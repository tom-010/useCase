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
		\begin{itemize}
		  \item Login als Text (z.B. tom)  
		  \item Passwort als Text (z.B. beispiel\_passwort)
		  \item optional Vorname als Text (z.B. Thomas)
		  \item Nachname als Text (z.B. Deniffel)
		  \item Alter als Zahl (z.B. 18) 
		\end{itemize}
		
		\subsubsection{Optionale Zutaten}
		\begin{itemize}
		  \item Adresse als Text (z.B. Haldenweg 7a)
		  \item Geschlecht als Text (z.B. m)
		\end{itemize}
	'''
	
	def subSection(Outputs outputs)'''
		\begin{itemize}
		  \item Erstellter Benutzer als Benutzer (z.B. Benutzer mit Login 'tom')
		\end{itemize}
	'''
	
	def subSection(PreConditions precoditions)'''
		\begin{itemize}
		  \item Angegebner Login muss im System einzigartig sein
		  \item Nur eine weitere Vorbedingung
		  \item Alter muss über 18 sein
		\end{itemize}
	'''
	
	def subSection(Steps steps)'''
		\begin{enumerate}
		  \item Falls Benutzer unter 18:
		  \begin{enumerate}
		   \item Melde Fehler UserToJungForTheSystem
		  \end{enumerate}
		  \item Suche Benutzer mit dem angegebenen Login
		  \item Falls der Benutzer gefunden wurde:
		  \begin{enumerate}
		   \item Melde Fehler UserExistiertBereits 
		  \end{enumerate}
		  \item Solange nicht drei gute Geschenke gefunden wurden:
		  \begin{enumerate}
		  \item Suche nach Geschenk in der Datenbank
		  \item Bewerte ob das Geschenk geeignet ist
		  \item Ordne das Geschenk dem Benutzer zu
		  \end{enumerate}
		  \item Speichere den Benutzer in die Datenbank. Bei Fehler melde BenutzerKonnteNichtErstelltWerden
		  \item Benachrichte alle, dass der Benutzer erstellt wurde
		  \item Sende Willkommensnachricht an den Benutzer
		\end{enumerate}
	'''
	
	def notesSubSection(Notes steps)'''
		Jeder User hat einen eigenen Login. Daher darf ein Login niemals doppelt vorkommen
	'''
	
	def subSection(UsedTypes types)'''
		\begin{itemize}
			 \item File: Files sind Dateien und werden für unterschiedlichste Dinge eingesetzt
			 \item Benutzer: Ein normaler Bentzer, der sich im System einloggen kann
			 \item Text: Mehrere Zeichen ergeben ein Wort, mehrere Worte einen Text
			 \item Zahl
			 \item Zeichen: Die einzelnen Zeichen aus dem deutschen oder irgend einem anderen Alphabet
		\end{itemize}
	'''
	
	def subSection(UsedExceptions exceptions)'''
		\begin{itemize}
			 \item UserToJungForTheSystem
			 \item UserExistiertBereits: Der angegebene Benutzer existiert bereits im System (der Login wurde bereits vergeben
			 \item BenutzerKonnteNichtErstelltWerden: Das System konnte den Benutzer nicht erstellen
			 \item IllegalArgumentException: Die Angegenen Paramter sind ungültig
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
