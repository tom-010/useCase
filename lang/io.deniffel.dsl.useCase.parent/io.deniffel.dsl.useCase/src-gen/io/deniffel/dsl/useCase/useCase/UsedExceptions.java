/**
 * generated by Xtext 2.14.0
 */
package io.deniffel.dsl.useCase.useCase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Exceptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.UsedExceptions#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getUsedExceptions()
 * @model
 * @generated
 */
public interface UsedExceptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
   * The list contents are of type {@link io.deniffel.dsl.useCase.useCase.ExceptionDecleration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceptions</em>' containment reference list.
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getUsedExceptions_Exceptions()
   * @model containment="true"
   * @generated
   */
  EList<ExceptionDecleration> getExceptions();

} // UsedExceptions
