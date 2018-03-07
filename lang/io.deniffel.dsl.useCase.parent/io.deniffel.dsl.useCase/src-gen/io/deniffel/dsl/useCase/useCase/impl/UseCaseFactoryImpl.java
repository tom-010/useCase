/**
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.useCase.impl;

import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroups;
import io.deniffel.dsl.useCase.useCase.Condition;
import io.deniffel.dsl.useCase.useCase.Description;
import io.deniffel.dsl.useCase.useCase.ExceptionDecleration;
import io.deniffel.dsl.useCase.useCase.Input;
import io.deniffel.dsl.useCase.useCase.Inputs;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.Notes;
import io.deniffel.dsl.useCase.useCase.Output;
import io.deniffel.dsl.useCase.useCase.Outputs;
import io.deniffel.dsl.useCase.useCase.PreConditions;
import io.deniffel.dsl.useCase.useCase.RaiseError;
import io.deniffel.dsl.useCase.useCase.Step;
import io.deniffel.dsl.useCase.useCase.Steps;
import io.deniffel.dsl.useCase.useCase.Type;
import io.deniffel.dsl.useCase.useCase.UseCase;
import io.deniffel.dsl.useCase.useCase.UseCaseFactory;
import io.deniffel.dsl.useCase.useCase.UseCasePackage;
import io.deniffel.dsl.useCase.useCase.UsedExceptions;
import io.deniffel.dsl.useCase.useCase.UsedTypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseFactoryImpl extends EFactoryImpl implements UseCaseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UseCaseFactory init()
  {
    try
    {
      UseCaseFactory theUseCaseFactory = (UseCaseFactory)EPackage.Registry.INSTANCE.getEFactory(UseCasePackage.eNS_URI);
      if (theUseCaseFactory != null)
      {
        return theUseCaseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UseCaseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UseCasePackage.MODEL: return createModel();
      case UseCasePackage.USE_CASE: return createUseCase();
      case UseCasePackage.PRE_CONDITIONS: return createPreConditions();
      case UseCasePackage.CONDITION: return createCondition();
      case UseCasePackage.STEPS: return createSteps();
      case UseCasePackage.USED_TYPES: return createUsedTypes();
      case UseCasePackage.USED_EXCEPTIONS: return createUsedExceptions();
      case UseCasePackage.STEP: return createStep();
      case UseCasePackage.RAISE_ERROR: return createRaiseError();
      case UseCasePackage.EXCEPTION: return createException();
      case UseCasePackage.DESCRIPTION: return createDescription();
      case UseCasePackage.NOTES: return createNotes();
      case UseCasePackage.INPUTS: return createInputs();
      case UseCasePackage.OUTPUTS: return createOutputs();
      case UseCasePackage.TYPE: return createType();
      case UseCasePackage.EXCEPTION_DECLERATION: return createExceptionDecleration();
      case UseCasePackage.INPUT: return createInput();
      case UseCasePackage.OUTPUT: return createOutput();
      case UseCasePackage.ALLOWED_USER_GROUPS: return createAllowedUserGroups();
      case UseCasePackage.ALLOWED_USER_GROUP: return createAllowedUserGroup();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase createUseCase()
  {
    UseCaseImpl useCase = new UseCaseImpl();
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreConditions createPreConditions()
  {
    PreConditionsImpl preConditions = new PreConditionsImpl();
    return preConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Steps createSteps()
  {
    StepsImpl steps = new StepsImpl();
    return steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsedTypes createUsedTypes()
  {
    UsedTypesImpl usedTypes = new UsedTypesImpl();
    return usedTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsedExceptions createUsedExceptions()
  {
    UsedExceptionsImpl usedExceptions = new UsedExceptionsImpl();
    return usedExceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaiseError createRaiseError()
  {
    RaiseErrorImpl raiseError = new RaiseErrorImpl();
    return raiseError;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public io.deniffel.dsl.useCase.useCase.Exception createException()
  {
    ExceptionImpl exception = new ExceptionImpl();
    return exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Notes createNotes()
  {
    NotesImpl notes = new NotesImpl();
    return notes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inputs createInputs()
  {
    InputsImpl inputs = new InputsImpl();
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Outputs createOutputs()
  {
    OutputsImpl outputs = new OutputsImpl();
    return outputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionDecleration createExceptionDecleration()
  {
    ExceptionDeclerationImpl exceptionDecleration = new ExceptionDeclerationImpl();
    return exceptionDecleration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllowedUserGroups createAllowedUserGroups()
  {
    AllowedUserGroupsImpl allowedUserGroups = new AllowedUserGroupsImpl();
    return allowedUserGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllowedUserGroup createAllowedUserGroup()
  {
    AllowedUserGroupImpl allowedUserGroup = new AllowedUserGroupImpl();
    return allowedUserGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCasePackage getUseCasePackage()
  {
    return (UseCasePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UseCasePackage getPackage()
  {
    return UseCasePackage.eINSTANCE;
  }

} //UseCaseFactoryImpl
