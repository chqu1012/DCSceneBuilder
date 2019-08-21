/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EParent#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEParent()
 * @model abstract="true"
 * @generated
 */
public interface EParent extends ENode {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.mm.ENode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.dc.javafx.mm.MmPackage#getEParent_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ENode> getChildren();

} // EParent
