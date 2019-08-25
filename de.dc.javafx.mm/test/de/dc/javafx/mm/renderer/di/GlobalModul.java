package de.dc.javafx.mm.renderer.di;

import com.google.inject.AbstractModule;

import de.dc.javafx.mm.renderer.FxmlRenderer;

public class GlobalModul extends AbstractModule {

	@Override
	protected void configure() {
		bind(FxmlRenderer.class).asEagerSingleton();
	}
}
