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

class UseCaseGenerator extends AbstractGenerator {
	
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
		fsa.generateFile(
			model.company.replace(".", "/") + "/" + model.package.path + "/" + usecase.name + ".java", 
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
			
			«usecase.inputValidations()»
			
			«usecase.notes()»
			
			«usecase.stepInterfaceDefinitions()»
			
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
			«input.compile»
		«ENDFOR»
	'''
	
	def compile(Inputs inputs) '''
		public static class Input {
			«FOR i:inputs.inputs»
				public «i.compile»;
			«ENDFOR»
			
			public Input(«inputs.inputs.join(', ') [compile]») {
				«FOR i:inputs.inputs»
				    this.«variableNaming.convert(i.content)» = «variableNaming.convert(i.content)»;
				«ENDFOR»
			}
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
			checkForRequiredInputs(getInput(), errors);
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
	
	int lastStepPoints = 1
	def compile(Steps steps)'''
		«steps.compilePre»
		«steps.compileCalls»
		«steps.compilePost»
	'''

	
	def compilePre(Steps steps)'''
		default Output steps() {
			ErrorMessages errors = checkPreconditions();
			if(errors.size() > 0) 
				return new Output(errors);
				
	'''
	
	def compileCalls(Steps steps) '''
		«FOR s : steps.steps»
			«s.compile()»
		«ENDFOR»'''
		
	def compilePost(Steps steps)'''
		«»
			return getOutput();
		}
		'''
	
	def points(Step s) {
		return s.number.length() - s.number.replace(".", "").length();
	}
	
	

	def compile(Step step){
		val close = (step.points < lastStepPoints);
		lastStepPoints = step.points
		
		'''
		«IF close»
			}
			«»
		«ENDIF»
			«step.call»
		'''
	}
	
	def call(Step step)'''
	«IF step.exception !== null»
		«step.exception.throwNow()»
	«ELSEIF step.condition !== null»
		if(«methodNaming.convert(step.condition.condition.name)»()) {
	«ELSEIF step.loop !== null»
		while(«methodNaming.convert(step.loop.condition.name)»()) {
	«ELSE»
		«methodNaming.convert(step.action)»()
	«ENDIF»
	'''
	
	def throwNow(RaiseErrorNow e)'''
		throw new «this.classNamingStrategy.convert(e.exception.type.name)»("«e.exception.type.message»");'''
	
	def inputValidations(UseCase usecase)'''
		«FOR input : usecase.inputs»
			«input.compileRequiredInputValidation()»
		«ENDFOR»
	'''
	
	def compileRequiredInputValidation(Inputs inputs) '''
		default void checkForRequiredInputs(Input input, ErrorMessages errors) {
			Input input = getInput();
			«FOR i:inputs.inputs»
				«IF i.optional === null»
					if(input.«variableNaming.convert(i.content)»==null) errors.add("'«i.content»' can't be null");
				«ENDIF»
			«ENDFOR»
		}
	'''
	
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
			void «step.compile()»«IF step.error !== null» throws «step.error.exception.type.name»«ENDIF»;
		«ENDFOR»
		«ENDFOR»
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
