/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EBean#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEBean()
 * @model
 * @generated
 */
public interface EBean extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.mm.EField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.dc.javafx.mm.MmPackage#getEBean_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<EField> getFields();

} // EBean
