package de.dc.javafx.mm.editor.model;

import com.oracle.javafx.scenebuilder.kit.fxom.FXOMDocument;

public class FxmlModel {

	private String name;
	private String basePackage;
	private FXOMDocument document;
	private Boolean useSpring;

	public FxmlModel(String name, String basePackage, FXOMDocument document, Boolean useSpring) {
		this.name = name;
		this.basePackage = basePackage;
		this.document = document;
		this.setUseSpring(useSpring);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBasePackage() {
		return basePackage;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

	public FXOMDocument getDocument() {
		return document;
	}

	public void setDocument(FXOMDocument document) {
		this.document = document;
	}

	public Boolean getUseSpring() {
		return useSpring;
	}

	public void setUseSpring(Boolean useSpring) {
		this.useSpring = useSpring;
	}
}
