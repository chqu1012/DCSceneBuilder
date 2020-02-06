/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBorder Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EBorderData#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEBorderData()
 * @model
 * @generated
 */
public interface EBorderData extends ELayoutData {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.javafx.mm.EBorderDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.dc.javafx.mm.EBorderDirection
	 * @see #setDirection(EBorderDirection)
	 * @see de.dc.javafx.mm.MmPackage#getEBorderData_Direction()
	 * @model unique="false"
	 * @generated
	 */
	EBorderDirection getDirection();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EBorderData#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.dc.javafx.mm.EBorderDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EBorderDirection value);

} // EBorderData
