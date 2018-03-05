/**
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.deniffel.dsl.useCase.UseCaseRuntimeModule;
import io.deniffel.dsl.useCase.UseCaseStandaloneSetup;
import io.deniffel.dsl.useCase.ide.UseCaseIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class UseCaseIdeSetup extends UseCaseStandaloneSetup {
  @Override
  public Injector createInjector() {
    UseCaseRuntimeModule _useCaseRuntimeModule = new UseCaseRuntimeModule();
    UseCaseIdeModule _useCaseIdeModule = new UseCaseIdeModule();
    return Guice.createInjector(Modules2.mixin(_useCaseRuntimeModule, _useCaseIdeModule));
  }
}
