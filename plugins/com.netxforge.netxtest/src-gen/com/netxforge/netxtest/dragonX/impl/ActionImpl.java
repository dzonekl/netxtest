/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.ACTIONCODE;
import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.Parameter;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ActionImpl#getActionCode <em>Action Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ActionImpl#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getActionCode() <em>Action Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionCode()
   * @generated
   * @ordered
   */
  protected static final ACTIONCODE ACTION_CODE_EDEFAULT = ACTIONCODE.CALL;

  /**
   * The cached value of the '{@link #getActionCode() <em>Action Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionCode()
   * @generated
   * @ordered
   */
  protected ACTIONCODE actionCode = ACTION_CODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterSet() <em>Parameter Set</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterSet()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameterSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return DragonXPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACTIONCODE getActionCode()
  {
    return actionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionCode(ACTIONCODE newActionCode)
  {
    ACTIONCODE oldActionCode = actionCode;
    actionCode = newActionCode == null ? ACTION_CODE_EDEFAULT : newActionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.ACTION__ACTION_CODE, oldActionCode, actionCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameterSet()
  {
    if (parameterSet == null)
    {
      parameterSet = new EObjectContainmentEList<Parameter>(Parameter.class, this, DragonXPackage.ACTION__PARAMETER_SET);
    }
    return parameterSet;
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
      case DragonXPackage.ACTION__PARAMETER_SET:
        return ((InternalEList<?>)getParameterSet()).basicRemove(otherEnd, msgs);
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
      case DragonXPackage.ACTION__ACTION_CODE:
        return getActionCode();
      case DragonXPackage.ACTION__PARAMETER_SET:
        return getParameterSet();
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
      case DragonXPackage.ACTION__ACTION_CODE:
        setActionCode((ACTIONCODE)newValue);
        return;
      case DragonXPackage.ACTION__PARAMETER_SET:
        getParameterSet().clear();
        getParameterSet().addAll((Collection<? extends Parameter>)newValue);
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
      case DragonXPackage.ACTION__ACTION_CODE:
        setActionCode(ACTION_CODE_EDEFAULT);
        return;
      case DragonXPackage.ACTION__PARAMETER_SET:
        getParameterSet().clear();
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
      case DragonXPackage.ACTION__ACTION_CODE:
        return actionCode != ACTION_CODE_EDEFAULT;
      case DragonXPackage.ACTION__PARAMETER_SET:
        return parameterSet != null && !parameterSet.isEmpty();
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
    result.append(" (actionCode: ");
    result.append(actionCode);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
