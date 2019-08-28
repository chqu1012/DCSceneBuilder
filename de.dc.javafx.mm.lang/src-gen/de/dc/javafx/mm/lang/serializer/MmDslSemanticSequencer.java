/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.mm.lang.serializer;

import com.google.inject.Inject;
import de.dc.javafx.mm.EAnchorPane;
import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.ECatgeoryAxis;
import de.dc.javafx.mm.ECheckBox;
import de.dc.javafx.mm.EDialogPane;
import de.dc.javafx.mm.EFlowPane;
import de.dc.javafx.mm.EGridPane;
import de.dc.javafx.mm.EGroup;
import de.dc.javafx.mm.EHBox;
import de.dc.javafx.mm.EHyperlink;
import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ELabel;
import de.dc.javafx.mm.EMenuButton;
import de.dc.javafx.mm.EPane;
import de.dc.javafx.mm.EPieChart;
import de.dc.javafx.mm.ERadioButton;
import de.dc.javafx.mm.ERegion;
import de.dc.javafx.mm.ESplitMenuButton;
import de.dc.javafx.mm.EStackPane;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.ETilePane;
import de.dc.javafx.mm.EToogleButton;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.EValueAxis;
import de.dc.javafx.mm.EWebView;
import de.dc.javafx.mm.EXYChart;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.MmPackage;
import de.dc.javafx.mm.lang.services.MmDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class MmDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MmDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MmPackage.EANCHOR_PANE:
				sequence_EAnchorPane(context, (EAnchorPane) semanticObject); 
				return; 
			case MmPackage.EBORDER_PANE:
				sequence_EBorderPane(context, (EBorderPane) semanticObject); 
				return; 
			case MmPackage.EBUTTON:
				sequence_EButton(context, (EButton) semanticObject); 
				return; 
			case MmPackage.ECATGEORY_AXIS:
				sequence_ECatgeoryAxis(context, (ECatgeoryAxis) semanticObject); 
				return; 
			case MmPackage.ECHECK_BOX:
				sequence_ECheckBox(context, (ECheckBox) semanticObject); 
				return; 
			case MmPackage.EDIALOG_PANE:
				sequence_EDialogPane(context, (EDialogPane) semanticObject); 
				return; 
			case MmPackage.EFLOW_PANE:
				sequence_EFlowPane(context, (EFlowPane) semanticObject); 
				return; 
			case MmPackage.EGRID_PANE:
				sequence_EGridPane(context, (EGridPane) semanticObject); 
				return; 
			case MmPackage.EGROUP:
				sequence_EGroup(context, (EGroup) semanticObject); 
				return; 
			case MmPackage.EH_BOX:
				sequence_EHBox(context, (EHBox) semanticObject); 
				return; 
			case MmPackage.EHYPERLINK:
				sequence_EHyperlink(context, (EHyperlink) semanticObject); 
				return; 
			case MmPackage.EINSETS:
				sequence_EInsets(context, (EInsets) semanticObject); 
				return; 
			case MmPackage.ELABEL:
				sequence_ELabel(context, (ELabel) semanticObject); 
				return; 
			case MmPackage.EMENU_BUTTON:
				sequence_EMenuButton(context, (EMenuButton) semanticObject); 
				return; 
			case MmPackage.EPANE:
				sequence_EPane_Impl(context, (EPane) semanticObject); 
				return; 
			case MmPackage.EPIE_CHART:
				sequence_EPieChart(context, (EPieChart) semanticObject); 
				return; 
			case MmPackage.ERADIO_BUTTON:
				sequence_ERadioButton(context, (ERadioButton) semanticObject); 
				return; 
			case MmPackage.EREGION:
				sequence_ERegion_Impl(context, (ERegion) semanticObject); 
				return; 
			case MmPackage.ESPLIT_MENU_BUTTON:
				sequence_ESplitMenuButton(context, (ESplitMenuButton) semanticObject); 
				return; 
			case MmPackage.ESTACK_PANE:
				sequence_EStackPane(context, (EStackPane) semanticObject); 
				return; 
			case MmPackage.ETABLE_COLUMN:
				sequence_ETableColumn(context, (ETableColumn) semanticObject); 
				return; 
			case MmPackage.ETABLE_VIEW:
				sequence_ETableView(context, (ETableView) semanticObject); 
				return; 
			case MmPackage.ETEXT:
				sequence_EText(context, (EText) semanticObject); 
				return; 
			case MmPackage.ETILE_PANE:
				sequence_ETilePane(context, (ETilePane) semanticObject); 
				return; 
			case MmPackage.ETOOGLE_BUTTON:
				sequence_EToogleButton_Impl(context, (EToogleButton) semanticObject); 
				return; 
			case MmPackage.EV_BOX:
				sequence_EVBox(context, (EVBox) semanticObject); 
				return; 
			case MmPackage.EVALUE_AXIS:
				sequence_EValueAxis(context, (EValueAxis) semanticObject); 
				return; 
			case MmPackage.EWEB_VIEW:
				sequence_EWebView(context, (EWebView) semanticObject); 
				return; 
			case MmPackage.EXY_CHART:
				sequence_EXYChart(context, (EXYChart) semanticObject); 
				return; 
			case MmPackage.EMF_MODEL:
				sequence_EmfModel(context, (EmfModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ENode returns EAnchorPane
	 *     EAnchorPane returns EAnchorPane
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EAnchorPane(ISerializationContext context, EAnchorPane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EBorderPane
	 *     EBorderPane returns EBorderPane
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets? 
	 *         left=ENode? 
	 *         right=ENode? 
	 *         top=ENode? 
	 *         bottom=ENode? 
	 *         center=ENode?
	 *     )
	 */
	protected void sequence_EBorderPane(ISerializationContext context, EBorderPane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EButton
	 *     EButton returns EButton
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EButton(ISerializationContext context, EButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns ECatgeoryAxis
	 *     ECatgeoryAxis returns ECatgeoryAxis
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_ECatgeoryAxis(ISerializationContext context, ECatgeoryAxis semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns ECheckBox
	 *     ECheckBox returns ECheckBox
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         selected?='selected'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_ECheckBox(ISerializationContext context, ECheckBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EDialogPane
	 *     EDialogPane returns EDialogPane
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         header=EString? 
	 *         headerText=EString? 
	 *         contentText=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets? 
	 *         content=ENode?
	 *     )
	 */
	protected void sequence_EDialogPane(ISerializationContext context, EDialogPane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EFlowPane
	 *     EFlowPane returns EFlowPane
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EFlowPane(ISerializationContext context, EFlowPane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EGridPane
	 *     EGridPane returns EGridPane
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EGridPane(ISerializationContext context, EGridPane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EGroup
	 *     EGroup returns EGroup
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         margin=EInsets?
	 *     )
	 */
	protected void sequence_EGroup(ISerializationContext context, EGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EHBox
	 *     EHBox returns EHBox
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         spacing=EDouble? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EHBox(ISerializationContext context, EHBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EHyperlink
	 *     EHyperlink returns EHyperlink
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         visited?='visited'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EHyperlink(ISerializationContext context, EHyperlink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EInsets returns EInsets
	 *
	 * Constraint:
	 *     (top=EDouble? bottom=EDouble? right=EDouble? left=EDouble?)
	 */
	protected void sequence_EInsets(ISerializationContext context, EInsets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns ELabel
	 *     ELabel returns ELabel
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_ELabel(ISerializationContext context, ELabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EMenuButton
	 *     EMenuButton returns EMenuButton
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EMenuButton(ISerializationContext context, EMenuButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EPane
	 *     EPane_Impl returns EPane
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EPane_Impl(ISerializationContext context, EPane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EPieChart
	 *     EPieChart returns EPieChart
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EPieChart(ISerializationContext context, EPieChart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns ERadioButton
	 *     ERadioButton returns ERadioButton
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         selected?='selected'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_ERadioButton(ISerializationContext context, ERadioButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns ERegion
	 *     ERegion_Impl returns ERegion
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_ERegion_Impl(ISerializationContext context, ERegion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns ESplitMenuButton
	 *     ESplitMenuButton returns ESplitMenuButton
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_ESplitMenuButton(ISerializationContext context, ESplitMenuButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EStackPane
	 *     EStackPane returns EStackPane
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EStackPane(ISerializationContext context, EStackPane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETableColumn returns ETableColumn
	 *
	 * Constraint:
	 *     (name=EString id=EString? width=EDouble? cellValueFactory=EString? cellFactory=EString?)
	 */
	protected void sequence_ETableColumn(ISerializationContext context, ETableColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns ETableView
	 *     ETableView returns ETableView
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets? 
	 *         (columns+=ETableColumn columns+=ETableColumn*)?
	 *     )
	 */
	protected void sequence_ETableView(ISerializationContext context, ETableView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EText
	 *     EText returns EText
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         promtText=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EText(ISerializationContext context, EText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns ETilePane
	 *     ETilePane returns ETilePane
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_ETilePane(ISerializationContext context, ETilePane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EToogleButton
	 *     EToogleButton_Impl returns EToogleButton
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         selected?='selected'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         text=EString? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EToogleButton_Impl(ISerializationContext context, EToogleButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EVBox
	 *     EVBox returns EVBox
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         pos=EPos? 
	 *         spacing=EDouble? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EVBox(ISerializationContext context, EVBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EValueAxis
	 *     EValueAxis returns EValueAxis
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EValueAxis(ISerializationContext context, EValueAxis semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EWebView
	 *     EWebView returns EWebView
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         margin=EInsets?
	 *     )
	 */
	protected void sequence_EWebView(ISerializationContext context, EWebView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENode returns EXYChart
	 *     EXYChart returns EXYChart
	 *
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         disable?='disable'? 
	 *         onAction=EString? 
	 *         id=EString? 
	 *         layoutX=EDouble? 
	 *         layoutY=EDouble? 
	 *         opacity=EDouble? 
	 *         style=EString? 
	 *         (styleClass+=EString styleClass+=EString*)? 
	 *         maxHeight=EDouble? 
	 *         minHeight=EDouble? 
	 *         prefHeight=EDouble? 
	 *         maxWidth=EDouble? 
	 *         minWidth=EDouble? 
	 *         prefWidth=EDouble? 
	 *         margin=EInsets? 
	 *         (children+=ENode children+=ENode*)? 
	 *         padding=EInsets?
	 *     )
	 */
	protected void sequence_EXYChart(ISerializationContext context, EXYChart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EmfModel returns EmfModel
	 *
	 * Constraint:
	 *     (basePackage=EString? controller=EString? (styleClass+=EString styleClass+=EString*)? root=ENode?)
	 */
	protected void sequence_EmfModel(ISerializationContext context, EmfModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}