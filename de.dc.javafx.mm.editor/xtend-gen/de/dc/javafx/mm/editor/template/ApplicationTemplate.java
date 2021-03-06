package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.IGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ApplicationTemplate implements IGenerator<EmfModel> {
  private String className;
  
  public ApplicationTemplate(final String className) {
    this.className = className;
  }
  
  @Override
  public String gen(final EmfModel t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = t.getBasePackage();
    _builder.append(_basePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.Properties;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.apache.log4j.Logger;");
    _builder.newLine();
    _builder.append("import org.apache.log4j.PropertyConfigurator;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import de.dc.javafx.mm.EmfApplication;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(this.className);
    _builder.append(" extends EmfApplication{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String getJavaFXFilePath() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"/");
    _builder.append(this.className, "\t\t");
    _builder.append(".javafx\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("initLogProperty();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("launch(args);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Logger.getRootLogger().info(\"Start ");
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper, "\t\t");
    _builder.append("Application\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static void initLogProperty() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Properties properties=new Properties();");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.rootLogger\",\"TRACE,stdout,MyFile\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.rootCategory\",\"TRACE\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.appender.stdout\",     \"org.apache.log4j.ConsoleAppender\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.appender.stdout.layout\",  \"org.apache.log4j.PatternLayout\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.appender.stdout.layout.ConversionPattern\",\"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.appender.MyFile.DatePattern\", \"\'.\'yyyy-MM-dd\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.appender.MyFile\", \"org.apache.log4j.DailyRollingFileAppender\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.appender.MyFile.File\", \"logs/application.log\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.appender.MyFile.layout\",  \"org.apache.log4j.PatternLayout\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("properties.setProperty(\"log4j.appender.MyFile.layout.ConversionPattern\",\"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("PropertyConfigurator.configure(properties);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
