package io.deniffel.dsl.useCase.generator;

import com.google.common.collect.Iterables;
import io.deniffel.dsl.useCase.generator.ClassNamingStrategy;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;
import io.deniffel.dsl.useCase.useCase.Description;
import io.deniffel.dsl.useCase.useCase.Input;
import io.deniffel.dsl.useCase.useCase.Inputs;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.Notes;
import io.deniffel.dsl.useCase.useCase.Output;
import io.deniffel.dsl.useCase.useCase.Outputs;
import io.deniffel.dsl.useCase.useCase.Type;
import io.deniffel.dsl.useCase.useCase.UseCase;
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
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model model : _filter) {
      EList<UseCase> _useCases = model.getUseCases();
      for (final UseCase usecase : _useCases) {
        {
          usecase.setName(this.classNamingStrategy.convert(usecase.getName()));
          String _name = usecase.getName();
          String _plus = (_name + ".java");
          fsa.generateFile(_plus, this.compile(usecase, model.getTypes()));
        }
      }
    }
  }
  
  public CharSequence compile(final UseCase usecase, final EList<Type> types) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Type t : types) {
        CharSequence _compile = this.compile(t);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      int _size = usecase.getAllowedUserGroups().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("import io.deniffel.auth.ACL;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<Description> _descriptions = usecase.getDescriptions();
      for(final Description d : _descriptions) {
        CharSequence _compile_1 = this.compile(d);
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _size_1 = usecase.getAllowedUserGroups().size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append("@ACL(allowedFor={");
        final Function1<AllowedUserGroup, CharSequence> _function = (AllowedUserGroup it) -> {
          return it.getName();
        };
        String _join = IterableExtensions.<AllowedUserGroup>join(usecase.getAllowedUserGroups().get(0).getGroups(), ", ", _function);
        _builder.append(_join);
        _builder.append("})");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("public class ");
    String _convert = this.classNamingStrategy.convert(usecase.getName());
    _builder.append(_convert);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Inputs> _inputs = usecase.getInputs();
      for(final Inputs s : _inputs) {
        _builder.append("\t");
        CharSequence _compile_2 = this.compile(s);
        _builder.append(_compile_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Outputs> _outputs = usecase.getOutputs();
      for(final Outputs s_1 : _outputs) {
        _builder.append("\t");
        CharSequence _compile_3 = this.compile(s_1);
        _builder.append(_compile_3, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/* NOTES:");
    _builder.newLine();
    {
      EList<Notes> _notes = usecase.getNotes();
      for(final Notes n : _notes) {
        _builder.append("\t");
        String _content = n.getContent();
        _builder.append(_content, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String getName(final AllowedUserGroup group) {
    return group.getName();
  }
  
  public CharSequence compile(final AllowedUserGroup group) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = group.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
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
        String _content = i_1.getContent();
        _builder.append(_content, "\t\t");
        _builder.append(" = ");
        String _content_1 = i_1.getContent();
        _builder.append(_content_1, "\t\t");
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
  
  public CharSequence compile(final Outputs outputs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class Output {");
    _builder.newLine();
    {
      EList<Output> _outputs = outputs.getOutputs();
      for(final Output o : _outputs) {
        _builder.append("\t");
        _builder.append("public ");
        CharSequence _compile = this.compile(o);
        _builder.append(_compile, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
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
      for(final Output o_1 : _outputs_1) {
        _builder.append("\t\t");
        _builder.append("this.");
        String _content = o_1.getContent();
        _builder.append(_content, "\t\t");
        _builder.append(" = ");
        String _content_1 = o_1.getContent();
        _builder.append(_content_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Output output) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = output.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _content = output.getContent();
    _builder.append(_content);
    return _builder;
  }
  
  public CharSequence compile(final Input input) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = input.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _content = input.getContent();
    _builder.append(_content);
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
}
