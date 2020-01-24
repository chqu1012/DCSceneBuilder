/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EList View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EListView#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEListView()
 * @model
 * @generated
 */
public interface EListView extends EBaseView {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(EListViewModel)
	 * @see de.dc.javafx.mm.MmPackage#getEListView_Model()
	 * @model containment="true"
	 * @generated
	 */
	EListViewModel getModel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EListView#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EListViewModel value);

} // EListView
