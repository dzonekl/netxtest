/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DragonXFactoryImpl extends EFactoryImpl implements DragonXFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DragonXFactory init()
  {
    try
    {
      DragonXFactory theDragonXFactory = (DragonXFactory)EPackage.Registry.INSTANCE.getEFactory(DragonXPackage.eNS_URI);
      if (theDragonXFactory != null)
      {
        return theDragonXFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DragonXFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DragonXFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DragonXPackage.DRAGON_X: return createDragonX();
      case DragonXPackage.UE: return createUE();
      case DragonXPackage.UE_META_OBJECT: return createUEMetaObject();
      case DragonXPackage.TEST_CASE: return createTestCase();
      case DragonXPackage.DESCRIPTION_OBJECT: return createDescriptionObject();
      case DragonXPackage.PROCEDURE: return createProcedure();
      case DragonXPackage.ACTION: return createAction();
      case DragonXPackage.PARAMETER: return createParameter();
      case DragonXPackage.PARAM_TYPE: return createParamType();
      case DragonXPackage.PARAM_RESPONSE_TYPE: return createParamResponseType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DragonXPackage.PARAM_NAME:
        return createPARAM_NAMEFromString(eDataType, initialValue);
      case DragonXPackage.PARAM_RESPONSE:
        return createPARAM_RESPONSEFromString(eDataType, initialValue);
      case DragonXPackage.ACTIONCODE:
        return createACTIONCODEFromString(eDataType, initialValue);
      case DragonXPackage.UEPARAMS:
        return createUEPARAMSFromString(eDataType, initialValue);
      case DragonXPackage.USSDCODES:
        return createUSSDCODESFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DragonXPackage.PARAM_NAME:
        return convertPARAM_NAMEToString(eDataType, instanceValue);
      case DragonXPackage.PARAM_RESPONSE:
        return convertPARAM_RESPONSEToString(eDataType, instanceValue);
      case DragonXPackage.ACTIONCODE:
        return convertACTIONCODEToString(eDataType, instanceValue);
      case DragonXPackage.UEPARAMS:
        return convertUEPARAMSToString(eDataType, instanceValue);
      case DragonXPackage.USSDCODES:
        return convertUSSDCODESToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DragonX createDragonX()
  {
    DragonXImpl dragonX = new DragonXImpl();
    return dragonX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UE createUE()
  {
    UEImpl ue = new UEImpl();
    return ue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UEMetaObject createUEMetaObject()
  {
    UEMetaObjectImpl ueMetaObject = new UEMetaObjectImpl();
    return ueMetaObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestCase createTestCase()
  {
    TestCaseImpl testCase = new TestCaseImpl();
    return testCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionObject createDescriptionObject()
  {
    DescriptionObjectImpl descriptionObject = new DescriptionObjectImpl();
    return descriptionObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamType createParamType()
  {
    ParamTypeImpl paramType = new ParamTypeImpl();
    return paramType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamResponseType createParamResponseType()
  {
    ParamResponseTypeImpl paramResponseType = new ParamResponseTypeImpl();
    return paramResponseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PARAM_NAME createPARAM_NAMEFromString(EDataType eDataType, String initialValue)
  {
    PARAM_NAME result = PARAM_NAME.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPARAM_NAMEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PARAM_RESPONSE createPARAM_RESPONSEFromString(EDataType eDataType, String initialValue)
  {
    PARAM_RESPONSE result = PARAM_RESPONSE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPARAM_RESPONSEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACTIONCODE createACTIONCODEFromString(EDataType eDataType, String initialValue)
  {
    ACTIONCODE result = ACTIONCODE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertACTIONCODEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UEPARAMS createUEPARAMSFromString(EDataType eDataType, String initialValue)
  {
    UEPARAMS result = UEPARAMS.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUEPARAMSToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public USSDCODES createUSSDCODESFromString(EDataType eDataType, String initialValue)
  {
    USSDCODES result = USSDCODES.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUSSDCODESToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DragonXPackage getDragonXPackage()
  {
    return (DragonXPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DragonXPackage getPackage()
  {
    return DragonXPackage.eINSTANCE;
  }

} //DragonXFactoryImpl
