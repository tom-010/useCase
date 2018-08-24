package io.deniffel.dsl.useCase.generator;

import com.google.common.collect.Iterables;
import io.deniffel.dsl.useCase.generator.ClassMemberNamingStrategy;
import io.deniffel.dsl.useCase.generator.ClassNamingStrategy;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroups;
import io.deniffel.dsl.useCase.useCase.Condition;
import io.deniffel.dsl.useCase.useCase.ExceptionDecleration;
import io.deniffel.dsl.useCase.useCase.IfStatement;
import io.deniffel.dsl.useCase.useCase.Input;
import io.deniffel.dsl.useCase.useCase.Inputs;
import io.deniffel.dsl.useCase.useCase.Loop;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.Notes;
import io.deniffel.dsl.useCase.useCase.OptionalInputs;
import io.deniffel.dsl.useCase.useCase.Outputs;
import io.deniffel.dsl.useCase.useCase.PackagePart;
import io.deniffel.dsl.useCase.useCase.PreConditions;
import io.deniffel.dsl.useCase.useCase.RaiseErrorNow;
import io.deniffel.dsl.useCase.useCase.Step;
import io.deniffel.dsl.useCase.useCase.Steps;
import io.deniffel.dsl.useCase.useCase.Type;
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
    _builder.append("\\usepackage{enumitem}");
    _builder.newLine();
    _builder.append("\\parindent0pt");
    _builder.newLine();
    _builder.append("\\usepackage{multicol}   ");
    _builder.newLine();
    _builder.append("\\usepackage[a4paper, left=2cm, right=1cm, top=2cm, bottom=1cm]{geometry}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{");
    CharSequence _compile = this.compile(model.getPackage());
    _builder.append(_compile);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("%<usecase>");
    _builder.newLine();
    _builder.append("\\subsection{");
    String _name = usecase.getName();
    _builder.append(_name);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.newLine();
    CharSequence _overviewTable = this.overviewTable(model);
    _builder.append(_overviewTable);
    _builder.newLineIfNotEmpty();
    CharSequence _diagram = this.diagram(usecase, dirPath);
    _builder.append(_diagram);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\bigbreak");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{multicols}{2}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsubsection{Erlaubt für}");
    _builder.newLine();
    CharSequence _subSection = this.subSection(usecase.getAllowedUserGroups().get(0));
    _builder.append(_subSection);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsubsection{Vorbedingungen}");
    _builder.newLine();
    CharSequence _subSection_1 = this.subSection(usecase.getPreconditions());
    _builder.append(_subSection_1);
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("\\subsubsection{Ergebins}");
    _builder.newLine();
    CharSequence _subSection_2 = this.subSection(usecase.getOutputs().get(0));
    _builder.append(_subSection_2);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\\columnbreak");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsubsection{Zutaten}");
    _builder.newLine();
    CharSequence _subSection_3 = this.subSection(usecase.getInputs().get(0), usecase.getOptionalInputs().get(0));
    _builder.append(_subSection_3);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\end{multicols}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsubsection{Schritte}");
    _builder.newLine();
    CharSequence _subSection_4 = this.subSection(usecase.getSteps().get(0));
    _builder.append(_subSection_4);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsubsection{Anmerkungen}");
    _builder.newLine();
    CharSequence _notesSubSection = this.notesSubSection(usecase.getNotes().get(0));
    _builder.append(_notesSubSection);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsubsection{Glossar}");
    _builder.newLine();
    _builder.append("\\textbf{Genutze Bausteine}");
    _builder.newLine();
    CharSequence _subSection_5 = this.subSection(model.getTypes());
    _builder.append(_subSection_5);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\textbf{Genutzte Fehler}");
    _builder.newLine();
    CharSequence _subSection_6 = this.subSection(model.getExceptions());
    _builder.append(_subSection_6);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("%</usecase>");
    _builder.newLine();
    _builder.append("\\clearpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence diagram(final UseCase uc, final String dirPath) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{wrapfigure}{r}{5cm}\\centering");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\vspace{-5cm}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\includegraphics[width=5cm]{../../../../../../..");
    String _pathToDiagramPath = this.pathToDiagramPath(dirPath);
    _builder.append(_pathToDiagramPath, "\t");
    String _camelCaseName = this.camelCaseName(uc);
    _builder.append(_camelCaseName, "\t");
    _builder.append(".png}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{wrapfigure}");
    _builder.newLine();
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
    _builder.append("\\begin{itemize}[noitemsep]");
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
    _builder.append("\\textbf{Benötigte Zutaten}");
    _builder.newLine();
    CharSequence _required = this.required(inputs, optionals);
    _builder.append(_required);
    _builder.newLineIfNotEmpty();
    _builder.append("\\bigbreak");
    _builder.newLine();
    _builder.append("\\textbf{Optionale Zutaten}");
    _builder.newLine();
    CharSequence _optional = this.optional(inputs, optionals);
    _builder.append(_optional);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence required(final Inputs inputs, final OptionalInputs optinals) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}[noitemsep,topsep=0pt]");
    _builder.newLine();
    {
      EList<Input> _inputs = inputs.getInputs();
      for(final Input input : _inputs) {
        {
          String _optional = input.getOptional();
          boolean _tripleEquals = (_optional == null);
          if (_tripleEquals) {
            _builder.append("\t");
            _builder.append("\\item ");
            CharSequence _compile = this.compile(input);
            _builder.append(_compile, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Input input) {
    StringConcatenation _builder = new StringConcatenation();
    String _escape = this.escape(input.getContent());
    _builder.append(_escape);
    _builder.append(" als ");
    String _name = input.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      String _example = input.getExample();
      boolean _tripleNotEquals = (_example != null);
      if (_tripleNotEquals) {
        _builder.append("(z.B. ");
        String _escape_1 = this.escape(input.getExample());
        _builder.append(_escape_1);
        _builder.append(")");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence optional(final Inputs inputs, final OptionalInputs optionals) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}[noitemsep,topsep=0pt]");
    _builder.newLine();
    {
      EList<Input> _inputs = inputs.getInputs();
      for(final Input input : _inputs) {
        {
          String _optional = input.getOptional();
          boolean _tripleNotEquals = (_optional != null);
          if (_tripleNotEquals) {
            _builder.append("\\item ");
            CharSequence _compile = this.compile(input);
            _builder.append(_compile);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Input> _inputs_1 = optionals.getInputs();
      for(final Input input_1 : _inputs_1) {
        _builder.append("\\item ");
        CharSequence _compile_1 = this.compile(input_1);
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final Outputs outputs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}[noitemsep]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\item Erstellter Benutzer als Benutzer (z.B. Benutzer mit Login \'tom\')");
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  private String result = "";
  
  public String escape(final String unsafe) {
    this.result = unsafe;
    this.result = this.result.replace("\\", "\\\\");
    this.result = this.result.replace("{", "\\{");
    this.result = this.result.replace("}", "\\}");
    this.result = this.result.replace("_", "\\_");
    this.result = this.result.replace("^", "\\^");
    this.result = this.result.replace("#", "\\#");
    this.result = this.result.replace("&", "\\&");
    this.result = this.result.replace("%", "\\%");
    this.result = this.result.replace("$", "\\$");
    this.result = this.result.replace("~", "\\~");
    return this.result;
  }
  
  public CharSequence subSection(final PreConditions precoditions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}[noitemsep]");
    _builder.newLine();
    {
      EList<Condition> _conditions = precoditions.getConditions();
      for(final Condition cond : _conditions) {
        _builder.append("  ");
        _builder.append("\\item ");
        String _escape = this.escape(cond.getContent());
        _builder.append(_escape, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final Steps steps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{enumerate}[noitemsep]");
    _builder.newLine();
    {
      EList<Step> _steps = steps.getSteps();
      for(final Step step : _steps) {
        _builder.append("  ");
        CharSequence _item = this.item(step);
        _builder.append(_item, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    return _builder;
  }
  
  private int lastStepPoints = 1;
  
  public CharSequence item(final Step step) {
    CharSequence _xblockexpression = null;
    {
      int _points = this.points(step);
      final boolean close = (_points < this.lastStepPoints);
      this.lastStepPoints = this.points(step);
      StringConcatenation _builder = new StringConcatenation();
      {
        if (close) {
          String _whiteSpacesBefore = this.whiteSpacesBefore(step);
          _builder.append(_whiteSpacesBefore);
          _builder.append("\\end{enumerate}");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\\item ");
      CharSequence _dependingOnStepType = this.dependingOnStepType(step);
      _builder.append(_dependingOnStepType);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence dependingOnStepType(final Step step) {
    StringConcatenation _builder = new StringConcatenation();
    {
      RaiseErrorNow _exception = step.getException();
      boolean _tripleNotEquals = (_exception != null);
      if (_tripleNotEquals) {
        String _whiteSpacesBefore = this.whiteSpacesBefore(step);
        _builder.append(_whiteSpacesBefore);
        CharSequence _throwNow = this.throwNow(step.getException());
        _builder.append(_throwNow);
        _builder.newLineIfNotEmpty();
      } else {
        IfStatement _condition = step.getCondition();
        boolean _tripleNotEquals_1 = (_condition != null);
        if (_tripleNotEquals_1) {
          String _whiteSpacesBefore_1 = this.whiteSpacesBefore(step);
          _builder.append(_whiteSpacesBefore_1);
          _builder.append("Falls ");
          String _escape = this.escape(step.getCondition().getCondition().getName());
          _builder.append(_escape);
          _builder.append(":");
          _builder.newLineIfNotEmpty();
          _builder.append("\\begin{enumerate}[noitemsep]");
          _builder.newLine();
        } else {
          Loop _loop = step.getLoop();
          boolean _tripleNotEquals_2 = (_loop != null);
          if (_tripleNotEquals_2) {
            String _whiteSpacesBefore_2 = this.whiteSpacesBefore(step);
            _builder.append(_whiteSpacesBefore_2);
            _builder.append("Solange ");
            String _escape_1 = this.escape(step.getLoop().getCondition().getName());
            _builder.append(_escape_1);
            _builder.append(":");
            _builder.newLineIfNotEmpty();
            _builder.append("\\begin{enumerate}");
            _builder.newLine();
          } else {
            String _whiteSpacesBefore_3 = this.whiteSpacesBefore(step);
            _builder.append(_whiteSpacesBefore_3);
            String _escape_2 = this.escape(step.getAction());
            _builder.append(_escape_2);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  private String whiteSpacesResult = "";
  
  private int i;
  
  private final int TAB_WITH = 4;
  
  public String whiteSpacesBefore(final Step step) {
    this.whiteSpacesResult = "";
    for (this.i = 0; (this.i < ((this.points(step) - 1) * this.TAB_WITH)); this.i++) {
      String _result = this.result;
      this.result = (_result + " ");
    }
    return this.whiteSpacesResult;
  }
  
  public CharSequence throwNow(final RaiseErrorNow e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Melde Fehler ");
    String _escape = this.escape(e.getException().getType().getName());
    _builder.append(_escape);
    return _builder;
  }
  
  public int points(final Step s) {
    int _length = s.getNumber().length();
    int _length_1 = s.getNumber().replace(".", "").length();
    return (_length - _length_1);
  }
  
  public CharSequence notesSubSection(final Notes notes) {
    StringConcatenation _builder = new StringConcatenation();
    String _escape = this.escape(notes.getContent());
    _builder.append(_escape);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence subSection(final UsedTypes types) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}[noitemsep]");
    _builder.newLine();
    {
      EList<Type> _types = types.getTypes();
      for(final Type type : _types) {
        _builder.append("\t");
        _builder.append("\\item ");
        String _name = type.getName();
        _builder.append(_name, "\t");
        {
          String _description = type.getDescription();
          boolean _tripleNotEquals = (_description != null);
          if (_tripleNotEquals) {
            _builder.append(": ");
            String _description_1 = type.getDescription();
            _builder.append(_description_1, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence subSection(final UsedExceptions exceptions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{itemize}[noitemsep]");
    _builder.newLine();
    {
      EList<ExceptionDecleration> _exceptions = exceptions.getExceptions();
      for(final ExceptionDecleration ex : _exceptions) {
        _builder.append("\t");
        _builder.append("\\item ");
        String _name = ex.getName();
        _builder.append(_name, "\t");
        {
          String _message = ex.getMessage();
          boolean _tripleNotEquals = (_message != null);
          if (_tripleNotEquals) {
            _builder.append(": ");
            String _message_1 = ex.getMessage();
            _builder.append(_message_1, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
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
