/**
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.useCase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.deniffel.dsl.useCase.useCase.UseCasePackage
 * @generated
 */
public interface UseCaseFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UseCaseFactory eINSTANCE = io.deniffel.dsl.useCase.useCase.impl.UseCaseFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Use Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Case</em>'.
   * @generated
   */
  UseCase createUseCase();

  /**
   * Returns a new object of class '<em>Steps</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Steps</em>'.
   * @generated
   */
  Steps createSteps();

  /**
   * Returns a new object of class '<em>Used Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Used Types</em>'.
   * @generated
   */
  UsedTypes createUsedTypes();

  /**
   * Returns a new object of class '<em>Used Exceptions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Used Exceptions</em>'.
   * @generated
   */
  UsedExceptions createUsedExceptions();

  /**
   * Returns a new object of class '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Step</em>'.
   * @generated
   */
  Step createStep();

  /**
   * Returns a new object of class '<em>Raise Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Raise Error</em>'.
   * @generated
   */
  RaiseError createRaiseError();

  /**
   * Returns a new object of class '<em>Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception</em>'.
   * @generated
   */
  Exception createException();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Notes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Notes</em>'.
   * @generated
   */
  Notes createNotes();

  /**
   * Returns a new object of class '<em>Inputs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inputs</em>'.
   * @generated
   */
  Inputs createInputs();

  /**
   * Returns a new object of class '<em>Outputs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Outputs</em>'.
   * @generated
   */
  Outputs createOutputs();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Exception Decleration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Decleration</em>'.
   * @generated
   */
  ExceptionDecleration createExceptionDecleration();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Allowed User Groups</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allowed User Groups</em>'.
   * @generated
   */
  AllowedUserGroups createAllowedUserGroups();

  /**
   * Returns a new object of class '<em>Allowed User Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allowed User Group</em>'.
   * @generated
   */
  AllowedUserGroup createAllowedUserGroup();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UseCasePackage getUseCasePackage();

} //UseCaseFactory
