package io.deniffel.dsl.useCase.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class UseCaseGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		new PlantUmlGenerator().doGenerate(resource, fsa, context); // TODO: the order is important, because the methods are called with parameters as reference. Change this 
		new LatexGenerator().doGenerate(resource, fsa, context);
		new CucumberGenerator().doGenerate(resource, fsa, context);
		new JavaGenerator().doGenerate(resource, fsa, context);
	}
	
}
