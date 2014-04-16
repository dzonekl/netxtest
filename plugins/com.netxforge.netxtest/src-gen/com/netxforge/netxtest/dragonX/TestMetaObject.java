/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Meta Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.TestMetaObject#getMetatype <em>Metatype</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.TestMetaObject#getMetaValue <em>Meta Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getTestMetaObject()
 * @model
 * @generated
 */
public interface TestMetaObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Metatype</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.METATYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metatype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metatype</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.METATYPE
   * @see #setMetatype(METATYPE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getTestMetaObject_Metatype()
   * @model
   * @generated
   */
  METATYPE getMetatype();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.TestMetaObject#getMetatype <em>Metatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metatype</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.METATYPE
   * @see #getMetatype()
   * @generated
   */
  void setMetatype(METATYPE value);

  /**
   * Returns the value of the '<em><b>Meta Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Value</em>' attribute.
   * @see #setMetaValue(String)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getTestMetaObject_MetaValue()
   * @model
   * @generated
   */
  String getMetaValue();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.TestMetaObject#getMetaValue <em>Meta Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Value</em>' attribute.
   * @see #getMetaValue()
   * @generated
   */
  void setMetaValue(String value);

} // TestMetaObject
