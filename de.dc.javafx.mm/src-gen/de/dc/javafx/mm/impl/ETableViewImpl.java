/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.ETableViewModel;
import de.dc.javafx.mm.MmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETable View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.ETableViewImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ETableViewImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETableViewImpl extends EBaseViewImpl implements ETableView {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ETableColumn> columns;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected ETableViewModel model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETableViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.ETABLE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETableColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<ETableColumn>(ETableColumn.class, this,
					MmPackage.ETABLE_VIEW__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETableViewModel getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ETableViewModel newModel, NotificationChain msgs) {
		ETableViewModel oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmPackage.ETABLE_VIEW__MODEL,
					oldModel, newModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(ETableViewModel newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.ETABLE_VIEW__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.ETABLE_VIEW__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ETABLE_VIEW__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.ETABLE_VIEW__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
		case MmPackage.ETABLE_VIEW__MODEL:
			return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.ETABLE_VIEW__COLUMNS:
			return getColumns();
		case MmPackage.ETABLE_VIEW__MODEL:
			return getModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmPackage.ETABLE_VIEW__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends ETableColumn>) newValue);
			return;
		case MmPackage.ETABLE_VIEW__MODEL:
			setModel((ETableViewModel) newValue);
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
		case MmPackage.ETABLE_VIEW__COLUMNS:
			getColumns().clear();
			return;
		case MmPackage.ETABLE_VIEW__MODEL:
			setModel((ETableViewModel) null);
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
		case MmPackage.ETABLE_VIEW__COLUMNS:
			return columns != null && !columns.isEmpty();
		case MmPackage.ETABLE_VIEW__MODEL:
			return model != null;
		}
		return super.eIsSet(featureID);
	}

} //ETableViewImpl
