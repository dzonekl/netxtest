/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE Meta Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.UEMetaObject#getParams <em>Params</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.UEMetaObject#getParamValue <em>Param Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getUEMetaObject()
 * @model
 * @generated
 */
public interface UEMetaObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.UEPARAMS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.UEPARAMS
   * @see #setParams(UEPARAMS)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getUEMetaObject_Params()
   * @model
   * @generated
   */
  UEPARAMS getParams();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.UEMetaObject#getParams <em>Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.UEPARAMS
   * @see #getParams()
   * @generated
   */
  void setParams(UEPARAMS value);

  /**
   * Returns the value of the '<em><b>Param Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Value</em>' attribute.
   * @see #setParamValue(String)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getUEMetaObject_ParamValue()
   * @model
   * @generated
   */
  String getParamValue();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.UEMetaObject#getParamValue <em>Param Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param Value</em>' attribute.
   * @see #getParamValue()
   * @generated
   */
  void setParamValue(String value);

} // UEMetaObject
