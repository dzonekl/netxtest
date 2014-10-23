/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXFactory
 * @model kind="package"
 * @generated
 */
public interface DragonXPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dragonX";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.netxforge.com/netxtest/DragonX";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dragonX";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DragonXPackage eINSTANCE = com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl.init();

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.DragonXImpl <em>Dragon X</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.DragonXImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getDragonX()
   * @generated
   */
  int DRAGON_X = 0;

  /**
   * The feature id for the '<em><b>Ues</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAGON_X__UES = 0;

  /**
   * The feature id for the '<em><b>Tests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAGON_X__TESTS = 1;

  /**
   * The number of structural features of the '<em>Dragon X</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAGON_X_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.UEImpl <em>UE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.UEImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUE()
   * @generated
   */
  int UE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UE__NAME = 0;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UE__META = 1;

  /**
   * The number of structural features of the '<em>UE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.UEMetaObjectImpl <em>UE Meta Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.UEMetaObjectImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUEMetaObject()
   * @generated
   */
  int UE_META_OBJECT = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UE_META_OBJECT__PARAMS = 0;

  /**
   * The feature id for the '<em><b>Param Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UE_META_OBJECT__PARAM_VALUE = 1;

  /**
   * The number of structural features of the '<em>UE Meta Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UE_META_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.TestCaseImpl <em>Test Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.TestCaseImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getTestCase()
   * @generated
   */
  int TEST_CASE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__PROCEDURE = 2;

  /**
   * The number of structural features of the '<em>Test Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.DescriptionObjectImpl <em>Description Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.DescriptionObjectImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getDescriptionObject()
   * @generated
   */
  int DESCRIPTION_OBJECT = 4;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_OBJECT__PARAMS = UE_META_OBJECT__PARAMS;

  /**
   * The feature id for the '<em><b>Param Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_OBJECT__PARAM_VALUE = UE_META_OBJECT__PARAM_VALUE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_OBJECT__DESCRIPTION = UE_META_OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Description Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_OBJECT_FEATURE_COUNT = UE_META_OBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ProcedureImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 5;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ActionImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

  /**
   * The feature id for the '<em><b>Action Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION_CODE = 0;

  /**
   * The feature id for the '<em><b>Parameter Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PARAMETER_SET = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParamTypeImpl <em>Param Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParamTypeImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParamType()
   * @generated
   */
  int PARAM_TYPE = 8;

  /**
   * The feature id for the '<em><b>Ue Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_TYPE__UE_REF = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_TYPE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_TYPE__RESPONSE = 2;

  /**
   * The number of structural features of the '<em>Param Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParamResponseTypeImpl <em>Param Response Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParamResponseTypeImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParamResponseType()
   * @generated
   */
  int PARAM_RESPONSE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Param Response</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_RESPONSE_TYPE__PARAM_RESPONSE = 0;

  /**
   * The number of structural features of the '<em>Param Response Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_RESPONSE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.PARAM_NAME <em>PARAM NAME</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.PARAM_NAME
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getPARAM_NAME()
   * @generated
   */
  int PARAM_NAME = 10;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.PARAM_RESPONSE <em>PARAM RESPONSE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.PARAM_RESPONSE
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getPARAM_RESPONSE()
   * @generated
   */
  int PARAM_RESPONSE = 11;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.ACTIONCODE <em>ACTIONCODE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.ACTIONCODE
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getACTIONCODE()
   * @generated
   */
  int ACTIONCODE = 12;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.UEPARAMS <em>UEPARAMS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.UEPARAMS
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUEPARAMS()
   * @generated
   */
  int UEPARAMS = 13;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.USSDCODES <em>USSDCODES</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.USSDCODES
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUSSDCODES()
   * @generated
   */
  int USSDCODES = 14;


  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.DragonX <em>Dragon X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dragon X</em>'.
   * @see com.netxforge.netxtest.dragonX.DragonX
   * @generated
   */
  EClass getDragonX();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.DragonX#getUes <em>Ues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ues</em>'.
   * @see com.netxforge.netxtest.dragonX.DragonX#getUes()
   * @see #getDragonX()
   * @generated
   */
  EReference getDragonX_Ues();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.DragonX#getTests <em>Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tests</em>'.
   * @see com.netxforge.netxtest.dragonX.DragonX#getTests()
   * @see #getDragonX()
   * @generated
   */
  EReference getDragonX_Tests();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.UE <em>UE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UE</em>'.
   * @see com.netxforge.netxtest.dragonX.UE
   * @generated
   */
  EClass getUE();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.UE#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.netxforge.netxtest.dragonX.UE#getName()
   * @see #getUE()
   * @generated
   */
  EAttribute getUE_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.UE#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta</em>'.
   * @see com.netxforge.netxtest.dragonX.UE#getMeta()
   * @see #getUE()
   * @generated
   */
  EReference getUE_Meta();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.UEMetaObject <em>UE Meta Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UE Meta Object</em>'.
   * @see com.netxforge.netxtest.dragonX.UEMetaObject
   * @generated
   */
  EClass getUEMetaObject();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.UEMetaObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Params</em>'.
   * @see com.netxforge.netxtest.dragonX.UEMetaObject#getParams()
   * @see #getUEMetaObject()
   * @generated
   */
  EAttribute getUEMetaObject_Params();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.UEMetaObject#getParamValue <em>Param Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param Value</em>'.
   * @see com.netxforge.netxtest.dragonX.UEMetaObject#getParamValue()
   * @see #getUEMetaObject()
   * @generated
   */
  EAttribute getUEMetaObject_ParamValue();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.TestCase <em>Test Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Case</em>'.
   * @see com.netxforge.netxtest.dragonX.TestCase
   * @generated
   */
  EClass getTestCase();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.TestCase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.netxforge.netxtest.dragonX.TestCase#getName()
   * @see #getTestCase()
   * @generated
   */
  EAttribute getTestCase_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.netxforge.netxtest.dragonX.TestCase#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see com.netxforge.netxtest.dragonX.TestCase#getDescription()
   * @see #getTestCase()
   * @generated
   */
  EReference getTestCase_Description();

  /**
   * Returns the meta object for the containment reference '{@link com.netxforge.netxtest.dragonX.TestCase#getProcedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Procedure</em>'.
   * @see com.netxforge.netxtest.dragonX.TestCase#getProcedure()
   * @see #getTestCase()
   * @generated
   */
  EReference getTestCase_Procedure();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.DescriptionObject <em>Description Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description Object</em>'.
   * @see com.netxforge.netxtest.dragonX.DescriptionObject
   * @generated
   */
  EClass getDescriptionObject();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.DescriptionObject#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.netxforge.netxtest.dragonX.DescriptionObject#getDescription()
   * @see #getDescriptionObject()
   * @generated
   */
  EAttribute getDescriptionObject_Description();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see com.netxforge.netxtest.dragonX.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.Procedure#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.netxforge.netxtest.dragonX.Procedure#getActions()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Actions();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see com.netxforge.netxtest.dragonX.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.Action#getActionCode <em>Action Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action Code</em>'.
   * @see com.netxforge.netxtest.dragonX.Action#getActionCode()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_ActionCode();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.Action#getParameterSet <em>Parameter Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Set</em>'.
   * @see com.netxforge.netxtest.dragonX.Action#getParameterSet()
   * @see #getAction()
   * @generated
   */
  EReference getAction_ParameterSet();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see com.netxforge.netxtest.dragonX.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.netxforge.netxtest.dragonX.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.netxforge.netxtest.dragonX.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.netxforge.netxtest.dragonX.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Type</em>'.
   * @see com.netxforge.netxtest.dragonX.ParamType
   * @generated
   */
  EClass getParamType();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParamType#getUeRef <em>Ue Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ue Ref</em>'.
   * @see com.netxforge.netxtest.dragonX.ParamType#getUeRef()
   * @see #getParamType()
   * @generated
   */
  EReference getParamType_UeRef();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParamType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.netxforge.netxtest.dragonX.ParamType#getValue()
   * @see #getParamType()
   * @generated
   */
  EAttribute getParamType_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.netxforge.netxtest.dragonX.ParamType#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Response</em>'.
   * @see com.netxforge.netxtest.dragonX.ParamType#getResponse()
   * @see #getParamType()
   * @generated
   */
  EReference getParamType_Response();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParamResponseType <em>Param Response Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Response Type</em>'.
   * @see com.netxforge.netxtest.dragonX.ParamResponseType
   * @generated
   */
  EClass getParamResponseType();

  /**
   * Returns the meta object for the attribute list '{@link com.netxforge.netxtest.dragonX.ParamResponseType#getParamResponse <em>Param Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Param Response</em>'.
   * @see com.netxforge.netxtest.dragonX.ParamResponseType#getParamResponse()
   * @see #getParamResponseType()
   * @generated
   */
  EAttribute getParamResponseType_ParamResponse();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.PARAM_NAME <em>PARAM NAME</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>PARAM NAME</em>'.
   * @see com.netxforge.netxtest.dragonX.PARAM_NAME
   * @generated
   */
  EEnum getPARAM_NAME();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.PARAM_RESPONSE <em>PARAM RESPONSE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>PARAM RESPONSE</em>'.
   * @see com.netxforge.netxtest.dragonX.PARAM_RESPONSE
   * @generated
   */
  EEnum getPARAM_RESPONSE();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.ACTIONCODE <em>ACTIONCODE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ACTIONCODE</em>'.
   * @see com.netxforge.netxtest.dragonX.ACTIONCODE
   * @generated
   */
  EEnum getACTIONCODE();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.UEPARAMS <em>UEPARAMS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>UEPARAMS</em>'.
   * @see com.netxforge.netxtest.dragonX.UEPARAMS
   * @generated
   */
  EEnum getUEPARAMS();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.USSDCODES <em>USSDCODES</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>USSDCODES</em>'.
   * @see com.netxforge.netxtest.dragonX.USSDCODES
   * @generated
   */
  EEnum getUSSDCODES();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DragonXFactory getDragonXFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.DragonXImpl <em>Dragon X</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.DragonXImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getDragonX()
     * @generated
     */
    EClass DRAGON_X = eINSTANCE.getDragonX();

    /**
     * The meta object literal for the '<em><b>Ues</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRAGON_X__UES = eINSTANCE.getDragonX_Ues();

    /**
     * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRAGON_X__TESTS = eINSTANCE.getDragonX_Tests();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.UEImpl <em>UE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.UEImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUE()
     * @generated
     */
    EClass UE = eINSTANCE.getUE();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UE__NAME = eINSTANCE.getUE_Name();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UE__META = eINSTANCE.getUE_Meta();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.UEMetaObjectImpl <em>UE Meta Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.UEMetaObjectImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUEMetaObject()
     * @generated
     */
    EClass UE_META_OBJECT = eINSTANCE.getUEMetaObject();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UE_META_OBJECT__PARAMS = eINSTANCE.getUEMetaObject_Params();

    /**
     * The meta object literal for the '<em><b>Param Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UE_META_OBJECT__PARAM_VALUE = eINSTANCE.getUEMetaObject_ParamValue();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.TestCaseImpl <em>Test Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.TestCaseImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getTestCase()
     * @generated
     */
    EClass TEST_CASE = eINSTANCE.getTestCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_CASE__NAME = eINSTANCE.getTestCase_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE__DESCRIPTION = eINSTANCE.getTestCase_Description();

    /**
     * The meta object literal for the '<em><b>Procedure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE__PROCEDURE = eINSTANCE.getTestCase_Procedure();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.DescriptionObjectImpl <em>Description Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.DescriptionObjectImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getDescriptionObject()
     * @generated
     */
    EClass DESCRIPTION_OBJECT = eINSTANCE.getDescriptionObject();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION_OBJECT__DESCRIPTION = eINSTANCE.getDescriptionObject_Description();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ProcedureImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__ACTIONS = eINSTANCE.getProcedure_Actions();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ActionImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Action Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__ACTION_CODE = eINSTANCE.getAction_ActionCode();

    /**
     * The meta object literal for the '<em><b>Parameter Set</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PARAMETER_SET = eINSTANCE.getAction_ParameterSet();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParamTypeImpl <em>Param Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParamTypeImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParamType()
     * @generated
     */
    EClass PARAM_TYPE = eINSTANCE.getParamType();

    /**
     * The meta object literal for the '<em><b>Ue Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_TYPE__UE_REF = eINSTANCE.getParamType_UeRef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_TYPE__VALUE = eINSTANCE.getParamType_Value();

    /**
     * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_TYPE__RESPONSE = eINSTANCE.getParamType_Response();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParamResponseTypeImpl <em>Param Response Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParamResponseTypeImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParamResponseType()
     * @generated
     */
    EClass PARAM_RESPONSE_TYPE = eINSTANCE.getParamResponseType();

    /**
     * The meta object literal for the '<em><b>Param Response</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_RESPONSE_TYPE__PARAM_RESPONSE = eINSTANCE.getParamResponseType_ParamResponse();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.PARAM_NAME <em>PARAM NAME</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.PARAM_NAME
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getPARAM_NAME()
     * @generated
     */
    EEnum PARAM_NAME = eINSTANCE.getPARAM_NAME();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.PARAM_RESPONSE <em>PARAM RESPONSE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.PARAM_RESPONSE
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getPARAM_RESPONSE()
     * @generated
     */
    EEnum PARAM_RESPONSE = eINSTANCE.getPARAM_RESPONSE();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.ACTIONCODE <em>ACTIONCODE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.ACTIONCODE
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getACTIONCODE()
     * @generated
     */
    EEnum ACTIONCODE = eINSTANCE.getACTIONCODE();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.UEPARAMS <em>UEPARAMS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.UEPARAMS
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUEPARAMS()
     * @generated
     */
    EEnum UEPARAMS = eINSTANCE.getUEPARAMS();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.USSDCODES <em>USSDCODES</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.USSDCODES
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUSSDCODES()
     * @generated
     */
    EEnum USSDCODES = eINSTANCE.getUSSDCODES();

  }

} //DragonXPackage
