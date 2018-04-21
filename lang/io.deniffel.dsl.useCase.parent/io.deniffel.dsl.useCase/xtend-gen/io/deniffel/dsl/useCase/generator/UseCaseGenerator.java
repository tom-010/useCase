package io.deniffel.dsl.useCase.generator;

import com.google.common.collect.Iterables;
import io.deniffel.dsl.useCase.generator.ClassMemberNamingStrategy;
import io.deniffel.dsl.useCase.generator.ClassNamingStrategy;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;
import io.deniffel.dsl.useCase.useCase.Condition;
import io.deniffel.dsl.useCase.useCase.Description;
import io.deniffel.dsl.useCase.useCase.ExceptionDecleration;
import io.deniffel.dsl.useCase.useCase.Input;
import io.deniffel.dsl.useCase.useCase.Inputs;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.Notes;
import io.deniffel.dsl.useCase.useCase.Output;
import io.deniffel.dsl.useCase.useCase.Outputs;
import io.deniffel.dsl.useCase.useCase.PackagePart;
import io.deniffel.dsl.useCase.useCase.PreConditions;
import io.deniffel.dsl.useCase.useCase.RaiseErrorConditional;
import io.deniffel.dsl.useCase.useCase.RaiseErrorNow;
import io.deniffel.dsl.useCase.useCase.Step;
import io.deniffel.dsl.useCase.useCase.Steps;
import io.deniffel.dsl.useCase.useCase.Type;
import io.deniffel.dsl.useCase.useCase.UseCase;
import io.deniffel.dsl.useCase.useCase.UsedExceptions;
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
public class UseCaseGenerator extends AbstractGenerator {
  private ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
  
  private ClassMemberNamingStrategy variableNaming = new ClassMemberNamingStrategy();
  
