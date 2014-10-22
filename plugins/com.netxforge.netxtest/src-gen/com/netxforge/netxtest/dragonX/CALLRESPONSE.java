/**
 */
package com.netxforge.netxtest.dragonX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CALLRESPONSE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getCALLRESPONSE()
 * @model
 * @generated
 */
public enum CALLRESPONSE implements Enumerator
{
  /**
   * The '<em><b>Listening</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LISTENING_VALUE
   * @generated
   * @ordered
   */
  LISTENING(0, "listening", "Listening"),

  /**
   * The '<em><b>Hangup</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HANGUP_VALUE
   * @generated
   * @ordered
   */
  HANGUP(1, "hangup", "HangUp");

  /**
   * The '<em><b>Listening</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Listening</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LISTENING
   * @model name="listening" literal="Listening"
   * @generated
   * @ordered
   */
  public static final int LISTENING_VALUE = 0;

  /**
   * The '<em><b>Hangup</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Hangup</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HANGUP
   * @model name="hangup" literal="HangUp"
   * @generated
   * @ordered
   */
  public static final int HANGUP_VALUE = 1;

  /**
   * An array of all the '<em><b>CALLRESPONSE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CALLRESPONSE[] VALUES_ARRAY =
    new CALLRESPONSE[]
    {
      LISTENING,
      HANGUP,
    };

  /**
   * A public read-only list of all the '<em><b>CALLRESPONSE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CALLRESPONSE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>CALLRESPONSE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CALLRESPONSE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CALLRESPONSE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>CALLRESPONSE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CALLRESPONSE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CALLRESPONSE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>CALLRESPONSE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CALLRESPONSE get(int value)
  {
    switch (value)
    {
      case LISTENING_VALUE: return LISTENING;
      case HANGUP_VALUE: return HANGUP;
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
  private CALLRESPONSE(int value, String name, String literal)
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
  
} //CALLRESPONSE
