/**
 */
package com.netxforge.netxtest.dragonX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ACTIONS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getACTIONS()
 * @model
 * @generated
 */
public enum ACTIONS implements Enumerator
{
  /**
   * The '<em><b>Call</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CALL_VALUE
   * @generated
   * @ordered
   */
  CALL(0, "call", "CALL"),

  /**
   * The '<em><b>Answer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANSWER_VALUE
   * @generated
   * @ordered
   */
  ANSWER(1, "answer", "ANSWER"),

  /**
   * The '<em><b>Ussd</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USSD_VALUE
   * @generated
   * @ordered
   */
  USSD(2, "ussd", "USSD"),

  /**
   * The '<em><b>Sms</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMS_VALUE
   * @generated
   * @ordered
   */
  SMS(3, "sms", "SMS"),

  /**
   * The '<em><b>Data</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_VALUE
   * @generated
   * @ordered
   */
  DATA(4, "data", "DATA");

  /**
   * The '<em><b>Call</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Call</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CALL
   * @model name="call" literal="CALL"
   * @generated
   * @ordered
   */
  public static final int CALL_VALUE = 0;

  /**
   * The '<em><b>Answer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Answer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANSWER
   * @model name="answer" literal="ANSWER"
   * @generated
   * @ordered
   */
  public static final int ANSWER_VALUE = 1;

  /**
   * The '<em><b>Ussd</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ussd</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USSD
   * @model name="ussd" literal="USSD"
   * @generated
   * @ordered
   */
  public static final int USSD_VALUE = 2;

  /**
   * The '<em><b>Sms</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sms</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SMS
   * @model name="sms" literal="SMS"
   * @generated
   * @ordered
   */
  public static final int SMS_VALUE = 3;

  /**
   * The '<em><b>Data</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Data</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATA
   * @model name="data" literal="DATA"
   * @generated
   * @ordered
   */
  public static final int DATA_VALUE = 4;

  /**
   * An array of all the '<em><b>ACTIONS</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ACTIONS[] VALUES_ARRAY =
    new ACTIONS[]
    {
      CALL,
      ANSWER,
      USSD,
      SMS,
      DATA,
    };

  /**
   * A public read-only list of all the '<em><b>ACTIONS</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ACTIONS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>ACTIONS</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ACTIONS get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ACTIONS result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ACTIONS</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ACTIONS getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ACTIONS result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ACTIONS</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ACTIONS get(int value)
  {
    switch (value)
    {
      case CALL_VALUE: return CALL;
      case ANSWER_VALUE: return ANSWER;
      case USSD_VALUE: return USSD;
      case SMS_VALUE: return SMS;
      case DATA_VALUE: return DATA;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ACTIONS(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ACTIONS
