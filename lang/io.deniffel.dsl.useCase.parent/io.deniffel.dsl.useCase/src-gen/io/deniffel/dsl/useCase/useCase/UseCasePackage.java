/**
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.useCase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.deniffel.dsl.useCase.useCase.UseCaseFactory
 * @model kind="package"
 * @generated
 */
public interface UseCasePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "useCase";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.deniffel.io/dsl/useCase/UseCase";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "useCase";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UseCasePackage eINSTANCE = io.deniffel.dsl.useCase.useCase.impl.UseCasePackageImpl.init();

  /**
   * The meta object id for the '{@link io.deniffel.dsl.useCase.useCase.impl.UseCaseImpl <em>Use Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.deniffel.dsl.useCase.useCase.impl.UseCaseImpl
   * @see io.deniffel.dsl.useCase.useCase.impl.UseCasePackageImpl#getUseCase()
   * @generated
   */
  int USE_CASE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__SECTIONS = 1;

  /**
   * The number of structural features of the '<em>Use Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link io.deniffel.dsl.useCase.useCase.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.deniffel.dsl.useCase.useCase.impl.SectionImpl
   * @see io.deniffel.dsl.useCase.useCase.impl.UseCasePackageImpl#getSection()
   * @generated
   */
  int SECTION = 1;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link io.deniffel.dsl.useCase.useCase.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.deniffel.dsl.useCase.useCase.impl.DescriptionImpl
   * @see io.deniffel.dsl.useCase.useCase.impl.UseCasePackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__NAME = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link io.deniffel.dsl.useCase.useCase.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Case</em>'.
   * @see io.deniffel.dsl.useCase.useCase.UseCase
   * @generated
   */
  EClass getUseCase();

  /**
   * Returns the meta object for the attribute '{@link io.deniffel.dsl.useCase.useCase.UseCase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.deniffel.dsl.useCase.useCase.UseCase#getName()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Name();

  /**
   * Returns the meta object for the containment reference list '{@link io.deniffel.dsl.useCase.useCase.UseCase#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see io.deniffel.dsl.useCase.useCase.UseCase#getSections()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Sections();

  /**
   * Returns the meta object for class '{@link io.deniffel.dsl.useCase.useCase.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see io.deniffel.dsl.useCase.useCase.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for class '{@link io.deniffel.dsl.useCase.useCase.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see io.deniffel.dsl.useCase.useCase.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute '{@link io.deniffel.dsl.useCase.useCase.Description#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.deniffel.dsl.useCase.useCase.Description#getName()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UseCaseFactory getUseCaseFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link io.deniffel.dsl.useCase.useCase.impl.UseCaseImpl <em>Use Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.deniffel.dsl.useCase.useCase.impl.UseCaseImpl
     * @see io.deniffel.dsl.useCase.useCase.impl.UseCasePackageImpl#getUseCase()
     * @generated
     */
    EClass USE_CASE = eINSTANCE.getUseCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__NAME = eINSTANCE.getUseCase_Name();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__SECTIONS = eINSTANCE.getUseCase_Sections();

    /**
     * The meta object literal for the '{@link io.deniffel.dsl.useCase.useCase.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.deniffel.dsl.useCase.useCase.impl.SectionImpl
     * @see io.deniffel.dsl.useCase.useCase.impl.UseCasePackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '{@link io.deniffel.dsl.useCase.useCase.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.deniffel.dsl.useCase.useCase.impl.DescriptionImpl
     * @see io.deniffel.dsl.useCase.useCase.impl.UseCasePackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__NAME = eINSTANCE.getDescription_Name();

  }

} //UseCasePackage
