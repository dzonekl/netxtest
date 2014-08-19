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
   * The feature id for the '<em><b>Meta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__META = 1;

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
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.TestMetaImpl <em>Test Meta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.TestMetaImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getTestMeta()
   * @generated
   */
  int TEST_META = 4;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_META__META = 0;

  /**
   * The number of structural features of the '<em>Test Meta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_META_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.TestMetaObjectImpl <em>Test Meta Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.TestMetaObjectImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getTestMetaObject()
   * @generated
   */
  int TEST_META_OBJECT = 5;

  /**
   * The feature id for the '<em><b>Metatype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_META_OBJECT__METATYPE = 0;

  /**
   * The feature id for the '<em><b>Meta Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_META_OBJECT__META_VALUE = 1;

  /**
   * The number of structural features of the '<em>Test Meta Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_META_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ProcedureImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 6;

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
  int ACTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter Set</b></em>' containment reference.
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
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterSetImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSet()
   * @generated
   */
  int PARAMETER_SET = 8;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = 1;

  /**
   * The feature id for the '<em><b>Ue Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__UE_REF = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.ACTIONPARAMS <em>ACTIONPARAMS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.ACTIONPARAMS
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getACTIONPARAMS()
   * @generated
   */
  int ACTIONPARAMS = 10;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.UEPARAMS <em>UEPARAMS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.UEPARAMS
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUEPARAMS()
   * @generated
   */
  int UEPARAMS = 11;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.METATYPE <em>METATYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.METATYPE
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getMETATYPE()
   * @generated
   */
  int METATYPE = 12;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.ACTIONS <em>ACTIONS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.ACTIONS
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getACTIONS()
   * @generated
   */
  int ACTIONS = 13;


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
   * Returns the meta object for the containment reference '{@link com.netxforge.netxtest.dragonX.TestCase#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta</em>'.
   * @see com.netxforge.netxtest.dragonX.TestCase#getMeta()
   * @see #getTestCase()
   * @generated
   */
  EReference getTestCase_Meta();

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
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.TestMeta <em>Test Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Meta</em>'.
   * @see com.netxforge.netxtest.dragonX.TestMeta
   * @generated
   */
  EClass getTestMeta();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.TestMeta#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta</em>'.
   * @see com.netxforge.netxtest.dragonX.TestMeta#getMeta()
   * @see #getTestMeta()
   * @generated
   */
  EReference getTestMeta_Meta();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.TestMetaObject <em>Test Meta Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Meta Object</em>'.
   * @see com.netxforge.netxtest.dragonX.TestMetaObject
   * @generated
   */
  EClass getTestMetaObject();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.TestMetaObject#getMetatype <em>Metatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metatype</em>'.
   * @see com.netxforge.netxtest.dragonX.TestMetaObject#getMetatype()
   * @see #getTestMetaObject()
   * @generated
   */
  EAttribute getTestMetaObject_Metatype();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.TestMetaObject#getMetaValue <em>Meta Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta Value</em>'.
   * @see com.netxforge.netxtest.dragonX.TestMetaObject#getMetaValue()
   * @see #getTestMetaObject()
   * @generated
   */
  EAttribute getTestMetaObject_MetaValue();

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
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.netxforge.netxtest.dragonX.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.netxforge.netxtest.dragonX.Action#getParameterSet <em>Parameter Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Set</em>'.
   * @see com.netxforge.netxtest.dragonX.Action#getParameterSet()
   * @see #getAction()
   * @generated
   */
  EReference getAction_ParameterSet();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterSet <em>Parameter Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Set</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSet
   * @generated
   */
  EClass getParameterSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.ParameterSet#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSet#getParameters()
   * @see #getParameterSet()
   * @generated
   */
  EReference getParameterSet_Parameters();

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
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.netxforge.netxtest.dragonX.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Value();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.Parameter#getUeRef <em>Ue Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ue Ref</em>'.
   * @see com.netxforge.netxtest.dragonX.Parameter#getUeRef()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_UeRef();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.ACTIONPARAMS <em>ACTIONPARAMS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ACTIONPARAMS</em>'.
   * @see com.netxforge.netxtest.dragonX.ACTIONPARAMS
   * @generated
   */
  EEnum getACTIONPARAMS();

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
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.METATYPE <em>METATYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>METATYPE</em>'.
   * @see com.netxforge.netxtest.dragonX.METATYPE
   * @generated
   */
  EEnum getMETATYPE();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.ACTIONS <em>ACTIONS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ACTIONS</em>'.
   * @see com.netxforge.netxtest.dragonX.ACTIONS
   * @generated
   */
  EEnum getACTIONS();

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
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE__META = eINSTANCE.getTestCase_Meta();

    /**
     * The meta object literal for the '<em><b>Procedure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE__PROCEDURE = eINSTANCE.getTestCase_Procedure();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.TestMetaImpl <em>Test Meta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.TestMetaImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getTestMeta()
     * @generated
     */
    EClass TEST_META = eINSTANCE.getTestMeta();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_META__META = eINSTANCE.getTestMeta_Meta();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.TestMetaObjectImpl <em>Test Meta Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.TestMetaObjectImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getTestMetaObject()
     * @generated
     */
    EClass TEST_META_OBJECT = eINSTANCE.getTestMetaObject();

    /**
     * The meta object literal for the '<em><b>Metatype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_META_OBJECT__METATYPE = eINSTANCE.getTestMetaObject_Metatype();

    /**
     * The meta object literal for the '<em><b>Meta Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_META_OBJECT__META_VALUE = eINSTANCE.getTestMetaObject_MetaValue();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Parameter Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PARAMETER_SET = eINSTANCE.getAction_ParameterSet();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterSetImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSet()
     * @generated
     */
    EClass PARAMETER_SET = eINSTANCE.getParameterSet();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SET__PARAMETERS = eINSTANCE.getParameterSet_Parameters();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

    /**
     * The meta object literal for the '<em><b>Ue Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__UE_REF = eINSTANCE.getParameter_UeRef();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.ACTIONPARAMS <em>ACTIONPARAMS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.ACTIONPARAMS
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getACTIONPARAMS()
     * @generated
     */
    EEnum ACTIONPARAMS = eINSTANCE.getACTIONPARAMS();

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
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.METATYPE <em>METATYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.METATYPE
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getMETATYPE()
     * @generated
     */
    EEnum METATYPE = eINSTANCE.getMETATYPE();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.ACTIONS <em>ACTIONS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.ACTIONS
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getACTIONS()
     * @generated
     */
    EEnum ACTIONS = eINSTANCE.getACTIONS();

  }

} //DragonXPackage
