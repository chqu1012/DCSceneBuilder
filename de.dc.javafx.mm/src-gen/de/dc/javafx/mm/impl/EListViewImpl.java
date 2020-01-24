/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EListView;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EList View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EListViewImpl#getCellFactory <em>Cell Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EListViewImpl extends EBaseViewImpl implements EListView {
	/**
	 * The default value of the '{@link #getCellFactory() <em>Cell Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellFactory() <em>Cell Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellFactory()
	 * @generated
	 * @ordered
	 */
	protected String cellFactory = CELL_FACTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EListViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.ELIST_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCellFactory() {
		return cellFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellFactory(String newCellFactory) {
		String oldCellFactory = cellFactory;
		cellFactory = newCellFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ELIST_VIEW__CELL_FACTORY, oldCellFactory,
					cellFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.ELIST_VIEW__CELL_FACTORY:
			return getCellFactory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmPackage.ELIST_VIEW__CELL_FACTORY:
			setCellFactory((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MmPackage.ELIST_VIEW__CELL_FACTORY:
			setCellFactory(CELL_FACTORY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MmPackage.ELIST_VIEW__CELL_FACTORY:
			return CELL_FACTORY_EDEFAULT == null ? cellFactory != null : !CELL_FACTORY_EDEFAULT.equals(cellFactory);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cellFactory: ");
		result.append(cellFactory);
		result.append(')');
		return result.toString();
	}

} //EListViewImpl
