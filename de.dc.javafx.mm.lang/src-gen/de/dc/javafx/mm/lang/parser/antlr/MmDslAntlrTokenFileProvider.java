/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.mm.lang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MmDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/dc/javafx/mm/lang/parser/antlr/internal/InternalMmDsl.tokens");
	}
}
