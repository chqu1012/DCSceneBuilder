/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EH Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EHBox#getSpacing <em>Spacing</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEHBox()
 * @model
 * @generated
 */
public interface EHBox extends EPane {
	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #setSpacing(double)
	 * @see de.dc.javafx.mm.MmPackage#getEHBox_Spacing()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getSpacing();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EHBox#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' attribute.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(double value);

} // EHBox
