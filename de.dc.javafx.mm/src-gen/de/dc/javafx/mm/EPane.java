/**
 */
package de.dc.javafx.mm;

import javafx.geometry.Pos;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EPane#getPos <em>Pos</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEPane()
 * @model
 * @generated
 */
public interface EPane extends ERegion {
	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(Pos)
	 * @see de.dc.javafx.mm.MmPackage#getEPane_Pos()
	 * @model unique="false" dataType="de.dc.javafx.mm.EPos"
	 * @generated
	 */
	Pos getPos();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EPane#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Pos value);

} // EPane
