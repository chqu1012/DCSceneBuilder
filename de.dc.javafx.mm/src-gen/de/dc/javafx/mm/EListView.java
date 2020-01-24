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
 *   <li>{@link de.dc.javafx.mm.EListView#getCellFactory <em>Cell Factory</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEListView()
 * @model
 * @generated
 */
public interface EListView extends EBaseView {
	/**
	 * Returns the value of the '<em><b>Cell Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Factory</em>' attribute.
	 * @see #setCellFactory(String)
	 * @see de.dc.javafx.mm.MmPackage#getEListView_CellFactory()
	 * @model unique="false"
	 * @generated
	 */
	String getCellFactory();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EListView#getCellFactory <em>Cell Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Factory</em>' attribute.
	 * @see #getCellFactory()
	 * @generated
	 */
	void setCellFactory(String value);

} // EListView
