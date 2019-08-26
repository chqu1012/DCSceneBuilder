/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EText</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EText#getPromtText <em>Promt Text</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEText()
 * @model
 * @generated
 */
public interface EText extends ELabeled {
	/**
	 * Returns the value of the '<em><b>Promt Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promt Text</em>' attribute.
	 * @see #setPromtText(String)
	 * @see de.dc.javafx.mm.MmPackage#getEText_PromtText()
	 * @model unique="false"
	 * @generated
	 */
	String getPromtText();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EText#getPromtText <em>Promt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promt Text</em>' attribute.
	 * @see #getPromtText()
	 * @generated
	 */
	void setPromtText(String value);

} // EText
