/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.Action#getActionCode <em>Action Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.Action#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Action Code</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.ACTIONCODE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Code</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.ACTIONCODE
   * @see #setActionCode(ACTIONCODE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getAction_ActionCode()
   * @model
   * @generated
   */
  ACTIONCODE getActionCode();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.Action#getActionCode <em>Action Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Code</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.ACTIONCODE
   * @see #getActionCode()
   * @generated
   */
  void setActionCode(ACTIONCODE value);

  /**
   * Returns the value of the '<em><b>Parameter Set</b></em>' containment reference list.
   * The list contents are of type {@link com.netxforge.netxtest.dragonX.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Set</em>' containment reference list.
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getAction_ParameterSet()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameterSet();

} // Action
