/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETable Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.ETableColumnImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ETableColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ETableColumnImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ETableColumnImpl#getCellValueFactory <em>Cell Value Factory</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ETableColumnImpl#getCellFactory <em>Cell Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETableColumnImpl extends MinimalEObjectImpl.Container implements ETableColumn {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 150.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellValueFactory() <em>Cell Value Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellValueFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_VALUE_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellValueFactory() <em>Cell Value Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellValueFactory()
	 * @generated
	 * @ordered
	 */
	protected String cellValueFactory = CELL_VALUE_FACTORY_EDEFAULT;

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
	protected ETableColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.ETABLE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ETABLE_COLUMN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ETABLE_COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ETABLE_COLUMN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCellValueFactory() {
		return cellValueFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellValueFactory(String newCellValueFactory) {
		String oldCellValueFactory = cellValueFactory;
		cellValueFactory = newCellValueFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ETABLE_COLUMN__CELL_VALUE_FACTORY,
					oldCellValueFactory, cellValueFactory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ETABLE_COLUMN__CELL_FACTORY, oldCellFactory,
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
		case MmPackage.ETABLE_COLUMN__ID:
			return getId();
		case MmPackage.ETABLE_COLUMN__NAME:
			return getName();
		case MmPackage.ETABLE_COLUMN__WIDTH:
			return getWidth();
		case MmPackage.ETABLE_COLUMN__CELL_VALUE_FACTORY:
			return getCellValueFactory();
		case MmPackage.ETABLE_COLUMN__CELL_FACTORY:
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
		case MmPackage.ETABLE_COLUMN__ID:
			setId((String) newValue);
			return;
		case MmPackage.ETABLE_COLUMN__NAME:
			setName((String) newValue);
			return;
		case MmPackage.ETABLE_COLUMN__WIDTH:
			setWidth((Double) newValue);
			return;
		case MmPackage.ETABLE_COLUMN__CELL_VALUE_FACTORY:
			setCellValueFactory((String) newValue);
			return;
		case MmPackage.ETABLE_COLUMN__CELL_FACTORY:
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
		case MmPackage.ETABLE_COLUMN__ID:
			setId(ID_EDEFAULT);
			return;
		case MmPackage.ETABLE_COLUMN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.ETABLE_COLUMN__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case MmPackage.ETABLE_COLUMN__CELL_VALUE_FACTORY:
			setCellValueFactory(CELL_VALUE_FACTORY_EDEFAULT);
			return;
		case MmPackage.ETABLE_COLUMN__CELL_FACTORY:
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
		case MmPackage.ETABLE_COLUMN__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case MmPackage.ETABLE_COLUMN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.ETABLE_COLUMN__WIDTH:
			return width != WIDTH_EDEFAULT;
		case MmPackage.ETABLE_COLUMN__CELL_VALUE_FACTORY:
			return CELL_VALUE_FACTORY_EDEFAULT == null ? cellValueFactory != null
					: !CELL_VALUE_FACTORY_EDEFAULT.equals(cellValueFactory);
		case MmPackage.ETABLE_COLUMN__CELL_FACTORY:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", width: ");
		result.append(width);
		result.append(", cellValueFactory: ");
		result.append(cellValueFactory);
		result.append(", cellFactory: ");
		result.append(cellFactory);
		result.append(')');
		return result.toString();
	}

} //ETableColumnImpl
