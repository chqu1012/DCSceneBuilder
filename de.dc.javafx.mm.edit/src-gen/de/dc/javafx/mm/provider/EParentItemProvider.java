/**
 */
package de.dc.javafx.mm.provider;

import de.dc.javafx.mm.EParent;
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
 * This is the item provider adapter for a {@link de.dc.javafx.mm.EParent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EParentItemProvider extends ENodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MmPackage.Literals.EPARENT__CHILDREN);
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
		EParent eParent = (EParent) object;
		return getString("_UI_EParent_type") + " " + eParent.getLayoutX();
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

		switch (notification.getFeatureID(EParent.class)) {
		case MmPackage.EPARENT__CHILDREN:
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
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createERegion()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN,
				MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createETableView()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EPARENT__CHILDREN, MmFactory.eINSTANCE.createEBorderPane()));
	}

}
