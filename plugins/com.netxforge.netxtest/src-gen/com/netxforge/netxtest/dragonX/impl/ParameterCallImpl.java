/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.CALLRESPONSE;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.ParameterCall;
import com.netxforge.netxtest.dragonX.UE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterCallImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterCallImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterCallImpl#getCallingTime <em>Calling Time</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterCallImpl#getOfhookResponse <em>Ofhook Response</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterCallImpl#getResponseTime <em>Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterCallImpl extends MinimalEObjectImpl.Container implements ParameterCall
{
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected UE from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected UE to;

  /**
   * The default value of the '{@link #getCallingTime() <em>Calling Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallingTime()
   * @generated
   * @ordered
   */
  protected static final int CALLING_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCallingTime() <em>Calling Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallingTime()
   * @generated
   * @ordered
   */
  protected int callingTime = CALLING_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getOfhookResponse() <em>Ofhook Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfhookResponse()
   * @generated
   * @ordered
   */
  protected static final CALLRESPONSE OFHOOK_RESPONSE_EDEFAULT = CALLRESPONSE.LISTENING;

  /**
   * The cached value of the '{@link #getOfhookResponse() <em>Ofhook Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfhookResponse()
   * @generated
   * @ordered
   */
  protected CALLRESPONSE ofhookResponse = OFHOOK_RESPONSE_EDEFAULT;

  /**
   * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseTime()
   * @generated
   * @ordered
   */
  protected static final int RESPONSE_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseTime()
   * @generated
   * @ordered
   */
  protected int responseTime = RESPONSE_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterCallImpl()
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
    return DragonXPackage.Literals.PARAMETER_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (UE)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DragonXPackage.PARAMETER_CALL__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(UE newFrom)
  {
    UE oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_CALL__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (UE)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DragonXPackage.PARAMETER_CALL__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(UE newTo)
  {
    UE oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_CALL__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCallingTime()
  {
    return callingTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallingTime(int newCallingTime)
  {
    int oldCallingTime = callingTime;
    callingTime = newCallingTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_CALL__CALLING_TIME, oldCallingTime, callingTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CALLRESPONSE getOfhookResponse()
  {
    return ofhookResponse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOfhookResponse(CALLRESPONSE newOfhookResponse)
  {
    CALLRESPONSE oldOfhookResponse = ofhookResponse;
    ofhookResponse = newOfhookResponse == null ? OFHOOK_RESPONSE_EDEFAULT : newOfhookResponse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_CALL__OFHOOK_RESPONSE, oldOfhookResponse, ofhookResponse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getResponseTime()
  {
    return responseTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponseTime(int newResponseTime)
  {
    int oldResponseTime = responseTime;
    responseTime = newResponseTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_CALL__RESPONSE_TIME, oldResponseTime, responseTime));
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
      case DragonXPackage.PARAMETER_CALL__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case DragonXPackage.PARAMETER_CALL__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case DragonXPackage.PARAMETER_CALL__CALLING_TIME:
        return getCallingTime();
      case DragonXPackage.PARAMETER_CALL__OFHOOK_RESPONSE:
        return getOfhookResponse();
      case DragonXPackage.PARAMETER_CALL__RESPONSE_TIME:
        return getResponseTime();
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
      case DragonXPackage.PARAMETER_CALL__FROM:
        setFrom((UE)newValue);
        return;
      case DragonXPackage.PARAMETER_CALL__TO:
        setTo((UE)newValue);
        return;
      case DragonXPackage.PARAMETER_CALL__CALLING_TIME:
        setCallingTime((Integer)newValue);
        return;
      case DragonXPackage.PARAMETER_CALL__OFHOOK_RESPONSE:
        setOfhookResponse((CALLRESPONSE)newValue);
        return;
      case DragonXPackage.PARAMETER_CALL__RESPONSE_TIME:
        setResponseTime((Integer)newValue);
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
      case DragonXPackage.PARAMETER_CALL__FROM:
        setFrom((UE)null);
        return;
      case DragonXPackage.PARAMETER_CALL__TO:
        setTo((UE)null);
        return;
      case DragonXPackage.PARAMETER_CALL__CALLING_TIME:
        setCallingTime(CALLING_TIME_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_CALL__OFHOOK_RESPONSE:
        setOfhookResponse(OFHOOK_RESPONSE_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_CALL__RESPONSE_TIME:
        setResponseTime(RESPONSE_TIME_EDEFAULT);
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
      case DragonXPackage.PARAMETER_CALL__FROM:
        return from != null;
      case DragonXPackage.PARAMETER_CALL__TO:
        return to != null;
      case DragonXPackage.PARAMETER_CALL__CALLING_TIME:
        return callingTime != CALLING_TIME_EDEFAULT;
      case DragonXPackage.PARAMETER_CALL__OFHOOK_RESPONSE:
        return ofhookResponse != OFHOOK_RESPONSE_EDEFAULT;
      case DragonXPackage.PARAMETER_CALL__RESPONSE_TIME:
        return responseTime != RESPONSE_TIME_EDEFAULT;
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
    result.append(" (callingTime: ");
    result.append(callingTime);
    result.append(", ofhookResponse: ");
    result.append(ofhookResponse);
    result.append(", responseTime: ");
    result.append(responseTime);
    result.append(')');
    return result.toString();
  }

} //ParameterCallImpl
