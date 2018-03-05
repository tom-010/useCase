/*
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import javax.inject.Inject
import io.deniffel.dsl.useCase.useCase.UseCase

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UseCaseGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(e : resource.allContents.toIterable.filter(UseCase)) {
			fsa.generateFile(e.name + ".java", e.compile);
		}
	}
	
	def compile(UseCase usecase) '''	
	public class «usecase.name» {
	}
	'''
}
