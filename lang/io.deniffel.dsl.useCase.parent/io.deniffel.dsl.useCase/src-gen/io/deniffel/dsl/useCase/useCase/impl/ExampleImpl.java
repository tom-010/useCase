/**
 * generated by Xtext 2.14.0
 */
package io.deniffel.dsl.useCase.useCase.impl;

import io.deniffel.dsl.useCase.useCase.Example;
import io.deniffel.dsl.useCase.useCase.Given;
import io.deniffel.dsl.useCase.useCase.GivenAnd;
import io.deniffel.dsl.useCase.useCase.Then;
import io.deniffel.dsl.useCase.useCase.ThenAnd;
import io.deniffel.dsl.useCase.useCase.UseCasePackage;
import io.deniffel.dsl.useCase.useCase.When;
import io.deniffel.dsl.useCase.useCase.WhenAnd;

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
 * An implementation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getGivenAnd <em>Given And</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getWhen <em>When</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getWhenAnd <em>When And</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getThen <em>Then</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getThenAnd <em>Then And</em>}</li>
 *   <li>{@link io.deniffel.dsl.useCase.useCase.impl.ExampleImpl#getExplaination <em>Explaination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleImpl extends MinimalEObjectImpl.Container implements Example
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGiven()
   * @generated
   * @ordered
   */
  protected EList<Given> given;

  /**
   * The cached value of the '{@link #getGivenAnd() <em>Given And</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGivenAnd()
   * @generated
   * @ordered
   */
  protected EList<GivenAnd> givenAnd;

  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected EList<When> when;

  /**
   * The cached value of the '{@link #getWhenAnd() <em>When And</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenAnd()
   * @generated
   * @ordered
   */
  protected EList<WhenAnd> whenAnd;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected EList<Then> then;

  /**
   * The cached value of the '{@link #getThenAnd() <em>Then And</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenAnd()
   * @generated
   * @ordered
   */
  protected EList<ThenAnd> thenAnd;

  /**
   * The default value of the '{@link #getExplaination() <em>Explaination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplaination()
   * @generated
   * @ordered
   */
  protected static final String EXPLAINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExplaination() <em>Explaination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplaination()
   * @generated
   * @ordered
   */
  protected String explaination = EXPLAINATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExampleImpl()
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
    return UseCasePackage.Literals.EXAMPLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.EXAMPLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.EXAMPLE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Given> getGiven()
  {
    if (given == null)
    {
      given = new EObjectContainmentEList<Given>(Given.class, this, UseCasePackage.EXAMPLE__GIVEN);
    }
    return given;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GivenAnd> getGivenAnd()
  {
    if (givenAnd == null)
    {
      givenAnd = new EObjectContainmentEList<GivenAnd>(GivenAnd.class, this, UseCasePackage.EXAMPLE__GIVEN_AND);
    }
    return givenAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<When> getWhen()
  {
    if (when == null)
    {
      when = new EObjectContainmentEList<When>(When.class, this, UseCasePackage.EXAMPLE__WHEN);
    }
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenAnd> getWhenAnd()
  {
    if (whenAnd == null)
    {
      whenAnd = new EObjectContainmentEList<WhenAnd>(WhenAnd.class, this, UseCasePackage.EXAMPLE__WHEN_AND);
    }
    return whenAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Then> getThen()
  {
    if (then == null)
    {
      then = new EObjectContainmentEList<Then>(Then.class, this, UseCasePackage.EXAMPLE__THEN);
    }
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ThenAnd> getThenAnd()
  {
    if (thenAnd == null)
    {
      thenAnd = new EObjectContainmentEList<ThenAnd>(ThenAnd.class, this, UseCasePackage.EXAMPLE__THEN_AND);
    }
    return thenAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExplaination()
  {
    return explaination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplaination(String newExplaination)
  {
    String oldExplaination = explaination;
    explaination = newExplaination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.EXAMPLE__EXPLAINATION, oldExplaination, explaination));
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
      case UseCasePackage.EXAMPLE__GIVEN:
        return ((InternalEList<?>)getGiven()).basicRemove(otherEnd, msgs);
      case UseCasePackage.EXAMPLE__GIVEN_AND:
        return ((InternalEList<?>)getGivenAnd()).basicRemove(otherEnd, msgs);
      case UseCasePackage.EXAMPLE__WHEN:
        return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
      case UseCasePackage.EXAMPLE__WHEN_AND:
        return ((InternalEList<?>)getWhenAnd()).basicRemove(otherEnd, msgs);
      case UseCasePackage.EXAMPLE__THEN:
        return ((InternalEList<?>)getThen()).basicRemove(otherEnd, msgs);
      case UseCasePackage.EXAMPLE__THEN_AND:
        return ((InternalEList<?>)getThenAnd()).basicRemove(otherEnd, msgs);
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
      case UseCasePackage.EXAMPLE__NAME:
        return getName();
      case UseCasePackage.EXAMPLE__DESCRIPTION:
        return getDescription();
      case UseCasePackage.EXAMPLE__GIVEN:
        return getGiven();
      case UseCasePackage.EXAMPLE__GIVEN_AND:
        return getGivenAnd();
      case UseCasePackage.EXAMPLE__WHEN:
        return getWhen();
      case UseCasePackage.EXAMPLE__WHEN_AND:
        return getWhenAnd();
      case UseCasePackage.EXAMPLE__THEN:
        return getThen();
      case UseCasePackage.EXAMPLE__THEN_AND:
        return getThenAnd();
      case UseCasePackage.EXAMPLE__EXPLAINATION:
        return getExplaination();
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
      case UseCasePackage.EXAMPLE__NAME:
        setName((String)newValue);
        return;
      case UseCasePackage.EXAMPLE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case UseCasePackage.EXAMPLE__GIVEN:
        getGiven().clear();
        getGiven().addAll((Collection<? extends Given>)newValue);
        return;
      case UseCasePackage.EXAMPLE__GIVEN_AND:
        getGivenAnd().clear();
        getGivenAnd().addAll((Collection<? extends GivenAnd>)newValue);
        return;
      case UseCasePackage.EXAMPLE__WHEN:
        getWhen().clear();
        getWhen().addAll((Collection<? extends When>)newValue);
        return;
      case UseCasePackage.EXAMPLE__WHEN_AND:
        getWhenAnd().clear();
        getWhenAnd().addAll((Collection<? extends WhenAnd>)newValue);
        return;
      case UseCasePackage.EXAMPLE__THEN:
        getThen().clear();
        getThen().addAll((Collection<? extends Then>)newValue);
        return;
      case UseCasePackage.EXAMPLE__THEN_AND:
        getThenAnd().clear();
        getThenAnd().addAll((Collection<? extends ThenAnd>)newValue);
        return;
      case UseCasePackage.EXAMPLE__EXPLAINATION:
        setExplaination((String)newValue);
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
      case UseCasePackage.EXAMPLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UseCasePackage.EXAMPLE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case UseCasePackage.EXAMPLE__GIVEN:
        getGiven().clear();
        return;
      case UseCasePackage.EXAMPLE__GIVEN_AND:
        getGivenAnd().clear();
        return;
      case UseCasePackage.EXAMPLE__WHEN:
        getWhen().clear();
        return;
      case UseCasePackage.EXAMPLE__WHEN_AND:
        getWhenAnd().clear();
        return;
      case UseCasePackage.EXAMPLE__THEN:
        getThen().clear();
        return;
      case UseCasePackage.EXAMPLE__THEN_AND:
        getThenAnd().clear();
        return;
      case UseCasePackage.EXAMPLE__EXPLAINATION:
        setExplaination(EXPLAINATION_EDEFAULT);
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
      case UseCasePackage.EXAMPLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UseCasePackage.EXAMPLE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case UseCasePackage.EXAMPLE__GIVEN:
        return given != null && !given.isEmpty();
      case UseCasePackage.EXAMPLE__GIVEN_AND:
        return givenAnd != null && !givenAnd.isEmpty();
      case UseCasePackage.EXAMPLE__WHEN:
        return when != null && !when.isEmpty();
      case UseCasePackage.EXAMPLE__WHEN_AND:
        return whenAnd != null && !whenAnd.isEmpty();
      case UseCasePackage.EXAMPLE__THEN:
        return then != null && !then.isEmpty();
      case UseCasePackage.EXAMPLE__THEN_AND:
        return thenAnd != null && !thenAnd.isEmpty();
      case UseCasePackage.EXAMPLE__EXPLAINATION:
        return EXPLAINATION_EDEFAULT == null ? explaination != null : !EXPLAINATION_EDEFAULT.equals(explaination);
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
    result.append(", description: ");
    result.append(description);
    result.append(", explaination: ");
    result.append(explaination);
    result.append(')');
    return result.toString();
  }

} //ExampleImpl
