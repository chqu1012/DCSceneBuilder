/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EEvents;
import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ELayoutData;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.MmPackage;
import de.dc.javafx.mm.Skinnable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getOnAction <em>On Action</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#isDisable <em>Disable</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getLayoutX <em>Layout X</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getLayoutY <em>Layout Y</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getPrefHeight <em>Pref Height</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getPrefWidth <em>Pref Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.ENodeImpl#getLayoutData <em>Layout Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ENodeImpl extends StyleableImpl implements ENode {
	/**
	 * The default value of the '{@link #getOnAction() <em>On Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnAction() <em>On Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAction()
	 * @generated
	 * @ordered
	 */
	protected String onAction = ON_ACTION_EDEFAULT;

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
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected EInsets margin;

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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ENode> children;

	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected ELayoutData layoutData;

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
	public String getOnAction() {
		return onAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnAction(String newOnAction) {
		String oldOnAction = onAction;
		onAction = newOnAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__ON_ACTION, oldOnAction, onAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__ID, oldId, id));
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
	public EInsets getMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMargin(EInsets newMargin, NotificationChain msgs) {
		EInsets oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__MARGIN,
					oldMargin, newMargin);
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
	public void setMargin(EInsets newMargin) {
		if (newMargin != margin) {
			NotificationChain msgs = null;
			if (margin != null)
				msgs = ((InternalEObject) margin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MmPackage.ENODE__MARGIN,
						null, msgs);
			if (newMargin != null)
				msgs = ((InternalEObject) newMargin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MmPackage.ENODE__MARGIN,
						null, msgs);
			msgs = basicSetMargin(newMargin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__MARGIN, newMargin, newMargin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__MAX_HEIGHT, oldMaxHeight,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__MIN_HEIGHT, oldMinHeight,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__PREF_HEIGHT, oldPrefHeight,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__MAX_WIDTH, oldMaxWidth, maxWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__MIN_WIDTH, oldMinWidth, minWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__PREF_WIDTH, oldPrefWidth,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__PADDING,
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
						EOPPOSITE_FEATURE_BASE - MmPackage.ENODE__PADDING, null, msgs);
			if (newPadding != null)
				msgs = ((InternalEObject) newPadding).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.ENODE__PADDING, null, msgs);
			msgs = basicSetPadding(newPadding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__PADDING, newPadding, newPadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ENode> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ENode>(ENode.class, this, MmPackage.ENODE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ELayoutData getLayoutData() {
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutData(ELayoutData newLayoutData, NotificationChain msgs) {
		ELayoutData oldLayoutData = layoutData;
		layoutData = newLayoutData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__LAYOUT_DATA,
					oldLayoutData, newLayoutData);
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
	public void setLayoutData(ELayoutData newLayoutData) {
		if (newLayoutData != layoutData) {
			NotificationChain msgs = null;
			if (layoutData != null)
				msgs = ((InternalEObject) layoutData).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.ENODE__LAYOUT_DATA, null, msgs);
			if (newLayoutData != null)
				msgs = ((InternalEObject) newLayoutData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.ENODE__LAYOUT_DATA, null, msgs);
			msgs = basicSetLayoutData(newLayoutData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ENODE__LAYOUT_DATA, newLayoutData,
					newLayoutData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.ENODE__MARGIN:
			return basicSetMargin(null, msgs);
		case MmPackage.ENODE__PADDING:
			return basicSetPadding(null, msgs);
		case MmPackage.ENODE__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case MmPackage.ENODE__LAYOUT_DATA:
			return basicSetLayoutData(null, msgs);
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
		case MmPackage.ENODE__ON_ACTION:
			return getOnAction();
		case MmPackage.ENODE__ID:
			return getId();
		case MmPackage.ENODE__OPACITY:
			return getOpacity();
		case MmPackage.ENODE__VISIBLE:
			return isVisible();
		case MmPackage.ENODE__DISABLE:
			return isDisable();
		case MmPackage.ENODE__STYLE:
			return getStyle();
		case MmPackage.ENODE__STYLE_CLASS:
			return getStyleClass();
		case MmPackage.ENODE__MARGIN:
			return getMargin();
		case MmPackage.ENODE__LAYOUT_X:
			return getLayoutX();
		case MmPackage.ENODE__LAYOUT_Y:
			return getLayoutY();
		case MmPackage.ENODE__MAX_HEIGHT:
			return getMaxHeight();
		case MmPackage.ENODE__MIN_HEIGHT:
			return getMinHeight();
		case MmPackage.ENODE__PREF_HEIGHT:
			return getPrefHeight();
		case MmPackage.ENODE__MAX_WIDTH:
			return getMaxWidth();
		case MmPackage.ENODE__MIN_WIDTH:
			return getMinWidth();
		case MmPackage.ENODE__PREF_WIDTH:
			return getPrefWidth();
		case MmPackage.ENODE__PADDING:
			return getPadding();
		case MmPackage.ENODE__CHILDREN:
			return getChildren();
		case MmPackage.ENODE__LAYOUT_DATA:
			return getLayoutData();
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
		case MmPackage.ENODE__ON_ACTION:
			setOnAction((String) newValue);
			return;
		case MmPackage.ENODE__ID:
			setId((String) newValue);
			return;
		case MmPackage.ENODE__OPACITY:
			setOpacity((Double) newValue);
			return;
		case MmPackage.ENODE__VISIBLE:
			setVisible((Boolean) newValue);
			return;
		case MmPackage.ENODE__DISABLE:
			setDisable((Boolean) newValue);
			return;
		case MmPackage.ENODE__STYLE:
			setStyle((String) newValue);
			return;
		case MmPackage.ENODE__STYLE_CLASS:
			getStyleClass().clear();
			getStyleClass().addAll((Collection<? extends String>) newValue);
			return;
		case MmPackage.ENODE__MARGIN:
			setMargin((EInsets) newValue);
			return;
		case MmPackage.ENODE__LAYOUT_X:
			setLayoutX((Double) newValue);
			return;
		case MmPackage.ENODE__LAYOUT_Y:
			setLayoutY((Double) newValue);
			return;
		case MmPackage.ENODE__MAX_HEIGHT:
			setMaxHeight((Double) newValue);
			return;
		case MmPackage.ENODE__MIN_HEIGHT:
			setMinHeight((Double) newValue);
			return;
		case MmPackage.ENODE__PREF_HEIGHT:
			setPrefHeight((Double) newValue);
			return;
		case MmPackage.ENODE__MAX_WIDTH:
			setMaxWidth((Double) newValue);
			return;
		case MmPackage.ENODE__MIN_WIDTH:
			setMinWidth((Double) newValue);
			return;
		case MmPackage.ENODE__PREF_WIDTH:
			setPrefWidth((Double) newValue);
			return;
		case MmPackage.ENODE__PADDING:
			setPadding((EInsets) newValue);
			return;
		case MmPackage.ENODE__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends ENode>) newValue);
			return;
		case MmPackage.ENODE__LAYOUT_DATA:
			setLayoutData((ELayoutData) newValue);
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
		case MmPackage.ENODE__ON_ACTION:
			setOnAction(ON_ACTION_EDEFAULT);
			return;
		case MmPackage.ENODE__ID:
			setId(ID_EDEFAULT);
			return;
		case MmPackage.ENODE__OPACITY:
			setOpacity(OPACITY_EDEFAULT);
			return;
		case MmPackage.ENODE__VISIBLE:
			setVisible(VISIBLE_EDEFAULT);
			return;
		case MmPackage.ENODE__DISABLE:
			setDisable(DISABLE_EDEFAULT);
			return;
		case MmPackage.ENODE__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case MmPackage.ENODE__STYLE_CLASS:
			getStyleClass().clear();
			return;
		case MmPackage.ENODE__MARGIN:
			setMargin((EInsets) null);
			return;
		case MmPackage.ENODE__LAYOUT_X:
			setLayoutX(LAYOUT_X_EDEFAULT);
			return;
		case MmPackage.ENODE__LAYOUT_Y:
			setLayoutY(LAYOUT_Y_EDEFAULT);
			return;
		case MmPackage.ENODE__MAX_HEIGHT:
			setMaxHeight(MAX_HEIGHT_EDEFAULT);
			return;
		case MmPackage.ENODE__MIN_HEIGHT:
			setMinHeight(MIN_HEIGHT_EDEFAULT);
			return;
		case MmPackage.ENODE__PREF_HEIGHT:
			setPrefHeight(PREF_HEIGHT_EDEFAULT);
			return;
		case MmPackage.ENODE__MAX_WIDTH:
			setMaxWidth(MAX_WIDTH_EDEFAULT);
			return;
		case MmPackage.ENODE__MIN_WIDTH:
			setMinWidth(MIN_WIDTH_EDEFAULT);
			return;
		case MmPackage.ENODE__PREF_WIDTH:
			setPrefWidth(PREF_WIDTH_EDEFAULT);
			return;
		case MmPackage.ENODE__PADDING:
			setPadding((EInsets) null);
			return;
		case MmPackage.ENODE__CHILDREN:
			getChildren().clear();
			return;
		case MmPackage.ENODE__LAYOUT_DATA:
			setLayoutData((ELayoutData) null);
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
		case MmPackage.ENODE__ON_ACTION:
			return ON_ACTION_EDEFAULT == null ? onAction != null : !ON_ACTION_EDEFAULT.equals(onAction);
		case MmPackage.ENODE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case MmPackage.ENODE__OPACITY:
			return opacity != OPACITY_EDEFAULT;
		case MmPackage.ENODE__VISIBLE:
			return visible != VISIBLE_EDEFAULT;
		case MmPackage.ENODE__DISABLE:
			return disable != DISABLE_EDEFAULT;
		case MmPackage.ENODE__STYLE:
			return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		case MmPackage.ENODE__STYLE_CLASS:
			return styleClass != null && !styleClass.isEmpty();
		case MmPackage.ENODE__MARGIN:
			return margin != null;
		case MmPackage.ENODE__LAYOUT_X:
			return layoutX != LAYOUT_X_EDEFAULT;
		case MmPackage.ENODE__LAYOUT_Y:
			return layoutY != LAYOUT_Y_EDEFAULT;
		case MmPackage.ENODE__MAX_HEIGHT:
			return maxHeight != MAX_HEIGHT_EDEFAULT;
		case MmPackage.ENODE__MIN_HEIGHT:
			return minHeight != MIN_HEIGHT_EDEFAULT;
		case MmPackage.ENODE__PREF_HEIGHT:
			return prefHeight != PREF_HEIGHT_EDEFAULT;
		case MmPackage.ENODE__MAX_WIDTH:
			return maxWidth != MAX_WIDTH_EDEFAULT;
		case MmPackage.ENODE__MIN_WIDTH:
			return minWidth != MIN_WIDTH_EDEFAULT;
		case MmPackage.ENODE__PREF_WIDTH:
			return prefWidth != PREF_WIDTH_EDEFAULT;
		case MmPackage.ENODE__PADDING:
			return padding != null;
		case MmPackage.ENODE__CHILDREN:
			return children != null && !children.isEmpty();
		case MmPackage.ENODE__LAYOUT_DATA:
			return layoutData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Skinnable.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == EEvents.class) {
			switch (derivedFeatureID) {
			case MmPackage.ENODE__ON_ACTION:
				return MmPackage.EEVENTS__ON_ACTION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Skinnable.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == EEvents.class) {
			switch (baseFeatureID) {
			case MmPackage.EEVENTS__ON_ACTION:
				return MmPackage.ENODE__ON_ACTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (onAction: ");
		result.append(onAction);
		result.append(", id: ");
		result.append(id);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", visible: ");
		result.append(visible);
		result.append(", disable: ");
		result.append(disable);
		result.append(", style: ");
		result.append(style);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(", layoutX: ");
		result.append(layoutX);
		result.append(", layoutY: ");
		result.append(layoutY);
		result.append(", maxHeight: ");
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

} //ENodeImpl
