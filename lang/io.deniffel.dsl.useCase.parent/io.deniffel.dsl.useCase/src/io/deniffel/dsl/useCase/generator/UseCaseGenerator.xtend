package io.deniffel.dsl.useCase.generator

import io.deniffel.dsl.useCase.useCase.Attributes
import io.deniffel.dsl.useCase.useCase.Attribute
import io.deniffel.dsl.useCase.useCase.Model
import io.deniffel.dsl.useCase.useCase.Description
import io.deniffel.dsl.useCase.useCase.AllowedUserGroups
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup
import io.deniffel.dsl.useCase.useCase.UseCase
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.common.util.EList
import io.deniffel.dsl.useCase.useCase.Type

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
		«FOR s:usecase.sections»
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
	
	def compile(Attributes attrs) '''
		«FOR a:attrs.attrs»
			«a.compile»
		«ENDFOR»
	'''
	
	def compile(Attribute attribute) '''
		«attribute.type.name» «attribute.content»;
	'''
	
	def compile(Type type) '''
	«IF type.importInfo !== null»
		import «type.importInfo»;
	«ELSE»
		import «type.name»;
	«ENDIF»
	'''
	
	
}
