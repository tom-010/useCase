/**
 * generated by Xtext 2.14.0
 */
package io.deniffel.dsl.useCase.useCase.impl;

import io.deniffel.dsl.useCase.useCase.Example;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.UseCase;
import io.deniffel.dsl.useCase.useCase.UseCasePackage;
import io.deniffel.dsl.useCase.useCase.UsedExceptions;
import io.deniffel.dsl.useCase.useCase.UsedTypes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ModelImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ModelImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ModelImpl#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ModelImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ModelImpl#getExamples <em>Examples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompany()
   * @generated
   * @ordered
   */
  protected static final String COMPANY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompany()
   * @generated
   * @ordered
   */
  protected String company = COMPANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected io.deniffel.dsl.useCase.useCase.Package package_;

  /**
   * The cached value of the '{@link #getUseCases() <em>Use Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseCases()
   * @generated
   * @ordered
   */
  protected EList<UseCase> useCases;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected UsedTypes types;

  /**
   * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptions()
   * @generated
   * @ordered
   */
  protected UsedExceptions exceptions;

  /**
   * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExamples()
   * @generated
   * @ordered
   */
  protected EList<Example> examples;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return UseCasePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCompany()
  {
    return company;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompany(String newCompany)
  {
    String oldCompany = company;
    company = newCompany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.MODEL__COMPANY, oldCompany, company));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public io.deniffel.dsl.useCase.useCase.Package getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(io.deniffel.dsl.useCase.useCase.Package newPackage, NotificationChain msgs)
  {
    io.deniffel.dsl.useCase.useCase.Package oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UseCasePackage.MODEL__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(io.deniffel.dsl.useCase.useCase.Package newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UseCasePackage.MODEL__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UseCasePackage.MODEL__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.MODEL__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseCase> getUseCases()
  {
    if (useCases == null)
    {
      useCases = new EObjectContainmentEList<UseCase>(UseCase.class, this, UseCasePackage.MODEL__USE_CASES);
    }
    return useCases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsedTypes getTypes()
  {
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypes(UsedTypes newTypes, NotificationChain msgs)
  {
    UsedTypes oldTypes = types;
    types = newTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UseCasePackage.MODEL__TYPES, oldTypes, newTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypes(UsedTypes newTypes)
  {
    if (newTypes != types)
    {
      NotificationChain msgs = null;
      if (types != null)
        msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UseCasePackage.MODEL__TYPES, null, msgs);
      if (newTypes != null)
        msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UseCasePackage.MODEL__TYPES, null, msgs);
      msgs = basicSetTypes(newTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.MODEL__TYPES, newTypes, newTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsedExceptions getExceptions()
  {
    return exceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExceptions(UsedExceptions newExceptions, NotificationChain msgs)
  {
    UsedExceptions oldExceptions = exceptions;
    exceptions = newExceptions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UseCasePackage.MODEL__EXCEPTIONS, oldExceptions, newExceptions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExceptions(UsedExceptions newExceptions)
  {
    if (newExceptions != exceptions)
    {
      NotificationChain msgs = null;
      if (exceptions != null)
        msgs = ((InternalEObject)exceptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UseCasePackage.MODEL__EXCEPTIONS, null, msgs);
      if (newExceptions != null)
        msgs = ((InternalEObject)newExceptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UseCasePackage.MODEL__EXCEPTIONS, null, msgs);
      msgs = basicSetExceptions(newExceptions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.MODEL__EXCEPTIONS, newExceptions, newExceptions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Example> getExamples()
  {
    if (examples == null)
    {
      examples = new EObjectContainmentEList<Example>(Example.class, this, UseCasePackage.MODEL__EXAMPLES);
    }
    return examples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UseCasePackage.MODEL__PACKAGE:
        return basicSetPackage(null, msgs);
      case UseCasePackage.MODEL__USE_CASES:
        return ((InternalEList<?>)getUseCases()).basicRemove(otherEnd, msgs);
      case UseCasePackage.MODEL__TYPES:
        return basicSetTypes(null, msgs);
      case UseCasePackage.MODEL__EXCEPTIONS:
        return basicSetExceptions(null, msgs);
      case UseCasePackage.MODEL__EXAMPLES:
        return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UseCasePackage.MODEL__COMPANY:
        return getCompany();
      case UseCasePackage.MODEL__PACKAGE:
        return getPackage();
      case UseCasePackage.MODEL__USE_CASES:
        return getUseCases();
      case UseCasePackage.MODEL__TYPES:
        return getTypes();
      case UseCasePackage.MODEL__EXCEPTIONS:
        return getExceptions();
      case UseCasePackage.MODEL__EXAMPLES:
        return getExamples();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UseCasePackage.MODEL__COMPANY:
        setCompany((String)newValue);
        return;
      case UseCasePackage.MODEL__PACKAGE:
        setPackage((io.deniffel.dsl.useCase.useCase.Package)newValue);
        return;
      case UseCasePackage.MODEL__USE_CASES:
        getUseCases().clear();
        getUseCases().addAll((Collection<? extends UseCase>)newValue);
        return;
      case UseCasePackage.MODEL__TYPES:
        setTypes((UsedTypes)newValue);
        return;
      case UseCasePackage.MODEL__EXCEPTIONS:
        setExceptions((UsedExceptions)newValue);
        return;
      case UseCasePackage.MODEL__EXAMPLES:
        getExamples().clear();
        getExamples().addAll((Collection<? extends Example>)newValue);
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
      case UseCasePackage.MODEL__COMPANY:
        setCompany(COMPANY_EDEFAULT);
        return;
      case UseCasePackage.MODEL__PACKAGE:
        setPackage((io.deniffel.dsl.useCase.useCase.Package)null);
        return;
      case UseCasePackage.MODEL__USE_CASES:
        getUseCases().clear();
        return;
      case UseCasePackage.MODEL__TYPES:
        setTypes((UsedTypes)null);
        return;
      case UseCasePackage.MODEL__EXCEPTIONS:
        setExceptions((UsedExceptions)null);
        return;
      case UseCasePackage.MODEL__EXAMPLES:
        getExamples().clear();
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
      case UseCasePackage.MODEL__COMPANY:
        return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
      case UseCasePackage.MODEL__PACKAGE:
        return package_ != null;
      case UseCasePackage.MODEL__USE_CASES:
        return useCases != null && !useCases.isEmpty();
      case UseCasePackage.MODEL__TYPES:
        return types != null;
      case UseCasePackage.MODEL__EXCEPTIONS:
        return exceptions != null;
      case UseCasePackage.MODEL__EXAMPLES:
        return examples != null && !examples.isEmpty();
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
    result.append(" (company: ");
    result.append(company);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
