/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.PARAM_NAME}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.PARAM_NAME
   * @see #setName(PARAM_NAME)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameter_Name()
   * @model
   * @generated
   */
  PARAM_NAME getName();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.PARAM_NAME
   * @see #getName()
   * @generated
   */
  void setName(PARAM_NAME value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ParamType)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  ParamType getType();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ParamType value);

} // Parameter
