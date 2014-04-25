/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.UEMetaObject;
import com.netxforge.netxtest.dragonX.UEPARAMS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UE Meta Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.UEMetaObjectImpl#getParams <em>Params</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.UEMetaObjectImpl#getParamValue <em>Param Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UEMetaObjectImpl extends MinimalEObjectImpl.Container implements UEMetaObject
{
  /**
   * The default value of the '{@link #getParams() <em>Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected static final UEPARAMS PARAMS_EDEFAULT = UEPARAMS.IMEI;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected UEPARAMS params = PARAMS_EDEFAULT;

  /**
   * The default value of the '{@link #getParamValue() <em>Param Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamValue()
   * @generated
   * @ordered
   */
  protected static final String PARAM_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParamValue() <em>Param Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamValue()
   * @generated
   * @ordered
   */
  protected String paramValue = PARAM_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UEMetaObjectImpl()
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
    return DragonXPackage.Literals.UE_META_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UEPARAMS getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(UEPARAMS newParams)
  {
    UEPARAMS oldParams = params;
    params = newParams == null ? PARAMS_EDEFAULT : newParams;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.UE_META_OBJECT__PARAMS, oldParams, params));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParamValue()
  {
    return paramValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamValue(String newParamValue)
  {
    String oldParamValue = paramValue;
    paramValue = newParamValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.UE_META_OBJECT__PARAM_VALUE, oldParamValue, paramValue));
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
      case DragonXPackage.UE_META_OBJECT__PARAMS:
        return getParams();
      case DragonXPackage.UE_META_OBJECT__PARAM_VALUE:
        return getParamValue();
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
      case DragonXPackage.UE_META_OBJECT__PARAMS:
        setParams((UEPARAMS)newValue);
        return;
      case DragonXPackage.UE_META_OBJECT__PARAM_VALUE:
        setParamValue((String)newValue);
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
      case DragonXPackage.UE_META_OBJECT__PARAMS:
        setParams(PARAMS_EDEFAULT);
        return;
      case DragonXPackage.UE_META_OBJECT__PARAM_VALUE:
        setParamValue(PARAM_VALUE_EDEFAULT);
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
      case DragonXPackage.UE_META_OBJECT__PARAMS:
        return params != PARAMS_EDEFAULT;
      case DragonXPackage.UE_META_OBJECT__PARAM_VALUE:
        return PARAM_VALUE_EDEFAULT == null ? paramValue != null : !PARAM_VALUE_EDEFAULT.equals(paramValue);
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
    result.append(" (params: ");
    result.append(params);
    result.append(", paramValue: ");
    result.append(paramValue);
    result.append(')');
    return result.toString();
  }

} //UEMetaObjectImpl
