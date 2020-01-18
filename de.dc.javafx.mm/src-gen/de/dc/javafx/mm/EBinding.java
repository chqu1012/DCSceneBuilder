/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBinding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EBinding#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EBinding#getNode <em>Node</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EBinding#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EBinding#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EBinding#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEBinding()
 * @model
 * @generated
 */
public interface EBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.mm.MmPackage#getEBinding_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EBinding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ENode)
	 * @see de.dc.javafx.mm.MmPackage#getEBinding_Node()
	 * @model
	 * @generated
	 */
	ENode getNode();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EBinding#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(ENode value);

	/**
	 * Returns the value of the '<em><b>Binding Type</b></em>' attribute.
	 * The default value is <code>"StringProperty"</code>.
	 * The literals are from the enumeration {@link de.dc.javafx.mm.EBindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Type</em>' attribute.
	 * @see de.dc.javafx.mm.EBindingType
	 * @see #setBindingType(EBindingType)
	 * @see de.dc.javafx.mm.MmPackage#getEBinding_BindingType()
	 * @model default="StringProperty" unique="false"
	 * @generated
	 */
	EBindingType getBindingType();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EBinding#getBindingType <em>Binding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Type</em>' attribute.
	 * @see de.dc.javafx.mm.EBindingType
	 * @see #getBindingType()
	 * @generated
	 */
	void setBindingType(EBindingType value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * The default value is <code>"TextProperty"</code>.
	 * The literals are from the enumeration {@link de.dc.javafx.mm.EControlBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see de.dc.javafx.mm.EControlBinding
	 * @see #setBinding(EControlBinding)
	 * @see de.dc.javafx.mm.MmPackage#getEBinding_Binding()
	 * @model default="TextProperty" unique="false"
	 * @generated
	 */
	EControlBinding getBinding();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EBinding#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see de.dc.javafx.mm.EControlBinding
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(EControlBinding value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"Bind"</code>.
	 * The literals are from the enumeration {@link de.dc.javafx.mm.EBindingDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.dc.javafx.mm.EBindingDirection
	 * @see #setDirection(EBindingDirection)
	 * @see de.dc.javafx.mm.MmPackage#getEBinding_Direction()
	 * @model default="Bind" unique="false"
	 * @generated
	 */
	EBindingDirection getDirection();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EBinding#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.dc.javafx.mm.EBindingDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EBindingDirection value);

} // EBinding
