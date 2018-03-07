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

class UseCaseGenerator extends AbstractGenerator {
	
	ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
	ClassMemberNamingStrategy variableNaming = new ClassMemberNamingStrategy();
	ClassMemberNamingStrategy methodNaming = new ClassMemberNamingStrategy();
	 
		
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		for(model : resource.allContents.toIterable.filter(Model)) {
			for(usecase : model.useCases) {
				usecase.name = classNamingStrategy.convert(usecase.name); 
				fsa.generateFile(usecase.name + ".java", usecase.compile(model.types.types, model.exceptions));	
			}
		}
	}
	
	def compile(UseCase usecase, EList<Type> types, UsedExceptions exceptions) '''	
	«FOR t:types»
		«t.compile»
	«ENDFOR»
	
	«exceptions.compileImport»
	
	«IF usecase.allowedUserGroups.size() > 0 »
		import io.deniffel.auth.ACL;
		import io.deniffel.useCase.UseCase;
		import io.deniffel.useCase.ErrorMessages;
	«ENDIF»
	
	«FOR d:usecase.descriptions»
		«d.compile»
    «ENDFOR»
	public interface «classNamingStrategy.convert(usecase.name)» extends UseCase<Input, Output> {
		
		«IF usecase.allowedUserGroups.size() > 0 »
		default String[] allowedFor {
			return new String[] {«usecase.allowedUserGroups.get(0).groups.join(', ') [compile]»};
		}
		«ENDIF»
		
		«FOR s:usecase.inputs»
			«s.compile»
		«ENDFOR»
		
		«FOR s:usecase.outputs»
			«s.compile»
		«ENDFOR»
		«usecase.preconditions.compile»
		
		«FOR s:usecase.steps»
			«s.compile»
		«ENDFOR»
		
		/* NOTES:
		«FOR n:usecase.notes»
		«n.content» 
		«ENDFOR»
		*/
		
		// steps
		«FOR steps:usecase.steps»
		«FOR s:steps.steps»
			void «s.compile»«IF s.error !== null» throws «s.error.exception.type.name»«ENDIF»;
		«ENDFOR»
		«ENDFOR»
		
		// I/O
		Input getInput();
		Output getOutput();
		
		«IF usecase.preconditions !== null && usecase.preconditions.conditions.size() > 0»
		// precoditions
		«usecase.preconditions.compileMethods»
		«ENDIF»
		
		// exceptions
		«exceptions.compile»
	}
	'''
	
	def compile(PreConditions pcs)'''		
		default ErrorMessages checkPreconditions() {
			ErrorMessages errors = new ErrorMessages();
			«FOR p:pcs.conditions»
				«methodNaming.convert(p.content)»(getInput(), errors);
			«ENDFOR»
			return errors;
		}
	'''
	
	def compileMethods(PreConditions pcs)'''
		«FOR p:pcs.conditions»
			void «methodNaming.convert(p.content)»(Input input, ErrorMessages errors);
		«ENDFOR»
	'''
	
	def compile(AllowedUserGroup group) '''
	"«group.name.toUpperCase()»"'''
	
	def compile(Description description) '''
	/**
	* «description.name»
	*/
	'''
	
	def compileImport(UsedExceptions exeptions)'''
		«FOR e:exeptions.exceptions»
			«IF e.importInfo !== null»import «e.importInfo»;
			«ENDIF»«ENDFOR»
		'''
	
	def compile(UsedExceptions exeptions)'''
		«FOR e:exeptions.exceptions»
			«IF e.importInfo === null»
				public static class «e.name» extends Error { public «e.name»(){super("«e.message»");} }
			«ENDIF»
		«ENDFOR»
	'''
	
	def compile(Steps steps) '''
		default Output steps() {
			ErrorMessages errors = checkPreconditions();
			if(errors.size() > 0) 
				return new Output(errors); 
				
			«FOR s:steps.steps»
				«s.compile»;
			«ENDFOR»
			return getOutput();
		}
	'''
	
	def compile(Step step) '''
		«methodNaming.convert(step.action)»()'''
	
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
	
	def compile(Outputs outputs) '''
		public static class Output {
			«FOR o:outputs.outputs»
				public «o.compile»;
			«ENDFOR»
			public ErrorMessages errors;
			
			public Output(«outputs.outputs.join(', ') [compile]») {
				«FOR o:outputs.outputs»
					this.«o.content» = «o.content»;
				«ENDFOR»
			}
			
			public Output(ErrorMessages errors) {
				this.errors = errors;
			}
			
			public boolean wasSuccessful() {
				return errors == null || errors.size() == 0;
			}
		}
		
	'''
	
	def compile(Output output) '''
		«output.type.name» «variableNaming.convert(output.content)»'''
	
	def compile(Input input) '''
		«input.type.name» «variableNaming.convert(input.content)»'''
	
	def compile(Type type) '''
	«IF type.importInfo !== null»
		import «type.importInfo»;
	«ELSE»
		import «type.name»;
	«ENDIF»
	'''
	
	
}
