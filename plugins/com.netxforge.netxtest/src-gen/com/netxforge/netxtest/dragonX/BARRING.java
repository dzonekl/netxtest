/**
 */
package com.netxforge.netxtest.dragonX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BARRING</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getBARRING()
 * @model
 * @generated
 */
public enum BARRING implements Enumerator
{
  /**
   * The '<em><b>All Outgoing Calls</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_OUTGOING_CALLS_VALUE
   * @generated
   * @ordered
   */
  ALL_OUTGOING_CALLS(0, "allOutgoingCalls", "AllOutgoingCalls"),

  /**
   * The '<em><b>All Incomming Calls</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_INCOMMING_CALLS_VALUE
   * @generated
   * @ordered
   */
  ALL_INCOMMING_CALLS(1, "allIncommingCalls", "AllIncomingCalls"),

  /**
   * The '<em><b>All Outgoing Calls Ex Home</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_OUTGOING_CALLS_EX_HOME_VALUE
   * @generated
   * @ordered
   */
  ALL_OUTGOING_CALLS_EX_HOME(2, "allOutgoingCallsExHome", "AllOutgoingCallsExHome"),

  /**
   * The '<em><b>All Incomming Calls Roaming</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_INCOMMING_CALLS_ROAMING_VALUE
   * @generated
   * @ordered
   */
  ALL_INCOMMING_CALLS_ROAMING(3, "allIncommingCallsRoaming", "AllIncommingCallsRoaming");

  /**
   * The '<em><b>All Outgoing Calls</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All Outgoing Calls</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_OUTGOING_CALLS
   * @model name="allOutgoingCalls" literal="AllOutgoingCalls"
   * @generated
   * @ordered
   */
  public static final int ALL_OUTGOING_CALLS_VALUE = 0;

  /**
   * The '<em><b>All Incomming Calls</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All Incomming Calls</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_INCOMMING_CALLS
   * @model name="allIncommingCalls" literal="AllIncomingCalls"
   * @generated
   * @ordered
   */
  public static final int ALL_INCOMMING_CALLS_VALUE = 1;

  /**
   * The '<em><b>All Outgoing Calls Ex Home</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All Outgoing Calls Ex Home</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_OUTGOING_CALLS_EX_HOME
   * @model name="allOutgoingCallsExHome" literal="AllOutgoingCallsExHome"
   * @generated
   * @ordered
   */
  public static final int ALL_OUTGOING_CALLS_EX_HOME_VALUE = 2;

  /**
   * The '<em><b>All Incomming Calls Roaming</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All Incomming Calls Roaming</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_INCOMMING_CALLS_ROAMING
   * @model name="allIncommingCallsRoaming" literal="AllIncommingCallsRoaming"
   * @generated
   * @ordered
   */
  public static final int ALL_INCOMMING_CALLS_ROAMING_VALUE = 3;

  /**
   * An array of all the '<em><b>BARRING</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BARRING[] VALUES_ARRAY =
    new BARRING[]
    {
      ALL_OUTGOING_CALLS,
      ALL_INCOMMING_CALLS,
      ALL_OUTGOING_CALLS_EX_HOME,
      ALL_INCOMMING_CALLS_ROAMING,
    };

  /**
   * A public read-only list of all the '<em><b>BARRING</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BARRING> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>BARRING</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BARRING get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BARRING result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BARRING</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BARRING getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BARRING result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BARRING</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BARRING get(int value)
  {
    switch (value)
    {
      case ALL_OUTGOING_CALLS_VALUE: return ALL_OUTGOING_CALLS;
      case ALL_INCOMMING_CALLS_VALUE: return ALL_INCOMMING_CALLS;
      case ALL_OUTGOING_CALLS_EX_HOME_VALUE: return ALL_OUTGOING_CALLS_EX_HOME;
      case ALL_INCOMMING_CALLS_ROAMING_VALUE: return ALL_INCOMMING_CALLS_ROAMING;
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
  private BARRING(int value, String name, String literal)
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
  
} //BARRING
