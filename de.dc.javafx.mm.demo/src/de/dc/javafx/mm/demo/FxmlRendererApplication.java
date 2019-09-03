package de.dc.javafx.mm.demo;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.dc.javafx.mm.EmfApplication;

public class FxmlRendererApplication extends EmfApplication{

	@Override
	protected String getJavaFXFilePath() {
		return "/FxmlRendererApplication.javafx";
	}

	public static void main(String[] args) {
		initLogProperty();
		launch(args);
		Logger.getRootLogger().info("Start PersonApplication");
	}

	private static void initLogProperty() {
		Properties properties=new Properties();
	    properties.setProperty("log4j.rootLogger","TRACE,stdout,MyFile");
	    properties.setProperty("log4j.rootCategory","TRACE");

	    properties.setProperty("log4j.appender.stdout",     "org.apache.log4j.ConsoleAppender");
	    properties.setProperty("log4j.appender.stdout.layout",  "org.apache.log4j.PatternLayout");
	    properties.setProperty("log4j.appender.stdout.layout.ConversionPattern","%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

	    properties.setProperty("log4j.appender.MyFile.DatePattern", "'.'yyyy-MM-dd");
	    properties.setProperty("log4j.appender.MyFile", "org.apache.log4j.DailyRollingFileAppender");
	    properties.setProperty("log4j.appender.MyFile.File", "logs/application.log");
	    properties.setProperty("log4j.appender.MyFile.layout",  "org.apache.log4j.PatternLayout");
	    properties.setProperty("log4j.appender.MyFile.layout.ConversionPattern","%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

	    PropertyConfigurator.configure(properties);
	}

}
