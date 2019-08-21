/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getController <em>Controller</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEmfModel()
 * @model
 * @generated
 */
public interface EmfModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see #setController(String)
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_Controller()
	 * @model unique="false"
	 * @generated
	 */
	String getController();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EmfModel#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see #getController()
	 * @generated
	 */
	void setController(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute list.
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_StyleClass()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStyleClass();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.mm.ENode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ENode> getNodes();

} // EmfModel
