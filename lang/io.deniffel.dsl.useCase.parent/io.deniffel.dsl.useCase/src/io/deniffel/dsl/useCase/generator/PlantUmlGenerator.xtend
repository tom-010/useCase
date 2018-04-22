package io.deniffel.dsl.useCase.generator

import io.deniffel.dsl.useCase.useCase.Model
import io.deniffel.dsl.useCase.useCase.Package
import io.deniffel.dsl.useCase.useCase.PackagePart
import io.deniffel.dsl.useCase.useCase.Type
import io.deniffel.dsl.useCase.useCase.UseCase
import io.deniffel.dsl.useCase.useCase.UsedExceptions
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class PlantUmlGenerator extends AbstractGenerator {
	
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
		val dirPath = model.company.replace(".", "/") + "/" + model.package.path + "/"
		fsa.generateFile(
			"/main/resources/diagrams/"+ dirPath + classNamingStrategy.convert(usecase.name) + ".plantuml", 
			usecase.createUseCaseDiagram(model.company, model.package, model.types.types, model.exceptions)
		);
	}
	
	def createUseCaseDiagram(UseCase usecase, String company, Package ucPackage, EList<Type> types, UsedExceptions exceptions) '''	
	@startuml
	
	«FOR groups : usecase.allowedUserGroups»
		«FOR group : groups.groups»
			«group.name» --> («usecase.name»)
		«ENDFOR»
	«ENDFOR»
	
	@enduml
	'''
	
	def path(Package ucPackage) {
		return ucPackage.parts.join('/')[compile]
	}
	
	def compile(PackagePart part)'''
		«packageNaming.convert(part.name)»'''
}
