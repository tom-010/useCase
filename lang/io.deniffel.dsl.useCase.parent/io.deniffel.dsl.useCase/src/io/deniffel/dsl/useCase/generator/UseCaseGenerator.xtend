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

class UseCaseGenerator extends AbstractGenerator {
	
	ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
	
	
		
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		for(model : resource.allContents.toIterable.filter(Model)) {
			for(usecase : model.useCases) {
				usecase.name = classNamingStrategy.convert(usecase.name); 
				fsa.generateFile(usecase.name + ".java", usecase.compile(model.types));	
			}
		}
	}
	
	def compile(UseCase usecase, EList<Type> types) '''	
	«FOR t:types»
		«t.compile»
	«ENDFOR»
	
	«IF usecase.allowedUserGroups.size() > 0 »
		import io.deniffel.auth.ACL;
	«ENDIF»
	
	«FOR d:usecase.descriptions»
		«d.compile»
    «ENDFOR»
    «IF usecase.allowedUserGroups.size() > 0 »
		@ACL(allowedFor={«usecase.allowedUserGroups.get(0).groups.join(', ') [name]»})
    «ENDIF»
	public class «classNamingStrategy.convert(usecase.name)» {
		
		«FOR s:usecase.inputs»
			«s.compile»
		«ENDFOR»
		
		«FOR s:usecase.outputs»
			«s.compile»
		«ENDFOR»
	}
	'''
	
	def getName(AllowedUserGroup group) {
		return group.name
	}
	
	def compile(AllowedUserGroup group) '''
	«group.name»
	'''
	
	def compile(Description description) '''
	/**
	* «description.name»
	*/
	'''
	
	def compile(Inputs inputs) '''
		public static class Input {
			«FOR i:inputs.inputs»
				public «i.compile»;
			«ENDFOR»
			
			public Input(«inputs.inputs.join(', ') [compile]») {
				«FOR i:inputs.inputs»
				    this.«i.content» = «i.content»;
				«ENDFOR»
			}
		}
	'''
	
	def compile(Outputs outputs) '''
		public static class Output {
			«FOR o:outputs.outputs»
				public «o.compile»;
			«ENDFOR»
			
			public Output(«outputs.outputs.join(', ') [compile]») {
				«FOR o:outputs.outputs»
					this.«o.content» = «o.content»;
				«ENDFOR»
			}
		}
		
	'''
	
	def compile(Output output) '''
		«output.type.name» «output.content»'''
	
	def compile(Input input) '''
		«input.type.name» «input.content»'''
	
	def compile(Type type) '''
	«IF type.importInfo !== null»
		import «type.importInfo»;
	«ELSE»
		import «type.name»;
	«ENDIF»
	'''
	
	
}
