/**
 * generated by Xtext 2.14.0
 */
package io.deniffel.dsl.useCase.useCase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Description#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getDescription_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.deniffel.dsl.useCase.useCase.Description#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Description
