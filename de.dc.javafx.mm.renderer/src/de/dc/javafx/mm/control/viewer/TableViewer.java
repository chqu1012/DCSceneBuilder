package de.dc.javafx.mm.control.viewer;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

import de.dc.javafx.mm.control.viewer.provider.IContentProvider;
import de.dc.javafx.mm.control.viewer.provider.ILabelProvider;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class TableViewer<T> extends TableView<T> implements IViewer<T>{

	private ObservableList<T> input = FXCollections.observableArrayList();
	private FilteredList<T> filteredInput = new FilteredList<>(input);
	private SortedList<T> sortedInput = new SortedList<>(filteredInput);
	private IContentProvider contentProvider;
	private ILabelProvider labelProvider;
	
	public TableViewer() {
		setItems(sortedInput);
	}

	@Override
	public void setLabelProvider(ILabelProvider<T> labelProvider) {
		this.labelProvider = labelProvider;
	}

	@Override
	public void setContentProvider(IContentProvider<T> contentProvider) {
		this.contentProvider = contentProvider;
	}

	@Override
	public void setInput(T input) {
		this.input.clear();
		if (input instanceof List) {
			List list = (List) input;
			this.input.addAll(list);
		}
	}
	
	public void addColumn(String name, String property, ILabelProvider provider) {
		TableColumn column = new TableColumn<>(name);
		column.setMinWidth(200);
		getColumns().add(column);
		
		column.setCellValueFactory(new PropertyValueFactory<>(property));
		column.setCellFactory(param -> new TableCell() {
			@Override
			protected void updateItem(Object item, boolean empty) {
				super.updateItem(item, empty);
				if (item==null || empty) {
					setText(null);
					setGraphic(null);
				}else {
					HBox value = new HBox(5.0d);
					System.out.println(item);
					String content = Optional.of(provider.getText(item)).orElse(StringUtils.EMPTY);
					if(provider.getImage(item)!=null) {
						value.getChildren().add(new ImageView(provider.getImage(item)));
					}
					value.getChildren().add(new Label(content));
					setGraphic(value);
				}
			}
		});
	}
}
