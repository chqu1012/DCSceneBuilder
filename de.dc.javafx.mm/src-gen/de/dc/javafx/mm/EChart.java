/**
 */
package de.dc.javafx.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EChart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EChart#isAnimated <em>Animated</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EChart#isLegendVisible <em>Legend Visible</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EChart#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEChart()
 * @model abstract="true"
 * @generated
 */
public interface EChart extends ENode {
	/**
	 * Returns the value of the '<em><b>Animated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animated</em>' attribute.
	 * @see #setAnimated(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getEChart_Animated()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isAnimated();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EChart#isAnimated <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animated</em>' attribute.
	 * @see #isAnimated()
	 * @generated
	 */
	void setAnimated(boolean value);

	/**
	 * Returns the value of the '<em><b>Legend Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Visible</em>' attribute.
	 * @see #setLegendVisible(boolean)
	 * @see de.dc.javafx.mm.MmPackage#getEChart_LegendVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isLegendVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EChart#isLegendVisible <em>Legend Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Visible</em>' attribute.
	 * @see #isLegendVisible()
	 * @generated
	 */
	void setLegendVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.dc.javafx.mm.MmPackage#getEChart_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EChart#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // EChart
