package io.deniffel.dsl.useCase.generator;

import com.google.common.collect.Iterables;
import io.deniffel.dsl.useCase.generator.ClassMemberNamingStrategy;
import io.deniffel.dsl.useCase.generator.ClassNamingStrategy;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroups;
import io.deniffel.dsl.useCase.useCase.Inputs;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.Notes;
import io.deniffel.dsl.useCase.useCase.OptionalInputs;
import io.deniffel.dsl.useCase.useCase.Outputs;
import io.deniffel.dsl.useCase.useCase.PackagePart;
import io.deniffel.dsl.useCase.useCase.PreConditions;
import io.deniffel.dsl.useCase.useCase.Steps;
import io.deniffel.dsl.useCase.useCase.UseCase;
import io.deniffel.dsl.useCase.useCase.UsedExceptions;
import io.deniffel.dsl.useCase.useCase.UsedTypes;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class LatexGenerator extends AbstractGenerator {
  private ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
  
  private ClassMemberNamingStrategy packageNaming = new ClassMemberNamingStrategy();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model model : _filter) {
      EList<UseCase> _useCases = model.getUseCases();
      for (final UseCase usecase : _useCases) {
        this.create(usecase, model, fsa);
      }
    }
  }
  
  public void create(final UseCase usecase, final Model model, final IFileSystemAccess2 fsa) {
    String _replace = model.getCompany().replace(".", "/");
    String _plus = ("/main/resources/documents/" + _replace);
    String _plus_1 = (_plus + "/");
    String _path = this.path(model.getPackage());
    String _plus_2 = (_plus_1 + _path);
    final String dirPath = (_plus_2 + "/");
    String _camelCaseName = this.camelCaseName(usecase);
    String _plus_3 = (dirPath + _camelCaseName);
    String _plus_4 = (_plus_3 + ".tex");
    fsa.generateFile(_plus_4, 
      this.createLatexDocument(model, usecase, dirPath));
  }
  
  public String camelCaseName(final UseCase uc) {
    return this.classNamingStrategy.convert(uc.getName());
  }
  
  public CharSequence createLatexDocument(final Model model, final UseCase usecase, final String dirPath) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass[a4paper,10pt]{scrartcl}");
    _builder.newLine();
    _builder.append("\\usepackage{graphicx,wrapfig,lipsum}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage[utf8]{inputenc}");
    _builder.newLine();
    _builder.append("\\usepackage[T1]{fontenc}");
    _builder.newLine();
    _builder.append("\\usepackage[german]{babel}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{");
    String _name = usecase.getName();
    _builder.append(_name);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _diagram = this.diagram(usecase, dirPath);
    _builder.append(_diagram);
    _builder.newLineIfNotEmpty();
    CharSequence _overviewTable = this.overviewTable(model);
    _builder.append(_overviewTable);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsection{Erlaubt für}");
    _builder.newLine();
    CharSequence _subSection = this.subSection(usecase.getAllowedUserGroups().get(0));
    _builder.append(_subSection);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsection{Zutaten}");
    _builder.newLine();
    CharSequence _subSection_1 = this.subSection(usecase.getInputs().get(0), usecase.getOptionalInputs().get(0));
    _builder.append(_subSection_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsection{Ergebins}");
    _builder.newLine();
    CharSequence _subSection_2 = this.subSection(usecase.getOutputs().get(0));
    _builder.append(_subSection_2);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsection{Vorbedingungen}");
    _builder.newLine();
    CharSequence _subSection_3 = this.subSection(usecase.getPreconditions());
    _builder.append(_subSection_3);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsection{Schritte}");
    _builder.newLine();
    CharSequence _subSection_4 = this.subSection(usecase.getSteps().get(0));
    _builder.append(_subSection_4);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsection{Anmerkungen}");
    _builder.newLine();
    CharSequence _notesSubSection = this.notesSubSection(usecase.getNotes().get(0));
    _builder.append(_notesSubSection);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsection{Glossar}");
    _builder.newLine();
    _builder.append("\\subsubsection{Genutze Bausteine}");
    _builder.newLine();
    CharSequence _subSection_5 = this.subSection(model.getTypes());
    _builder.append(_subSection_5);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsubsection{Genutzte Fehler}");
    _builder.newLine();
    CharSequence _subSection_6 = this.subSection(model.getExceptions());
    _builder.append(_subSection_6);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence diagram(final UseCase uc, final String dirPath) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{wrapfigure}{r}{5cm}");
    _builder.newLine();
    _builder.append("\\includegraphics[width=5cm]{../../../../../../..");
    String _pathToDiagramPath = this.pathToDiagramPath(dirPath);
    _builder.append(_pathToDiagramPath);
    String _camelCaseName = this.camelCaseName(uc);
    _builder.append(_camelCaseName);
    _builder.append(".png}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{wrapfigure} ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence overviewTable(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{tabular}{ l l }");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Firma: & ");
    String _company = model.getCompany();
    _builder.append(_company, " ");
    _builder.append(" \\\\ ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("Kathegorie: & ");
    CharSequence _compile = this.compile(model.getPackage());
    _builder.append(_compile, " ");
    _builder.append(" \\\\      ");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{tabular}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final AllowedUserGroups groups) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    {
      EList<AllowedUserGroup> _groups = groups.getGroups();
      for(final AllowedUserGroup group : _groups) {
        _builder.append("  ");
        _builder.append("\\item ");
        String _name = group.getName();
        _builder.append(_name, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final Inputs inputs, final OptionalInputs optionals) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\subsubsection{Benötigte Zutaten}");
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Login als Text (z.B. tom)  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Passwort als Text (z.B. beispiel\\_passwort)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item optional Vorname als Text (z.B. Thomas)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Nachname als Text (z.B. Deniffel)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Alter als Zahl (z.B. 18) ");
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsubsection{Optionale Zutaten}");
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Adresse als Text (z.B. Haldenweg 7a)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Geschlecht als Text (z.B. m)");
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final Outputs outputs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Erstellter Benutzer als Benutzer (z.B. Benutzer mit Login \'tom\')");
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final PreConditions precoditions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Angegebner Login muss im System einzigartig sein");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Nur eine weitere Vorbedingung");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Alter muss über 18 sein");
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final Steps steps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{enumerate}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Falls Benutzer unter 18:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\begin{enumerate}");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("\\item Melde Fehler UserToJungForTheSystem");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Suche Benutzer mit dem angegebenen Login");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Falls der Benutzer gefunden wurde:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\begin{enumerate}");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("\\item Melde Fehler UserExistiertBereits ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Solange nicht drei gute Geschenke gefunden wurden:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\begin{enumerate}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Suche nach Geschenk in der Datenbank");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Bewerte ob das Geschenk geeignet ist");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Ordne das Geschenk dem Benutzer zu");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Speichere den Benutzer in die Datenbank. Bei Fehler melde BenutzerKonnteNichtErstelltWerden");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Benachrichte alle, dass der Benutzer erstellt wurde");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Sende Willkommensnachricht an den Benutzer");
    _builder.newLine();
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence notesSubSection(final Notes steps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Jeder User hat einen eigenen Login. Daher darf ein Login niemals doppelt vorkommen");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final UsedTypes types) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item File: Files sind Dateien und werden für unterschiedlichste Dinge eingesetzt");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item Benutzer: Ein normaler Bentzer, der sich im System einloggen kann");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item Text: Mehrere Zeichen ergeben ein Wort, mehrere Worte einen Text");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item Zahl");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item Zeichen: Die einzelnen Zeichen aus dem deutschen oder irgend einem anderen Alphabet");
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final UsedExceptions exceptions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item UserToJungForTheSystem");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item UserExistiertBereits: Der angegebene Benutzer existiert bereits im System (der Login wurde bereits vergeben");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item BenutzerKonnteNichtErstelltWerden: Das System konnte den Benutzer nicht erstellen");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("\\item IllegalArgumentException: Die Angegenen Paramter sind ungültig");
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public String pathToDiagramPath(final String pathToDir) {
    return pathToDir.replace("documents", "diagrams");
  }
  
  public String path(final io.deniffel.dsl.useCase.useCase.Package ucPackage) {
    final Function1<PackagePart, CharSequence> _function = (PackagePart it) -> {
      return this.compile(it);
    };
    return IterableExtensions.<PackagePart>join(ucPackage.getParts(), "/", _function);
  }
  
  public CharSequence compile(final io.deniffel.dsl.useCase.useCase.Package ucPackage) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<PackagePart, CharSequence> _function = (PackagePart it) -> {
      return it.getName();
    };
    String _join = IterableExtensions.<PackagePart>join(ucPackage.getParts(), " $\\rightarrow$ ", _function);
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PackagePart part) {
    StringConcatenation _builder = new StringConcatenation();
    String _convert = this.packageNaming.convert(part.getName());
    _builder.append(_convert);
    return _builder;
  }
}
