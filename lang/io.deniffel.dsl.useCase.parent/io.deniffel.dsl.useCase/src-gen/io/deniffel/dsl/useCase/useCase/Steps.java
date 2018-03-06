/**
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.useCase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Steps#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getSteps()
 * @model
 * @generated
 */
public interface Steps extends EObject
{
  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link io.deniffel.dsl.useCase.useCase.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getSteps_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

} // Steps
