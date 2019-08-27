/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.mm.lang.ide

import com.google.inject.Guice
import de.dc.javafx.mm.lang.MmDslRuntimeModule
import de.dc.javafx.mm.lang.MmDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MmDslIdeSetup extends MmDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MmDslRuntimeModule, new MmDslIdeModule))
	}
	
}
