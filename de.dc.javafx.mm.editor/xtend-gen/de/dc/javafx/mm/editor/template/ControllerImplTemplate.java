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
public class ControllerImplTemplate implements IGenerator<EmfModel> {
  private StringBuffer onActionBuffer = new StringBuffer();
  
  private ControllerFieldInitializer onActionInitializer = new ControllerFieldInitializer(ControllerGenType.ON_ACTION_IMPL);
  
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
      StringConcatenation _builder = new StringConcatenation();
      String _doSwitch = this.onActionInitializer.doSwitch(node);
      _builder.append(_doSwitch);
      this.onActionBuffer.append(_builder);
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
