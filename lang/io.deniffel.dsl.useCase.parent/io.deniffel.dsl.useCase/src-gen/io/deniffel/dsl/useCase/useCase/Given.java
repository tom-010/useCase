/**
 * generated by Xtext 2.14.0
 */
package io.deniffel.dsl.useCase.useCase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Given</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Given#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getGiven()
 * @model
 * @generated
 */
public interface Given extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getGiven_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link io.deniffel.dsl.useCase.useCase.Given#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // Given
