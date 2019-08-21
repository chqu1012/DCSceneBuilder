/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.MmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getLayoutX <em>Layout X</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getLayoutY <em>Layout Y</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#isDisable <em>Disable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ENodeImpl extends StyleableImpl implements ENode {
	/**
	 * The default value of the '{@link #getLayoutX() <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutX()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYOUT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayoutX() <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutX()
	 * @generated
	 * @ordered
	 */
	protected double layoutX = LAYOUT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutY() <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutY()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYOUT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayoutY() <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutY()
	 * @generated
	 * @ordered
	 */
	protected double layoutY = LAYOUT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double OPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected double opacity = OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<String> styleClass;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisable() <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisable() <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisable()
	 * @generated
	 * @ordered
	 */
	protected boolean disable = DISABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.ENODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLayoutX() {
		return layoutX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayoutX(double newLayoutX) {
		double oldLayoutX = layoutX;
		layoutX = newLayoutX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__LAYOUT_X, oldLayoutX, layoutX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLayoutY() {
		return layoutY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayoutY(double newLayoutY) {
		double oldLayoutY = layoutY;
		layoutY = newLayoutY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__LAYOUT_Y, oldLayoutY, layoutY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpacity(double newOpacity) {
		double oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStyleClass() {
		if (styleClass == null) {
			styleClass = new EDataTypeEList<String>(String.class, this, MmPackage.ENODE__STYLE_CLASS);
		}
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisable() {
		return disable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisable(boolean newDisable) {
		boolean oldDisable = disable;
		disable = newDisable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__DISABLE, oldDisable, disable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.ENODE__LAYOUT_X:
			return getLayoutX();
		case MmPackage.ENODE__LAYOUT_Y:
			return getLayoutY();
		case MmPackage.ENODE__OPACITY:
			return getOpacity();
		case MmPackage.ENODE__STYLE:
			return getStyle();
		case MmPackage.ENODE__STYLE_CLASS:
			return getStyleClass();
		case MmPackage.ENODE__VISIBLE:
			return isVisible();
		case MmPackage.ENODE__DISABLE:
			return isDisable();
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
		case MmPackage.ENODE__LAYOUT_X:
			setLayoutX((Double) newValue);
			return;
		case MmPackage.ENODE__LAYOUT_Y:
			setLayoutY((Double) newValue);
			return;
		case MmPackage.ENODE__OPACITY:
			setOpacity((Double) newValue);
			return;
		case MmPackage.ENODE__STYLE:
			setStyle((String) newValue);
			return;
		case MmPackage.ENODE__STYLE_CLASS:
			getStyleClass().clear();
			getStyleClass().addAll((Collection<? extends String>) newValue);
			return;
		case MmPackage.ENODE__VISIBLE:
			setVisible((Boolean) newValue);
			return;
		case MmPackage.ENODE__DISABLE:
			setDisable((Boolean) newValue);
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
		case MmPackage.ENODE__LAYOUT_X:
			setLayoutX(LAYOUT_X_EDEFAULT);
			return;
		case MmPackage.ENODE__LAYOUT_Y:
			setLayoutY(LAYOUT_Y_EDEFAULT);
			return;
		case MmPackage.ENODE__OPACITY:
			setOpacity(OPACITY_EDEFAULT);
			return;
		case MmPackage.ENODE__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case MmPackage.ENODE__STYLE_CLASS:
			getStyleClass().clear();
			return;
		case MmPackage.ENODE__VISIBLE:
			setVisible(VISIBLE_EDEFAULT);
			return;
		case MmPackage.ENODE__DISABLE:
			setDisable(DISABLE_EDEFAULT);
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
		case MmPackage.ENODE__LAYOUT_X:
			return layoutX != LAYOUT_X_EDEFAULT;
		case MmPackage.ENODE__LAYOUT_Y:
			return layoutY != LAYOUT_Y_EDEFAULT;
		case MmPackage.ENODE__OPACITY:
			return opacity != OPACITY_EDEFAULT;
		case MmPackage.ENODE__STYLE:
			return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		case MmPackage.ENODE__STYLE_CLASS:
			return styleClass != null && !styleClass.isEmpty();
		case MmPackage.ENODE__VISIBLE:
			return visible != VISIBLE_EDEFAULT;
		case MmPackage.ENODE__DISABLE:
			return disable != DISABLE_EDEFAULT;
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
		result.append(" (layoutX: ");
		result.append(layoutX);
		result.append(", layoutY: ");
		result.append(layoutY);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", style: ");
		result.append(style);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(", visible: ");
		result.append(visible);
		result.append(", disable: ");
		result.append(disable);
		result.append(')');
		return result.toString();
	}

} //ENodeImpl
