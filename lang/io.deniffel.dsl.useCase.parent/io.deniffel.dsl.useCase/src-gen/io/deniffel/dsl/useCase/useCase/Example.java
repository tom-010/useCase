/**
 * generated by Xtext 2.14.0
 */
package io.deniffel.dsl.useCase.useCase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getName <em>Name</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getDescription <em>Description</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getGiven <em>Given</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getGivenAnd <em>Given And</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getWhen <em>When</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getWhenAnd <em>When And</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getThen <em>Then</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getThenAnd <em>Then And</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.Example#getExplaination <em>Explaination</em>}</li>
 * </ul>
 *
 * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample()
 * @model
 * @generated
 */
public interface Example extends EObject
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
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.deniffel.dsl.useCase.useCase.Example#getName <em>Name</em>}' attribute.
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
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link io.deniffel.dsl.useCase.useCase.Example#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Given</b></em>' containment reference list.
   * The list contents are of type {@link io.deniffel.dsl.useCase.useCase.Given}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Given</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Given</em>' containment reference list.
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_Given()
   * @model containment="true"
   * @generated
   */
  EList<Given> getGiven();

  /**
   * Returns the value of the '<em><b>Given And</b></em>' containment reference list.
   * The list contents are of type {@link io.deniffel.dsl.useCase.useCase.GivenAnd}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Given And</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Given And</em>' containment reference list.
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_GivenAnd()
   * @model containment="true"
   * @generated
   */
  EList<GivenAnd> getGivenAnd();

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference list.
   * The list contents are of type {@link io.deniffel.dsl.useCase.useCase.When}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference list.
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_When()
   * @model containment="true"
   * @generated
   */
  EList<When> getWhen();

  /**
   * Returns the value of the '<em><b>When And</b></em>' containment reference list.
   * The list contents are of type {@link io.deniffel.dsl.useCase.useCase.WhenAnd}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When And</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When And</em>' containment reference list.
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_WhenAnd()
   * @model containment="true"
   * @generated
   */
  EList<WhenAnd> getWhenAnd();

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference list.
   * The list contents are of type {@link io.deniffel.dsl.useCase.useCase.Then}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference list.
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_Then()
   * @model containment="true"
   * @generated
   */
  EList<Then> getThen();

  /**
   * Returns the value of the '<em><b>Then And</b></em>' containment reference list.
   * The list contents are of type {@link io.deniffel.dsl.useCase.useCase.ThenAnd}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then And</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then And</em>' containment reference list.
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_ThenAnd()
   * @model containment="true"
   * @generated
   */
  EList<ThenAnd> getThenAnd();

  /**
   * Returns the value of the '<em><b>Explaination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explaination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explaination</em>' attribute.
   * @see #setExplaination(String)
   * @see io.deniffel.dsl.useCase.useCase.UseCasePackage#getExample_Explaination()
   * @model
   * @generated
   */
  String getExplaination();

  /**
   * Sets the value of the '{@link io.deniffel.dsl.useCase.useCase.Example#getExplaination <em>Explaination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explaination</em>' attribute.
   * @see #getExplaination()
   * @generated
   */
  void setExplaination(String value);

} // Example
