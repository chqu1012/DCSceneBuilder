package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.ControllerFieldInitializer;
import de.dc.javafx.mm.editor.template.IGenerator;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ControllerTemplate implements IGenerator<EmfModel> {
  private StringBuffer sb = new StringBuffer();
  
  private ControllerFieldInitializer fieldInitializer = new ControllerFieldInitializer();
  
  @Override
  public String gen(final EmfModel t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = t.getBasePackage();
    _builder.append(_basePackage);
    _builder.append(".controller;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
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
    String _string = this.sb.toString();
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
        this.sb.append(_builder);
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
