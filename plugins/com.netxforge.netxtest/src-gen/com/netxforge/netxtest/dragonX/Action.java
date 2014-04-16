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
 *   <li>{@link com.netxforge.netxtest.dragonX.Action#getAction <em>Action</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.Action#getParameters <em>Parameters</em>}</li>
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
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.ACTIONS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.ACTIONS
   * @see #setAction(ACTIONS)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getAction_Action()
   * @model
   * @generated
   */
  ACTIONS getAction();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.Action#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.ACTIONS
   * @see #getAction()
   * @generated
   */
  void setAction(ACTIONS value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.netxforge.netxtest.dragonX.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getAction_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // Action
