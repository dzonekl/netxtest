/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Mixer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterMixer#getMixer <em>Mixer</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterMixer#getValue <em>Value</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterMixer#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterMixer()
 * @model
 * @generated
 */
public interface ParameterMixer extends EObject
{
  /**
   * Returns the value of the '<em><b>Mixer</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.MIXER}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixer</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.MIXER
   * @see #setMixer(MIXER)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterMixer_Mixer()
   * @model
   * @generated
   */
  MIXER getMixer();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterMixer#getMixer <em>Mixer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mixer</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.MIXER
   * @see #getMixer()
   * @generated
   */
  void setMixer(MIXER value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterMixer_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterMixer#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.MIXEROPTIONS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.MIXEROPTIONS
   * @see #setOption(MIXEROPTIONS)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterMixer_Option()
   * @model
   * @generated
   */
  MIXEROPTIONS getOption();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterMixer#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.MIXEROPTIONS
   * @see #getOption()
   * @generated
   */
  void setOption(MIXEROPTIONS value);

} // ParameterMixer
