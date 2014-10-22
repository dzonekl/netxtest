/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterCall#getFrom <em>From</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterCall#getTo <em>To</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterCall#getCallingTime <em>Calling Time</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterCall#getOfhookResponse <em>Ofhook Response</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterCall#getResponseTime <em>Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterCall()
 * @model
 * @generated
 */
public interface ParameterCall extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(UE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterCall_From()
   * @model
   * @generated
   */
  UE getFrom();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterCall#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(UE value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(UE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterCall_To()
   * @model
   * @generated
   */
  UE getTo();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterCall#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(UE value);

  /**
   * Returns the value of the '<em><b>Calling Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calling Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calling Time</em>' attribute.
   * @see #setCallingTime(int)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterCall_CallingTime()
   * @model
   * @generated
   */
  int getCallingTime();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterCall#getCallingTime <em>Calling Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Calling Time</em>' attribute.
   * @see #getCallingTime()
   * @generated
   */
  void setCallingTime(int value);

  /**
   * Returns the value of the '<em><b>Ofhook Response</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.CALLRESPONSE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ofhook Response</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ofhook Response</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.CALLRESPONSE
   * @see #setOfhookResponse(CALLRESPONSE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterCall_OfhookResponse()
   * @model
   * @generated
   */
  CALLRESPONSE getOfhookResponse();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterCall#getOfhookResponse <em>Ofhook Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ofhook Response</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.CALLRESPONSE
   * @see #getOfhookResponse()
   * @generated
   */
  void setOfhookResponse(CALLRESPONSE value);

  /**
   * Returns the value of the '<em><b>Response Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response Time</em>' attribute.
   * @see #setResponseTime(int)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterCall_ResponseTime()
   * @model
   * @generated
   */
  int getResponseTime();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterCall#getResponseTime <em>Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Time</em>' attribute.
   * @see #getResponseTime()
   * @generated
   */
  void setResponseTime(int value);

} // ParameterCall
