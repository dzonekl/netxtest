/**
 */
package com.netxforge.netxtest.dragonX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Ussd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterUssd#getFrom <em>From</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterUssd#getCfCode <em>Cf Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterUssd#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterUssd#getServiceDelay <em>Service Delay</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterUssd#getBarringCode <em>Barring Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterUssd#getCode <em>Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterUssd#getLiCode <em>Li Code</em>}</li>
 *   <li>{@link com.netxforge.netxtest.dragonX.ParameterUssd#getUssdregistration <em>Ussdregistration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd()
 * @model
 * @generated
 */
public interface ParameterUssd extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(UE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd_From()
   * @model
   * @generated
   */
  UE getFrom();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(UE value);

  /**
   * Returns the value of the '<em><b>Cf Code</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.CALLFORWARDING}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cf Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cf Code</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.CALLFORWARDING
   * @see #setCfCode(CALLFORWARDING)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd_CfCode()
   * @model
   * @generated
   */
  CALLFORWARDING getCfCode();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getCfCode <em>Cf Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cf Code</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.CALLFORWARDING
   * @see #getCfCode()
   * @generated
   */
  void setCfCode(CALLFORWARDING value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(UE)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd_Destination()
   * @model
   * @generated
   */
  UE getDestination();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(UE value);

  /**
   * Returns the value of the '<em><b>Service Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Delay</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Delay</em>' attribute.
   * @see #setServiceDelay(int)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd_ServiceDelay()
   * @model
   * @generated
   */
  int getServiceDelay();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getServiceDelay <em>Service Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Delay</em>' attribute.
   * @see #getServiceDelay()
   * @generated
   */
  void setServiceDelay(int value);

  /**
   * Returns the value of the '<em><b>Barring Code</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.BARRING}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Barring Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Barring Code</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.BARRING
   * @see #setBarringCode(BARRING)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd_BarringCode()
   * @model
   * @generated
   */
  BARRING getBarringCode();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getBarringCode <em>Barring Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Barring Code</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.BARRING
   * @see #getBarringCode()
   * @generated
   */
  void setBarringCode(BARRING value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(int)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd_Code()
   * @model
   * @generated
   */
  int getCode();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(int value);

  /**
   * Returns the value of the '<em><b>Li Code</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.LINEIDENTIFICATION}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Li Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Li Code</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.LINEIDENTIFICATION
   * @see #setLiCode(LINEIDENTIFICATION)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd_LiCode()
   * @model
   * @generated
   */
  LINEIDENTIFICATION getLiCode();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getLiCode <em>Li Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Li Code</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.LINEIDENTIFICATION
   * @see #getLiCode()
   * @generated
   */
  void setLiCode(LINEIDENTIFICATION value);

  /**
   * Returns the value of the '<em><b>Ussdregistration</b></em>' attribute.
   * The literals are from the enumeration {@link com.netxforge.netxtest.dragonX.USSDREGISTRATION}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ussdregistration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ussdregistration</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.USSDREGISTRATION
   * @see #setUssdregistration(USSDREGISTRATION)
   * @see com.netxforge.netxtest.dragonX.DragonXPackage#getParameterUssd_Ussdregistration()
   * @model
   * @generated
   */
  USSDREGISTRATION getUssdregistration();

  /**
   * Sets the value of the '{@link com.netxforge.netxtest.dragonX.ParameterUssd#getUssdregistration <em>Ussdregistration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ussdregistration</em>' attribute.
   * @see com.netxforge.netxtest.dragonX.USSDREGISTRATION
   * @see #getUssdregistration()
   * @generated
   */
  void setUssdregistration(USSDREGISTRATION value);

} // ParameterUssd
