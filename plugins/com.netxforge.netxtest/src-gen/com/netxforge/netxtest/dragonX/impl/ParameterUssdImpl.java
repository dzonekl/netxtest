/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.BARRING;
import com.netxforge.netxtest.dragonX.CALLFORWARDING;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.LINEIDENTIFICATION;
import com.netxforge.netxtest.dragonX.ParameterUssd;
import com.netxforge.netxtest.dragonX.UE;
import com.netxforge.netxtest.dragonX.USSDREGISTRATION;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Ussd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl#getCfCode <em>Cf Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl#getServiceDelay <em>Service Delay</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl#getBarringCode <em>Barring Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl#getLiCode <em>Li Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl#getUssdregistration <em>Ussdregistration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterUssdImpl extends MinimalEObjectImpl.Container implements ParameterUssd
{
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected UE from;

  /**
   * The default value of the '{@link #getCfCode() <em>Cf Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCfCode()
   * @generated
   * @ordered
   */
  protected static final CALLFORWARDING CF_CODE_EDEFAULT = CALLFORWARDING.CFU;

  /**
   * The cached value of the '{@link #getCfCode() <em>Cf Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCfCode()
   * @generated
   * @ordered
   */
  protected CALLFORWARDING cfCode = CF_CODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected UE destination;

  /**
   * The default value of the '{@link #getServiceDelay() <em>Service Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceDelay()
   * @generated
   * @ordered
   */
  protected static final int SERVICE_DELAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getServiceDelay() <em>Service Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceDelay()
   * @generated
   * @ordered
   */
  protected int serviceDelay = SERVICE_DELAY_EDEFAULT;

  /**
   * The default value of the '{@link #getBarringCode() <em>Barring Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBarringCode()
   * @generated
   * @ordered
   */
  protected static final BARRING BARRING_CODE_EDEFAULT = BARRING.ALL_OUTGOING_CALLS;

  /**
   * The cached value of the '{@link #getBarringCode() <em>Barring Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBarringCode()
   * @generated
   * @ordered
   */
  protected BARRING barringCode = BARRING_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected static final int CODE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected int code = CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getLiCode() <em>Li Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiCode()
   * @generated
   * @ordered
   */
  protected static final LINEIDENTIFICATION LI_CODE_EDEFAULT = LINEIDENTIFICATION.CLIP;

  /**
   * The cached value of the '{@link #getLiCode() <em>Li Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiCode()
   * @generated
   * @ordered
   */
  protected LINEIDENTIFICATION liCode = LI_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getUssdregistration() <em>Ussdregistration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUssdregistration()
   * @generated
   * @ordered
   */
  protected static final USSDREGISTRATION USSDREGISTRATION_EDEFAULT = USSDREGISTRATION.ACTIVATE;

  /**
   * The cached value of the '{@link #getUssdregistration() <em>Ussdregistration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUssdregistration()
   * @generated
   * @ordered
   */
  protected USSDREGISTRATION ussdregistration = USSDREGISTRATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterUssdImpl()
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
    return DragonXPackage.Literals.PARAMETER_USSD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (UE)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DragonXPackage.PARAMETER_USSD__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(UE newFrom)
  {
    UE oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_USSD__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CALLFORWARDING getCfCode()
  {
    return cfCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCfCode(CALLFORWARDING newCfCode)
  {
    CALLFORWARDING oldCfCode = cfCode;
    cfCode = newCfCode == null ? CF_CODE_EDEFAULT : newCfCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_USSD__CF_CODE, oldCfCode, cfCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE getDestination()
  {
    if (destination != null && destination.eIsProxy())
    {
      InternalEObject oldDestination = (InternalEObject)destination;
      destination = (UE)eResolveProxy(oldDestination);
      if (destination != oldDestination)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DragonXPackage.PARAMETER_USSD__DESTINATION, oldDestination, destination));
      }
    }
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE basicGetDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(UE newDestination)
  {
    UE oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_USSD__DESTINATION, oldDestination, destination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getServiceDelay()
  {
    return serviceDelay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceDelay(int newServiceDelay)
  {
    int oldServiceDelay = serviceDelay;
    serviceDelay = newServiceDelay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_USSD__SERVICE_DELAY, oldServiceDelay, serviceDelay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BARRING getBarringCode()
  {
    return barringCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBarringCode(BARRING newBarringCode)
  {
    BARRING oldBarringCode = barringCode;
    barringCode = newBarringCode == null ? BARRING_CODE_EDEFAULT : newBarringCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_USSD__BARRING_CODE, oldBarringCode, barringCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(int newCode)
  {
    int oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_USSD__CODE, oldCode, code));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LINEIDENTIFICATION getLiCode()
  {
    return liCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiCode(LINEIDENTIFICATION newLiCode)
  {
    LINEIDENTIFICATION oldLiCode = liCode;
    liCode = newLiCode == null ? LI_CODE_EDEFAULT : newLiCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_USSD__LI_CODE, oldLiCode, liCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public USSDREGISTRATION getUssdregistration()
  {
    return ussdregistration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUssdregistration(USSDREGISTRATION newUssdregistration)
  {
    USSDREGISTRATION oldUssdregistration = ussdregistration;
    ussdregistration = newUssdregistration == null ? USSDREGISTRATION_EDEFAULT : newUssdregistration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.PARAMETER_USSD__USSDREGISTRATION, oldUssdregistration, ussdregistration));
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
      case DragonXPackage.PARAMETER_USSD__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case DragonXPackage.PARAMETER_USSD__CF_CODE:
        return getCfCode();
      case DragonXPackage.PARAMETER_USSD__DESTINATION:
        if (resolve) return getDestination();
        return basicGetDestination();
      case DragonXPackage.PARAMETER_USSD__SERVICE_DELAY:
        return getServiceDelay();
      case DragonXPackage.PARAMETER_USSD__BARRING_CODE:
        return getBarringCode();
      case DragonXPackage.PARAMETER_USSD__CODE:
        return getCode();
      case DragonXPackage.PARAMETER_USSD__LI_CODE:
        return getLiCode();
      case DragonXPackage.PARAMETER_USSD__USSDREGISTRATION:
        return getUssdregistration();
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
      case DragonXPackage.PARAMETER_USSD__FROM:
        setFrom((UE)newValue);
        return;
      case DragonXPackage.PARAMETER_USSD__CF_CODE:
        setCfCode((CALLFORWARDING)newValue);
        return;
      case DragonXPackage.PARAMETER_USSD__DESTINATION:
        setDestination((UE)newValue);
        return;
      case DragonXPackage.PARAMETER_USSD__SERVICE_DELAY:
        setServiceDelay((Integer)newValue);
        return;
      case DragonXPackage.PARAMETER_USSD__BARRING_CODE:
        setBarringCode((BARRING)newValue);
        return;
      case DragonXPackage.PARAMETER_USSD__CODE:
        setCode((Integer)newValue);
        return;
      case DragonXPackage.PARAMETER_USSD__LI_CODE:
        setLiCode((LINEIDENTIFICATION)newValue);
        return;
      case DragonXPackage.PARAMETER_USSD__USSDREGISTRATION:
        setUssdregistration((USSDREGISTRATION)newValue);
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
      case DragonXPackage.PARAMETER_USSD__FROM:
        setFrom((UE)null);
        return;
      case DragonXPackage.PARAMETER_USSD__CF_CODE:
        setCfCode(CF_CODE_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_USSD__DESTINATION:
        setDestination((UE)null);
        return;
      case DragonXPackage.PARAMETER_USSD__SERVICE_DELAY:
        setServiceDelay(SERVICE_DELAY_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_USSD__BARRING_CODE:
        setBarringCode(BARRING_CODE_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_USSD__CODE:
        setCode(CODE_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_USSD__LI_CODE:
        setLiCode(LI_CODE_EDEFAULT);
        return;
      case DragonXPackage.PARAMETER_USSD__USSDREGISTRATION:
        setUssdregistration(USSDREGISTRATION_EDEFAULT);
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
      case DragonXPackage.PARAMETER_USSD__FROM:
        return from != null;
      case DragonXPackage.PARAMETER_USSD__CF_CODE:
        return cfCode != CF_CODE_EDEFAULT;
      case DragonXPackage.PARAMETER_USSD__DESTINATION:
        return destination != null;
      case DragonXPackage.PARAMETER_USSD__SERVICE_DELAY:
        return serviceDelay != SERVICE_DELAY_EDEFAULT;
      case DragonXPackage.PARAMETER_USSD__BARRING_CODE:
        return barringCode != BARRING_CODE_EDEFAULT;
      case DragonXPackage.PARAMETER_USSD__CODE:
        return code != CODE_EDEFAULT;
      case DragonXPackage.PARAMETER_USSD__LI_CODE:
        return liCode != LI_CODE_EDEFAULT;
      case DragonXPackage.PARAMETER_USSD__USSDREGISTRATION:
        return ussdregistration != USSDREGISTRATION_EDEFAULT;
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
    result.append(" (cfCode: ");
    result.append(cfCode);
    result.append(", serviceDelay: ");
    result.append(serviceDelay);
    result.append(", barringCode: ");
    result.append(barringCode);
    result.append(", code: ");
    result.append(code);
    result.append(", liCode: ");
    result.append(liCode);
    result.append(", ussdregistration: ");
    result.append(ussdregistration);
    result.append(')');
    return result.toString();
  }

} //ParameterUssdImpl
