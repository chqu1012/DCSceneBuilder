/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EScroll Pane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EScrollPane#isIsPannable <em>Is Pannable</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EScrollPane#isFitToWidth <em>Fit To Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EScrollPane#isFitToHeight <em>Fit To Height</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EScrollPane#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEScrollPane()
 * @model
 * @generated
 */
public interface EScrollPane extends EPane {
	/**
	 * Returns the value of the '<em><b>Is Pannable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pannable</em>' attribute.
	 * @see #setIsPannable(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getEScrollPane_IsPannable()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isIsPannable();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EScrollPane#isIsPannable <em>Is Pannable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pannable</em>' attribute.
	 * @see #isIsPannable()
	 * @generated
	 */
	void setIsPannable(boolean value);

	/**
	 * Returns the value of the '<em><b>Fit To Width</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fit To Width</em>' attribute.
	 * @see #setFitToWidth(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getEScrollPane_FitToWidth()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isFitToWidth();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EScrollPane#isFitToWidth <em>Fit To Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fit To Width</em>' attribute.
	 * @see #isFitToWidth()
	 * @generated
	 */
	void setFitToWidth(boolean value);

	/**
	 * Returns the value of the '<em><b>Fit To Height</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fit To Height</em>' attribute.
	 * @see #setFitToHeight(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getEScrollPane_FitToHeight()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isFitToHeight();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EScrollPane#isFitToHeight <em>Fit To Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fit To Height</em>' attribute.
	 * @see #isFitToHeight()
	 * @generated
	 */
	void setFitToHeight(boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(ENode)
	 * @see de.dc.javafx.mm.MmPackage#getEScrollPane_Content()
	 * @model containment="true"
	 * @generated
	 */
	ENode getContent();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EScrollPane#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ENode value);

} // EScrollPane
