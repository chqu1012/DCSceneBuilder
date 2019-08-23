/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEvents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EEvents#getOnAction <em>On Action</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEEvents()
 * @model
 * @generated
 */
public interface EEvents extends EObject {
	/**
	 * Returns the value of the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Action</em>' attribute.
	 * @see #setOnAction(String)
	 * @see de.dc.javafx.mm.MmPackage#getEEvents_OnAction()
	 * @model unique="false"
	 * @generated
	 */
	String getOnAction();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EEvents#getOnAction <em>On Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Action</em>' attribute.
	 * @see #getOnAction()
	 * @generated
	 */
	void setOnAction(String value);

} // EEvents
