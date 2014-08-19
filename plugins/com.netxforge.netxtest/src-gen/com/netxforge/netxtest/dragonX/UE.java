/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.UE#getName <em>Name</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.UE#getMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getUE()
 * @model
 * @generated
 */
public interface UE extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getUE_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.UE#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
   * The list contents are of type {@link com.netxforge.netxtest.dragonX.UEMetaObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' containment reference list.
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getUE_Meta()
   * @model containment="true"
   * @generated
   */
  EList<UEMetaObject> getMeta();

} // UE
