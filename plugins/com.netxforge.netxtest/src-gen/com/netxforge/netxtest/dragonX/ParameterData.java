/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterData#getFrom <em>From</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterData#getUrl <em>Url</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterData#getTo <em>To</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterData#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterData()
 * @model
 * @generated
 */
public interface ParameterData extends EObject
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
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterData_From()
   * @model
   * @generated
   */
  UE getFrom();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterData#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(UE value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterData_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterData#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

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
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterData_To()
   * @model
   * @generated
   */
  UE getTo();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterData#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(UE value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' attribute.
   * @see #setData(String)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterData_Data()
   * @model
   * @generated
   */
  String getData();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterData#getData <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' attribute.
   * @see #getData()
   * @generated
   */
  void setData(String value);

} // ParameterData
