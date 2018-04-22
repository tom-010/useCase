package io.deniffel.dsl.useCase.generator

import io.deniffel.dsl.useCase.useCase.AllowedUserGroup
import io.deniffel.dsl.useCase.useCase.Description
import io.deniffel.dsl.useCase.useCase.Input
import io.deniffel.dsl.useCase.useCase.Inputs
import io.deniffel.dsl.useCase.useCase.Model
import io.deniffel.dsl.useCase.useCase.Type
import io.deniffel.dsl.useCase.useCase.UseCase
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import io.deniffel.dsl.useCase.useCase.Outputs
import io.deniffel.dsl.useCase.useCase.Output
import io.deniffel.dsl.useCase.useCase.Steps
import io.deniffel.dsl.useCase.useCase.Step
import io.deniffel.dsl.useCase.useCase.UsedExceptions
import io.deniffel.dsl.useCase.useCase.PreConditions
import io.deniffel.dsl.useCase.useCase.Package
import io.deniffel.dsl.useCase.useCase.PackagePart
import io.deniffel.dsl.useCase.useCase.RaiseErrorNow
import io.deniffel.dsl.useCase.useCase.BooleanCondition
import io.deniffel.dsl.useCase.useCase.OptionalInputs

class JavaGenerator extends AbstractGenerator {
	
	ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
	ClassMemberNamingStrategy variableNaming = new ClassMemberNamingStrategy();
	ClassMemberNamingStrategy methodNaming = new ClassMemberNamingStrategy();
	ClassMemberNamingStrategy packageNaming = new ClassMemberNamingStrategy();
	 
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(model : resource.allContents.toIterable.filter(Model)) 
			for(usecase : model.useCases) 
				usecase.create(model, fsa);
	}
	
	def create(UseCase usecase, Model model, IFileSystemAccess2 fsa) {
		usecase.name = classNamingStrategy.convert(usecase.name);
		val dirPath = model.company.replace(".", "/") + "/" + model.package.path + "/"
		fsa.generateFile(
			"/main/java/"+ dirPath + usecase.name + ".java", 
			usecase.createJavaInterface(model.company, model.package, model.types.types, model.exceptions)
		);
	}
	
	
	def path(Package ucPackage) {
		return ucPackage.parts.join('/')[compile]
	}
	
	def createJavaInterface(UseCase usecase, String company, Package ucPackage, EList<Type> types, UsedExceptions exceptions) '''	
		«ucPackage.toJavaPackage(company)»
		
		«types.importStatements()»
		
		«exceptions.importStatements()»
		
		«usecase.requiredFormalImports()»
		
		«usecase.descriptions()»
		public interface «classNamingStrategy.convert(usecase.name)» extends UseCase<Input, Output> {
			
			«usecase.allowedUserGroups()»
			
			«usecase.inputs()»
			
			«usecase.outputs()»
			
			«usecase.checkPreconditions()»
			
			«usecase.steps()»

			«usecase.notes()»
			
			«usecase.stepInterfaceDefinitions()»
			
			«usecase.conditionInterfaceDefinitions()»
			
			«usecase.ioInterfaceDefinitions()»
			
			«usecase.precoditionInterfaceDefintions()»
			
			«exceptions.exceptionInterfaceDefinitions()»
		}
	'''
	
	def toJavaPackage(Package ucPackage, String company)'''
		package «company».«ucPackage.parts.join('.')[compile]»;
	'''
	
	def compile(PackagePart part)'''
		«packageNaming.convert(part.name)»'''
	
	def importStatements(EList<Type> types)'''
		«FOR type : types»
			«type.compile»
		«ENDFOR»
	'''
	
	def compile(Type type) '''
		«IF type.importInfo !== null»
			import «type.importInfo»;
		«ELSE»
			import «type.name»;
		«ENDIF»
	'''
	
	def importStatements(UsedExceptions exceptions)'''
		«FOR exception : exceptions.exceptions»
			«IF exception.importInfo !== null»
				import «exception.importInfo»;
			«ENDIF»
		«ENDFOR»
	'''
	
	def requiredFormalImports(UseCase usecase)'''
		«IF usecase.allowedUserGroups.size() > 0 »
			import io.deniffel.auth.ACL;
			import io.deniffel.useCase.UseCase;
			import io.deniffel.useCase.ErrorMessages;
		«ENDIF»
	'''
		
	def descriptions(UseCase usecase)'''
		«FOR description : usecase.descriptions»
		«description.compile»
    	«ENDFOR»
	'''
	
	def compile(Description description) '''
		/**
		* «description.name»
		*/
	'''
	
	def allowedUserGroups(UseCase usecase)'''
		«IF usecase.allowedUserGroups.size() > 0 »
			default String[] allowedFor {
				return new String[] {«usecase.allowedUserGroups.get(0).groups.join(', ') [compile]»};
			}
		«ENDIF»
	'''
	
	def compile(AllowedUserGroup group) '''
		"«group.name.toUpperCase()»"'''	
	
	def inputs(UseCase usecase)'''
		«FOR input : usecase.inputs»
			«FOR optional : usecase.optionalInputs»
				«input.compile(optional)»
			«ENDFOR»
		«ENDFOR»
	'''
	
	def compile(Inputs inputs, OptionalInputs optionalInputs) '''
		public static class Input {
			«FOR i :inputs.inputs»
				public «i.compile»; «IF i.optional !== null» // optional«ENDIF» 
			«ENDFOR»
			«FOR optional : optionalInputs.inputs»
				public «optional.compile»; // optional
			«ENDFOR»
			
			public Input(«inputs.inputs.join(', ') [compile]») {
				«FOR i:inputs.inputs»
				    this.«variableNaming.convert(i.content)» = «variableNaming.convert(i.content)»;
				«ENDFOR»
			}
			
			«inputs.compileRequiredInputValidation»
		}
	'''
	
	def compileRequiredInputValidation(Inputs inputs) '''
		void validate(ErrorMessages errors) {
			Input input = getInput();
			«FOR input :inputs.inputs»
				«IF input.optional === null»
					if(input.«variableNaming.convert(input.content)»==null) errors.add("'«input.content»' can't be null");
				«ENDIF»
			«ENDFOR»
		}
	'''
	
	def compile(Input input) '''
		«input.type.name» «variableNaming.convert(input.content)»'''
	
	def outputs(UseCase usecase)'''
		«FOR output : usecase.outputs»
			«output.generateInnerClass()»
		«ENDFOR»
	'''
	
	// TODO: it is not nice that the name is Outputs instead of output -> Change this: generateInnerClass(Outputs outputs) 
	def generateInnerClass(Outputs outputs) '''
		public static class Output {
			«FOR output : outputs.outputs»
				public «output.compile»;
			«ENDFOR»
			public ErrorMessages errors;
			
			public Output(«outputs.outputs.join(', ') [compile]») {
				«FOR output : outputs.outputs»
					this.«output.content» = «output.content»;
				«ENDFOR»
			}
			
			public Output(ErrorMessages errors) {this.errors = errors;}
			public boolean wasSuccessful() {return errors == null || errors.size() == 0;}
		}
	'''
	
	def compile(Output output) '''
		«output.type.name» «variableNaming.convert(output.content)»'''
	
	def checkPreconditions(UseCase usecase)'''		
		default ErrorMessages checkPreconditions() {
			ErrorMessages errors = new ErrorMessages();
			getInput().validate(errors);
			«FOR condition : usecase.preconditions.conditions»
				«methodNaming.convert(condition.content)»(getInput(), errors);
			«ENDFOR»
			return errors;
		}
	'''
	
	def steps(UseCase usecase)'''
		«FOR steps : usecase.steps»
			«steps.compile()»
		«ENDFOR»
	'''
	
	
	def compile(Steps steps)'''
		default Output steps() {
			ErrorMessages errors = checkPreconditions();
			if(errors.size() > 0) 
				return new Output(errors);
						
			«FOR s : steps.steps»
				«s.compile()»
			«ENDFOR»
			
			return getOutput();
		}
		'''
	
	int lastStepPoints = 1
	def compile(Step step){
		val close = (step.points < lastStepPoints);
		lastStepPoints = step.points
		
		'''
		«IF close»
			«step.whiteSpacesBefore»}
			«»
		«ENDIF»
		«step.compileDependingOnStepType»
		'''
	}
	
	def points(Step s) {
		return s.number.length() - s.number.replace(".", "").length();
	}
	
	def compileDependingOnStepType(Step step)'''
		«IF step.exception !== null»
			«step.whiteSpacesBefore»«step.exception.throwNow()»
		«ELSEIF step.condition !== null»
			«step.whiteSpacesBefore»if(«methodNaming.convert(step.condition.condition.name)»()) {
		«ELSEIF step.loop !== null»
			«step.whiteSpacesBefore»while(«methodNaming.convert(step.loop.condition.name)»()) {
		«ELSE»
			«step.whiteSpacesBefore»«methodNaming.convert(step.action)»();
		«ENDIF»
	'''	
	String result = "";
	int i;
	final int TAB_WITH = 4;
	def whiteSpacesBefore(Step step) {
		result = "";
		for(i=0; i<(step.points-1)*TAB_WITH; i++)
			result += " ";
		return result;
	}

	def throwNow(RaiseErrorNow e)'''
		throw new «this.classNamingStrategy.convert(e.exception.type.name)»("«e.exception.type.message»");'''
	
	def notes(UseCase usecase)'''
		/* NOTES:
		«FOR note : usecase.notes»
			«note.content» 
		«ENDFOR»
		*/
	'''
	
	def stepInterfaceDefinitions(UseCase usecase)'''
		// steps
		«FOR steps : usecase.steps»
		«FOR step : steps.steps»
			«step.interfaceDefinition()»
		«ENDFOR»
		«ENDFOR»
	'''
	
	def interfaceDefinition(Step step) '''
		«IF step.action !== null»
			void «methodNaming.convert(step.action)»()«IF step.error !== null» throws «step.error.exception.type.name»«ENDIF»;
		«ENDIF»
	'''
	
	def conditionInterfaceDefinitions(UseCase usecase)'''
		// conditionals
		«FOR steps : usecase.steps»
		«FOR step : steps.steps»
			«IF step.condition !== null»
				«step.condition.condition.interfaceDefinition»
			«ENDIF»
			«IF step.loop !== null»
				«step.loop.condition.interfaceDefinition»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
	'''
	
	def interfaceDefinition(BooleanCondition condition)'''
		boolean «methodNaming.convert(condition.name)»();
	'''
	
	def ioInterfaceDefinitions(UseCase usecase)'''
		// I/O
		Input getInput();
		Output getOutput();
	'''
	
	def precoditionInterfaceDefintions(UseCase usecase)'''
		«IF usecase.preconditions !== null && usecase.preconditions.conditions.size() > 0»
			// precoditions
			«usecase.preconditions.compileMethods»
		«ENDIF»
	'''
	
	def compileMethods(PreConditions pcs)'''
		«FOR p:pcs.conditions»
			void «methodNaming.convert(p.content)»(Input input, ErrorMessages errors);
		«ENDFOR»
	'''
	
	def exceptionInterfaceDefinitions(UsedExceptions exceptions)'''
		«FOR e : exceptions.exceptions»
			«IF e.importInfo === null»
				public static class «e.name» extends Error { public «e.name»(){super("«e.message»");} }
			«ENDIF»
		«ENDFOR»
	'''
}
