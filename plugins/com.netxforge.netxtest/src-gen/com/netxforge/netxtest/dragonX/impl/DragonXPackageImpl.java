/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.DescriptionObject;
import com.netxforge.netxtest.dragonX.DragonX;
import com.netxforge.netxtest.dragonX.DragonXFactory;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.ParameterAnswer;
import com.netxforge.netxtest.dragonX.ParameterCall;
import com.netxforge.netxtest.dragonX.ParameterData;
import com.netxforge.netxtest.dragonX.ParameterMixer;
import com.netxforge.netxtest.dragonX.ParameterSetAnswer;
import com.netxforge.netxtest.dragonX.ParameterSetCall;
import com.netxforge.netxtest.dragonX.ParameterSetData;
import com.netxforge.netxtest.dragonX.ParameterSetMixer;
import com.netxforge.netxtest.dragonX.ParameterSetSms;
import com.netxforge.netxtest.dragonX.ParameterSetUssd;
import com.netxforge.netxtest.dragonX.ParameterSms;
import com.netxforge.netxtest.dragonX.ParameterUssd;
import com.netxforge.netxtest.dragonX.Procedure;
import com.netxforge.netxtest.dragonX.TestCase;
import com.netxforge.netxtest.dragonX.UEMetaObject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DragonXPackageImpl extends EPackageImpl implements DragonXPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dragonXEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ueMetaObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSetCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSetAnswerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSetUssdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSetSmsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSetDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSetMixerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterAnswerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterUssdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSmsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterMixerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mixeroptionsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mixerEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ussdregistrationEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum callforwardingEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum barringEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lineidentificationEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum answerresponseEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum callresponseEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ueparamsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DragonXPackageImpl()
  {
    super(eNS_URI, DragonXFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DragonXPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DragonXPackage init()
  {
    if (isInited) return (DragonXPackage)EPackage.Registry.INSTANCE.getEPackage(DragonXPackage.eNS_URI);

    // Obtain or create and register package
    DragonXPackageImpl theDragonXPackage = (DragonXPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DragonXPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DragonXPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDragonXPackage.createPackageContents();

    // Initialize created meta-data
    theDragonXPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDragonXPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DragonXPackage.eNS_URI, theDragonXPackage);
    return theDragonXPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDragonX()
  {
    return dragonXEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDragonX_Ues()
  {
    return (EReference)dragonXEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDragonX_Tests()
  {
    return (EReference)dragonXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUE()
  {
    return ueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUE_Name()
  {
    return (EAttribute)ueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUE_Meta()
  {
    return (EReference)ueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUEMetaObject()
  {
    return ueMetaObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUEMetaObject_Params()
  {
    return (EAttribute)ueMetaObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUEMetaObject_ParamValue()
  {
    return (EAttribute)ueMetaObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestCase()
  {
    return testCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestCase_Name()
  {
    return (EAttribute)testCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestCase_Description()
  {
    return (EReference)testCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestCase_Procedure()
  {
    return (EReference)testCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescriptionObject()
  {
    return descriptionObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescriptionObject_Description()
  {
    return (EAttribute)descriptionObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedure()
  {
    return procedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Actions()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Name()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_ParameterSet()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSetCall()
  {
    return parameterSetCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSetCall_Parameters()
  {
    return (EReference)parameterSetCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSetAnswer()
  {
    return parameterSetAnswerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSetAnswer_Parameters()
  {
    return (EReference)parameterSetAnswerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSetUssd()
  {
    return parameterSetUssdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSetUssd_Parameters()
  {
    return (EReference)parameterSetUssdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSetSms()
  {
    return parameterSetSmsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSetSms_Parameters()
  {
    return (EReference)parameterSetSmsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSetData()
  {
    return parameterSetDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSetData_Parameters()
  {
    return (EReference)parameterSetDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSetMixer()
  {
    return parameterSetMixerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSetMixer_Parameters()
  {
    return (EReference)parameterSetMixerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterCall()
  {
    return parameterCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterCall_From()
  {
    return (EReference)parameterCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterCall_To()
  {
    return (EReference)parameterCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterCall_CallingTime()
  {
    return (EAttribute)parameterCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterCall_OfhookResponse()
  {
    return (EAttribute)parameterCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterCall_ResponseTime()
  {
    return (EAttribute)parameterCallEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterAnswer()
  {
    return parameterAnswerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterAnswer_From()
  {
    return (EReference)parameterAnswerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterAnswer_ListeningTime()
  {
    return (EAttribute)parameterAnswerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterAnswer_AnswerTime()
  {
    return (EAttribute)parameterAnswerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterAnswer_Response()
  {
    return (EAttribute)parameterAnswerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterUssd()
  {
    return parameterUssdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterUssd_From()
  {
    return (EReference)parameterUssdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterUssd_CfCode()
  {
    return (EAttribute)parameterUssdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterUssd_Destination()
  {
    return (EReference)parameterUssdEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterUssd_ServiceDelay()
  {
    return (EAttribute)parameterUssdEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterUssd_BarringCode()
  {
    return (EAttribute)parameterUssdEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterUssd_Code()
  {
    return (EAttribute)parameterUssdEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterUssd_LiCode()
  {
    return (EAttribute)parameterUssdEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterUssd_Ussdregistration()
  {
    return (EAttribute)parameterUssdEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSms()
  {
    return parameterSmsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSms_From()
  {
    return (EReference)parameterSmsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSms_To()
  {
    return (EReference)parameterSmsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterSms_Message()
  {
    return (EAttribute)parameterSmsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterData()
  {
    return parameterDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterData_From()
  {
    return (EReference)parameterDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterData_Url()
  {
    return (EAttribute)parameterDataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterData_To()
  {
    return (EReference)parameterDataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterData_Data()
  {
    return (EAttribute)parameterDataEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterMixer()
  {
    return parameterMixerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterMixer_Mixer()
  {
    return (EAttribute)parameterMixerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterMixer_Value()
  {
    return (EAttribute)parameterMixerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterMixer_Option()
  {
    return (EAttribute)parameterMixerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMIXEROPTIONS()
  {
    return mixeroptionsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMIXER()
  {
    return mixerEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUSSDREGISTRATION()
  {
    return ussdregistrationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCALLFORWARDING()
  {
    return callforwardingEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBARRING()
  {
    return barringEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLINEIDENTIFICATION()
  {
    return lineidentificationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getANSWERRESPONSE()
  {
    return answerresponseEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCALLRESPONSE()
  {
    return callresponseEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUEPARAMS()
  {
    return ueparamsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DragonXFactory getDragonXFactory()
  {
    return (DragonXFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dragonXEClass = createEClass(DRAGON_X);
    createEReference(dragonXEClass, DRAGON_X__UES);
    createEReference(dragonXEClass, DRAGON_X__TESTS);

    ueEClass = createEClass(UE);
    createEAttribute(ueEClass, UE__NAME);
    createEReference(ueEClass, UE__META);

    ueMetaObjectEClass = createEClass(UE_META_OBJECT);
    createEAttribute(ueMetaObjectEClass, UE_META_OBJECT__PARAMS);
    createEAttribute(ueMetaObjectEClass, UE_META_OBJECT__PARAM_VALUE);

    testCaseEClass = createEClass(TEST_CASE);
    createEAttribute(testCaseEClass, TEST_CASE__NAME);
    createEReference(testCaseEClass, TEST_CASE__DESCRIPTION);
    createEReference(testCaseEClass, TEST_CASE__PROCEDURE);

    descriptionObjectEClass = createEClass(DESCRIPTION_OBJECT);
    createEAttribute(descriptionObjectEClass, DESCRIPTION_OBJECT__DESCRIPTION);

    procedureEClass = createEClass(PROCEDURE);
    createEReference(procedureEClass, PROCEDURE__ACTIONS);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__NAME);
    createEReference(actionEClass, ACTION__PARAMETER_SET);

    parameterSetCallEClass = createEClass(PARAMETER_SET_CALL);
    createEReference(parameterSetCallEClass, PARAMETER_SET_CALL__PARAMETERS);

    parameterSetAnswerEClass = createEClass(PARAMETER_SET_ANSWER);
    createEReference(parameterSetAnswerEClass, PARAMETER_SET_ANSWER__PARAMETERS);

    parameterSetUssdEClass = createEClass(PARAMETER_SET_USSD);
    createEReference(parameterSetUssdEClass, PARAMETER_SET_USSD__PARAMETERS);

    parameterSetSmsEClass = createEClass(PARAMETER_SET_SMS);
    createEReference(parameterSetSmsEClass, PARAMETER_SET_SMS__PARAMETERS);

    parameterSetDataEClass = createEClass(PARAMETER_SET_DATA);
    createEReference(parameterSetDataEClass, PARAMETER_SET_DATA__PARAMETERS);

    parameterSetMixerEClass = createEClass(PARAMETER_SET_MIXER);
    createEReference(parameterSetMixerEClass, PARAMETER_SET_MIXER__PARAMETERS);

    parameterCallEClass = createEClass(PARAMETER_CALL);
    createEReference(parameterCallEClass, PARAMETER_CALL__FROM);
    createEReference(parameterCallEClass, PARAMETER_CALL__TO);
    createEAttribute(parameterCallEClass, PARAMETER_CALL__CALLING_TIME);
    createEAttribute(parameterCallEClass, PARAMETER_CALL__OFHOOK_RESPONSE);
    createEAttribute(parameterCallEClass, PARAMETER_CALL__RESPONSE_TIME);

    parameterAnswerEClass = createEClass(PARAMETER_ANSWER);
    createEReference(parameterAnswerEClass, PARAMETER_ANSWER__FROM);
    createEAttribute(parameterAnswerEClass, PARAMETER_ANSWER__LISTENING_TIME);
    createEAttribute(parameterAnswerEClass, PARAMETER_ANSWER__ANSWER_TIME);
    createEAttribute(parameterAnswerEClass, PARAMETER_ANSWER__RESPONSE);

    parameterUssdEClass = createEClass(PARAMETER_USSD);
    createEReference(parameterUssdEClass, PARAMETER_USSD__FROM);
    createEAttribute(parameterUssdEClass, PARAMETER_USSD__CF_CODE);
    createEReference(parameterUssdEClass, PARAMETER_USSD__DESTINATION);
    createEAttribute(parameterUssdEClass, PARAMETER_USSD__SERVICE_DELAY);
    createEAttribute(parameterUssdEClass, PARAMETER_USSD__BARRING_CODE);
    createEAttribute(parameterUssdEClass, PARAMETER_USSD__CODE);
    createEAttribute(parameterUssdEClass, PARAMETER_USSD__LI_CODE);
    createEAttribute(parameterUssdEClass, PARAMETER_USSD__USSDREGISTRATION);

    parameterSmsEClass = createEClass(PARAMETER_SMS);
    createEReference(parameterSmsEClass, PARAMETER_SMS__FROM);
    createEReference(parameterSmsEClass, PARAMETER_SMS__TO);
    createEAttribute(parameterSmsEClass, PARAMETER_SMS__MESSAGE);

    parameterDataEClass = createEClass(PARAMETER_DATA);
    createEReference(parameterDataEClass, PARAMETER_DATA__FROM);
    createEAttribute(parameterDataEClass, PARAMETER_DATA__URL);
    createEReference(parameterDataEClass, PARAMETER_DATA__TO);
    createEAttribute(parameterDataEClass, PARAMETER_DATA__DATA);

    parameterMixerEClass = createEClass(PARAMETER_MIXER);
    createEAttribute(parameterMixerEClass, PARAMETER_MIXER__MIXER);
    createEAttribute(parameterMixerEClass, PARAMETER_MIXER__VALUE);
    createEAttribute(parameterMixerEClass, PARAMETER_MIXER__OPTION);

    // Create enums
    mixeroptionsEEnum = createEEnum(MIXEROPTIONS);
    mixerEEnum = createEEnum(MIXER);
    ussdregistrationEEnum = createEEnum(USSDREGISTRATION);
    callforwardingEEnum = createEEnum(CALLFORWARDING);
    barringEEnum = createEEnum(BARRING);
    lineidentificationEEnum = createEEnum(LINEIDENTIFICATION);
    answerresponseEEnum = createEEnum(ANSWERRESPONSE);
    callresponseEEnum = createEEnum(CALLRESPONSE);
    ueparamsEEnum = createEEnum(UEPARAMS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    descriptionObjectEClass.getESuperTypes().add(this.getUEMetaObject());

    // Initialize classes and features; add operations and parameters
    initEClass(dragonXEClass, DragonX.class, "DragonX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDragonX_Ues(), this.getUE(), null, "ues", null, 0, -1, DragonX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDragonX_Tests(), this.getTestCase(), null, "tests", null, 0, -1, DragonX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ueEClass, com.netxforge.netxtest.dragonX.UE.class, "UE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUE_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.netxforge.netxtest.dragonX.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUE_Meta(), this.getUEMetaObject(), null, "meta", null, 0, -1, com.netxforge.netxtest.dragonX.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ueMetaObjectEClass, UEMetaObject.class, "UEMetaObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUEMetaObject_Params(), this.getUEPARAMS(), "params", null, 0, 1, UEMetaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUEMetaObject_ParamValue(), ecorePackage.getEString(), "paramValue", null, 0, 1, UEMetaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestCase_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestCase_Description(), this.getDescriptionObject(), null, "description", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestCase_Procedure(), this.getProcedure(), null, "procedure", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionObjectEClass, DescriptionObject.class, "DescriptionObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescriptionObject_Description(), ecorePackage.getEString(), "description", null, 0, 1, DescriptionObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedure_Actions(), this.getAction(), null, "actions", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_ParameterSet(), ecorePackage.getEObject(), null, "parameterSet", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterSetCallEClass, ParameterSetCall.class, "ParameterSetCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterSetCall_Parameters(), this.getParameterCall(), null, "parameters", null, 0, -1, ParameterSetCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterSetAnswerEClass, ParameterSetAnswer.class, "ParameterSetAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterSetAnswer_Parameters(), this.getParameterAnswer(), null, "parameters", null, 0, -1, ParameterSetAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterSetUssdEClass, ParameterSetUssd.class, "ParameterSetUssd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterSetUssd_Parameters(), this.getParameterUssd(), null, "parameters", null, 0, -1, ParameterSetUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterSetSmsEClass, ParameterSetSms.class, "ParameterSetSms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterSetSms_Parameters(), this.getParameterSms(), null, "parameters", null, 0, -1, ParameterSetSms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterSetDataEClass, ParameterSetData.class, "ParameterSetData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterSetData_Parameters(), this.getParameterData(), null, "parameters", null, 0, -1, ParameterSetData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterSetMixerEClass, ParameterSetMixer.class, "ParameterSetMixer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterSetMixer_Parameters(), this.getParameterMixer(), null, "parameters", null, 0, -1, ParameterSetMixer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterCallEClass, ParameterCall.class, "ParameterCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterCall_From(), this.getUE(), null, "from", null, 0, 1, ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterCall_To(), this.getUE(), null, "to", null, 0, 1, ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterCall_CallingTime(), ecorePackage.getEInt(), "callingTime", null, 0, 1, ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterCall_OfhookResponse(), this.getCALLRESPONSE(), "ofhookResponse", null, 0, 1, ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterCall_ResponseTime(), ecorePackage.getEInt(), "responseTime", null, 0, 1, ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterAnswerEClass, ParameterAnswer.class, "ParameterAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterAnswer_From(), this.getUE(), null, "from", null, 0, 1, ParameterAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterAnswer_ListeningTime(), ecorePackage.getEInt(), "listeningTime", null, 0, 1, ParameterAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterAnswer_AnswerTime(), ecorePackage.getEInt(), "answerTime", null, 0, 1, ParameterAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterAnswer_Response(), this.getANSWERRESPONSE(), "response", null, 0, 1, ParameterAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterUssdEClass, ParameterUssd.class, "ParameterUssd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterUssd_From(), this.getUE(), null, "from", null, 0, 1, ParameterUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterUssd_CfCode(), this.getCALLFORWARDING(), "cfCode", null, 0, 1, ParameterUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterUssd_Destination(), this.getUE(), null, "destination", null, 0, 1, ParameterUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterUssd_ServiceDelay(), ecorePackage.getEInt(), "serviceDelay", null, 0, 1, ParameterUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterUssd_BarringCode(), this.getBARRING(), "barringCode", null, 0, 1, ParameterUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterUssd_Code(), ecorePackage.getEInt(), "code", null, 0, 1, ParameterUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterUssd_LiCode(), this.getLINEIDENTIFICATION(), "liCode", null, 0, 1, ParameterUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterUssd_Ussdregistration(), this.getUSSDREGISTRATION(), "ussdregistration", null, 0, 1, ParameterUssd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterSmsEClass, ParameterSms.class, "ParameterSms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterSms_From(), this.getUE(), null, "from", null, 0, 1, ParameterSms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterSms_To(), this.getUE(), null, "to", null, 0, 1, ParameterSms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterSms_Message(), ecorePackage.getEString(), "message", null, 0, 1, ParameterSms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDataEClass, ParameterData.class, "ParameterData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterData_From(), this.getUE(), null, "from", null, 0, 1, ParameterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterData_Url(), ecorePackage.getEString(), "url", null, 0, 1, ParameterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterData_To(), this.getUE(), null, "to", null, 0, 1, ParameterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterData_Data(), ecorePackage.getEString(), "data", null, 0, 1, ParameterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterMixerEClass, ParameterMixer.class, "ParameterMixer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterMixer_Mixer(), this.getMIXER(), "mixer", null, 0, 1, ParameterMixer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterMixer_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ParameterMixer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterMixer_Option(), this.getMIXEROPTIONS(), "option", null, 0, 1, ParameterMixer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(mixeroptionsEEnum, com.netxforge.netxtest.dragonX.MIXEROPTIONS.class, "MIXEROPTIONS");
    addEEnumLiteral(mixeroptionsEEnum, com.netxforge.netxtest.dragonX.MIXEROPTIONS.RESET);

    initEEnum(mixerEEnum, com.netxforge.netxtest.dragonX.MIXER.class, "MIXER");
    addEEnumLiteral(mixerEEnum, com.netxforge.netxtest.dragonX.MIXER.P1);
    addEEnumLiteral(mixerEEnum, com.netxforge.netxtest.dragonX.MIXER.P2);
    addEEnumLiteral(mixerEEnum, com.netxforge.netxtest.dragonX.MIXER.P3);
    addEEnumLiteral(mixerEEnum, com.netxforge.netxtest.dragonX.MIXER.P4);
    addEEnumLiteral(mixerEEnum, com.netxforge.netxtest.dragonX.MIXER.P5);
    addEEnumLiteral(mixerEEnum, com.netxforge.netxtest.dragonX.MIXER.P6);

    initEEnum(ussdregistrationEEnum, com.netxforge.netxtest.dragonX.USSDREGISTRATION.class, "USSDREGISTRATION");
    addEEnumLiteral(ussdregistrationEEnum, com.netxforge.netxtest.dragonX.USSDREGISTRATION.ACTIVATE);
    addEEnumLiteral(ussdregistrationEEnum, com.netxforge.netxtest.dragonX.USSDREGISTRATION.DEACTIVATE);

    initEEnum(callforwardingEEnum, com.netxforge.netxtest.dragonX.CALLFORWARDING.class, "CALLFORWARDING");
    addEEnumLiteral(callforwardingEEnum, com.netxforge.netxtest.dragonX.CALLFORWARDING.CFU);
    addEEnumLiteral(callforwardingEEnum, com.netxforge.netxtest.dragonX.CALLFORWARDING.CFB);
    addEEnumLiteral(callforwardingEEnum, com.netxforge.netxtest.dragonX.CALLFORWARDING.CFNA);
    addEEnumLiteral(callforwardingEEnum, com.netxforge.netxtest.dragonX.CALLFORWARDING.CFNR);
    addEEnumLiteral(callforwardingEEnum, com.netxforge.netxtest.dragonX.CALLFORWARDING.ACD);

    initEEnum(barringEEnum, com.netxforge.netxtest.dragonX.BARRING.class, "BARRING");
    addEEnumLiteral(barringEEnum, com.netxforge.netxtest.dragonX.BARRING.ALL_OUTGOING_CALLS);
    addEEnumLiteral(barringEEnum, com.netxforge.netxtest.dragonX.BARRING.ALL_INCOMMING_CALLS);
    addEEnumLiteral(barringEEnum, com.netxforge.netxtest.dragonX.BARRING.ALL_OUTGOING_CALLS_EX_HOME);
    addEEnumLiteral(barringEEnum, com.netxforge.netxtest.dragonX.BARRING.ALL_INCOMMING_CALLS_ROAMING);

    initEEnum(lineidentificationEEnum, com.netxforge.netxtest.dragonX.LINEIDENTIFICATION.class, "LINEIDENTIFICATION");
    addEEnumLiteral(lineidentificationEEnum, com.netxforge.netxtest.dragonX.LINEIDENTIFICATION.CLIP);
    addEEnumLiteral(lineidentificationEEnum, com.netxforge.netxtest.dragonX.LINEIDENTIFICATION.CLIR);
    addEEnumLiteral(lineidentificationEEnum, com.netxforge.netxtest.dragonX.LINEIDENTIFICATION.COLP);
    addEEnumLiteral(lineidentificationEEnum, com.netxforge.netxtest.dragonX.LINEIDENTIFICATION.COLR);

    initEEnum(answerresponseEEnum, com.netxforge.netxtest.dragonX.ANSWERRESPONSE.class, "ANSWERRESPONSE");
    addEEnumLiteral(answerresponseEEnum, com.netxforge.netxtest.dragonX.ANSWERRESPONSE.LISTENING);
    addEEnumLiteral(answerresponseEEnum, com.netxforge.netxtest.dragonX.ANSWERRESPONSE.OFFHOOK);
    addEEnumLiteral(answerresponseEEnum, com.netxforge.netxtest.dragonX.ANSWERRESPONSE.HANGUP);

    initEEnum(callresponseEEnum, com.netxforge.netxtest.dragonX.CALLRESPONSE.class, "CALLRESPONSE");
    addEEnumLiteral(callresponseEEnum, com.netxforge.netxtest.dragonX.CALLRESPONSE.LISTENING);
    addEEnumLiteral(callresponseEEnum, com.netxforge.netxtest.dragonX.CALLRESPONSE.HANGUP);

    initEEnum(ueparamsEEnum, com.netxforge.netxtest.dragonX.UEPARAMS.class, "UEPARAMS");
    addEEnumLiteral(ueparamsEEnum, com.netxforge.netxtest.dragonX.UEPARAMS.IMEI);
    addEEnumLiteral(ueparamsEEnum, com.netxforge.netxtest.dragonX.UEPARAMS.MSISDN);

    // Create resource
    createResource(eNS_URI);
  }

} //DragonXPackageImpl
