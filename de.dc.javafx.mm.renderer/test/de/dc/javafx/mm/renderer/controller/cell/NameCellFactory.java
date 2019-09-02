package de.dc.javafx.mm.renderer.controller.cell;

import de.dc.javafx.mm.renderer.model.Person;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class NameCellFactory implements Callback<TableColumn<Person, String>, TableCell<Person, String>>{

	@Override
	public TableCell<Person, String> call(TableColumn<Person, String> param) {
		return new TableCell<Person, String>(){
			@Override
			protected void updateItem(String item, boolean empty) {
				super.updateItem(item, empty);
				if (item==null || empty) {
					setText(null);
				}else {
					setText(item);
				}
			}
		};
	}

}
