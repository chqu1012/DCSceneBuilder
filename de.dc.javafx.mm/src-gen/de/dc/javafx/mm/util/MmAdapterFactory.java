/**
 */
package de.dc.javafx.mm.util;

import de.dc.javafx.mm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.mm.MmPackage
 * @generated
 */
public class MmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MmSwitch<Adapter> modelSwitch = new MmSwitch<Adapter>() {
		@Override
		public Adapter caseEmfModel(EmfModel object) {
			return createEmfModelAdapter();
		}

		@Override
		public Adapter caseEBean(EBean object) {
			return createEBeanAdapter();
		}

		@Override
		public Adapter caseEField(EField object) {
			return createEFieldAdapter();
		}

		@Override
		public Adapter caseEBindingModel(EBindingModel object) {
			return createEBindingModelAdapter();
		}

		@Override
		public Adapter caseEBinding(EBinding object) {
			return createEBindingAdapter();
		}

		@Override
		public Adapter caseStyleable(Styleable object) {
			return createStyleableAdapter();
		}

		@Override
		public Adapter caseSkinnable(Skinnable object) {
			return createSkinnableAdapter();
		}

		@Override
		public Adapter caseEInsets(EInsets object) {
			return createEInsetsAdapter();
		}

		@Override
		public Adapter caseEGroup(EGroup object) {
			return createEGroupAdapter();
		}

		@Override
		public Adapter caseEControl(EControl object) {
			return createEControlAdapter();
		}

		@Override
		public Adapter caseELabeled(ELabeled object) {
			return createELabeledAdapter();
		}

		@Override
		public Adapter caseEText(EText object) {
			return createETextAdapter();
		}

		@Override
		public Adapter caseELabel(ELabel object) {
			return createELabelAdapter();
		}

		@Override
		public Adapter caseEButtonBase(EButtonBase object) {
			return createEButtonBaseAdapter();
		}

		@Override
		public Adapter caseEButton(EButton object) {
			return createEButtonAdapter();
		}

		@Override
		public Adapter caseECheckBox(ECheckBox object) {
			return createECheckBoxAdapter();
		}

		@Override
		public Adapter caseEHyperlink(EHyperlink object) {
			return createEHyperlinkAdapter();
		}

		@Override
		public Adapter caseEMenuButton(EMenuButton object) {
			return createEMenuButtonAdapter();
		}

		@Override
		public Adapter caseESplitMenuButton(ESplitMenuButton object) {
			return createESplitMenuButtonAdapter();
		}

		@Override
		public Adapter caseEToogleButton(EToogleButton object) {
			return createEToogleButtonAdapter();
		}

		@Override
		public Adapter caseEBaseView(EBaseView object) {
			return createEBaseViewAdapter();
		}

		@Override
		public Adapter caseEFilteredTableView(EFilteredTableView object) {
			return createEFilteredTableViewAdapter();
		}

		@Override
		public Adapter caseETableView(ETableView object) {
			return createETableViewAdapter();
		}

		@Override
		public Adapter caseETableColumn(ETableColumn object) {
			return createETableColumnAdapter();
		}

		@Override
		public Adapter caseEListView(EListView object) {
			return createEListViewAdapter();
		}

		@Override
		public Adapter caseERadioButton(ERadioButton object) {
			return createERadioButtonAdapter();
		}

		@Override
		public Adapter caseEAxis(EAxis object) {
			return createEAxisAdapter();
		}

		@Override
		public Adapter caseECatgeoryAxis(ECatgeoryAxis object) {
			return createECatgeoryAxisAdapter();
		}

		@Override
		public Adapter caseEValueAxis(EValueAxis object) {
			return createEValueAxisAdapter();
		}

		@Override
		public Adapter caseEPieChart(EPieChart object) {
			return createEPieChartAdapter();
		}

		@Override
		public Adapter caseEXYChart(EXYChart object) {
			return createEXYChartAdapter();
		}

		@Override
		public Adapter caseEPane(EPane object) {
			return createEPaneAdapter();
		}

		@Override
		public Adapter caseEStackPane(EStackPane object) {
			return createEStackPaneAdapter();
		}

		@Override
		public Adapter caseEDialogPane(EDialogPane object) {
			return createEDialogPaneAdapter();
		}

		@Override
		public Adapter caseEGridPane(EGridPane object) {
			return createEGridPaneAdapter();
		}

		@Override
		public Adapter caseEHBox(EHBox object) {
			return createEHBoxAdapter();
		}

		@Override
		public Adapter caseEVBox(EVBox object) {
			return createEVBoxAdapter();
		}

