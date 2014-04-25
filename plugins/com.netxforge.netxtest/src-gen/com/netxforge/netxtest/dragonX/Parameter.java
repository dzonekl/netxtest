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
 *   <li>{@link com.netxforge.netxtest.dragonX.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.Parameter#getUeRef <em>Ue Ref</em>}</li>
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
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.ACTIONPARAMS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.ACTIONPARAMS
   * @see #setName(ACTIONPARAMS)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameter_Name()
   * @model
   * @generated
   */
  ACTIONPARAMS getName();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.ACTIONPARAMS
   * @see #getName()
   * @generated
   */
  void setName(ACTIONPARAMS value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameter_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.Parameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

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
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameter_UeRef()
   * @model
   * @generated
   */
  UE getUeRef();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.Parameter#getUeRef <em>Ue Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ue Ref</em>' reference.
   * @see #getUeRef()
   * @generated
   */
  void setUeRef(UE value);

} // Parameter
