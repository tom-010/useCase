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
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup
import io.deniffel.dsl.useCase.useCase.AllowedUserGroups
import io.deniffel.dsl.useCase.useCase.OptionalInputs
import io.deniffel.dsl.useCase.useCase.Inputs
import io.deniffel.dsl.useCase.useCase.Outputs
import io.deniffel.dsl.useCase.useCase.PreConditions
import io.deniffel.dsl.useCase.useCase.Steps
import io.deniffel.dsl.useCase.useCase.Notes
import io.deniffel.dsl.useCase.useCase.UsedTypes
import io.deniffel.dsl.useCase.useCase.Input
import io.deniffel.dsl.useCase.useCase.Step
import io.deniffel.dsl.useCase.useCase.RaiseErrorNow

class LatexGenerator extends AbstractGenerator {
	
	ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
	ClassMemberNamingStrategy packageNaming = new ClassMemberNamingStrategy();
	 
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(model : resource.allContents.toIterable.filter(Model)) 
			for(usecase : model.useCases) 
				usecase.create(model, fsa);
	}
	
	def create(UseCase usecase, Model model, IFileSystemAccess2 fsa) {
		val dirPath = "/main/resources/documents/" + model.company.replace(".", "/") + "/" + model.package.path + "/"
		fsa.generateFile(
			dirPath + usecase.camelCaseName + ".tex", 
			model.createLatexDocument(usecase, dirPath)
		);
	}
	
	def camelCaseName(UseCase uc) {
		return classNamingStrategy.convert(uc.name)
	}
	
	def createLatexDocument(Model model,UseCase usecase, String dirPath) '''	
		\documentclass[a4paper,10pt]{scrartcl}
		\usepackage{graphicx,wrapfig,lipsum}
		
		\usepackage[utf8]{inputenc}
		\usepackage[T1]{fontenc}
		\usepackage[german]{babel}
		
		\begin{document}
		
		\section{«usecase.name»}
		
		«usecase.diagram(dirPath)»
		«model.overviewTable»
		
		\subsection{Erlaubt für}
		«usecase.allowedUserGroups.get(0).subSection»
		
		\subsection{Zutaten}
		«usecase.inputs.get(0).subSection(usecase.optionalInputs.get(0))»
		
		\subsection{Ergebins}
		«usecase.outputs.get(0).subSection»
		
		\subsection{Vorbedingungen}
		«usecase.preconditions.subSection»
		
		\subsection{Schritte}
		«usecase.steps.get(0).subSection»
		
		\subsection{Anmerkungen}
		«usecase.notes.get(0).notesSubSection»
		
		\subsection{Glossar}
		\subsubsection{Genutze Bausteine}
		«model.types.subSection»
		
		
		\subsubsection{Genutzte Fehler}
		«model.exceptions.subSection»
		
		\end{document}
	'''
	
	def diagram(UseCase uc, String dirPath) '''
		\begin{wrapfigure}{r}{5cm}
		\includegraphics[width=5cm]{../../../../../../..«pathToDiagramPath(dirPath)»«uc.camelCaseName».png}
		\end{wrapfigure} 
	'''
	
	def overviewTable(Model model)'''
		\begin{tabular}{ l l }
		 Firma: & «model.company» \\ 
		 Kathegorie: & «model.getPackage().compile» \\      
		\end{tabular}
	'''
	
	def subSection(AllowedUserGroups groups)'''
		\begin{itemize}
		  «FOR group : groups.groups»
		  	\item «group.name»
		  «ENDFOR»
		\end{itemize}
	'''
	
	def subSection(Inputs inputs, OptionalInputs optionals)'''
		\subsubsection{Benötigte Zutaten}
		«inputs.required(optionals)»
		
		\subsubsection{Optionale Zutaten}
		«inputs.optional(optionals)»
	'''
	
	def required(Inputs inputs, OptionalInputs optinals)'''
		\begin{itemize}
			«FOR input : inputs.inputs»
				«IF input.optional === null»
					\item «input.compile»
				«ENDIF»
			«ENDFOR»
		\end{itemize}
	'''
	
	def compile(Input input)'''
		«input.content.escape» als «input.type.name» «IF input.example !== null»(z.B. «input.example.escape»)«ENDIF»
	'''
	
	def optional(Inputs inputs, OptionalInputs optionals)'''
		\begin{itemize}
	 	«FOR input : inputs.inputs»
			«IF input.optional !== null»
			 	\item «input.compile»
			«ENDIF»
		«ENDFOR»
		«FOR input : optionals.inputs»
		 	\item «input.compile»
		«ENDFOR»
		\end{itemize}
	'''
	
	def subSection(Outputs outputs)'''
		\begin{itemize}
		  \item Erstellter Benutzer als Benutzer (z.B. Benutzer mit Login 'tom')
		\end{itemize}
	'''
	
	String result = "";
	def escape(String unsafe) {
		result = unsafe;
		result = result.replace("\\", "\\\\");
		result = result.replace("{", "\\{");
		result = result.replace("}", "\\}");
		result = result.replace("_", "\\_");
		result = result.replace("^", "\\^");
		result = result.replace("#", "\\#");
		result = result.replace("&", "\\&");
		result = result.replace("%", "\\%");
		result = result.replace("$", "\\$");
		result = result.replace("~", "\\~");
		return result;
	}
	
	def subSection(PreConditions precoditions)'''
		\begin{itemize}
		  «FOR cond : precoditions.conditions»
		  	\item «cond.content.escape»
		  «ENDFOR»
		\end{itemize}
	'''
	
	def subSection(Steps steps)'''
		\begin{enumerate}
		  «FOR step : steps.steps»
		  	«step.item»
		  «ENDFOR»
		\end{enumerate}
	'''
	int lastStepPoints = 1
	def item(Step step){
		val close = (step.points < lastStepPoints);
		lastStepPoints = step.points
		
		'''
		«IF close»
			«step.whiteSpacesBefore»\end{enumerate}
		«ENDIF»
		\item «step.dependingOnStepType»
		'''
	}
		
	
	def dependingOnStepType(Step step)'''
		«IF step.exception !== null»
			«step.whiteSpacesBefore»«step.exception.throwNow()»
		«ELSEIF step.condition !== null»
			«step.whiteSpacesBefore»Falls «step.condition.condition.name.escape»:
			\begin{enumerate}
		«ELSEIF step.loop !== null»
			«step.whiteSpacesBefore»Solange «step.loop.condition.name.escape»:
			\begin{enumerate}
		«ELSE»
			«step.whiteSpacesBefore»«step.action.escape»
		«ENDIF»
	'''	
	
	String whiteSpacesResult = "";
	int i;
	final int TAB_WITH = 4;
	def whiteSpacesBefore(Step step) {
		whiteSpacesResult = "";
		for(i=0; i<(step.points-1)*TAB_WITH; i++)
			result += " ";
		return whiteSpacesResult;
	}
	
	def throwNow(RaiseErrorNow e)'''
		Melde Fehler «e.exception.type.name.escape»'''
	
	
	def points(Step s) {
		return s.number.length() - s.number.replace(".", "").length();
	}
	
	def notesSubSection(Notes notes)'''
		«notes.content.escape»
	'''
	
	def subSection(UsedTypes types)'''
		\begin{itemize}
			«FOR type : types.types»
				\item «type.name»«IF type.description !== null»: «type.description»«ENDIF»
			«ENDFOR»
		\end{itemize}
	'''
	
	def subSection(UsedExceptions exceptions)'''
		\begin{itemize}
			«FOR ex : exceptions.exceptions»
				\item «ex.name»«IF ex.message !== null»: «ex.message»«ENDIF»
			«ENDFOR»
		\end{itemize}
	'''
	
	def pathToDiagramPath(String pathToDir) {
		return pathToDir.replace("documents", "diagrams");
	}
	
	def path(Package ucPackage) {
		return ucPackage.parts.join('/')[compile]
	}
		
	def compile(Package ucPackage)'''
		«ucPackage.parts.join(' $\\rightarrow$ ')[name]»
	'''
	
	def compile(PackagePart part)'''
		«packageNaming.convert(part.name)»'''
}
