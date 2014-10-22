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
      case DragonXPackage.PARAMETER_SET_CALL: return createParameterSetCall();
      case DragonXPackage.PARAMETER_SET_ANSWER: return createParameterSetAnswer();
      case DragonXPackage.PARAMETER_SET_USSD: return createParameterSetUssd();
      case DragonXPackage.PARAMETER_SET_SMS: return createParameterSetSms();
      case DragonXPackage.PARAMETER_SET_DATA: return createParameterSetData();
      case DragonXPackage.PARAMETER_SET_MIXER: return createParameterSetMixer();
      case DragonXPackage.PARAMETER_CALL: return createParameterCall();
      case DragonXPackage.PARAMETER_ANSWER: return createParameterAnswer();
      case DragonXPackage.PARAMETER_USSD: return createParameterUssd();
      case DragonXPackage.PARAMETER_SMS: return createParameterSms();
      case DragonXPackage.PARAMETER_DATA: return createParameterData();
      case DragonXPackage.PARAMETER_MIXER: return createParameterMixer();
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
      case DragonXPackage.MIXEROPTIONS:
        return createMIXEROPTIONSFromString(eDataType, initialValue);
      case DragonXPackage.MIXER:
        return createMIXERFromString(eDataType, initialValue);
      case DragonXPackage.USSDREGISTRATION:
        return createUSSDREGISTRATIONFromString(eDataType, initialValue);
      case DragonXPackage.CALLFORWARDING:
        return createCALLFORWARDINGFromString(eDataType, initialValue);
      case DragonXPackage.BARRING:
        return createBARRINGFromString(eDataType, initialValue);
      case DragonXPackage.LINEIDENTIFICATION:
        return createLINEIDENTIFICATIONFromString(eDataType, initialValue);
      case DragonXPackage.ANSWERRESPONSE:
        return createANSWERRESPONSEFromString(eDataType, initialValue);
      case DragonXPackage.CALLRESPONSE:
        return createCALLRESPONSEFromString(eDataType, initialValue);
      case DragonXPackage.UEPARAMS:
        return createUEPARAMSFromString(eDataType, initialValue);
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
      case DragonXPackage.MIXEROPTIONS:
        return convertMIXEROPTIONSToString(eDataType, instanceValue);
      case DragonXPackage.MIXER:
        return convertMIXERToString(eDataType, instanceValue);
      case DragonXPackage.USSDREGISTRATION:
        return convertUSSDREGISTRATIONToString(eDataType, instanceValue);
      case DragonXPackage.CALLFORWARDING:
        return convertCALLFORWARDINGToString(eDataType, instanceValue);
      case DragonXPackage.BARRING:
        return convertBARRINGToString(eDataType, instanceValue);
      case DragonXPackage.LINEIDENTIFICATION:
        return convertLINEIDENTIFICATIONToString(eDataType, instanceValue);
      case DragonXPackage.ANSWERRESPONSE:
        return convertANSWERRESPONSEToString(eDataType, instanceValue);
      case DragonXPackage.CALLRESPONSE:
        return convertCALLRESPONSEToString(eDataType, instanceValue);
      case DragonXPackage.UEPARAMS:
        return convertUEPARAMSToString(eDataType, instanceValue);
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
  public ParameterSetCall createParameterSetCall()
  {
    ParameterSetCallImpl parameterSetCall = new ParameterSetCallImpl();
    return parameterSetCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSetAnswer createParameterSetAnswer()
  {
    ParameterSetAnswerImpl parameterSetAnswer = new ParameterSetAnswerImpl();
    return parameterSetAnswer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSetUssd createParameterSetUssd()
  {
    ParameterSetUssdImpl parameterSetUssd = new ParameterSetUssdImpl();
    return parameterSetUssd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSetSms createParameterSetSms()
  {
    ParameterSetSmsImpl parameterSetSms = new ParameterSetSmsImpl();
    return parameterSetSms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSetData createParameterSetData()
  {
    ParameterSetDataImpl parameterSetData = new ParameterSetDataImpl();
    return parameterSetData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSetMixer createParameterSetMixer()
  {
    ParameterSetMixerImpl parameterSetMixer = new ParameterSetMixerImpl();
    return parameterSetMixer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterCall createParameterCall()
  {
    ParameterCallImpl parameterCall = new ParameterCallImpl();
    return parameterCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterAnswer createParameterAnswer()
  {
    ParameterAnswerImpl parameterAnswer = new ParameterAnswerImpl();
    return parameterAnswer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterUssd createParameterUssd()
  {
    ParameterUssdImpl parameterUssd = new ParameterUssdImpl();
    return parameterUssd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSms createParameterSms()
  {
    ParameterSmsImpl parameterSms = new ParameterSmsImpl();
    return parameterSms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterData createParameterData()
  {
    ParameterDataImpl parameterData = new ParameterDataImpl();
    return parameterData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterMixer createParameterMixer()
  {
    ParameterMixerImpl parameterMixer = new ParameterMixerImpl();
    return parameterMixer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MIXEROPTIONS createMIXEROPTIONSFromString(EDataType eDataType, String initialValue)
  {
    MIXEROPTIONS result = MIXEROPTIONS.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMIXEROPTIONSToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MIXER createMIXERFromString(EDataType eDataType, String initialValue)
  {
    MIXER result = MIXER.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMIXERToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public USSDREGISTRATION createUSSDREGISTRATIONFromString(EDataType eDataType, String initialValue)
  {
    USSDREGISTRATION result = USSDREGISTRATION.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUSSDREGISTRATIONToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CALLFORWARDING createCALLFORWARDINGFromString(EDataType eDataType, String initialValue)
  {
    CALLFORWARDING result = CALLFORWARDING.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCALLFORWARDINGToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BARRING createBARRINGFromString(EDataType eDataType, String initialValue)
  {
    BARRING result = BARRING.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBARRINGToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LINEIDENTIFICATION createLINEIDENTIFICATIONFromString(EDataType eDataType, String initialValue)
  {
    LINEIDENTIFICATION result = LINEIDENTIFICATION.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLINEIDENTIFICATIONToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ANSWERRESPONSE createANSWERRESPONSEFromString(EDataType eDataType, String initialValue)
  {
    ANSWERRESPONSE result = ANSWERRESPONSE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertANSWERRESPONSEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CALLRESPONSE createCALLRESPONSEFromString(EDataType eDataType, String initialValue)
  {
    CALLRESPONSE result = CALLRESPONSE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCALLRESPONSEToString(EDataType eDataType, Object instanceValue)
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
