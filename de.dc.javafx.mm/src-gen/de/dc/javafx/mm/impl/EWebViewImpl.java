/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EWebView;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EWeb View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EWebViewImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EWebViewImpl#isContextMenuEnabled <em>Context Menu Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EWebViewImpl extends ENodeImpl implements EWebView {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isContextMenuEnabled() <em>Context Menu Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextMenuEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTEXT_MENU_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContextMenuEnabled() <em>Context Menu Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextMenuEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean contextMenuEnabled = CONTEXT_MENU_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EWebViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.EWEB_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EWEB_VIEW__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContextMenuEnabled() {
		return contextMenuEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextMenuEnabled(boolean newContextMenuEnabled) {
		boolean oldContextMenuEnabled = contextMenuEnabled;
		contextMenuEnabled = newContextMenuEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EWEB_VIEW__CONTEXT_MENU_ENABLED,
					oldContextMenuEnabled, contextMenuEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.EWEB_VIEW__URL:
			return getUrl();
		case MmPackage.EWEB_VIEW__CONTEXT_MENU_ENABLED:
			return isContextMenuEnabled();
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
		case MmPackage.EWEB_VIEW__URL:
			setUrl((String) newValue);
			return;
		case MmPackage.EWEB_VIEW__CONTEXT_MENU_ENABLED:
			setContextMenuEnabled((Boolean) newValue);
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
		case MmPackage.EWEB_VIEW__URL:
			setUrl(URL_EDEFAULT);
			return;
		case MmPackage.EWEB_VIEW__CONTEXT_MENU_ENABLED:
			setContextMenuEnabled(CONTEXT_MENU_ENABLED_EDEFAULT);
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
		case MmPackage.EWEB_VIEW__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case MmPackage.EWEB_VIEW__CONTEXT_MENU_ENABLED:
			return contextMenuEnabled != CONTEXT_MENU_ENABLED_EDEFAULT;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", contextMenuEnabled: ");
		result.append(contextMenuEnabled);
		result.append(')');
		return result.toString();
	}

} //EWebViewImpl
