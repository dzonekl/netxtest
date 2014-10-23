/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.PARAM_RESPONSE;
import com.netxforge.netxtest.dragonX.ParamResponseType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParamResponseTypeImpl#getParamResponse <em>Param Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamResponseTypeImpl extends MinimalEObjectImpl.Container implements ParamResponseType
{
  /**
   * The cached value of the '{@link #getParamResponse() <em>Param Response</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamResponse()
   * @generated
   * @ordered
   */
  protected EList<PARAM_RESPONSE> paramResponse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamResponseTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DragonXPackage.Literals.PARAM_RESPONSE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PARAM_RESPONSE> getParamResponse()
  {
    if (paramResponse == null)
    {
      paramResponse = new EDataTypeEList<PARAM_RESPONSE>(PARAM_RESPONSE.class, this, DragonXPackage.PARAM_RESPONSE_TYPE__PARAM_RESPONSE);
    }
    return paramResponse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DragonXPackage.PARAM_RESPONSE_TYPE__PARAM_RESPONSE:
        return getParamResponse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DragonXPackage.PARAM_RESPONSE_TYPE__PARAM_RESPONSE:
        getParamResponse().clear();
        getParamResponse().addAll((Collection<? extends PARAM_RESPONSE>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DragonXPackage.PARAM_RESPONSE_TYPE__PARAM_RESPONSE:
        getParamResponse().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DragonXPackage.PARAM_RESPONSE_TYPE__PARAM_RESPONSE:
        return paramResponse != null && !paramResponse.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (paramResponse: ");
    result.append(paramResponse);
    result.append(')');
    return result.toString();
  }

} //ParamResponseTypeImpl
