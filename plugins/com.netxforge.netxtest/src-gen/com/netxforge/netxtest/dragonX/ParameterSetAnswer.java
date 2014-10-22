/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterSetAnswer#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterSetAnswer()
 * @model
 * @generated
 */
public interface ParameterSetAnswer extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.netxforge.netxtest.dragonX.ParameterAnswer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterSetAnswer_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ParameterAnswer> getParameters();

} // ParameterSetAnswer
