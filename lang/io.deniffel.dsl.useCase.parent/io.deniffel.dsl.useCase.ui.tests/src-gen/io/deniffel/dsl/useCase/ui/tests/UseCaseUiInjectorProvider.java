/*
 * generated by Xtext 2.14.0
 */
package io.deniffel.dsl.useCase.ui.tests;

import com.google.inject.Injector;
import io.deniffel.dsl.useCase.ui.internal.UseCaseActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class UseCaseUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UseCaseActivator.getInstance().getInjector("io.deniffel.dsl.useCase.UseCase");
	}

}
