/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.DragonX;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.TestCase;
import com.netxforge.netxtest.dragonX.UE;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dragon X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.DragonXImpl#getUes <em>Ues</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.impl.DragonXImpl#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DragonXImpl extends MinimalEObjectImpl.Container implements DragonX
{
  /**
   * The cached value of the '{@link #getUes() <em>Ues</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUes()
   * @generated
   * @ordered
   */
  protected EList<UE> ues;

  /**
   * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTests()
   * @generated
   * @ordered
   */
  protected EList<TestCase> tests;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DragonXImpl()
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
    return DragonXPackage.Literals.DRAGON_X;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UE> getUes()
  {
    if (ues == null)
    {
      ues = new EObjectContainmentEList<UE>(UE.class, this, DragonXPackage.DRAGON_X__UES);
    }
    return ues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TestCase> getTests()
  {
    if (tests == null)
    {
      tests = new EObjectContainmentEList<TestCase>(TestCase.class, this, DragonXPackage.DRAGON_X__TESTS);
    }
    return tests;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DragonXPackage.DRAGON_X__UES:
        return ((InternalEList<?>)getUes()).basicRemove(otherEnd, msgs);
      case DragonXPackage.DRAGON_X__TESTS:
        return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DragonXPackage.DRAGON_X__UES:
        return getUes();
      case DragonXPackage.DRAGON_X__TESTS:
        return getTests();
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
      case DragonXPackage.DRAGON_X__UES:
        getUes().clear();
        getUes().addAll((Collection<? extends UE>)newValue);
        return;
      case DragonXPackage.DRAGON_X__TESTS:
        getTests().clear();
        getTests().addAll((Collection<? extends TestCase>)newValue);
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
      case DragonXPackage.DRAGON_X__UES:
        getUes().clear();
        return;
      case DragonXPackage.DRAGON_X__TESTS:
        getTests().clear();
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
      case DragonXPackage.DRAGON_X__UES:
        return ues != null && !ues.isEmpty();
      case DragonXPackage.DRAGON_X__TESTS:
        return tests != null && !tests.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DragonXImpl
