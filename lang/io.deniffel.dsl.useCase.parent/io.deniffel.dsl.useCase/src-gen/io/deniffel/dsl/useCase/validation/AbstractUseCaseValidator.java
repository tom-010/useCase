/*
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUseCaseValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(io.deniffel.dsl.useCase.useCase.UseCasePackage.eINSTANCE);
		return result;
	}
	
}
