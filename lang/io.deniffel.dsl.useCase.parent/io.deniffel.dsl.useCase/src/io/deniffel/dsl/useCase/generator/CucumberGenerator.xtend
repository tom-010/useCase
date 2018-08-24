package io.deniffel.dsl.useCase.generator

import io.deniffel.dsl.useCase.useCase.Example
import io.deniffel.dsl.useCase.useCase.Model
import io.deniffel.dsl.useCase.useCase.Package
import io.deniffel.dsl.useCase.useCase.PackagePart
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class CucumberGenerator extends AbstractGenerator {
	
	ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
	ClassMemberNamingStrategy variableNaming = new ClassMemberNamingStrategy();
	ClassMemberNamingStrategy methodNaming = new ClassMemberNamingStrategy();
	ClassMemberNamingStrategy packageNaming = new ClassMemberNamingStrategy();
	 
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(model : resource.allContents.toIterable.filter(Model)) {
			model.createFeature(fsa)
		}
	}
	
	def createFeature(Model model, IFileSystemAccess2 fsa) {
		
		val dirPath = model.company.replace(".", "/") + "/" + model.package.path + "/"
		fsa.generateFile(
			"/test/features/"+ dirPath + classNamingStrategy.convert(model.useCases.get(0).name) + ".feature", 
			model.compileFeature()
		);
	}
	
	def compileFeature(Model model)'''
		#language: de
		
		Funktionalität: «model.useCases.get(0).name»
		
		«IF model.useCases.get(0).descriptions.size > 0»
			«FOR description : model.useCases.get(0).descriptions»
				«description.name»
			«ENDFOR»
		«ENDIF»
		
		«FOR example : model.examples»
			«example.compile»
		«ENDFOR»
	'''
	
	def compile(Example example) '''	
		Scenario: «example.name»
		  «FOR given : example.given»
		  	Gegeben «given.content»
		  «ENDFOR»
		  «FOR given : example.givenAnd»
		  	Und «given.content»
		  «ENDFOR»
		  «FOR when : example.when»
		  	Wenn «when.content»
		  «ENDFOR»
		  «FOR when : example.whenAnd»
		  	Und «when.content»
  		  «ENDFOR»
		  «FOR then : example.then»
		  	Dann «then.content»
		  «ENDFOR»
		  «FOR then : example.thenAnd»
		  	Und «then.content»
  		  «ENDFOR»
  		  
	'''
	
	def path(Package ucPackage) {
		return ucPackage.parts.join('/')[compile]
	}
	
	def compile(PackagePart part)'''
		«packageNaming.convert(part.name)»'''
}
