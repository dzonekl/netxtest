/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.MIXER;
import com.netxforge.netxtest.dragonX.MIXEROPTIONS;
import com.netxforge.netxtest.dragonX.ParameterMixer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Mixer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterMixerImpl#getMixer <em>Mixer</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterMixerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterMixerImpl#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterMixerImpl extends MinimalEObjectImpl.Container implements ParameterMixer
{
  /**
   * The default value of the '{@link #getMixer() <em>Mixer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixer()
   * @generated
   * @ordered
   */
  protected static final MIXER MIXER_EDEFAULT = MIXER.P1;

  /**
   * The cached value of the '{@link #getMixer() <em>Mixer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixer()
   * @generated
   * @ordered
   */
  protected MIXER mixer = MIXER_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected static final MIXEROPTIONS OPTION_EDEFAULT = MIXEROPTIONS.RESET;

  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected MIXEROPTIONS option = OPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterMixerImpl()
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
    return DragonXPackage.Literals.PARAMETER_MIXER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MIXER getMixer()
  {
    return mixer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMixer(MIXER newMixer)
  {
    MIXER oldMixer = mixer;
    mixer = newMixer == null ? MIXER_EDEFAULT : newMixer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_MIXER__MIXER, oldMixer, mixer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_MIXER__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MIXEROPTIONS getOption()
  {
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOption(MIXEROPTIONS newOption)
  {
    MIXEROPTIONS oldOption = option;
    option = newOption == null ? OPTION_EDEFAULT : newOption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_MIXER__OPTION, oldOption, option));
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
      case DragonXPackage.PARAMETER_MIXER__MIXER:
        return getMixer();
      case DragonXPackage.PARAMETER_MIXER__VALUE:
        return getValue();
      case DragonXPackage.PARAMETER_MIXER__OPTION:
        return getOption();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DragonXPackage.PARAMETER_MIXER__MIXER:
        setMixer((MIXER)newValue);
        return;
      case DragonXPackage.PARAMETER_MIXER__VALUE:
        setValue((Integer)newValue);
        return;
      case DragonXPackage.PARAMETER_MIXER__OPTION:
        setOption((MIXEROPTIONS)newValue);
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
      case DragonXPackage.PARAMETER_MIXER__MIXER:
        setMixer(MIXER_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_MIXER__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_MIXER__OPTION:
        setOption(OPTION_EDEFAULT);
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
      case DragonXPackage.PARAMETER_MIXER__MIXER:
        return mixer != MIXER_EDEFAULT;
      case DragonXPackage.PARAMETER_MIXER__VALUE:
        return value != VALUE_EDEFAULT;
      case DragonXPackage.PARAMETER_MIXER__OPTION:
        return option != OPTION_EDEFAULT;
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
    result.append(" (mixer: ");
    result.append(mixer);
    result.append(", value: ");
    result.append(value);
    result.append(", option: ");
    result.append(option);
    result.append(')');
    return result.toString();
  }

} //ParameterMixerImpl
