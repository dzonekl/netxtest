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
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetCallImpl <em>Parameter Set Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterSetCallImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetCall()
   * @generated
   */
  int PARAMETER_SET_CALL = 7;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_CALL__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter Set Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_CALL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetAnswerImpl <em>Parameter Set Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterSetAnswerImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetAnswer()
   * @generated
   */
  int PARAMETER_SET_ANSWER = 8;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_ANSWER__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter Set Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_ANSWER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetUssdImpl <em>Parameter Set Ussd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterSetUssdImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetUssd()
   * @generated
   */
  int PARAMETER_SET_USSD = 9;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_USSD__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter Set Ussd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_USSD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetSmsImpl <em>Parameter Set Sms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterSetSmsImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetSms()
   * @generated
   */
  int PARAMETER_SET_SMS = 10;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_SMS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter Set Sms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_SMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetDataImpl <em>Parameter Set Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterSetDataImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetData()
   * @generated
   */
  int PARAMETER_SET_DATA = 11;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_DATA__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter Set Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_DATA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetMixerImpl <em>Parameter Set Mixer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterSetMixerImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetMixer()
   * @generated
   */
  int PARAMETER_SET_MIXER = 12;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_MIXER__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter Set Mixer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SET_MIXER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterCallImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterCall()
   * @generated
   */
  int PARAMETER_CALL = 13;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_CALL__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_CALL__TO = 1;

  /**
   * The feature id for the '<em><b>Calling Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_CALL__CALLING_TIME = 2;

  /**
   * The feature id for the '<em><b>Ofhook Response</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_CALL__OFHOOK_RESPONSE = 3;

  /**
   * The feature id for the '<em><b>Response Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_CALL__RESPONSE_TIME = 4;

  /**
   * The number of structural features of the '<em>Parameter Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_CALL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterAnswerImpl <em>Parameter Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterAnswerImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterAnswer()
   * @generated
   */
  int PARAMETER_ANSWER = 14;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ANSWER__FROM = 0;

  /**
   * The feature id for the '<em><b>Listening Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ANSWER__LISTENING_TIME = 1;

  /**
   * The feature id for the '<em><b>Answer Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ANSWER__ANSWER_TIME = 2;

  /**
   * The feature id for the '<em><b>Response</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ANSWER__RESPONSE = 3;

  /**
   * The number of structural features of the '<em>Parameter Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ANSWER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl <em>Parameter Ussd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterUssd()
   * @generated
   */
  int PARAMETER_USSD = 15;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD__FROM = 0;

  /**
   * The feature id for the '<em><b>Cf Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD__CF_CODE = 1;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD__DESTINATION = 2;

  /**
   * The feature id for the '<em><b>Service Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD__SERVICE_DELAY = 3;

  /**
   * The feature id for the '<em><b>Barring Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD__BARRING_CODE = 4;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD__CODE = 5;

  /**
   * The feature id for the '<em><b>Li Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD__LI_CODE = 6;

  /**
   * The feature id for the '<em><b>Ussdregistration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD__USSDREGISTRATION = 7;

  /**
   * The number of structural features of the '<em>Parameter Ussd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_USSD_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSmsImpl <em>Parameter Sms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterSmsImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSms()
   * @generated
   */
  int PARAMETER_SMS = 16;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SMS__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SMS__TO = 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SMS__MESSAGE = 2;

  /**
   * The number of structural features of the '<em>Parameter Sms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SMS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterDataImpl <em>Parameter Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterDataImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterData()
   * @generated
   */
  int PARAMETER_DATA = 17;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA__FROM = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA__URL = 1;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA__TO = 2;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA__DATA = 3;

  /**
   * The number of structural features of the '<em>Parameter Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterMixerImpl <em>Parameter Mixer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.impl.ParameterMixerImpl
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterMixer()
   * @generated
   */
  int PARAMETER_MIXER = 18;

  /**
   * The feature id for the '<em><b>Mixer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_MIXER__MIXER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_MIXER__VALUE = 1;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_MIXER__OPTION = 2;

  /**
   * The number of structural features of the '<em>Parameter Mixer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_MIXER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.MIXEROPTIONS <em>MIXEROPTIONS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.MIXEROPTIONS
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getMIXEROPTIONS()
   * @generated
   */
  int MIXEROPTIONS = 19;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.MIXER <em>MIXER</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.MIXER
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getMIXER()
   * @generated
   */
  int MIXER = 20;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.USSDREGISTRATION <em>USSDREGISTRATION</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.USSDREGISTRATION
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUSSDREGISTRATION()
   * @generated
   */
  int USSDREGISTRATION = 21;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.CALLFORWARDING <em>CALLFORWARDING</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.CALLFORWARDING
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getCALLFORWARDING()
   * @generated
   */
  int CALLFORWARDING = 22;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.BARRING <em>BARRING</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.BARRING
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getBARRING()
   * @generated
   */
  int BARRING = 23;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.LINEIDENTIFICATION <em>LINEIDENTIFICATION</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.LINEIDENTIFICATION
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getLINEIDENTIFICATION()
   * @generated
   */
  int LINEIDENTIFICATION = 24;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.ANSWERRESPONSE <em>ANSWERRESPONSE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.ANSWERRESPONSE
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getANSWERRESPONSE()
   * @generated
   */
  int ANSWERRESPONSE = 25;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.CALLRESPONSE <em>CALLRESPONSE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.CALLRESPONSE
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getCALLRESPONSE()
   * @generated
   */
  int CALLRESPONSE = 26;

  /**
   * The meta object id for the '{@link com.netxforge.netxtest.dragonX.UEPARAMS <em>UEPARAMS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.netxforge.netxtest.dragonX.UEPARAMS
   * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUEPARAMS()
   * @generated
   */
  int UEPARAMS = 27;


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
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterSetCall <em>Parameter Set Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Set Call</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetCall
   * @generated
   */
  EClass getParameterSetCall();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.ParameterSetCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetCall#getParameters()
   * @see #getParameterSetCall()
   * @generated
   */
  EReference getParameterSetCall_Parameters();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterSetAnswer <em>Parameter Set Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Set Answer</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetAnswer
   * @generated
   */
  EClass getParameterSetAnswer();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.ParameterSetAnswer#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetAnswer#getParameters()
   * @see #getParameterSetAnswer()
   * @generated
   */
  EReference getParameterSetAnswer_Parameters();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterSetUssd <em>Parameter Set Ussd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Set Ussd</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetUssd
   * @generated
   */
  EClass getParameterSetUssd();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.ParameterSetUssd#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetUssd#getParameters()
   * @see #getParameterSetUssd()
   * @generated
   */
  EReference getParameterSetUssd_Parameters();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterSetSms <em>Parameter Set Sms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Set Sms</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetSms
   * @generated
   */
  EClass getParameterSetSms();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.ParameterSetSms#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetSms#getParameters()
   * @see #getParameterSetSms()
   * @generated
   */
  EReference getParameterSetSms_Parameters();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterSetData <em>Parameter Set Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Set Data</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetData
   * @generated
   */
  EClass getParameterSetData();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.ParameterSetData#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetData#getParameters()
   * @see #getParameterSetData()
   * @generated
   */
  EReference getParameterSetData_Parameters();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterSetMixer <em>Parameter Set Mixer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Set Mixer</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetMixer
   * @generated
   */
  EClass getParameterSetMixer();

  /**
   * Returns the meta object for the containment reference list '{@link com.netxforge.netxtest.dragonX.ParameterSetMixer#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSetMixer#getParameters()
   * @see #getParameterSetMixer()
   * @generated
   */
  EReference getParameterSetMixer_Parameters();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterCall <em>Parameter Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Call</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterCall
   * @generated
   */
  EClass getParameterCall();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterCall#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterCall#getFrom()
   * @see #getParameterCall()
   * @generated
   */
  EReference getParameterCall_From();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterCall#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterCall#getTo()
   * @see #getParameterCall()
   * @generated
   */
  EReference getParameterCall_To();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterCall#getCallingTime <em>Calling Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Calling Time</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterCall#getCallingTime()
   * @see #getParameterCall()
   * @generated
   */
  EAttribute getParameterCall_CallingTime();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterCall#getOfhookResponse <em>Ofhook Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ofhook Response</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterCall#getOfhookResponse()
   * @see #getParameterCall()
   * @generated
   */
  EAttribute getParameterCall_OfhookResponse();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterCall#getResponseTime <em>Response Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response Time</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterCall#getResponseTime()
   * @see #getParameterCall()
   * @generated
   */
  EAttribute getParameterCall_ResponseTime();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterAnswer <em>Parameter Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Answer</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterAnswer
   * @generated
   */
  EClass getParameterAnswer();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterAnswer#getFrom()
   * @see #getParameterAnswer()
   * @generated
   */
  EReference getParameterAnswer_From();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getListeningTime <em>Listening Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Listening Time</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterAnswer#getListeningTime()
   * @see #getParameterAnswer()
   * @generated
   */
  EAttribute getParameterAnswer_ListeningTime();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getAnswerTime <em>Answer Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Answer Time</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterAnswer#getAnswerTime()
   * @see #getParameterAnswer()
   * @generated
   */
  EAttribute getParameterAnswer_AnswerTime();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterAnswer#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterAnswer#getResponse()
   * @see #getParameterAnswer()
   * @generated
   */
  EAttribute getParameterAnswer_Response();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterUssd <em>Parameter Ussd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Ussd</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd
   * @generated
   */
  EClass getParameterUssd();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd#getFrom()
   * @see #getParameterUssd()
   * @generated
   */
  EReference getParameterUssd_From();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getCfCode <em>Cf Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cf Code</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd#getCfCode()
   * @see #getParameterUssd()
   * @generated
   */
  EAttribute getParameterUssd_CfCode();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd#getDestination()
   * @see #getParameterUssd()
   * @generated
   */
  EReference getParameterUssd_Destination();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getServiceDelay <em>Service Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Delay</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd#getServiceDelay()
   * @see #getParameterUssd()
   * @generated
   */
  EAttribute getParameterUssd_ServiceDelay();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getBarringCode <em>Barring Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Barring Code</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd#getBarringCode()
   * @see #getParameterUssd()
   * @generated
   */
  EAttribute getParameterUssd_BarringCode();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd#getCode()
   * @see #getParameterUssd()
   * @generated
   */
  EAttribute getParameterUssd_Code();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getLiCode <em>Li Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Li Code</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd#getLiCode()
   * @see #getParameterUssd()
   * @generated
   */
  EAttribute getParameterUssd_LiCode();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getUssdregistration <em>Ussdregistration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ussdregistration</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterUssd#getUssdregistration()
   * @see #getParameterUssd()
   * @generated
   */
  EAttribute getParameterUssd_Ussdregistration();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterSms <em>Parameter Sms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Sms</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSms
   * @generated
   */
  EClass getParameterSms();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterSms#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSms#getFrom()
   * @see #getParameterSms()
   * @generated
   */
  EReference getParameterSms_From();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterSms#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSms#getTo()
   * @see #getParameterSms()
   * @generated
   */
  EReference getParameterSms_To();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterSms#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterSms#getMessage()
   * @see #getParameterSms()
   * @generated
   */
  EAttribute getParameterSms_Message();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterData <em>Parameter Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Data</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterData
   * @generated
   */
  EClass getParameterData();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterData#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterData#getFrom()
   * @see #getParameterData()
   * @generated
   */
  EReference getParameterData_From();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterData#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterData#getUrl()
   * @see #getParameterData()
   * @generated
   */
  EAttribute getParameterData_Url();

  /**
   * Returns the meta object for the reference '{@link com.netxforge.netxtest.dragonX.ParameterData#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterData#getTo()
   * @see #getParameterData()
   * @generated
   */
  EReference getParameterData_To();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterData#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterData#getData()
   * @see #getParameterData()
   * @generated
   */
  EAttribute getParameterData_Data();

  /**
   * Returns the meta object for class '{@link com.netxforge.netxtest.dragonX.ParameterMixer <em>Parameter Mixer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Mixer</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterMixer
   * @generated
   */
  EClass getParameterMixer();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterMixer#getMixer <em>Mixer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mixer</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterMixer#getMixer()
   * @see #getParameterMixer()
   * @generated
   */
  EAttribute getParameterMixer_Mixer();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterMixer#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterMixer#getValue()
   * @see #getParameterMixer()
   * @generated
   */
  EAttribute getParameterMixer_Value();

  /**
   * Returns the meta object for the attribute '{@link com.netxforge.netxtest.dragonX.ParameterMixer#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see com.netxforge.netxtest.dragonX.ParameterMixer#getOption()
   * @see #getParameterMixer()
   * @generated
   */
  EAttribute getParameterMixer_Option();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.MIXEROPTIONS <em>MIXEROPTIONS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>MIXEROPTIONS</em>'.
   * @see com.netxforge.netxtest.dragonX.MIXEROPTIONS
   * @generated
   */
  EEnum getMIXEROPTIONS();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.MIXER <em>MIXER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>MIXER</em>'.
   * @see com.netxforge.netxtest.dragonX.MIXER
   * @generated
   */
  EEnum getMIXER();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.USSDREGISTRATION <em>USSDREGISTRATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>USSDREGISTRATION</em>'.
   * @see com.netxforge.netxtest.dragonX.USSDREGISTRATION
   * @generated
   */
  EEnum getUSSDREGISTRATION();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.CALLFORWARDING <em>CALLFORWARDING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>CALLFORWARDING</em>'.
   * @see com.netxforge.netxtest.dragonX.CALLFORWARDING
   * @generated
   */
  EEnum getCALLFORWARDING();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.BARRING <em>BARRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BARRING</em>'.
   * @see com.netxforge.netxtest.dragonX.BARRING
   * @generated
   */
  EEnum getBARRING();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.LINEIDENTIFICATION <em>LINEIDENTIFICATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>LINEIDENTIFICATION</em>'.
   * @see com.netxforge.netxtest.dragonX.LINEIDENTIFICATION
   * @generated
   */
  EEnum getLINEIDENTIFICATION();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.ANSWERRESPONSE <em>ANSWERRESPONSE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ANSWERRESPONSE</em>'.
   * @see com.netxforge.netxtest.dragonX.ANSWERRESPONSE
   * @generated
   */
  EEnum getANSWERRESPONSE();

  /**
   * Returns the meta object for enum '{@link com.netxforge.netxtest.dragonX.CALLRESPONSE <em>CALLRESPONSE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>CALLRESPONSE</em>'.
   * @see com.netxforge.netxtest.dragonX.CALLRESPONSE
   * @generated
   */
  EEnum getCALLRESPONSE();

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
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetCallImpl <em>Parameter Set Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterSetCallImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetCall()
     * @generated
     */
    EClass PARAMETER_SET_CALL = eINSTANCE.getParameterSetCall();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SET_CALL__PARAMETERS = eINSTANCE.getParameterSetCall_Parameters();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetAnswerImpl <em>Parameter Set Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterSetAnswerImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetAnswer()
     * @generated
     */
    EClass PARAMETER_SET_ANSWER = eINSTANCE.getParameterSetAnswer();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SET_ANSWER__PARAMETERS = eINSTANCE.getParameterSetAnswer_Parameters();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetUssdImpl <em>Parameter Set Ussd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterSetUssdImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetUssd()
     * @generated
     */
    EClass PARAMETER_SET_USSD = eINSTANCE.getParameterSetUssd();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SET_USSD__PARAMETERS = eINSTANCE.getParameterSetUssd_Parameters();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetSmsImpl <em>Parameter Set Sms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterSetSmsImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetSms()
     * @generated
     */
    EClass PARAMETER_SET_SMS = eINSTANCE.getParameterSetSms();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SET_SMS__PARAMETERS = eINSTANCE.getParameterSetSms_Parameters();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetDataImpl <em>Parameter Set Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterSetDataImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetData()
     * @generated
     */
    EClass PARAMETER_SET_DATA = eINSTANCE.getParameterSetData();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SET_DATA__PARAMETERS = eINSTANCE.getParameterSetData_Parameters();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSetMixerImpl <em>Parameter Set Mixer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterSetMixerImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSetMixer()
     * @generated
     */
    EClass PARAMETER_SET_MIXER = eINSTANCE.getParameterSetMixer();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SET_MIXER__PARAMETERS = eINSTANCE.getParameterSetMixer_Parameters();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterCallImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterCall()
     * @generated
     */
    EClass PARAMETER_CALL = eINSTANCE.getParameterCall();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_CALL__FROM = eINSTANCE.getParameterCall_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_CALL__TO = eINSTANCE.getParameterCall_To();

    /**
     * The meta object literal for the '<em><b>Calling Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_CALL__CALLING_TIME = eINSTANCE.getParameterCall_CallingTime();

    /**
     * The meta object literal for the '<em><b>Ofhook Response</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_CALL__OFHOOK_RESPONSE = eINSTANCE.getParameterCall_OfhookResponse();

    /**
     * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_CALL__RESPONSE_TIME = eINSTANCE.getParameterCall_ResponseTime();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterAnswerImpl <em>Parameter Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterAnswerImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterAnswer()
     * @generated
     */
    EClass PARAMETER_ANSWER = eINSTANCE.getParameterAnswer();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ANSWER__FROM = eINSTANCE.getParameterAnswer_From();

    /**
     * The meta object literal for the '<em><b>Listening Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_ANSWER__LISTENING_TIME = eINSTANCE.getParameterAnswer_ListeningTime();

    /**
     * The meta object literal for the '<em><b>Answer Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_ANSWER__ANSWER_TIME = eINSTANCE.getParameterAnswer_AnswerTime();

    /**
     * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_ANSWER__RESPONSE = eINSTANCE.getParameterAnswer_Response();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl <em>Parameter Ussd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterUssdImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterUssd()
     * @generated
     */
    EClass PARAMETER_USSD = eINSTANCE.getParameterUssd();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_USSD__FROM = eINSTANCE.getParameterUssd_From();

    /**
     * The meta object literal for the '<em><b>Cf Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_USSD__CF_CODE = eINSTANCE.getParameterUssd_CfCode();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_USSD__DESTINATION = eINSTANCE.getParameterUssd_Destination();

    /**
     * The meta object literal for the '<em><b>Service Delay</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_USSD__SERVICE_DELAY = eINSTANCE.getParameterUssd_ServiceDelay();

    /**
     * The meta object literal for the '<em><b>Barring Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_USSD__BARRING_CODE = eINSTANCE.getParameterUssd_BarringCode();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_USSD__CODE = eINSTANCE.getParameterUssd_Code();

    /**
     * The meta object literal for the '<em><b>Li Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_USSD__LI_CODE = eINSTANCE.getParameterUssd_LiCode();

    /**
     * The meta object literal for the '<em><b>Ussdregistration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_USSD__USSDREGISTRATION = eINSTANCE.getParameterUssd_Ussdregistration();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterSmsImpl <em>Parameter Sms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterSmsImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterSms()
     * @generated
     */
    EClass PARAMETER_SMS = eINSTANCE.getParameterSms();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SMS__FROM = eINSTANCE.getParameterSms_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SMS__TO = eINSTANCE.getParameterSms_To();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_SMS__MESSAGE = eINSTANCE.getParameterSms_Message();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterDataImpl <em>Parameter Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterDataImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterData()
     * @generated
     */
    EClass PARAMETER_DATA = eINSTANCE.getParameterData();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DATA__FROM = eINSTANCE.getParameterData_From();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DATA__URL = eINSTANCE.getParameterData_Url();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DATA__TO = eINSTANCE.getParameterData_To();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DATA__DATA = eINSTANCE.getParameterData_Data();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.impl.ParameterMixerImpl <em>Parameter Mixer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.impl.ParameterMixerImpl
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getParameterMixer()
     * @generated
     */
    EClass PARAMETER_MIXER = eINSTANCE.getParameterMixer();

    /**
     * The meta object literal for the '<em><b>Mixer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_MIXER__MIXER = eINSTANCE.getParameterMixer_Mixer();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_MIXER__VALUE = eINSTANCE.getParameterMixer_Value();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_MIXER__OPTION = eINSTANCE.getParameterMixer_Option();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.MIXEROPTIONS <em>MIXEROPTIONS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.MIXEROPTIONS
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getMIXEROPTIONS()
     * @generated
     */
    EEnum MIXEROPTIONS = eINSTANCE.getMIXEROPTIONS();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.MIXER <em>MIXER</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.MIXER
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getMIXER()
     * @generated
     */
    EEnum MIXER = eINSTANCE.getMIXER();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.USSDREGISTRATION <em>USSDREGISTRATION</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.USSDREGISTRATION
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUSSDREGISTRATION()
     * @generated
     */
    EEnum USSDREGISTRATION = eINSTANCE.getUSSDREGISTRATION();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.CALLFORWARDING <em>CALLFORWARDING</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.CALLFORWARDING
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getCALLFORWARDING()
     * @generated
     */
    EEnum CALLFORWARDING = eINSTANCE.getCALLFORWARDING();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.BARRING <em>BARRING</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.BARRING
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getBARRING()
     * @generated
     */
    EEnum BARRING = eINSTANCE.getBARRING();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.LINEIDENTIFICATION <em>LINEIDENTIFICATION</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.LINEIDENTIFICATION
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getLINEIDENTIFICATION()
     * @generated
     */
    EEnum LINEIDENTIFICATION = eINSTANCE.getLINEIDENTIFICATION();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.ANSWERRESPONSE <em>ANSWERRESPONSE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.ANSWERRESPONSE
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getANSWERRESPONSE()
     * @generated
     */
    EEnum ANSWERRESPONSE = eINSTANCE.getANSWERRESPONSE();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.CALLRESPONSE <em>CALLRESPONSE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.CALLRESPONSE
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getCALLRESPONSE()
     * @generated
     */
    EEnum CALLRESPONSE = eINSTANCE.getCALLRESPONSE();

    /**
     * The meta object literal for the '{@link com.netxforge.netxtest.dragonX.UEPARAMS <em>UEPARAMS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.netxforge.netxtest.dragonX.UEPARAMS
     * @see com.netxforge.netxtest.dragonX.impl.DragonXPackageImpl#getUEPARAMS()
     * @generated
     */
    EEnum UEPARAMS = eINSTANCE.getUEPARAMS();

  }

} //DragonXPackage
