/**
 * generated by Xtext 2.14.0
 */
package io.deniffel.dsl.useCase.useCase.impl;

import io.deniffel.dsl.useCase.useCase.ExceptionDecleration;
import io.deniffel.dsl.useCase.useCase.UseCasePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Decleration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExceptionDeclerationImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExceptionDeclerationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExceptionDeclerationImpl#getImportInfo <em>Import Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionDeclerationImpl extends MinimalEObjectImpl.Container implements ExceptionDecleration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected String message = MESSAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getImportInfo() <em>Import Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportInfo()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_INFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportInfo() <em>Import Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportInfo()
   * @generated
   * @ordered
   */
  protected String importInfo = IMPORT_INFO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExceptionDeclerationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UseCasePackage.Literals.EXCEPTION_DECLERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.EXCEPTION_DECLERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(String newMessage)
  {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.EXCEPTION_DECLERATION__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportInfo()
  {
    return importInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportInfo(String newImportInfo)
  {
    String oldImportInfo = importInfo;
    importInfo = newImportInfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.EXCEPTION_DECLERATION__IMPORT_INFO, oldImportInfo, importInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UseCasePackage.EXCEPTION_DECLERATION__NAME:
        return getName();
      case UseCasePackage.EXCEPTION_DECLERATION__MESSAGE:
        return getMessage();
      case UseCasePackage.EXCEPTION_DECLERATION__IMPORT_INFO:
        return getImportInfo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UseCasePackage.EXCEPTION_DECLERATION__NAME:
        setName((String)newValue);
        return;
      case UseCasePackage.EXCEPTION_DECLERATION__MESSAGE:
        setMessage((String)newValue);
        return;
      case UseCasePackage.EXCEPTION_DECLERATION__IMPORT_INFO:
        setImportInfo((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UseCasePackage.EXCEPTION_DECLERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UseCasePackage.EXCEPTION_DECLERATION__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
        return;
      case UseCasePackage.EXCEPTION_DECLERATION__IMPORT_INFO:
        setImportInfo(IMPORT_INFO_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UseCasePackage.EXCEPTION_DECLERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UseCasePackage.EXCEPTION_DECLERATION__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
      case UseCasePackage.EXCEPTION_DECLERATION__IMPORT_INFO:
        return IMPORT_INFO_EDEFAULT == null ? importInfo != null : !IMPORT_INFO_EDEFAULT.equals(importInfo);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", message: ");
    result.append(message);
    result.append(", importInfo: ");
    result.append(importInfo);
    result.append(')');
    return result.toString();
  }

} //ExceptionDeclerationImpl
