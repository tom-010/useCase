package io.deniffel.dsl.useCase.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import javax.inject.Inject
import io.deniffel.dsl.useCase.useCase.UseCase
import io.deniffel.dsl.useCase.generator.ClassNamingStrategy;
import javax.management.Descriptor
import io.deniffel.dsl.useCase.useCase.*

class UseCaseGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
		
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(e : resource.allContents.toIterable.filter(UseCase)) {
			e.name = classNamingStrategy.convert(e.name); 
			fsa.generateFile(e.name + ".java", e.compile);
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
	
	def compile(Attributes a) '''
		// «a.name»
	'''
}
