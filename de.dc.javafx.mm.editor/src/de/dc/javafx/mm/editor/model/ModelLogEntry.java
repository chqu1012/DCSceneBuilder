package de.dc.javafx.mm.editor.model;

import java.time.LocalDateTime;

import org.eclipse.emf.ecore.EObject;

public class ModelLogEntry {

	private LocalDateTime timestamp;
	private String message;
	private EObject node;

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EObject getNode() {
		return node;
	}

	public void setNode(EObject node) {
		this.node = node;
	}
}