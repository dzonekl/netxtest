/**
 */
package com.netxforge.netxtest.dragonX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>LINEIDENTIFICATION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getLINEIDENTIFICATION()
 * @model
 * @generated
 */
public enum LINEIDENTIFICATION implements Enumerator
{
  /**
   * The '<em><b>Clip</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLIP_VALUE
   * @generated
   * @ordered
   */
  CLIP(0, "clip", "CLIP"),

  /**
   * The '<em><b>Clir</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLIR_VALUE
   * @generated
   * @ordered
   */
  CLIR(1, "clir", "CLIR"),

  /**
   * The '<em><b>Colp</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLP_VALUE
   * @generated
   * @ordered
   */
  COLP(2, "colp", "COLP"),

  /**
   * The '<em><b>Colr</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLR_VALUE
   * @generated
   * @ordered
   */
  COLR(3, "colr", "COLR");

  /**
   * The '<em><b>Clip</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Clip</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLIP
   * @model name="clip" literal="CLIP"
   * @generated
   * @ordered
   */
  public static final int CLIP_VALUE = 0;

  /**
   * The '<em><b>Clir</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Clir</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLIR
   * @model name="clir" literal="CLIR"
   * @generated
   * @ordered
   */
  public static final int CLIR_VALUE = 1;

  /**
   * The '<em><b>Colp</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Colp</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLP
   * @model name="colp" literal="COLP"
   * @generated
   * @ordered
   */
  public static final int COLP_VALUE = 2;

  /**
   * The '<em><b>Colr</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Colr</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLR
   * @model name="colr" literal="COLR"
   * @generated
   * @ordered
   */
  public static final int COLR_VALUE = 3;

  /**
   * An array of all the '<em><b>LINEIDENTIFICATION</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LINEIDENTIFICATION[] VALUES_ARRAY =
    new LINEIDENTIFICATION[]
    {
      CLIP,
      CLIR,
      COLP,
      COLR,
    };

  /**
   * A public read-only list of all the '<em><b>LINEIDENTIFICATION</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LINEIDENTIFICATION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>LINEIDENTIFICATION</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LINEIDENTIFICATION get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LINEIDENTIFICATION result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>LINEIDENTIFICATION</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LINEIDENTIFICATION getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LINEIDENTIFICATION result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>LINEIDENTIFICATION</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LINEIDENTIFICATION get(int value)
  {
    switch (value)
    {
      case CLIP_VALUE: return CLIP;
      case CLIR_VALUE: return CLIR;
      case COLP_VALUE: return COLP;
      case COLR_VALUE: return COLR;
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
  private LINEIDENTIFICATION(int value, String name, String literal)
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
  
} //LINEIDENTIFICATION
