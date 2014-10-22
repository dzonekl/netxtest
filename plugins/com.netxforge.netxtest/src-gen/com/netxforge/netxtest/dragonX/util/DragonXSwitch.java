/**
 */
package com.netxforge.netxtest.dragonX.util;

import com.netxforge.netxtest.dragonX.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage
 * @generated
 */
public class DragonXSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DragonXPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DragonXSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DragonXPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DragonXPackage.DRAGON_X:
      {
        DragonX dragonX = (DragonX)theEObject;
        T result = caseDragonX(dragonX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.UE:
      {
        UE ue = (UE)theEObject;
        T result = caseUE(ue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.UE_META_OBJECT:
      {
        UEMetaObject ueMetaObject = (UEMetaObject)theEObject;
        T result = caseUEMetaObject(ueMetaObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.TEST_CASE:
      {
        TestCase testCase = (TestCase)theEObject;
        T result = caseTestCase(testCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.DESCRIPTION_OBJECT:
      {
        DescriptionObject descriptionObject = (DescriptionObject)theEObject;
        T result = caseDescriptionObject(descriptionObject);
        if (result == null) result = caseUEMetaObject(descriptionObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PROCEDURE:
      {
        Procedure procedure = (Procedure)theEObject;
        T result = caseProcedure(procedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_SET_CALL:
      {
        ParameterSetCall parameterSetCall = (ParameterSetCall)theEObject;
        T result = caseParameterSetCall(parameterSetCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_SET_ANSWER:
      {
        ParameterSetAnswer parameterSetAnswer = (ParameterSetAnswer)theEObject;
        T result = caseParameterSetAnswer(parameterSetAnswer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_SET_USSD:
      {
        ParameterSetUssd parameterSetUssd = (ParameterSetUssd)theEObject;
        T result = caseParameterSetUssd(parameterSetUssd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_SET_SMS:
      {
        ParameterSetSms parameterSetSms = (ParameterSetSms)theEObject;
        T result = caseParameterSetSms(parameterSetSms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_SET_DATA:
      {
        ParameterSetData parameterSetData = (ParameterSetData)theEObject;
        T result = caseParameterSetData(parameterSetData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_SET_MIXER:
      {
        ParameterSetMixer parameterSetMixer = (ParameterSetMixer)theEObject;
        T result = caseParameterSetMixer(parameterSetMixer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_CALL:
      {
        ParameterCall parameterCall = (ParameterCall)theEObject;
        T result = caseParameterCall(parameterCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_ANSWER:
      {
        ParameterAnswer parameterAnswer = (ParameterAnswer)theEObject;
        T result = caseParameterAnswer(parameterAnswer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_USSD:
      {
        ParameterUssd parameterUssd = (ParameterUssd)theEObject;
        T result = caseParameterUssd(parameterUssd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_SMS:
      {
        ParameterSms parameterSms = (ParameterSms)theEObject;
        T result = caseParameterSms(parameterSms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_DATA:
      {
        ParameterData parameterData = (ParameterData)theEObject;
        T result = caseParameterData(parameterData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DragonXPackage.PARAMETER_MIXER:
      {
        ParameterMixer parameterMixer = (ParameterMixer)theEObject;
        T result = caseParameterMixer(parameterMixer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dragon X</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dragon X</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDragonX(DragonX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUE(UE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UE Meta Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UE Meta Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUEMetaObject(UEMetaObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestCase(TestCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescriptionObject(DescriptionObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedure(Procedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Set Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Set Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSetCall(ParameterSetCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Set Answer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Set Answer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSetAnswer(ParameterSetAnswer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Set Ussd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Set Ussd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSetUssd(ParameterSetUssd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Set Sms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Set Sms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSetSms(ParameterSetSms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Set Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Set Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSetData(ParameterSetData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Set Mixer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Set Mixer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSetMixer(ParameterSetMixer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterCall(ParameterCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Answer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Answer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterAnswer(ParameterAnswer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Ussd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Ussd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterUssd(ParameterUssd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Sms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Sms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSms(ParameterSms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterData(ParameterData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Mixer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Mixer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterMixer(ParameterMixer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DragonXSwitch
