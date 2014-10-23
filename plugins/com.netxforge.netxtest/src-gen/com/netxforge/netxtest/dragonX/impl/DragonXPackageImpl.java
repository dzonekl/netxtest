/**
 */
package com.netxforge.netxtest.dragonX.impl;

import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.DescriptionObject;
import com.netxforge.netxtest.dragonX.DragonX;
import com.netxforge.netxtest.dragonX.DragonXFactory;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.ParamResponseType;
import com.netxforge.netxtest.dragonX.ParamType;
import com.netxforge.netxtest.dragonX.Parameter;
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
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramResponseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum paraM_NAMEEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum paraM_RESPONSEEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum actioncodeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ueparamsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ussdcodesEEnum = null;

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
  public EAttribute getAction_ActionCode()
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
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamType()
  {
    return paramTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamType_UeRef()
  {
    return (EReference)paramTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamType_Value()
  {
    return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamType_Response()
  {
    return (EReference)paramTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamResponseType()
  {
    return paramResponseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamResponseType_ParamResponse()
  {
    return (EAttribute)paramResponseTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPARAM_NAME()
  {
    return paraM_NAMEEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPARAM_RESPONSE()
  {
    return paraM_RESPONSEEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getACTIONCODE()
  {
    return actioncodeEEnum;
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
  public EEnum getUSSDCODES()
  {
    return ussdcodesEEnum;
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
    createEAttribute(actionEClass, ACTION__ACTION_CODE);
    createEReference(actionEClass, ACTION__PARAMETER_SET);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);
    createEReference(parameterEClass, PARAMETER__TYPE);

    paramTypeEClass = createEClass(PARAM_TYPE);
    createEReference(paramTypeEClass, PARAM_TYPE__UE_REF);
    createEAttribute(paramTypeEClass, PARAM_TYPE__VALUE);
    createEReference(paramTypeEClass, PARAM_TYPE__RESPONSE);

    paramResponseTypeEClass = createEClass(PARAM_RESPONSE_TYPE);
    createEAttribute(paramResponseTypeEClass, PARAM_RESPONSE_TYPE__PARAM_RESPONSE);

    // Create enums
    paraM_NAMEEEnum = createEEnum(PARAM_NAME);
    paraM_RESPONSEEEnum = createEEnum(PARAM_RESPONSE);
    actioncodeEEnum = createEEnum(ACTIONCODE);
    ueparamsEEnum = createEEnum(UEPARAMS);
    ussdcodesEEnum = createEEnum(USSDCODES);
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
    initEAttribute(getAction_ActionCode(), this.getACTIONCODE(), "actionCode", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_ParameterSet(), this.getParameter(), null, "parameterSet", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Name(), this.getPARAM_NAME(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Type(), this.getParamType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramTypeEClass, ParamType.class, "ParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParamType_UeRef(), this.getUE(), null, "ueRef", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParamType_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParamType_Response(), this.getParamResponseType(), null, "response", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramResponseTypeEClass, ParamResponseType.class, "ParamResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParamResponseType_ParamResponse(), this.getPARAM_RESPONSE(), "paramResponse", null, 0, -1, ParamResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.class, "PARAM_NAME");
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.FROM);
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.TO);
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.CALL_DURATION);
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.RESPONSE_TIME);
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.LISTENING_TIME);
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.DATA);
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.MESSAGE);
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.USSD_CODE);
    addEEnumLiteral(paraM_NAMEEEnum, com.netxforge.netxtest.dragonX.PARAM_NAME.SERVICE_DELAY);

    initEEnum(paraM_RESPONSEEEnum, com.netxforge.netxtest.dragonX.PARAM_RESPONSE.class, "PARAM_RESPONSE");
    addEEnumLiteral(paraM_RESPONSEEEnum, com.netxforge.netxtest.dragonX.PARAM_RESPONSE.LISTINING);
    addEEnumLiteral(paraM_RESPONSEEEnum, com.netxforge.netxtest.dragonX.PARAM_RESPONSE.OFFHOOK);
    addEEnumLiteral(paraM_RESPONSEEEnum, com.netxforge.netxtest.dragonX.PARAM_RESPONSE.HANGUP);

    initEEnum(actioncodeEEnum, com.netxforge.netxtest.dragonX.ACTIONCODE.class, "ACTIONCODE");
    addEEnumLiteral(actioncodeEEnum, com.netxforge.netxtest.dragonX.ACTIONCODE.CALL);
    addEEnumLiteral(actioncodeEEnum, com.netxforge.netxtest.dragonX.ACTIONCODE.ANSWER);
    addEEnumLiteral(actioncodeEEnum, com.netxforge.netxtest.dragonX.ACTIONCODE.USSD);
    addEEnumLiteral(actioncodeEEnum, com.netxforge.netxtest.dragonX.ACTIONCODE.SMS);
    addEEnumLiteral(actioncodeEEnum, com.netxforge.netxtest.dragonX.ACTIONCODE.DATA);
    addEEnumLiteral(actioncodeEEnum, com.netxforge.netxtest.dragonX.ACTIONCODE.MIXER);

    initEEnum(ueparamsEEnum, com.netxforge.netxtest.dragonX.UEPARAMS.class, "UEPARAMS");
    addEEnumLiteral(ueparamsEEnum, com.netxforge.netxtest.dragonX.UEPARAMS.IMEI);
    addEEnumLiteral(ueparamsEEnum, com.netxforge.netxtest.dragonX.UEPARAMS.MSISDN);

    initEEnum(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.class, "USSDCODES");
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.CFU);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.CFB);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.CFNA);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.CFNR);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.ACD);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.ALL_OUTGOING_CALLS);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.ALL_INCOMMING_CALLS);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.ALL_OUTGOING_CALLS_EX_HOME);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.ALL_INCOMMING_CALLS_ROAMING);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.CLIP);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.CLIR);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.COLP);
    addEEnumLiteral(ussdcodesEEnum, com.netxforge.netxtest.dragonX.USSDCODES.COLR);

    // Create resource
    createResource(eNS_URI);
  }

} //DragonXPackageImpl
