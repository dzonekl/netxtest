/**
 */
package com.netxforge.netxtest.dragonX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PARAM RESPONSE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getPARAM_RESPONSE()
 * @model
 * @generated
 */
public enum PARAM_RESPONSE implements Enumerator
{
  /**
   * The '<em><b>Listining</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LISTINING_VALUE
   * @generated
   * @ordered
   */
  LISTINING(0, "listining", "Listening"),

  /**
   * The '<em><b>Offhook</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OFFHOOK_VALUE
   * @generated
   * @ordered
   */
  OFFHOOK(1, "offhook", "OffHook"),

  /**
   * The '<em><b>Hangup</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HANGUP_VALUE
   * @generated
   * @ordered
   */
  HANGUP(2, "hangup", "HangUp");

  /**
   * The '<em><b>Listining</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Listining</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LISTINING
   * @model name="listining" literal="Listening"
   * @generated
   * @ordered
   */
  public static final int LISTINING_VALUE = 0;

  /**
   * The '<em><b>Offhook</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Offhook</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OFFHOOK
   * @model name="offhook" literal="OffHook"
   * @generated
   * @ordered
   */
  public static final int OFFHOOK_VALUE = 1;

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
  public static final int HANGUP_VALUE = 2;

  /**
   * An array of all the '<em><b>PARAM RESPONSE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PARAM_RESPONSE[] VALUES_ARRAY =
    new PARAM_RESPONSE[]
    {
      LISTINING,
      OFFHOOK,
      HANGUP,
    };

  /**
   * A public read-only list of all the '<em><b>PARAM RESPONSE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PARAM_RESPONSE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>PARAM RESPONSE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PARAM_RESPONSE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PARAM_RESPONSE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>PARAM RESPONSE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PARAM_RESPONSE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PARAM_RESPONSE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>PARAM RESPONSE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PARAM_RESPONSE get(int value)
  {
    switch (value)
    {
      case LISTINING_VALUE: return LISTINING;
      case OFFHOOK_VALUE: return OFFHOOK;
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
  private PARAM_RESPONSE(int value, String name, String literal)
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
  
} //PARAM_RESPONSE
