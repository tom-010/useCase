/*
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.ui;

import com.google.inject.Injector;
import io.deniffel.dsl.useCase.ui.internal.UseCaseActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UseCaseExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(UseCaseActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		UseCaseActivator activator = UseCaseActivator.getInstance();
		return activator != null ? activator.getInjector(UseCaseActivator.IO_DENIFFEL_DSL_USECASE_USECASE) : null;
	}

}
