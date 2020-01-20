/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EView Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EViewModel#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EViewModel#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EViewModel#isGenerateClass <em>Generate Class</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEViewModel()
 * @model
 * @generated
 */
public interface EViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.mm.MmPackage#getEViewModel_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EViewModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see de.dc.javafx.mm.MmPackage#getEViewModel_InstanceName()
	 * @model unique="false"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EViewModel#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Generate Class</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Class</em>' attribute.
	 * @see #setGenerateClass(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getEViewModel_GenerateClass()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateClass();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EViewModel#isGenerateClass <em>Generate Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Class</em>' attribute.
	 * @see #isGenerateClass()
	 * @generated
	 */
	void setGenerateClass(boolean value);

} // EViewModel
