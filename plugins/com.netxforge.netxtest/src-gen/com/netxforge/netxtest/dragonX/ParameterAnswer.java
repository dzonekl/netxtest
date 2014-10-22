/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getFrom <em>From</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getListeningTime <em>Listening Time</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getAnswerTime <em>Answer Time</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterAnswer()
 * @model
 * @generated
 */
public interface ParameterAnswer extends EObject
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
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterAnswer_From()
   * @model
   * @generated
   */
  UE getFrom();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(UE value);

  /**
   * Returns the value of the '<em><b>Listening Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listening Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listening Time</em>' attribute.
   * @see #setListeningTime(int)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterAnswer_ListeningTime()
   * @model
   * @generated
   */
  int getListeningTime();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getListeningTime <em>Listening Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Listening Time</em>' attribute.
   * @see #getListeningTime()
   * @generated
   */
  void setListeningTime(int value);

  /**
   * Returns the value of the '<em><b>Answer Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer Time</em>' attribute.
   * @see #setAnswerTime(int)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterAnswer_AnswerTime()
   * @model
   * @generated
   */
  int getAnswerTime();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getAnswerTime <em>Answer Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer Time</em>' attribute.
   * @see #getAnswerTime()
   * @generated
   */
  void setAnswerTime(int value);

  /**
   * Returns the value of the '<em><b>Response</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.ANSWERRESPONSE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.ANSWERRESPONSE
   * @see #setResponse(ANSWERRESPONSE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterAnswer_Response()
   * @model
   * @generated
   */
  ANSWERRESPONSE getResponse();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getResponse <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.ANSWERRESPONSE
   * @see #getResponse()
   * @generated
   */
  void setResponse(ANSWERRESPONSE value);

} // ParameterAnswer
