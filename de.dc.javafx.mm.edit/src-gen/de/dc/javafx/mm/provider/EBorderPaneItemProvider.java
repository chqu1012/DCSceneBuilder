/**
 */
package de.dc.javafx.mm.provider;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.MmPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.javafx.mm.EBorderPane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EBorderPaneItemProvider extends EPaneItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBorderPaneItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MmPackage.Literals.EBORDER_PANE__LEFT);
			childrenFeatures.add(MmPackage.Literals.EBORDER_PANE__RIGHT);
			childrenFeatures.add(MmPackage.Literals.EBORDER_PANE__TOP);
			childrenFeatures.add(MmPackage.Literals.EBORDER_PANE__BOTTOM);
			childrenFeatures.add(MmPackage.Literals.EBORDER_PANE__CENTER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EBorderPane.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EBorderPane"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EBorderPane) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_EBorderPane_type")
				: getString("_UI_EBorderPane_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EBorderPane.class)) {
		case MmPackage.EBORDER_PANE__LEFT:
		case MmPackage.EBORDER_PANE__RIGHT:
		case MmPackage.EBORDER_PANE__TOP:
		case MmPackage.EBORDER_PANE__BOTTOM:
		case MmPackage.EBORDER_PANE__CENTER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEText()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT,
				MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createETableView()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT,
				MmFactory.eINSTANCE.createEFilteredTableView()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createESplitPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__LEFT, MmFactory.eINSTANCE.createEBorderPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEText()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT,
				MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT,
				MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createETableView()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT,
				MmFactory.eINSTANCE.createEFilteredTableView()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT,
				MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createESplitPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__RIGHT, MmFactory.eINSTANCE.createEBorderPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEText()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP,
				MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createETableView()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP,
				MmFactory.eINSTANCE.createEFilteredTableView()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createESplitPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__TOP, MmFactory.eINSTANCE.createEBorderPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEText()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM,
				MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM,
				MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createETableView()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM,
				MmFactory.eINSTANCE.createEFilteredTableView()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM,
				MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM,
				MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createESplitPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__BOTTOM, MmFactory.eINSTANCE.createEBorderPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEText()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER,
				MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER,
				MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createETableView()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER,
				MmFactory.eINSTANCE.createEFilteredTableView()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER,
				MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER,
				MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createESplitPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EBORDER_PANE__CENTER, MmFactory.eINSTANCE.createEBorderPane()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == MmPackage.Literals.ENODE__MARGIN
				|| childFeature == MmPackage.Literals.ENODE__PADDING
				|| childFeature == MmPackage.Literals.ENODE__CHILDREN
				|| childFeature == MmPackage.Literals.EBORDER_PANE__LEFT
				|| childFeature == MmPackage.Literals.EBORDER_PANE__RIGHT
				|| childFeature == MmPackage.Literals.EBORDER_PANE__TOP
				|| childFeature == MmPackage.Literals.EBORDER_PANE__BOTTOM
				|| childFeature == MmPackage.Literals.EBORDER_PANE__CENTER;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
