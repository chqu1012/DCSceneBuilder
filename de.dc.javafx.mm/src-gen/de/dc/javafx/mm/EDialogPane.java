/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDialog Pane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EDialogPane#getHeader <em>Header</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EDialogPane#getHeaderText <em>Header Text</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EDialogPane#getContentText <em>Content Text</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EDialogPane#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEDialogPane()
 * @model
 * @generated
 */
public interface EDialogPane extends EPane {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see de.dc.javafx.mm.MmPackage#getEDialogPane_Header()
	 * @model unique="false"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EDialogPane#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Header Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Text</em>' attribute.
	 * @see #setHeaderText(String)
	 * @see de.dc.javafx.mm.MmPackage#getEDialogPane_HeaderText()
	 * @model unique="false"
	 * @generated
	 */
	String getHeaderText();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EDialogPane#getHeaderText <em>Header Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Text</em>' attribute.
	 * @see #getHeaderText()
	 * @generated
	 */
	void setHeaderText(String value);

	/**
	 * Returns the value of the '<em><b>Content Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Text</em>' attribute.
	 * @see #setContentText(String)
	 * @see de.dc.javafx.mm.MmPackage#getEDialogPane_ContentText()
	 * @model unique="false"
	 * @generated
	 */
	String getContentText();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EDialogPane#getContentText <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Text</em>' attribute.
	 * @see #getContentText()
	 * @generated
	 */
	void setContentText(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(ENode)
	 * @see de.dc.javafx.mm.MmPackage#getEDialogPane_Content()
	 * @model containment="true"
	 * @generated
	 */
	ENode getContent();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EDialogPane#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ENode value);

} // EDialogPane
