package io.deniffel.dsl.useCase.generator

import io.deniffel.dsl.useCase.useCase.Attributes
import io.deniffel.dsl.useCase.useCase.Attribute
import io.deniffel.dsl.useCase.useCase.Description
import io.deniffel.dsl.useCase.useCase.UseCase
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class UseCaseGenerator extends AbstractGenerator {
	
	ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
		
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		
		for(e : resource.allContents.toIterable.filter(UseCase)) {
			e.name = classNamingStrategy.convert(e.name); 
			fsa.generateFile(e.name + ".java", "import" + e.compile);
		}
	}
	
	def compile(UseCase usecase) '''	
	«FOR d:usecase.descriptions»
		«d.compile»
    «ENDFOR»
	public class «classNamingStrategy.convert(usecase.name)» {
		«FOR s:usecase.sections»
			«s.compile»
		«ENDFOR»
	}
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
	
	
}
