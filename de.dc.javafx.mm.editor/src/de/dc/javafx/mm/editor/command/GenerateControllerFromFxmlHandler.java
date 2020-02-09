package de.dc.javafx.mm.editor.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.dc.javafx.mm.editor.dialog.GenerateCodeByFxmlDialog;

public class GenerateControllerFromFxmlHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		GenerateCodeByFxmlDialog dialog = new GenerateCodeByFxmlDialog();
		dialog.open();
		return null;
	}
}
