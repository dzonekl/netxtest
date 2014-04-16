/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.METATYPE;
import com.netxforge.netxtest.dragonX.TestMetaObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Meta Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.TestMetaObjectImpl#getMetatype <em>Metatype</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.TestMetaObjectImpl#getMetaValue <em>Meta Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestMetaObjectImpl extends MinimalEObjectImpl.Container implements TestMetaObject
{
  /**
   * The default value of the '{@link #getMetatype() <em>Metatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetatype()
   * @generated
   * @ordered
   */
  protected static final METATYPE METATYPE_EDEFAULT = METATYPE.DESCRIPTION;

  /**
   * The cached value of the '{@link #getMetatype() <em>Metatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetatype()
   * @generated
   * @ordered
   */
  protected METATYPE metatype = METATYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getMetaValue() <em>Meta Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaValue()
   * @generated
   * @ordered
   */
  protected static final String META_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMetaValue() <em>Meta Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaValue()
   * @generated
   * @ordered
   */
  protected String metaValue = META_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestMetaObjectImpl()
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
    return DragonXPackage.Literals.TEST_META_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public METATYPE getMetatype()
  {
    return metatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetatype(METATYPE newMetatype)
  {
    METATYPE oldMetatype = metatype;
    metatype = newMetatype == null ? METATYPE_EDEFAULT : newMetatype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.TEST_META_OBJECT__METATYPE, oldMetatype, metatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMetaValue()
  {
    return metaValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaValue(String newMetaValue)
  {
    String oldMetaValue = metaValue;
    metaValue = newMetaValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DragonXPackage.TEST_META_OBJECT__META_VALUE, oldMetaValue, metaValue));
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
      case DragonXPackage.TEST_META_OBJECT__METATYPE:
        return getMetatype();
      case DragonXPackage.TEST_META_OBJECT__META_VALUE:
        return getMetaValue();
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
      case DragonXPackage.TEST_META_OBJECT__METATYPE:
        setMetatype((METATYPE)newValue);
        return;
      case DragonXPackage.TEST_META_OBJECT__META_VALUE:
        setMetaValue((String)newValue);
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
      case DragonXPackage.TEST_META_OBJECT__METATYPE:
        setMetatype(METATYPE_EDEFAULT);
        return;
      case DragonXPackage.TEST_META_OBJECT__META_VALUE:
        setMetaValue(META_VALUE_EDEFAULT);
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
      case DragonXPackage.TEST_META_OBJECT__METATYPE:
        return metatype != METATYPE_EDEFAULT;
      case DragonXPackage.TEST_META_OBJECT__META_VALUE:
        return META_VALUE_EDEFAULT == null ? metaValue != null : !META_VALUE_EDEFAULT.equals(metaValue);
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
    result.append(" (metatype: ");
    result.append(metatype);
    result.append(", metaValue: ");
    result.append(metaValue);
    result.append(')');
    return result.toString();
  }

} //TestMetaObjectImpl
