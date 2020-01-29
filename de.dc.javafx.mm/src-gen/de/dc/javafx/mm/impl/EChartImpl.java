/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EChart;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EChart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EChartImpl#isAnimated <em>Animated</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EChartImpl#isLegendVisible <em>Legend Visible</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EChartImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EChartImpl extends ENodeImpl implements EChart {
	/**
	 * The default value of the '{@link #isAnimated() <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANIMATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAnimated() <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimated()
	 * @generated
	 * @ordered
	 */
	protected boolean animated = ANIMATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isLegendVisible() <em>Legend Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLegendVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEGEND_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLegendVisible() <em>Legend Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLegendVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean legendVisible = LEGEND_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.ECHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnimated() {
		return animated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnimated(boolean newAnimated) {
		boolean oldAnimated = animated;
		animated = newAnimated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ECHART__ANIMATED, oldAnimated, animated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLegendVisible() {
		return legendVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegendVisible(boolean newLegendVisible) {
		boolean oldLegendVisible = legendVisible;
		legendVisible = newLegendVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ECHART__LEGEND_VISIBLE, oldLegendVisible,
					legendVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ECHART__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.ECHART__ANIMATED:
			return isAnimated();
		case MmPackage.ECHART__LEGEND_VISIBLE:
			return isLegendVisible();
		case MmPackage.ECHART__TITLE:
			return getTitle();
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
		case MmPackage.ECHART__ANIMATED:
			setAnimated((Boolean) newValue);
			return;
		case MmPackage.ECHART__LEGEND_VISIBLE:
			setLegendVisible((Boolean) newValue);
			return;
		case MmPackage.ECHART__TITLE:
			setTitle((String) newValue);
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
		case MmPackage.ECHART__ANIMATED:
			setAnimated(ANIMATED_EDEFAULT);
			return;
		case MmPackage.ECHART__LEGEND_VISIBLE:
			setLegendVisible(LEGEND_VISIBLE_EDEFAULT);
			return;
		case MmPackage.ECHART__TITLE:
			setTitle(TITLE_EDEFAULT);
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
		case MmPackage.ECHART__ANIMATED:
			return animated != ANIMATED_EDEFAULT;
		case MmPackage.ECHART__LEGEND_VISIBLE:
			return legendVisible != LEGEND_VISIBLE_EDEFAULT;
		case MmPackage.ECHART__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (animated: ");
		result.append(animated);
		result.append(", legendVisible: ");
		result.append(legendVisible);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //EChartImpl
