package de.dc.javafx.mm.editor.template;

import com.google.common.collect.Iterators;
import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.ETableViewModel;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.ControllerFieldInitializer;
import de.dc.javafx.mm.editor.template.ControllerGenType;
import de.dc.javafx.mm.editor.template.IGenerator;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ControllerImplTemplate implements IGenerator<EmfModel> {
  private StringBuffer fieldBuffer = new StringBuffer();
  
  private StringBuffer onActionBuffer = new StringBuffer();
  
  private ControllerFieldInitializer fieldInitializer = new ControllerFieldInitializer(ControllerGenType.FIELD);
  
  private ControllerFieldInitializer onActionInitializer = new ControllerFieldInitializer(ControllerGenType.ON_ACTION);
  
  @Override
  public String gen(final EmfModel t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = t.getBasePackage();
    _builder.append(_basePackage);
    _builder.append(".controller;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("import javafx.beans.value.*;");
    _builder.newLine();
    _builder.append("import javafx.event.*;");
    _builder.newLine();
    _builder.append("import org.apache.log4j.*;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = t.getBasePackage();
    _builder.append(_basePackage_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper);
    _builder.append("Controller extends Base");
    String _firstUpper_1 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_1);
    _builder.append("Controller{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Logger log = Logger.getLogger(");
    String _firstUpper_2 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_2, "\t");
    _builder.append("Controller.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _name = t.getName();
    _builder.append(_name, "\t");
    _builder.append("Binding model = new ");
    String _name_1 = t.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Binding();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void initialize() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super.initialize();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("log.info(\"Initialize  ");
    String _firstUpper_3 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append("Controller\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      List<ETableView> _list = IteratorExtensions.<ETableView>toList(Iterators.<ETableView>filter(EcoreUtil.<Object>getAllContents(t, true), ETableView.class));
      for(final ETableView node : _list) {
        _builder.append("\t\t");
        ETableViewModel _model = node.getModel();
        String _name_2 = null;
        if (_model!=null) {
          _name_2=_model.getName();
        }
        final String modelName = StringExtensions.toFirstUpper(_name_2);
        _builder.newLineIfNotEmpty();
        {
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(modelName);
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            _builder.append("\t\t");
            _builder.append("model.sortedData");
            _builder.append(modelName, "\t\t");
            _builder.append("().comparatorProperty().bind(tableView");
            _builder.append(modelName, "\t\t");
            _builder.append(".comparatorProperty());\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            String _firstLower = StringExtensions.toFirstLower(node.getId());
            _builder.append(_firstLower, "\t\t");
            _builder.append(".setItems(model.sortedData");
            String _firstUpper_4 = StringExtensions.toFirstUpper(node.getModel().getName());
            _builder.append(_firstUpper_4, "\t\t");
            _builder.append("());");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            String _firstLower_1 = StringExtensions.toFirstLower(node.getId());
            _builder.append(_firstLower_1, "\t\t");
            _builder.append(".getSelectionModel().selectedItemProperty().addListener(this::onTableView");
            String _firstUpper_5 = StringExtensions.toFirstUpper(node.getModel().getName());
            _builder.append(_firstUpper_5, "\t\t");
            _builder.append("SelectionChanged);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("model.selected");
            String _firstUpper_6 = StringExtensions.toFirstUpper(node.getModel().getName());
            _builder.append(_firstUpper_6, "\t\t");
            _builder.append(".bind(tableView");
            String _firstUpper_7 = StringExtensions.toFirstUpper(node.getModel().getName());
            _builder.append(_firstUpper_7, "\t\t");
            _builder.append(".getSelectionModel().selectedItemProperty());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ETableView> _list_1 = IteratorExtensions.<ETableView>toList(Iterators.<ETableView>filter(EcoreUtil.<Object>getAllContents(t, true), ETableView.class));
      for(final ETableView node_1 : _list_1) {
        _builder.append("\t");
        ETableViewModel _model_1 = node_1.getModel();
        String _name_3 = null;
        if (_model_1!=null) {
          _name_3=_model_1.getName();
        }
        final String name = StringExtensions.toFirstUpper(_name_3);
        _builder.newLineIfNotEmpty();
        {
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(name);
          boolean _not_1 = (!_isNullOrEmpty_1);
          if (_not_1) {
            _builder.append("\t");
            _builder.append("private void onTableView");
            _builder.append(name, "\t");
            _builder.append("SelectionChanged(ObservableValue<? extends ");
            _builder.append(name, "\t");
            _builder.append("> observable, ");
            _builder.append(name, "\t");
            _builder.append(" oldValue, ");
            _builder.append(name, "\t");
            _builder.append(" newValue) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("if (newValue!=null) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("// TODO: not impleted yet!");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    this.getInitField(t.getRoot());
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _string = this.onActionBuffer.toString();
    _builder.append(_string, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public void getInitField(final ENode node) {
    if ((node != null)) {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(node.getId());
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        String _doSwitch = this.fieldInitializer.doSwitch(node);
        _builder.append(_doSwitch);
        this.fieldBuffer.append(_builder);
        StringConcatenation _builder_1 = new StringConcatenation();
        String _doSwitch_1 = this.onActionInitializer.doSwitch(node);
        _builder_1.append(_doSwitch_1);
        this.onActionBuffer.append(_builder_1);
      }
      if ((node instanceof EBorderPane)) {
        this.getInitField(((EBorderPane)node).getLeft());
        this.getInitField(((EBorderPane)node).getRight());
        this.getInitField(((EBorderPane)node).getTop());
        this.getInitField(((EBorderPane)node).getBottom());
        this.getInitField(((EBorderPane)node).getCenter());
      } else {
        final Consumer<ENode> _function = (ENode e) -> {
          this.getInitField(e);
        };
        node.getChildren().forEach(_function);
      }
    }
  }
}
