/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETable View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.ETableView#getColumns <em>Columns</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ETableView#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getETableView()
 * @model
 * @generated
 */
public interface ETableView extends EBaseView {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.mm.ETableColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see de.dc.javafx.mm.MmPackage#getETableView_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETableColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(EBean)
	 * @see de.dc.javafx.mm.MmPackage#getETableView_Model()
	 * @model
	 * @generated
	 */
	EBean getModel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ETableView#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EBean value);

} // ETableView
