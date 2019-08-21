/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETable Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.ETableColumn#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ETableColumn#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ETableColumn#getCellValueFactory <em>Cell Value Factory</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ETableColumn#getCellFactory <em>Cell Factory</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getETableColumn()
 * @model
 * @generated
 */
public interface ETableColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.mm.MmPackage#getETableColumn_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ETableColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"150"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see de.dc.javafx.mm.MmPackage#getETableColumn_Width()
	 * @model default="150" unique="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ETableColumn#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Cell Value Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Value Factory</em>' attribute.
	 * @see #setCellValueFactory(String)
	 * @see de.dc.javafx.mm.MmPackage#getETableColumn_CellValueFactory()
	 * @model unique="false"
	 * @generated
	 */
	String getCellValueFactory();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ETableColumn#getCellValueFactory <em>Cell Value Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Value Factory</em>' attribute.
	 * @see #getCellValueFactory()
	 * @generated
	 */
	void setCellValueFactory(String value);

	/**
	 * Returns the value of the '<em><b>Cell Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Factory</em>' attribute.
	 * @see #setCellFactory(String)
	 * @see de.dc.javafx.mm.MmPackage#getETableColumn_CellFactory()
	 * @model unique="false"
	 * @generated
	 */
	String getCellFactory();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ETableColumn#getCellFactory <em>Cell Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Factory</em>' attribute.
	 * @see #getCellFactory()
	 * @generated
	 */
	void setCellFactory(String value);

} // ETableColumn
