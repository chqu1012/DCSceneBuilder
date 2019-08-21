/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ERegion;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERegion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.ERegionImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ERegionImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ERegionImpl#getPrefHeight <em>Pref Height</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ERegionImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ERegionImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ERegionImpl#getPrefWidth <em>Pref Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ERegionImpl#getPadding <em>Padding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERegionImpl extends EParentImpl implements ERegion {
	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected double maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected double minHeight = MIN_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefHeight() <em>Pref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double PREF_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrefHeight() <em>Pref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefHeight()
	 * @generated
	 * @ordered
	 */
	protected double prefHeight = PREF_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected double maxWidth = MAX_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected double minWidth = MIN_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefWidth() <em>Pref Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double PREF_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrefWidth() <em>Pref Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefWidth()
	 * @generated
	 * @ordered
	 */
	protected double prefWidth = PREF_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected EInsets padding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.EREGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHeight(double newMaxHeight) {
		double oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EREGION__MAX_HEIGHT, oldMaxHeight,
					maxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinHeight() {
		return minHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinHeight(double newMinHeight) {
		double oldMinHeight = minHeight;
		minHeight = newMinHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EREGION__MIN_HEIGHT, oldMinHeight,
					minHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrefHeight() {
		return prefHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefHeight(double newPrefHeight) {
		double oldPrefHeight = prefHeight;
		prefHeight = newPrefHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EREGION__PREF_HEIGHT, oldPrefHeight,
					prefHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxWidth() {
		return maxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWidth(double newMaxWidth) {
		double oldMaxWidth = maxWidth;
		maxWidth = newMaxWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EREGION__MAX_WIDTH, oldMaxWidth, maxWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinWidth() {
		return minWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinWidth(double newMinWidth) {
		double oldMinWidth = minWidth;
		minWidth = newMinWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EREGION__MIN_WIDTH, oldMinWidth, minWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrefWidth() {
		return prefWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefWidth(double newPrefWidth) {
		double oldPrefWidth = prefWidth;
		prefWidth = newPrefWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EREGION__PREF_WIDTH, oldPrefWidth,
					prefWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EInsets getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPadding(EInsets newPadding, NotificationChain msgs) {
		EInsets oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmPackage.EREGION__PADDING,
					oldPadding, newPadding);
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
	public void setPadding(EInsets newPadding) {
		if (newPadding != padding) {
			NotificationChain msgs = null;
			if (padding != null)
				msgs = ((InternalEObject) padding).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EREGION__PADDING, null, msgs);
			if (newPadding != null)
				msgs = ((InternalEObject) newPadding).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EREGION__PADDING, null, msgs);
			msgs = basicSetPadding(newPadding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EREGION__PADDING, newPadding, newPadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.EREGION__PADDING:
			return basicSetPadding(null, msgs);
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
		case MmPackage.EREGION__MAX_HEIGHT:
			return getMaxHeight();
		case MmPackage.EREGION__MIN_HEIGHT:
			return getMinHeight();
		case MmPackage.EREGION__PREF_HEIGHT:
			return getPrefHeight();
		case MmPackage.EREGION__MAX_WIDTH:
			return getMaxWidth();
		case MmPackage.EREGION__MIN_WIDTH:
			return getMinWidth();
		case MmPackage.EREGION__PREF_WIDTH:
			return getPrefWidth();
		case MmPackage.EREGION__PADDING:
			return getPadding();
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
		case MmPackage.EREGION__MAX_HEIGHT:
			setMaxHeight((Double) newValue);
			return;
		case MmPackage.EREGION__MIN_HEIGHT:
			setMinHeight((Double) newValue);
			return;
		case MmPackage.EREGION__PREF_HEIGHT:
			setPrefHeight((Double) newValue);
			return;
		case MmPackage.EREGION__MAX_WIDTH:
			setMaxWidth((Double) newValue);
			return;
		case MmPackage.EREGION__MIN_WIDTH:
			setMinWidth((Double) newValue);
			return;
		case MmPackage.EREGION__PREF_WIDTH:
			setPrefWidth((Double) newValue);
			return;
		case MmPackage.EREGION__PADDING:
			setPadding((EInsets) newValue);
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
		case MmPackage.EREGION__MAX_HEIGHT:
			setMaxHeight(MAX_HEIGHT_EDEFAULT);
			return;
		case MmPackage.EREGION__MIN_HEIGHT:
			setMinHeight(MIN_HEIGHT_EDEFAULT);
			return;
		case MmPackage.EREGION__PREF_HEIGHT:
			setPrefHeight(PREF_HEIGHT_EDEFAULT);
			return;
		case MmPackage.EREGION__MAX_WIDTH:
			setMaxWidth(MAX_WIDTH_EDEFAULT);
			return;
		case MmPackage.EREGION__MIN_WIDTH:
			setMinWidth(MIN_WIDTH_EDEFAULT);
			return;
		case MmPackage.EREGION__PREF_WIDTH:
			setPrefWidth(PREF_WIDTH_EDEFAULT);
			return;
		case MmPackage.EREGION__PADDING:
			setPadding((EInsets) null);
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
		case MmPackage.EREGION__MAX_HEIGHT:
			return maxHeight != MAX_HEIGHT_EDEFAULT;
		case MmPackage.EREGION__MIN_HEIGHT:
			return minHeight != MIN_HEIGHT_EDEFAULT;
		case MmPackage.EREGION__PREF_HEIGHT:
			return prefHeight != PREF_HEIGHT_EDEFAULT;
		case MmPackage.EREGION__MAX_WIDTH:
			return maxWidth != MAX_WIDTH_EDEFAULT;
		case MmPackage.EREGION__MIN_WIDTH:
			return minWidth != MIN_WIDTH_EDEFAULT;
		case MmPackage.EREGION__PREF_WIDTH:
			return prefWidth != PREF_WIDTH_EDEFAULT;
		case MmPackage.EREGION__PADDING:
			return padding != null;
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
		result.append(" (maxHeight: ");
		result.append(maxHeight);
		result.append(", minHeight: ");
		result.append(minHeight);
		result.append(", prefHeight: ");
		result.append(prefHeight);
		result.append(", maxWidth: ");
		result.append(maxWidth);
		result.append(", minWidth: ");
		result.append(minWidth);
		result.append(", prefWidth: ");
		result.append(prefWidth);
		result.append(')');
		return result.toString();
	}

} //ERegionImpl
