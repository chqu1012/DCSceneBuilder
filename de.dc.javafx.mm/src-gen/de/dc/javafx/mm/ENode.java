/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.ENode#getLayoutX <em>Layout X</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ENode#getLayoutY <em>Layout Y</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ENode#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ENode#getStyle <em>Style</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ENode#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ENode#isVisible <em>Visible</em>}</li>
 *   <li>{@link de.dc.javafx.mm.ENode#isDisable <em>Disable</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getENode()
 * @model abstract="true"
 * @generated
 */
public interface ENode extends Styleable, Skinnable {
	/**
	 * Returns the value of the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout X</em>' attribute.
	 * @see #setLayoutX(double)
	 * @see de.dc.javafx.mm.MmPackage#getENode_LayoutX()
	 * @model unique="false"
	 * @generated
	 */
	double getLayoutX();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ENode#getLayoutX <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout X</em>' attribute.
	 * @see #getLayoutX()
	 * @generated
	 */
	void setLayoutX(double value);

	/**
	 * Returns the value of the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Y</em>' attribute.
	 * @see #setLayoutY(double)
	 * @see de.dc.javafx.mm.MmPackage#getENode_LayoutY()
	 * @model unique="false"
	 * @generated
	 */
	double getLayoutY();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ENode#getLayoutY <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Y</em>' attribute.
	 * @see #getLayoutY()
	 * @generated
	 */
	void setLayoutY(double value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(double)
	 * @see de.dc.javafx.mm.MmPackage#getENode_Opacity()
	 * @model unique="false"
	 * @generated
	 */
	double getOpacity();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ENode#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(double value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see de.dc.javafx.mm.MmPackage#getENode_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ENode#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute list.
	 * @see de.dc.javafx.mm.MmPackage#getENode_StyleClass()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStyleClass();

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getENode_Visible()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ENode#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getENode_Disable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisable();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.ENode#isDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #isDisable()
	 * @generated
	 */
	void setDisable(boolean value);

} // ENode
