/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.ANSWERRESPONSE;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.ParameterAnswer;
import com.netxforge.netxtest.dragonX.UE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterAnswerImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterAnswerImpl#getListeningTime <em>Listening Time</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterAnswerImpl#getAnswerTime <em>Answer Time</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterAnswerImpl#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterAnswerImpl extends MinimalEObjectImpl.Container implements ParameterAnswer
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
   * The default value of the '{@link #getListeningTime() <em>Listening Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeningTime()
   * @generated
   * @ordered
   */
  protected static final int LISTENING_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getListeningTime() <em>Listening Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeningTime()
   * @generated
   * @ordered
   */
  protected int listeningTime = LISTENING_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getAnswerTime() <em>Answer Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswerTime()
   * @generated
   * @ordered
   */
  protected static final int ANSWER_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAnswerTime() <em>Answer Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswerTime()
   * @generated
   * @ordered
   */
  protected int answerTime = ANSWER_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getResponse() <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected static final ANSWERRESPONSE RESPONSE_EDEFAULT = ANSWERRESPONSE.LISTENING;

  /**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected ANSWERRESPONSE response = RESPONSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterAnswerImpl()
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
    return DragonXPackage.Literals.PARAMETER_ANSWER;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DragonXPackage.PARAMETER_ANSWER__FROM, oldFrom, from));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_ANSWER__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getListeningTime()
  {
    return listeningTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListeningTime(int newListeningTime)
  {
    int oldListeningTime = listeningTime;
    listeningTime = newListeningTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_ANSWER__LISTENING_TIME, oldListeningTime, listeningTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAnswerTime()
  {
    return answerTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswerTime(int newAnswerTime)
  {
    int oldAnswerTime = answerTime;
    answerTime = newAnswerTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_ANSWER__ANSWER_TIME, oldAnswerTime, answerTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ANSWERRESPONSE getResponse()
  {
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse(ANSWERRESPONSE newResponse)
  {
    ANSWERRESPONSE oldResponse = response;
    response = newResponse == null ? RESPONSE_EDEFAULT : newResponse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_ANSWER__RESPONSE, oldResponse, response));
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
      case DragonXPackage.PARAMETER_ANSWER__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case DragonXPackage.PARAMETER_ANSWER__LISTENING_TIME:
        return getListeningTime();
      case DragonXPackage.PARAMETER_ANSWER__ANSWER_TIME:
        return getAnswerTime();
      case DragonXPackage.PARAMETER_ANSWER__RESPONSE:
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
      case DragonXPackage.PARAMETER_ANSWER__FROM:
        setFrom((UE)newValue);
        return;
      case DragonXPackage.PARAMETER_ANSWER__LISTENING_TIME:
        setListeningTime((Integer)newValue);
        return;
      case DragonXPackage.PARAMETER_ANSWER__ANSWER_TIME:
        setAnswerTime((Integer)newValue);
        return;
      case DragonXPackage.PARAMETER_ANSWER__RESPONSE:
        setResponse((ANSWERRESPONSE)newValue);
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
      case DragonXPackage.PARAMETER_ANSWER__FROM:
        setFrom((UE)null);
        return;
      case DragonXPackage.PARAMETER_ANSWER__LISTENING_TIME:
        setListeningTime(LISTENING_TIME_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_ANSWER__ANSWER_TIME:
        setAnswerTime(ANSWER_TIME_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_ANSWER__RESPONSE:
        setResponse(RESPONSE_EDEFAULT);
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
      case DragonXPackage.PARAMETER_ANSWER__FROM:
        return from != null;
      case DragonXPackage.PARAMETER_ANSWER__LISTENING_TIME:
        return listeningTime != LISTENING_TIME_EDEFAULT;
      case DragonXPackage.PARAMETER_ANSWER__ANSWER_TIME:
        return answerTime != ANSWER_TIME_EDEFAULT;
      case DragonXPackage.PARAMETER_ANSWER__RESPONSE:
        return response != RESPONSE_EDEFAULT;
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
    result.append(" (listeningTime: ");
    result.append(listeningTime);
    result.append(", answerTime: ");
    result.append(answerTime);
    result.append(", response: ");
    result.append(response);
    result.append(')');
    return result.toString();
  }

} //ParameterAnswerImpl
