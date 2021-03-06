/**
 */
package com.netxforge.netxtest.dragonX.util;

import com.netxforge.netxtest.dragonX.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage
 * @generated
 */
public class DragonXAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DragonXPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DragonXAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DragonXPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DragonXSwitch<Adapter> modelSwitch =
    new DragonXSwitch<Adapter>()
    {
      @Override
      public Adapter caseDragonX(DragonX object)
      {
        return createDragonXAdapter();
      }
      @Override
      public Adapter caseUE(UE object)
      {
        return createUEAdapter();
      }
      @Override
      public Adapter caseUEMetaObject(UEMetaObject object)
      {
        return createUEMetaObjectAdapter();
      }
      @Override
      public Adapter caseTestCase(TestCase object)
      {
        return createTestCaseAdapter();
      }
      @Override
      public Adapter caseDescriptionObject(DescriptionObject object)
      {
        return createDescriptionObjectAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseParamType(ParamType object)
      {
        return createParamTypeAdapter();
      }
      @Override
      public Adapter caseParamResponseType(ParamResponseType object)
      {
        return createParamResponseTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.DragonX <em>Dragon X</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.DragonX
   * @generated
   */
  public Adapter createDragonXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.UE <em>UE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.UE
   * @generated
   */
  public Adapter createUEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.UEMetaObject <em>UE Meta Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.UEMetaObject
   * @generated
   */
  public Adapter createUEMetaObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.TestCase <em>Test Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.TestCase
   * @generated
   */
  public Adapter createTestCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.DescriptionObject <em>Description Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.DescriptionObject
   * @generated
   */
  public Adapter createDescriptionObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.ParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.ParamType
   * @generated
   */
  public Adapter createParamTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.netxforge.netxtest.dragonX.ParamResponseType <em>Param Response Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.netxforge.netxtest.dragonX.ParamResponseType
   * @generated
   */
  public Adapter createParamResponseTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DragonXAdapterFactory
