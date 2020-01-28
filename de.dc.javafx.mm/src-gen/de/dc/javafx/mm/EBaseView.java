/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBase View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EBaseView#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEBaseView()
 * @model abstract="true"
 * @generated
 */
public interface EBaseView extends EControl {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(EBean)
	 * @see de.dc.javafx.mm.MmPackage#getEBaseView_Model()
	 * @model
	 * @generated
	 */
	EBean getModel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EBaseView#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EBean value);

} // EBaseView
