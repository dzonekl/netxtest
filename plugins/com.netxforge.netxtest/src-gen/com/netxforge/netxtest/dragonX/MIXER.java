/**
 */
package com.netxforge.netxtest.dragonX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MIXER</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getMIXER()
 * @model
 * @generated
 */
public enum MIXER implements Enumerator
{
  /**
   * The '<em><b>P1</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #P1_VALUE
   * @generated
   * @ordered
   */
  P1(0, "p1", "P1"),

  /**
   * The '<em><b>P2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #P2_VALUE
   * @generated
   * @ordered
   */
  P2(1, "p2", "P2"),

  /**
   * The '<em><b>P3</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #P3_VALUE
   * @generated
   * @ordered
   */
  P3(2, "p3", "p3"),

  /**
   * The '<em><b>P4</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #P4_VALUE
   * @generated
   * @ordered
   */
  P4(3, "p4", "p4"),

  /**
   * The '<em><b>P5</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #P5_VALUE
   * @generated
   * @ordered
   */
  P5(4, "p5", "p5"),

  /**
   * The '<em><b>P6</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #P6_VALUE
   * @generated
   * @ordered
   */
  P6(5, "p6", "p6");

  /**
   * The '<em><b>P1</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>P1</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #P1
   * @model name="p1" literal="P1"
   * @generated
   * @ordered
   */
  public static final int P1_VALUE = 0;

  /**
   * The '<em><b>P2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>P2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #P2
   * @model name="p2" literal="P2"
   * @generated
   * @ordered
   */
  public static final int P2_VALUE = 1;

  /**
   * The '<em><b>P3</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>P3</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #P3
   * @model name="p3"
   * @generated
   * @ordered
   */
  public static final int P3_VALUE = 2;

  /**
   * The '<em><b>P4</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>P4</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #P4
   * @model name="p4"
   * @generated
   * @ordered
   */
  public static final int P4_VALUE = 3;

  /**
   * The '<em><b>P5</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>P5</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #P5
   * @model name="p5"
   * @generated
   * @ordered
   */
  public static final int P5_VALUE = 4;

  /**
   * The '<em><b>P6</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>P6</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #P6
   * @model name="p6"
   * @generated
   * @ordered
   */
  public static final int P6_VALUE = 5;

  /**
   * An array of all the '<em><b>MIXER</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MIXER[] VALUES_ARRAY =
    new MIXER[]
    {
      P1,
      P2,
      P3,
      P4,
      P5,
      P6,
    };

  /**
   * A public read-only list of all the '<em><b>MIXER</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MIXER> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>MIXER</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MIXER get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MIXER result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MIXER</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MIXER getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MIXER result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MIXER</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MIXER get(int value)
  {
    switch (value)
    {
      case P1_VALUE: return P1;
      case P2_VALUE: return P2;
      case P3_VALUE: return P3;
      case P4_VALUE: return P4;
      case P5_VALUE: return P5;
      case P6_VALUE: return P6;
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
  private MIXER(int value, String name, String literal)
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
  
} //MIXER
