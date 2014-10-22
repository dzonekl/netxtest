/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Sms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterSms#getFrom <em>From</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterSms#getTo <em>To</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterSms#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterSms()
 * @model
 * @generated
 */
public interface ParameterSms extends EObject
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
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterSms_From()
   * @model
   * @generated
   */
  UE getFrom();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterSms#getFrom <em>From</em>}' reference.
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
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterSms_To()
   * @model
   * @generated
   */
  UE getTo();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterSms#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(UE value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterSms_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterSms#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // ParameterSms
