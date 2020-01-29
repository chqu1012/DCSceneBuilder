/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETab Pane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.ETabPane#getTabs <em>Tabs</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getETabPane()
 * @model
 * @generated
 */
public interface ETabPane extends EPane {
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.mm.ETab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see de.dc.javafx.mm.MmPackage#getETabPane_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETab> getTabs();

} // ETabPane
