/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.ParamResponseType;
import com.netxforge.netxtest.dragonX.ParamType;
import com.netxforge.netxtest.dragonX.UE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParamTypeImpl#getUeRef <em>Ue Ref</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParamTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParamTypeImpl#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamTypeImpl extends MinimalEObjectImpl.Container implements ParamType
{
  /**
   * The cached value of the '{@link #getUeRef() <em>Ue Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUeRef()
   * @generated
   * @ordered
   */
  protected UE ueRef;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected ParamResponseType response;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamTypeImpl()
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
    return DragonXPackage.Literals.PARAM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE getUeRef()
  {
    if (ueRef != null && ueRef.eIsProxy())
    {
      InternalEObject oldUeRef = (InternalEObject)ueRef;
      ueRef = (UE)eResolveProxy(oldUeRef);
      if (ueRef != oldUeRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DragonXPackage.PARAM_TYPE__UE_REF, oldUeRef, ueRef));
      }
    }
    return ueRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE basicGetUeRef()
  {
    return ueRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUeRef(UE newUeRef)
  {
    UE oldUeRef = ueRef;
    ueRef = newUeRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAM_TYPE__UE_REF, oldUeRef, ueRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAM_TYPE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamResponseType getResponse()
  {
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResponse(ParamResponseType newResponse, NotificationChain msgs)
  {
    ParamResponseType oldResponse = response;
    response = newResponse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAM_TYPE__RESPONSE, oldResponse, newResponse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse(ParamResponseType newResponse)
  {
    if (newResponse != response)
    {
      NotificationChain msgs = null;
      if (response != null)
        msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DragonXPackage.PARAM_TYPE__RESPONSE, null, msgs);
      if (newResponse != null)
        msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DragonXPackage.PARAM_TYPE__RESPONSE, null, msgs);
      msgs = basicSetResponse(newResponse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAM_TYPE__RESPONSE, newResponse, newResponse));
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
      case DragonXPackage.PARAM_TYPE__RESPONSE:
        return basicSetResponse(null, msgs);
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
      case DragonXPackage.PARAM_TYPE__UE_REF:
        if (resolve) return getUeRef();
        return basicGetUeRef();
      case DragonXPackage.PARAM_TYPE__VALUE:
        return getValue();
      case DragonXPackage.PARAM_TYPE__RESPONSE:
        return getResponse();
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
      case DragonXPackage.PARAM_TYPE__UE_REF:
        setUeRef((UE)newValue);
        return;
      case DragonXPackage.PARAM_TYPE__VALUE:
        setValue((Integer)newValue);
        return;
      case DragonXPackage.PARAM_TYPE__RESPONSE:
        setResponse((ParamResponseType)newValue);
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
      case DragonXPackage.PARAM_TYPE__UE_REF:
        setUeRef((UE)null);
        return;
      case DragonXPackage.PARAM_TYPE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DragonXPackage.PARAM_TYPE__RESPONSE:
        setResponse((ParamResponseType)null);
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
      case DragonXPackage.PARAM_TYPE__UE_REF:
        return ueRef != null;
      case DragonXPackage.PARAM_TYPE__VALUE:
        return value != VALUE_EDEFAULT;
      case DragonXPackage.PARAM_TYPE__RESPONSE:
        return response != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //ParamTypeImpl
