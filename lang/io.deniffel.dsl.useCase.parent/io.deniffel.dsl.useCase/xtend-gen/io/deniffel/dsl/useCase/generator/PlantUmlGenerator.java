package io.deniffel.dsl.useCase.generator;

import com.google.common.collect.Iterables;
import io.deniffel.dsl.useCase.generator.ClassMemberNamingStrategy;
import io.deniffel.dsl.useCase.generator.ClassNamingStrategy;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroups;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.PackagePart;
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
public class PlantUmlGenerator extends AbstractGenerator {
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
    String _replace = model.getCompany().replace(".", "/");
    String _plus = (_replace + "/");
    String _path = this.path(model.getPackage());
    String _plus_1 = (_plus + _path);
    final String dirPath = (_plus_1 + "/");
    String _convert = this.classNamingStrategy.convert(usecase.getName());
    String _plus_2 = (("/main/resources/diagrams/" + dirPath) + _convert);
    String _plus_3 = (_plus_2 + ".plantuml");
    fsa.generateFile(_plus_3, 
      this.createUseCaseDiagram(usecase, model.getCompany(), model.getPackage(), model.getTypes().getTypes(), model.getExceptions()));
  }
  
  public CharSequence createUseCaseDiagram(final UseCase usecase, final String company, final io.deniffel.dsl.useCase.useCase.Package ucPackage, final EList<Type> types, final UsedExceptions exceptions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    _builder.newLine();
    {
      EList<AllowedUserGroups> _allowedUserGroups = usecase.getAllowedUserGroups();
      for(final AllowedUserGroups groups : _allowedUserGroups) {
        {
          EList<AllowedUserGroup> _groups = groups.getGroups();
          for(final AllowedUserGroup group : _groups) {
            String _name = group.getName();
            _builder.append(_name);
            _builder.append(" --> (");
            String _name_1 = usecase.getName();
            _builder.append(_name_1);
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("@enduml");
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
