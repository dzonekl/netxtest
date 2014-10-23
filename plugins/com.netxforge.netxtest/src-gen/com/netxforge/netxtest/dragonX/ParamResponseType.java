/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParamResponseType#getParamResponse <em>Param Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParamResponseType()
 * @model
 * @generated
 */
public interface ParamResponseType extends EObject
{
  /**
   * Returns the value of the '<em><b>Param Response</b></em>' attribute list.
   * The list contents are of type {@link com.netxforge.netxtest.dragonX.PARAM_RESPONSE}.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.PARAM_RESPONSE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Response</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Response</em>' attribute list.
   * @see com.netxforge.netxtest.dragonX.PARAM_RESPONSE
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParamResponseType_ParamResponse()
   * @model unique="false"
   * @generated
   */
  EList<PARAM_RESPONSE> getParamResponse();

} // ParamResponseType
