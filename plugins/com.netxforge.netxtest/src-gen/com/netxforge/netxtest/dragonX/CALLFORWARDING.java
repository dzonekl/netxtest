/**
 */
package com.netxforge.netxtest.dragonX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CALLFORWARDING</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getCALLFORWARDING()
 * @model
 * @generated
 */
public enum CALLFORWARDING implements Enumerator
{
  /**
   * The '<em><b>Cfu</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CFU_VALUE
   * @generated
   * @ordered
   */
  CFU(0, "cfu", "CFU"),

  /**
   * The '<em><b>Cfb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CFB_VALUE
   * @generated
   * @ordered
   */
  CFB(1, "cfb", "CFB"),

  /**
   * The '<em><b>Cfna</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CFNA_VALUE
   * @generated
   * @ordered
   */
  CFNA(2, "cfna", "CFNA"),

  /**
   * The '<em><b>Cfnr</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CFNR_VALUE
   * @generated
   * @ordered
   */
  CFNR(3, "cfnr", "CFNR"),

  /**
   * The '<em><b>Acd</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACD_VALUE
   * @generated
   * @ordered
   */
  ACD(4, "acd", "ACD");

  /**
   * The '<em><b>Cfu</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cfu</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CFU
   * @model name="cfu" literal="CFU"
   * @generated
   * @ordered
   */
  public static final int CFU_VALUE = 0;

  /**
   * The '<em><b>Cfb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cfb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CFB
   * @model name="cfb" literal="CFB"
   * @generated
   * @ordered
   */
  public static final int CFB_VALUE = 1;

  /**
   * The '<em><b>Cfna</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cfna</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CFNA
   * @model name="cfna" literal="CFNA"
   * @generated
   * @ordered
   */
  public static final int CFNA_VALUE = 2;

  /**
   * The '<em><b>Cfnr</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cfnr</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CFNR
   * @model name="cfnr" literal="CFNR"
   * @generated
   * @ordered
   */
  public static final int CFNR_VALUE = 3;

  /**
   * The '<em><b>Acd</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Acd</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACD
   * @model name="acd" literal="ACD"
   * @generated
   * @ordered
   */
  public static final int ACD_VALUE = 4;

  /**
   * An array of all the '<em><b>CALLFORWARDING</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CALLFORWARDING[] VALUES_ARRAY =
    new CALLFORWARDING[]
    {
      CFU,
      CFB,
      CFNA,
      CFNR,
      ACD,
    };

  /**
   * A public read-only list of all the '<em><b>CALLFORWARDING</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CALLFORWARDING> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>CALLFORWARDING</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CALLFORWARDING get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CALLFORWARDING result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>CALLFORWARDING</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CALLFORWARDING getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CALLFORWARDING result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>CALLFORWARDING</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CALLFORWARDING get(int value)
  {
    switch (value)
    {
      case CFU_VALUE: return CFU;
      case CFB_VALUE: return CFB;
      case CFNA_VALUE: return CFNA;
      case CFNR_VALUE: return CFNR;
      case ACD_VALUE: return ACD;
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
  private CALLFORWARDING(int value, String name, String literal)
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
  
} //CALLFORWARDING
