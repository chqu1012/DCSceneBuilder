package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.ControllerFieldInitializer;
import de.dc.javafx.mm.editor.template.ControllerGenType;
import de.dc.javafx.mm.editor.template.IGenerator;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ControllerTemplate implements IGenerator<EmfModel> {
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
    _builder.newLine();
    _builder.append("import javafx.event.*;");
    _builder.newLine();
    _builder.append("import javafx.fxml.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Base");
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper);
    _builder.append("Controller{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void initialize(){}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    this.getInitField(t.getRoot());
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _string = this.fieldBuffer.toString();
    _builder.append(_string, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _string_1 = this.onActionBuffer.toString();
    _builder.append(_string_1, "\t");
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
