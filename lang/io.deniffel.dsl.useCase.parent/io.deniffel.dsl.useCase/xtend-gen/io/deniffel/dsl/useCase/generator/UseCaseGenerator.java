package io.deniffel.dsl.useCase.generator;

import com.google.common.collect.Iterables;
import io.deniffel.dsl.useCase.generator.ClassNamingStrategy;
import io.deniffel.dsl.useCase.useCase.Attribute;
import io.deniffel.dsl.useCase.useCase.Attributes;
import io.deniffel.dsl.useCase.useCase.Description;
import io.deniffel.dsl.useCase.useCase.UseCase;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class UseCaseGenerator extends AbstractGenerator {
  private ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<UseCase> _filter = Iterables.<UseCase>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), UseCase.class);
    for (final UseCase e : _filter) {
      {
        e.setName(this.classNamingStrategy.convert(e.getName()));
        String _name = e.getName();
        String _plus = (_name + ".java");
        CharSequence _compile = this.compile(e);
        String _plus_1 = ("import" + _compile);
        fsa.generateFile(_plus, _plus_1);
      }
    }
  }
  
  public CharSequence compile(final UseCase usecase) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Description> _descriptions = usecase.getDescriptions();
      for(final Description d : _descriptions) {
        CharSequence _compile = this.compile(d);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("public class ");
    String _convert = this.classNamingStrategy.convert(usecase.getName());
    _builder.append(_convert);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Attributes> _sections = usecase.getSections();
      for(final Attributes s : _sections) {
        _builder.append("\t");
        CharSequence _compile_1 = this.compile(s);
        _builder.append(_compile_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
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
  
  public CharSequence compile(final Attributes attrs) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Attribute> _attrs = attrs.getAttrs();
      for(final Attribute a : _attrs) {
        CharSequence _compile = this.compile(a);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = attribute.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _content = attribute.getContent();
    _builder.append(_content);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
