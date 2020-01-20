/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETable View Model Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.ETableViewModelField#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ETableViewModelField#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getETableViewModelField()
 * @model
 * @generated
 */
public interface ETableViewModelField extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.mm.MmPackage#getETableViewModelField_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ETableViewModelField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see #setDatatype(String)
	 * @see de.dc.javafx.mm.MmPackage#getETableViewModelField_Datatype()
	 * @model default="String" unique="false"
	 * @generated
	 */
	String getDatatype();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ETableViewModelField#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(String value);

} // ETableViewModelField
