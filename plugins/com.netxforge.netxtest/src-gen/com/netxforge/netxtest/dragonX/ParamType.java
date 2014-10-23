/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParamType#getUeRef <em>Ue Ref</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParamType#getValue <em>Value</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParamType#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParamType()
 * @model
 * @generated
 */
public interface ParamType extends EObject
{
  /**
   * Returns the value of the '<em><b>Ue Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ue Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ue Ref</em>' reference.
   * @see #setUeRef(UE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParamType_UeRef()
   * @model
   * @generated
   */
  UE getUeRef();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParamType#getUeRef <em>Ue Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ue Ref</em>' reference.
   * @see #getUeRef()
   * @generated
   */
  void setUeRef(UE value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParamType_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParamType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' containment reference.
   * @see #setResponse(ParamResponseType)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParamType_Response()
   * @model containment="true"
   * @generated
   */
  ParamResponseType getResponse();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParamType#getResponse <em>Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response</em>' containment reference.
   * @see #getResponse()
   * @generated
   */
  void setResponse(ParamResponseType value);

} // ParamType
