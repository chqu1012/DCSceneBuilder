package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EBinding;
import de.dc.javafx.mm.EBindingModel;
import de.dc.javafx.mm.EBindingType;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.IGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class BindingTemplate implements IGenerator<EmfModel> {
  @Override
  public String gen(final EmfModel t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = t.getBasePackage();
    _builder.append(_basePackage);
    _builder.append(".model;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javafx.beans.property.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper);
    _builder.append("Binding{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EBindingModel _bindingModel = t.getBindingModel();
      boolean _tripleNotEquals = (_bindingModel != null);
      if (_tripleNotEquals) {
        {
          EList<EBinding> _bindings = t.getBindingModel().getBindings();
          for(final EBinding b : _bindings) {
            _builder.append("\t");
            final String name = StringExtensions.toFirstLower(b.getName());
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("private ");
            EBindingType _bindingType = b.getBindingType();
            _builder.append(_bindingType, "\t");
            _builder.append(" ");
            _builder.append(name, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        {
          EList<EBinding> _bindings_1 = t.getBindingModel().getBindings();
          for(final EBinding b_1 : _bindings_1) {
            _builder.append("\t");
            final String name_1 = StringExtensions.toFirstLower(b_1.getName());
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("public ");
            String _replace = b_1.getBindingType().toString().replace("Property", "");
            _builder.append(_replace, "\t");
            _builder.append(" get");
            String _firstUpper_1 = StringExtensions.toFirstUpper(name_1);
            _builder.append(_firstUpper_1, "\t");
            _builder.append("(){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return this.");
            _builder.append(name_1, "\t\t");
            _builder.append(".get();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public void set");
            String _firstUpper_2 = StringExtensions.toFirstUpper(name_1);
            _builder.append(_firstUpper_2, "\t");
            _builder.append("(");
            String _replace_1 = b_1.getBindingType().toString().replace("Property", "");
            _builder.append(_replace_1, "\t");
            _builder.append(" ");
            _builder.append(name_1, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            _builder.append(name_1, "\t\t");
            _builder.append(".set(");
            _builder.append(name_1, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public ");
            EBindingType _bindingType_1 = b_1.getBindingType();
            _builder.append(_bindingType_1, "\t");
            _builder.append(" ");
            _builder.append(name_1, "\t");
            _builder.append("Property(){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return this.");
            _builder.append(name_1, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public void set");
            String _firstUpper_3 = StringExtensions.toFirstUpper(name_1);
            _builder.append(_firstUpper_3, "\t");
            _builder.append("Property(");
            EBindingType _bindingType_2 = b_1.getBindingType();
            _builder.append(_bindingType_2, "\t");
            _builder.append(" ");
            _builder.append(name_1, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            _builder.append(name_1, "\t\t");
            _builder.append("=");
            _builder.append(name_1, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public String toString() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("StringBuilder sb = new StringBuilder();");
        _builder.newLine();
        {
          EList<EBinding> _bindings_2 = t.getBindingModel().getBindings();
          for(final EBinding b_2 : _bindings_2) {
            _builder.append("\t");
            _builder.append("\t");
            final String name_2 = StringExtensions.toFirstLower(b_2.getName());
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("sb.append(\"");
            _builder.append(name_2, "\t\t");
            _builder.append(": \").append(");
            _builder.append(name_2, "\t\t");
            _builder.append(".get()).append(\",\");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return sb.toString();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
