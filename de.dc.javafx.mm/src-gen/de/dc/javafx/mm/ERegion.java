/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERegion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.ERegion#getPadding <em>Padding</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getERegion()
 * @model
 * @generated
 */
public interface ERegion extends EParent {
	/**
	 * Returns the value of the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' containment reference.
	 * @see #setPadding(EInsets)
	 * @see de.dc.javafx.mm.MmPackage#getERegion_Padding()
	 * @model containment="true"
	 * @generated
	 */
	EInsets getPadding();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ERegion#getPadding <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' containment reference.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(EInsets value);

} // ERegion
