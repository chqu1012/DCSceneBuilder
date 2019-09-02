package de.dc.javafx.mm.di;

import com.google.inject.AbstractModule;

import de.dc.javafx.mm.renderer.FxmlRenderer;

public class EmfModul extends AbstractModule {

	@Override
	protected void configure() {
		bind(FxmlRenderer.class).asEagerSingleton();
	}
}