		@Override
		public Adapter caseEFlowPane(EFlowPane object) {
			return createEFlowPaneAdapter();
		}

		@Override
		public Adapter caseESplitPane(ESplitPane object) {
			return createESplitPaneAdapter();
		}

		@Override
		public Adapter caseETilePane(ETilePane object) {
			return createETilePaneAdapter();
		}

		@Override
		public Adapter caseEAnchorPane(EAnchorPane object) {
			return createEAnchorPaneAdapter();
		}

		@Override
		public Adapter caseEBorderPane(EBorderPane object) {
			return createEBorderPaneAdapter();
		}

		@Override
		public Adapter caseEChart(EChart object) {
			return createEChartAdapter();
		}

		@Override
		public Adapter caseEImageView(EImageView object) {
			return createEImageViewAdapter();
		}

		@Override
		public Adapter caseEScrollPane(EScrollPane object) {
			return createEScrollPaneAdapter();
		}

		@Override
		public Adapter caseEEvents(EEvents object) {
			return createEEventsAdapter();
		}

		@Override
		public Adapter caseEWebView(EWebView object) {
			return createEWebViewAdapter();
		}

		@Override
		public Adapter caseENode(ENode object) {
			return createENodeAdapter();
		}

		@Override
		public Adapter caseETabPane(ETabPane object) {
			return createETabPaneAdapter();
		}

		@Override
		public Adapter caseETab(ETab object) {
			return createETabAdapter();
		}

		@Override
		public Adapter caseELayoutData(ELayoutData object) {
			return createELayoutDataAdapter();
		}

		@Override
		public Adapter caseEBorderData(EBorderData object) {
			return createEBorderDataAdapter();
		}

		@Override
		public Adapter caseEVBoxData(EVBoxData object) {
			return createEVBoxDataAdapter();
		}

		@Override
		public Adapter caseEHBoxData(EHBoxData object) {
			return createEHBoxDataAdapter();
		}

		@Override
		public Adapter caseEAreaChart(EAreaChart object) {
			return createEAreaChartAdapter();
		}

		@Override
		public Adapter caseEBarChart(EBarChart object) {
			return createEBarChartAdapter();
		}

		@Override
		public Adapter caseEBubbleChart(EBubbleChart object) {
			return createEBubbleChartAdapter();
		}

		@Override
		public Adapter caseELineChart(ELineChart object) {
			return createELineChartAdapter();
		}

		@Override
		public Adapter caseEScatterChart(EScatterChart object) {
			return createEScatterChartAdapter();
		}

		@Override
		public Adapter caseEStackedAreaChart(EStackedAreaChart object) {
			return createEStackedAreaChartAdapter();
		}