  private ClassMemberNamingStrategy methodNaming = new ClassMemberNamingStrategy();
  
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
    usecase.setName(this.classNamingStrategy.convert(usecase.getName()));
    String _replace = model.getCompany().replace(".", "/");
    String _plus = (_replace + "/");
    String _path = this.path(model.getPackage());
    String _plus_1 = (_plus + _path);
    String _plus_2 = (_plus_1 + "/");
    String _name = usecase.getName();
    String _plus_3 = (_plus_2 + _name);
    String _plus_4 = (_plus_3 + ".java");
    fsa.generateFile(_plus_4, 
      this.createJavaInterface(usecase, model.getCompany(), model.getPackage(), model.getTypes().getTypes(), model.getExceptions()));
  }
  
  public String path(final io.deniffel.dsl.useCase.useCase.Package ucPackage) {
    final Function1<PackagePart, CharSequence> _function = (PackagePart it) -> {
      return this.compile(it);
    };
    return IterableExtensions.<PackagePart>join(ucPackage.getParts(), "/", _function);
  }
  
  public CharSequence createJavaInterface(final UseCase usecase, final String company, final io.deniffel.dsl.useCase.useCase.Package ucPackage, final EList<Type> types, final UsedExceptions exceptions) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _javaPackage = this.toJavaPackage(ucPackage, company);
    _builder.append(_javaPackage);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _importStatements = this.importStatements(types);
    _builder.append(_importStatements);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _importStatements_1 = this.importStatements(exceptions);
    _builder.append(_importStatements_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _requiredFormalImports = this.requiredFormalImports(usecase);
    _builder.append(_requiredFormalImports);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _descriptions = this.descriptions(usecase);
    _builder.append(_descriptions);
    _builder.newLineIfNotEmpty();
    _builder.append("public interface ");
    String _convert = this.classNamingStrategy.convert(usecase.getName());
    _builder.append(_convert);
    _builder.append(" extends UseCase<Input, Output> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _allowedUserGroups = this.allowedUserGroups(usecase);
    _builder.append(_allowedUserGroups, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _inputs = this.inputs(usecase);
    _builder.append(_inputs, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _outputs = this.outputs(usecase);
    _builder.append(_outputs, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _checkPreconditions = this.checkPreconditions(usecase);
    _builder.append(_checkPreconditions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _steps = this.steps(usecase);
    _builder.append(_steps, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _inputValidations = this.inputValidations(usecase);
    _builder.append(_inputValidations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _notes = this.notes(usecase);
    _builder.append(_notes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _stepInterfaceDefinitions = this.stepInterfaceDefinitions(usecase);
    _builder.append(_stepInterfaceDefinitions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _ioInterfaceDefinitions = this.ioInterfaceDefinitions(usecase);
    _builder.append(_ioInterfaceDefinitions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _precoditionInterfaceDefintions = this.precoditionInterfaceDefintions(usecase);
    _builder.append(_precoditionInterfaceDefintions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _exceptionInterfaceDefinitions = this.exceptionInterfaceDefinitions(exceptions);
    _builder.append(_exceptionInterfaceDefinitions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toJavaPackage(final io.deniffel.dsl.useCase.useCase.Package ucPackage, final String company) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(company);
    _builder.append(".");
    final Function1<PackagePart, CharSequence> _function = (PackagePart it) -> {
      return this.compile(it);
    };
    String _join = IterableExtensions.<PackagePart>join(ucPackage.getParts(), ".", _function);
    _builder.append(_join);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PackagePart part) {
    StringConcatenation _builder = new StringConcatenation();
    String _convert = this.packageNaming.convert(part.getName());
    _builder.append(_convert);
    return _builder;
  }
  
  public CharSequence importStatements(final EList<Type> types) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Type type : types) {
        CharSequence _compile = this.compile(type);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _importInfo = type.getImportInfo();
      boolean _tripleNotEquals = (_importInfo != null);
      if (_tripleNotEquals) {
        _builder.append("import ");
        String _importInfo_1 = type.getImportInfo();
        _builder.append(_importInfo_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("import ");
        String _name = type.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence importStatements(final UsedExceptions exceptions) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ExceptionDecleration> _exceptions = exceptions.getExceptions();
      for(final ExceptionDecleration exception : _exceptions) {
        {
          String _importInfo = exception.getImportInfo();
          boolean _tripleNotEquals = (_importInfo != null);
          if (_tripleNotEquals) {
            _builder.append("import ");
            String _importInfo_1 = exception.getImportInfo();
            _builder.append(_importInfo_1);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence requiredFormalImports(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = usecase.getAllowedUserGroups().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("import io.deniffel.auth.ACL;");
        _builder.newLine();
        _builder.append("import io.deniffel.useCase.UseCase;");
        _builder.newLine();
        _builder.append("import io.deniffel.useCase.ErrorMessages;");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence descriptions(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Description> _descriptions = usecase.getDescriptions();
      for(final Description description : _descriptions) {
        CharSequence _compile = this.compile(description);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Description description) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* ");
    String _name = description.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence allowedUserGroups(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = usecase.getAllowedUserGroups().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("default String[] allowedFor {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return new String[] {");
        final Function1<AllowedUserGroup, CharSequence> _function = (AllowedUserGroup it) -> {
          return this.compile(it);
        };
        String _join = IterableExtensions.<AllowedUserGroup>join(usecase.getAllowedUserGroups().get(0).getGroups(), ", ", _function);
        _builder.append(_join, "\t");
        _builder.append("};");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final AllowedUserGroup group) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _upperCase = group.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence inputs(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Inputs> _inputs = usecase.getInputs();
      for(final Inputs input : _inputs) {
        CharSequence _compile = this.compile(input);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Inputs inputs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class Input {");
    _builder.newLine();
    {
      EList<Input> _inputs = inputs.getInputs();
      for(final Input i : _inputs) {
        _builder.append("\t");
        _builder.append("public ");
        CharSequence _compile = this.compile(i);
        _builder.append(_compile, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Input(");
    final Function1<Input, CharSequence> _function = (Input it) -> {
      return this.compile(it);
    };
    String _join = IterableExtensions.<Input>join(inputs.getInputs(), ", ", _function);
    _builder.append(_join, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<Input> _inputs_1 = inputs.getInputs();
      for(final Input i_1 : _inputs_1) {
        _builder.append("\t\t");
        _builder.append("this.");
        String _convert = this.variableNaming.convert(i_1.getContent());
        _builder.append(_convert, "\t\t");
        _builder.append(" = ");
        String _convert_1 = this.variableNaming.convert(i_1.getContent());
        _builder.append(_convert_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Input input) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = input.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _convert = this.variableNaming.convert(input.getContent());
    _builder.append(_convert);
    return _builder;
  }
  
  public CharSequence outputs(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Outputs> _outputs = usecase.getOutputs();
      for(final Outputs output : _outputs) {
        CharSequence _generateInnerClass = this.generateInnerClass(output);
        _builder.append(_generateInnerClass);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateInnerClass(final Outputs outputs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class Output {");
    _builder.newLine();
    {
      EList<Output> _outputs = outputs.getOutputs();
      for(final Output output : _outputs) {
        _builder.append("\t");
        _builder.append("public ");
        CharSequence _compile = this.compile(output);
        _builder.append(_compile, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("public ErrorMessages errors;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Output(");
    final Function1<Output, CharSequence> _function = (Output it) -> {
      return this.compile(it);
    };
    String _join = IterableExtensions.<Output>join(outputs.getOutputs(), ", ", _function);
    _builder.append(_join, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<Output> _outputs_1 = outputs.getOutputs();
      for(final Output output_1 : _outputs_1) {
        _builder.append("\t\t");
        _builder.append("this.");
        String _content = output_1.getContent();
        _builder.append(_content, "\t\t");
        _builder.append(" = ");
        String _content_1 = output_1.getContent();
        _builder.append(_content_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Output(ErrorMessages errors) {this.errors = errors;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean wasSuccessful() {return errors == null || errors.size() == 0;}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Output output) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = output.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _convert = this.variableNaming.convert(output.getContent());
    _builder.append(_convert);
    return _builder;
  }
  
  public CharSequence checkPreconditions(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("default ErrorMessages checkPreconditions() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ErrorMessages errors = new ErrorMessages();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("checkForRequiredInputs(getInput(), errors);");
    _builder.newLine();
    {
      EList<Condition> _conditions = usecase.getPreconditions().getConditions();
      for(final Condition condition : _conditions) {
        _builder.append("\t");
        String _convert = this.methodNaming.convert(condition.getContent());
        _builder.append(_convert, "\t");
        _builder.append("(getInput(), errors);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("return errors;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence steps(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Steps> _steps = usecase.getSteps();
      for(final Steps step : _steps) {
        CharSequence _compile = this.compile(step);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Steps steps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("default Output steps() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ErrorMessages errors = checkPreconditions();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(errors.size() > 0) ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new Output(errors); ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Step> _steps = steps.getSteps();
      for(final Step s : _steps) {
        _builder.append("\t");
        CharSequence _compile = this.compile(s);
        _builder.append(_compile, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("return getOutput();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Step step) {
    StringConcatenation _builder = new StringConcatenation();
    {
      RaiseErrorNow _exception = step.getException();
      boolean _tripleNotEquals = (_exception != null);
      if (_tripleNotEquals) {
        CharSequence _throwNow = this.throwNow(step.getException());
        _builder.append(_throwNow);
      } else {
        String _convert = this.methodNaming.convert(step.getAction());
        _builder.append(_convert);
        _builder.append("()");
      }
    }
    return _builder;
  }
  
  public CharSequence throwNow(final RaiseErrorNow e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("throw new ");
    String _convert = this.classNamingStrategy.convert(e.getException().getType().getName());
    _builder.append(_convert);
    _builder.append("(\"");
    String _message = e.getException().getType().getMessage();
    _builder.append(_message);
    _builder.append("\");");
    return _builder;
  }
  
  public CharSequence inputValidations(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Inputs> _inputs = usecase.getInputs();
      for(final Inputs input : _inputs) {
        CharSequence _compileRequiredInputValidation = this.compileRequiredInputValidation(input);
        _builder.append(_compileRequiredInputValidation);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileRequiredInputValidation(final Inputs inputs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("default void checkForRequiredInputs(Input input, ErrorMessages errors) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Input input = getInput();");
    _builder.newLine();
    {
      EList<Input> _inputs = inputs.getInputs();
      for(final Input i : _inputs) {
        {
          String _optional = i.getOptional();
          boolean _tripleEquals = (_optional == null);
          if (_tripleEquals) {
            _builder.append("\t");
            _builder.append("if(input.");
            String _convert = this.variableNaming.convert(i.getContent());
            _builder.append(_convert, "\t");
            _builder.append("==null) errors.add(\"\'");
            String _content = i.getContent();
            _builder.append(_content, "\t");
            _builder.append("\' can\'t be null\");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence notes(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* NOTES:");
    _builder.newLine();
    {
      EList<Notes> _notes = usecase.getNotes();
      for(final Notes note : _notes) {
        String _content = note.getContent();
        _builder.append(_content);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence stepInterfaceDefinitions(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// steps");
    _builder.newLine();
    {
      EList<Steps> _steps = usecase.getSteps();
      for(final Steps steps : _steps) {
        {
          EList<Step> _steps_1 = steps.getSteps();
          for(final Step step : _steps_1) {
            _builder.append("void ");
            CharSequence _compile = this.compile(step);
            _builder.append(_compile);
            {
              RaiseErrorConditional _error = step.getError();
              boolean _tripleNotEquals = (_error != null);
              if (_tripleNotEquals) {
                _builder.append(" throws ");
                String _name = step.getError().getException().getType().getName();
                _builder.append(_name);
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence ioInterfaceDefinitions(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// I/O");
    _builder.newLine();
    _builder.append("Input getInput();");
    _builder.newLine();
    _builder.append("Output getOutput();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence precoditionInterfaceDefintions(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((usecase.getPreconditions() != null) && (usecase.getPreconditions().getConditions().size() > 0))) {
        _builder.append("// precoditions");
        _builder.newLine();
        CharSequence _compileMethods = this.compileMethods(usecase.getPreconditions());
        _builder.append(_compileMethods);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileMethods(final PreConditions pcs) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Condition> _conditions = pcs.getConditions();
      for(final Condition p : _conditions) {
        _builder.append("void ");
        String _convert = this.methodNaming.convert(p.getContent());
        _builder.append(_convert);
        _builder.append("(Input input, ErrorMessages errors);");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence exceptionInterfaceDefinitions(final UsedExceptions exceptions) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ExceptionDecleration> _exceptions = exceptions.getExceptions();
      for(final ExceptionDecleration e : _exceptions) {
        {
          String _importInfo = e.getImportInfo();
          boolean _tripleEquals = (_importInfo == null);
          if (_tripleEquals) {
            _builder.append("public static class ");
            String _name = e.getName();
            _builder.append(_name);
            _builder.append(" extends Error { public ");
            String _name_1 = e.getName();
            _builder.append(_name_1);
            _builder.append("(){super(\"");
            String _message = e.getMessage();
            _builder.append(_message);
            _builder.append("\");} }");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
