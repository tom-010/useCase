package io.deniffel.dsl.useCase.generator;

import com.google.common.collect.Iterables;
import io.deniffel.dsl.useCase.generator.ClassMemberNamingStrategy;
import io.deniffel.dsl.useCase.generator.ClassNamingStrategy;
import io.deniffel.dsl.useCase.useCase.Description;
import io.deniffel.dsl.useCase.useCase.Example;
import io.deniffel.dsl.useCase.useCase.Given;
import io.deniffel.dsl.useCase.useCase.GivenAnd;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.PackagePart;
import io.deniffel.dsl.useCase.useCase.Then;
import io.deniffel.dsl.useCase.useCase.ThenAnd;
import io.deniffel.dsl.useCase.useCase.When;
import io.deniffel.dsl.useCase.useCase.WhenAnd;
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
public class CucumberGenerator extends AbstractGenerator {
  private ClassNamingStrategy classNamingStrategy = new ClassNamingStrategy();
  
  private ClassMemberNamingStrategy variableNaming = new ClassMemberNamingStrategy();
  
  private ClassMemberNamingStrategy methodNaming = new ClassMemberNamingStrategy();
  
  private ClassMemberNamingStrategy packageNaming = new ClassMemberNamingStrategy();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model model : _filter) {
      this.createFeature(model, fsa);
    }
  }
  
  public void createFeature(final Model model, final IFileSystemAccess2 fsa) {
    String _replace = model.getCompany().replace(".", "/");
    String _plus = (_replace + "/");
    String _path = this.path(model.getPackage());
    String _plus_1 = (_plus + _path);
    final String dirPath = (_plus_1 + "/");
    String _convert = this.classNamingStrategy.convert(model.getUseCases().get(0).getName());
    String _plus_2 = (("/test/features/" + dirPath) + _convert);
    String _plus_3 = (_plus_2 + ".feature");
    fsa.generateFile(_plus_3, 
      this.compileFeature(model));
  }
  
  public CharSequence compileFeature(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#language: de");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Funktionalität: ");
    String _name = model.getUseCases().get(0).getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      int _size = model.getUseCases().get(0).getDescriptions().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          EList<Description> _descriptions = model.getUseCases().get(0).getDescriptions();
          for(final Description description : _descriptions) {
            String _name_1 = description.getName();
            _builder.append(_name_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<Example> _examples = model.getExamples();
      for(final Example example : _examples) {
        CharSequence _compile = this.compile(example);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Example example) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: ");
    String _name = example.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    {
      EList<Given> _given = example.getGiven();
      for(final Given given : _given) {
        _builder.append("  ");
        _builder.append("Gegeben ");
        String _content = given.getContent();
        _builder.append(_content, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<GivenAnd> _givenAnd = example.getGivenAnd();
      for(final GivenAnd given_1 : _givenAnd) {
        _builder.append("  ");
        _builder.append("Und ");
        String _content_1 = given_1.getContent();
        _builder.append(_content_1, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<When> _when = example.getWhen();
      for(final When when : _when) {
        _builder.append("  ");
        _builder.append("Wenn ");
        String _content_2 = when.getContent();
        _builder.append(_content_2, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<WhenAnd> _whenAnd = example.getWhenAnd();
      for(final WhenAnd when_1 : _whenAnd) {
        _builder.append("  ");
        _builder.append("Und ");
        String _content_3 = when_1.getContent();
        _builder.append(_content_3, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Then> _then = example.getThen();
      for(final Then then : _then) {
        _builder.append("  ");
        _builder.append("Dann ");
        String _content_4 = then.getContent();
        _builder.append(_content_4, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ThenAnd> _thenAnd = example.getThenAnd();
      for(final ThenAnd then_1 : _thenAnd) {
        _builder.append("  ");
        _builder.append("Und ");
        String _content_5 = then_1.getContent();
        _builder.append(_content_5, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  \t\t  ");
    _builder.newLine();
    return _builder;
  }
  
  public String path(final io.deniffel.dsl.useCase.useCase.Package ucPackage) {
    final Function1<PackagePart, CharSequence> _function = (PackagePart it) -> {
      return this.compile(it);
    };
    return IterableExtensions.<PackagePart>join(ucPackage.getParts(), "/", _function);
  }
  
  public CharSequence compile(final PackagePart part) {
    StringConcatenation _builder = new StringConcatenation();
    String _convert = this.packageNaming.convert(part.getName());
    _builder.append(_convert);
    return _builder;
  }
}
