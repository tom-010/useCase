/**
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.useCase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Type#getName <em>Name</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Type#getDescription <em>Description</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Type#getImportInfo <em>Import Info</em>}</li>
 * </ul>
 *
 * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
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
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.deniffel.dsl.useCase.useCase.Type#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getType_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link io.deniffel.dsl.useCase.useCase.Type#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Import Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Info</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Info</em>' attribute.
   * @see #setImportInfo(String)
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getType_ImportInfo()
   * @model
   * @generated
   */
  String getImportInfo();

  /**
   * Sets the value of the '{@link io.deniffel.dsl.useCase.useCase.Type#getImportInfo <em>Import Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Info</em>' attribute.
   * @see #getImportInfo()
   * @generated
   */
  void setImportInfo(String value);

} // Type
