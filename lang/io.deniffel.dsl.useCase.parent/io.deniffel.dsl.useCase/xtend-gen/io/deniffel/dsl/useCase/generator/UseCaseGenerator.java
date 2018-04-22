package io.deniffel.dsl.useCase.generator;

import io.deniffel.dsl.useCase.generator.JavaGenerator;
import io.deniffel.dsl.useCase.generator.LatexGenerator;
import io.deniffel.dsl.useCase.generator.PlantUmlGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class UseCaseGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    new PlantUmlGenerator().doGenerate(resource, fsa, context);
    new LatexGenerator().doGenerate(resource, fsa, context);
    new JavaGenerator().doGenerate(resource, fsa, context);
  }
}
