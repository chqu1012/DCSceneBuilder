/**
 */
package de.dc.javafx.mm.provider;

import de.dc.javafx.mm.util.MmAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MmItemProviderAdapterFactory extends MmAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EmfModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfModelItemProvider emfModelItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EmfModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmfModelAdapter() {
		if (emfModelItemProvider == null) {
			emfModelItemProvider = new EmfModelItemProvider(this);
		}

		return emfModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.Styleable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleableItemProvider styleableItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.Styleable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStyleableAdapter() {
		if (styleableItemProvider == null) {
			styleableItemProvider = new StyleableItemProvider(this);
		}

		return styleableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.Skinnable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkinnableItemProvider skinnableItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.Skinnable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSkinnableAdapter() {
		if (skinnableItemProvider == null) {
			skinnableItemProvider = new SkinnableItemProvider(this);
		}

		return skinnableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ERegion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERegionItemProvider eRegionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ERegion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createERegionAdapter() {
		if (eRegionItemProvider == null) {
			eRegionItemProvider = new ERegionItemProvider(this);
		}

		return eRegionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EInsets} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EInsetsItemProvider eInsetsItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EInsets}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEInsetsAdapter() {
		if (eInsetsItemProvider == null) {
			eInsetsItemProvider = new EInsetsItemProvider(this);
		}

		return eInsetsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EGroupItemProvider eGroupItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEGroupAdapter() {
		if (eGroupItemProvider == null) {
			eGroupItemProvider = new EGroupItemProvider(this);
		}

		return eGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EWebView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EWebViewItemProvider eWebViewItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EWebView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEWebViewAdapter() {
		if (eWebViewItemProvider == null) {
			eWebViewItemProvider = new EWebViewItemProvider(this);
		}

		return eWebViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ELabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELabelItemProvider eLabelItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ELabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createELabelAdapter() {
		if (eLabelItemProvider == null) {
			eLabelItemProvider = new ELabelItemProvider(this);
		}

		return eLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EButtonItemProvider eButtonItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEButtonAdapter() {
		if (eButtonItemProvider == null) {
			eButtonItemProvider = new EButtonItemProvider(this);
		}

		return eButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ECheckBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECheckBoxItemProvider eCheckBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ECheckBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createECheckBoxAdapter() {
		if (eCheckBoxItemProvider == null) {
			eCheckBoxItemProvider = new ECheckBoxItemProvider(this);
		}

		return eCheckBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EHyperlink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EHyperlinkItemProvider eHyperlinkItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EHyperlink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEHyperlinkAdapter() {
		if (eHyperlinkItemProvider == null) {
			eHyperlinkItemProvider = new EHyperlinkItemProvider(this);
		}

		return eHyperlinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EMenuButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMenuButtonItemProvider eMenuButtonItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EMenuButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEMenuButtonAdapter() {
		if (eMenuButtonItemProvider == null) {
			eMenuButtonItemProvider = new EMenuButtonItemProvider(this);
		}

		return eMenuButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ESplitMenuButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESplitMenuButtonItemProvider eSplitMenuButtonItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ESplitMenuButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createESplitMenuButtonAdapter() {
		if (eSplitMenuButtonItemProvider == null) {
			eSplitMenuButtonItemProvider = new ESplitMenuButtonItemProvider(this);
		}

		return eSplitMenuButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EToogleButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EToogleButtonItemProvider eToogleButtonItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EToogleButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEToogleButtonAdapter() {
		if (eToogleButtonItemProvider == null) {
			eToogleButtonItemProvider = new EToogleButtonItemProvider(this);
		}

		return eToogleButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ETableView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETableViewItemProvider eTableViewItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ETableView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createETableViewAdapter() {
		if (eTableViewItemProvider == null) {
			eTableViewItemProvider = new ETableViewItemProvider(this);
		}

		return eTableViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ETableColumn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETableColumnItemProvider eTableColumnItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ETableColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createETableColumnAdapter() {
		if (eTableColumnItemProvider == null) {
			eTableColumnItemProvider = new ETableColumnItemProvider(this);
		}

		return eTableColumnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ERadioButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERadioButtonItemProvider eRadioButtonItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ERadioButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createERadioButtonAdapter() {
		if (eRadioButtonItemProvider == null) {
			eRadioButtonItemProvider = new ERadioButtonItemProvider(this);
		}

		return eRadioButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ECatgeoryAxis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECatgeoryAxisItemProvider eCatgeoryAxisItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ECatgeoryAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createECatgeoryAxisAdapter() {
		if (eCatgeoryAxisItemProvider == null) {
			eCatgeoryAxisItemProvider = new ECatgeoryAxisItemProvider(this);
		}

		return eCatgeoryAxisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EValueAxis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EValueAxisItemProvider eValueAxisItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EValueAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEValueAxisAdapter() {
		if (eValueAxisItemProvider == null) {
			eValueAxisItemProvider = new EValueAxisItemProvider(this);
		}

		return eValueAxisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EPieChart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPieChartItemProvider ePieChartItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EPieChart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEPieChartAdapter() {
		if (ePieChartItemProvider == null) {
			ePieChartItemProvider = new EPieChartItemProvider(this);
		}

		return ePieChartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EXYChart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXYChartItemProvider exyChartItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EXYChart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEXYChartAdapter() {
		if (exyChartItemProvider == null) {
			exyChartItemProvider = new EXYChartItemProvider(this);
		}

		return exyChartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPaneItemProvider ePaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEPaneAdapter() {
		if (ePaneItemProvider == null) {
			ePaneItemProvider = new EPaneItemProvider(this);
		}

		return ePaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EStackPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStackPaneItemProvider eStackPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EStackPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEStackPaneAdapter() {
		if (eStackPaneItemProvider == null) {
			eStackPaneItemProvider = new EStackPaneItemProvider(this);
		}

		return eStackPaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EDialogPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDialogPaneItemProvider eDialogPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EDialogPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEDialogPaneAdapter() {
		if (eDialogPaneItemProvider == null) {
			eDialogPaneItemProvider = new EDialogPaneItemProvider(this);
		}

		return eDialogPaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EGridPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EGridPaneItemProvider eGridPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EGridPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEGridPaneAdapter() {
		if (eGridPaneItemProvider == null) {
			eGridPaneItemProvider = new EGridPaneItemProvider(this);
		}

		return eGridPaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EHBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EHBoxItemProvider ehBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EHBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEHBoxAdapter() {
		if (ehBoxItemProvider == null) {
			ehBoxItemProvider = new EHBoxItemProvider(this);
		}

		return ehBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EVBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EVBoxItemProvider evBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EVBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEVBoxAdapter() {
		if (evBoxItemProvider == null) {
			evBoxItemProvider = new EVBoxItemProvider(this);
		}

		return evBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EFlowPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFlowPaneItemProvider eFlowPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EFlowPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEFlowPaneAdapter() {
		if (eFlowPaneItemProvider == null) {
			eFlowPaneItemProvider = new EFlowPaneItemProvider(this);
		}

		return eFlowPaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.ETilePane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETilePaneItemProvider eTilePaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.ETilePane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createETilePaneAdapter() {
		if (eTilePaneItemProvider == null) {
			eTilePaneItemProvider = new ETilePaneItemProvider(this);
		}

		return eTilePaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EAnchorPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAnchorPaneItemProvider eAnchorPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EAnchorPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEAnchorPaneAdapter() {
		if (eAnchorPaneItemProvider == null) {
			eAnchorPaneItemProvider = new EAnchorPaneItemProvider(this);
		}

		return eAnchorPaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.mm.EBorderPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EBorderPaneItemProvider eBorderPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.mm.EBorderPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEBorderPaneAdapter() {
		if (eBorderPaneItemProvider == null) {
			eBorderPaneItemProvider = new EBorderPaneItemProvider(this);
		}

		return eBorderPaneItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (emfModelItemProvider != null)
			emfModelItemProvider.dispose();
		if (styleableItemProvider != null)
			styleableItemProvider.dispose();
		if (skinnableItemProvider != null)
			skinnableItemProvider.dispose();
		if (eRegionItemProvider != null)
			eRegionItemProvider.dispose();
		if (eInsetsItemProvider != null)
			eInsetsItemProvider.dispose();
		if (eGroupItemProvider != null)
			eGroupItemProvider.dispose();
		if (eWebViewItemProvider != null)
			eWebViewItemProvider.dispose();
		if (eLabelItemProvider != null)
			eLabelItemProvider.dispose();
		if (eButtonItemProvider != null)
			eButtonItemProvider.dispose();
		if (eCheckBoxItemProvider != null)
			eCheckBoxItemProvider.dispose();
		if (eHyperlinkItemProvider != null)
			eHyperlinkItemProvider.dispose();
		if (eMenuButtonItemProvider != null)
			eMenuButtonItemProvider.dispose();
		if (eSplitMenuButtonItemProvider != null)
			eSplitMenuButtonItemProvider.dispose();
		if (eToogleButtonItemProvider != null)
			eToogleButtonItemProvider.dispose();
		if (eTableViewItemProvider != null)
			eTableViewItemProvider.dispose();
		if (eTableColumnItemProvider != null)
			eTableColumnItemProvider.dispose();
		if (eRadioButtonItemProvider != null)
			eRadioButtonItemProvider.dispose();
		if (eCatgeoryAxisItemProvider != null)
			eCatgeoryAxisItemProvider.dispose();
		if (eValueAxisItemProvider != null)
			eValueAxisItemProvider.dispose();
		if (ePieChartItemProvider != null)
			ePieChartItemProvider.dispose();
		if (exyChartItemProvider != null)
			exyChartItemProvider.dispose();
		if (ePaneItemProvider != null)
			ePaneItemProvider.dispose();
		if (eStackPaneItemProvider != null)
			eStackPaneItemProvider.dispose();
		if (eDialogPaneItemProvider != null)
			eDialogPaneItemProvider.dispose();
		if (eGridPaneItemProvider != null)
			eGridPaneItemProvider.dispose();
		if (ehBoxItemProvider != null)
			ehBoxItemProvider.dispose();
		if (evBoxItemProvider != null)
			evBoxItemProvider.dispose();
		if (eFlowPaneItemProvider != null)
			eFlowPaneItemProvider.dispose();
		if (eTilePaneItemProvider != null)
			eTilePaneItemProvider.dispose();
		if (eAnchorPaneItemProvider != null)
			eAnchorPaneItemProvider.dispose();
		if (eBorderPaneItemProvider != null)
			eBorderPaneItemProvider.dispose();
	}

}