		@Override
		public Adapter caseEStackedBarChart(EStackedBarChart object) {
			return createEStackedBarChartAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EmfModel <em>Emf Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EmfModel
	 * @generated
	 */
	public Adapter createEmfModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EBean <em>EBean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EBean
	 * @generated
	 */
	public Adapter createEBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EField <em>EField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EField
	 * @generated
	 */
	public Adapter createEFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EBindingModel <em>EBinding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EBindingModel
	 * @generated
	 */
	public Adapter createEBindingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EBinding <em>EBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EBinding
	 * @generated
	 */
	public Adapter createEBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.Styleable <em>Styleable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.Styleable
	 * @generated
	 */
	public Adapter createStyleableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.Skinnable <em>Skinnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.Skinnable
	 * @generated
	 */
	public Adapter createSkinnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EInsets <em>EInsets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EInsets
	 * @generated
	 */
	public Adapter createEInsetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EGroup <em>EGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EGroup
	 * @generated
	 */
	public Adapter createEGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EControl <em>EControl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EControl
	 * @generated
	 */
	public Adapter createEControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ELabeled <em>ELabeled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ELabeled
	 * @generated
	 */
	public Adapter createELabeledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EText <em>EText</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EText
	 * @generated
	 */
	public Adapter createETextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ELabel <em>ELabel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ELabel
	 * @generated
	 */
	public Adapter createELabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EButtonBase <em>EButton Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EButtonBase
	 * @generated
	 */
	public Adapter createEButtonBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EButton <em>EButton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EButton
	 * @generated
	 */
	public Adapter createEButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ECheckBox <em>ECheck Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ECheckBox
	 * @generated
	 */
	public Adapter createECheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EHyperlink <em>EHyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EHyperlink
	 * @generated
	 */
	public Adapter createEHyperlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EMenuButton <em>EMenu Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EMenuButton
	 * @generated
	 */
	public Adapter createEMenuButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ESplitMenuButton <em>ESplit Menu Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ESplitMenuButton
	 * @generated
	 */
	public Adapter createESplitMenuButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EToogleButton <em>EToogle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EToogleButton
	 * @generated
	 */
	public Adapter createEToogleButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EBaseView <em>EBase View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EBaseView
	 * @generated
	 */
	public Adapter createEBaseViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EFilteredTableView <em>EFiltered Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EFilteredTableView
	 * @generated
	 */
	public Adapter createEFilteredTableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ETableView <em>ETable View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ETableView
	 * @generated
	 */
	public Adapter createETableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ETableColumn <em>ETable Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ETableColumn
	 * @generated
	 */
	public Adapter createETableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EListView <em>EList View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EListView
	 * @generated
	 */
	public Adapter createEListViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ERadioButton <em>ERadio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ERadioButton
	 * @generated
	 */
	public Adapter createERadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EAxis <em>EAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EAxis
	 * @generated
	 */
	public Adapter createEAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ECatgeoryAxis <em>ECatgeory Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ECatgeoryAxis
	 * @generated
	 */
	public Adapter createECatgeoryAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EValueAxis <em>EValue Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EValueAxis
	 * @generated
	 */
	public Adapter createEValueAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EPieChart <em>EPie Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EPieChart
	 * @generated
	 */
	public Adapter createEPieChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EXYChart <em>EXY Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EXYChart
	 * @generated
	 */
	public Adapter createEXYChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EPane <em>EPane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EPane
	 * @generated
	 */
	public Adapter createEPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EStackPane <em>EStack Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EStackPane
	 * @generated
	 */
	public Adapter createEStackPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EDialogPane <em>EDialog Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EDialogPane
	 * @generated
	 */
	public Adapter createEDialogPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EGridPane <em>EGrid Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EGridPane
	 * @generated
	 */
	public Adapter createEGridPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EHBox <em>EH Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EHBox
	 * @generated
	 */
	public Adapter createEHBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EVBox <em>EV Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EVBox
	 * @generated
	 */
	public Adapter createEVBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EFlowPane <em>EFlow Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EFlowPane
	 * @generated
	 */
	public Adapter createEFlowPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ESplitPane <em>ESplit Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ESplitPane
	 * @generated
	 */
	public Adapter createESplitPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ETilePane <em>ETile Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ETilePane
	 * @generated
	 */
	public Adapter createETilePaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EAnchorPane <em>EAnchor Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EAnchorPane
	 * @generated
	 */
	public Adapter createEAnchorPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EBorderPane <em>EBorder Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EBorderPane
	 * @generated
	 */
	public Adapter createEBorderPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EChart <em>EChart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EChart
	 * @generated
	 */
	public Adapter createEChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EImageView <em>EImage View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EImageView
	 * @generated
	 */
	public Adapter createEImageViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EScrollPane <em>EScroll Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EScrollPane
	 * @generated
	 */
	public Adapter createEScrollPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EEvents <em>EEvents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EEvents
	 * @generated
	 */
	public Adapter createEEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EWebView <em>EWeb View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EWebView
	 * @generated
	 */
	public Adapter createEWebViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ENode <em>ENode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ENode
	 * @generated
	 */
	public Adapter createENodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ETabPane <em>ETab Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ETabPane
	 * @generated
	 */
	public Adapter createETabPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ETab <em>ETab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ETab
	 * @generated
	 */
	public Adapter createETabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ELayoutData <em>ELayout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ELayoutData
	 * @generated
	 */
	public Adapter createELayoutDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EBorderData <em>EBorder Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EBorderData
	 * @generated
	 */
	public Adapter createEBorderDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EVBoxData <em>EV Box Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EVBoxData
	 * @generated
	 */
	public Adapter createEVBoxDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EHBoxData <em>EH Box Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EHBoxData
	 * @generated
	 */
	public Adapter createEHBoxDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EAreaChart <em>EArea Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EAreaChart
	 * @generated
	 */
	public Adapter createEAreaChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EBarChart <em>EBar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EBarChart
	 * @generated
	 */
	public Adapter createEBarChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EBubbleChart <em>EBubble Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EBubbleChart
	 * @generated
	 */
	public Adapter createEBubbleChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.ELineChart <em>ELine Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.ELineChart
	 * @generated
	 */
	public Adapter createELineChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EScatterChart <em>EScatter Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EScatterChart
	 * @generated
	 */
	public Adapter createEScatterChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EStackedAreaChart <em>EStacked Area Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EStackedAreaChart
	 * @generated
	 */
	public Adapter createEStackedAreaChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.mm.EStackedBarChart <em>EStacked Bar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.mm.EStackedBarChart
	 * @generated
	 */
	public Adapter createEStackedBarChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MmAdapterFactory
