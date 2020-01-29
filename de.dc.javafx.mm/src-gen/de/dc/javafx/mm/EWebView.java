/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EWeb View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EWebView#getUrl <em>Url</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EWebView#isContextMenuEnabled <em>Context Menu Enabled</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEWebView()
 * @model
 * @generated
 */
public interface EWebView extends ENode {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see de.dc.javafx.mm.MmPackage#getEWebView_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EWebView#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Context Menu Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Menu Enabled</em>' attribute.
	 * @see #setContextMenuEnabled(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getEWebView_ContextMenuEnabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isContextMenuEnabled();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EWebView#isContextMenuEnabled <em>Context Menu Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Menu Enabled</em>' attribute.
	 * @see #isContextMenuEnabled()
	 * @generated
	 */
	void setContextMenuEnabled(boolean value);

} // EWebView
