package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.ETableViewModel;
import de.dc.javafx.mm.ETableViewModelField;
import de.dc.javafx.mm.editor.template.IGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelTemplate implements IGenerator<ETableViewModel> {
  @Override
  public String gen(final ETableViewModel t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _instanceName = t.getInstanceName();
    String _name = t.getName();
    String _plus = ("." + _name);
    String _replace = _instanceName.replace(_plus, "");
    _builder.append(_replace);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = t.getName();
    _builder.append(_name_1);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<ETableViewModelField> _fields = t.getFields();
      for(final ETableViewModelField field : _fields) {
        _builder.append("\t");
        _builder.append("private ");
        String _datatype = field.getDatatype();
        _builder.append(_datatype, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(field.getName());
        _builder.append(_firstLower, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<ETableViewModelField> _fields_1 = t.getFields();
      for(final ETableViewModelField field_1 : _fields_1) {
        _builder.append("\t");
        _builder.append("public void set");
        String _firstUpper = StringExtensions.toFirstUpper(field_1.getName());
        _builder.append(_firstUpper, "\t");
        _builder.append("(");
        String _datatype_1 = field_1.getDatatype();
        _builder.append(_datatype_1, "\t");
        _builder.append(" ");
        String _firstLower_1 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_1, "\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _firstLower_2 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_2, "\t\t");
        _builder.append("=");
        String _firstLower_3 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _datatype_2 = field_1.getDatatype();
        _builder.append(_datatype_2, "\t");
        _builder.append(" get");
        String _firstUpper_1 = StringExtensions.toFirstUpper(field_1.getName());
        _builder.append(_firstUpper_1, "\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return this.");
        String _firstLower_4 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_4, "\t\t");
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
    _builder.append("\t\t");
    _builder.append("StringBuilder sb = new StringBuilder(\"");
    String _name_2 = t.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append(" -> \");");
    _builder.newLineIfNotEmpty();
    {
      EList<ETableViewModelField> _fields_2 = t.getFields();
      for(final ETableViewModelField b : _fields_2) {
        _builder.append("\t\t");
        final String name = StringExtensions.toFirstLower(b.getName());
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("sb.append(\"");
        _builder.append(name, "\t\t");
        _builder.append(": \").append(");
        _builder.append(name, "\t\t");
        _builder.append(").append(\",\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return sb.toString();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
