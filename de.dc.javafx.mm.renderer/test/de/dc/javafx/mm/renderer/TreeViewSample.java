package de.dc.javafx.mm.renderer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.dc.javafx.mm.control.viewer.TreeViewer;
import de.dc.javafx.mm.control.viewer.provider.IContentProvider;
import de.dc.javafx.mm.control.viewer.provider.ILabelProvider;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class TreeViewSample extends Application {
 
    Employee root = new Employee(null, "root", "toot");
    
    List<Employee> employees = Arrays.<Employee>asList(
            new Employee(root, "Ethan Williams", "Sales Department"),
            new Employee(root, "Emma Jones", "Sales Department"),
            new Employee(root, "Michael Brown", "Sales Department"),
            new Employee(root, "Anna Black", "Sales Department"),
            new Employee(root, "Rodger York", "Sales Department"),
            new Employee(root, "Susan Collins", "Sales Department"),
            new Employee(root, "Mike Graham", "IT Support"),
            new Employee(root, "Judy Mayer", "IT Support"),
            new Employee(root, "Gregory Smith", "IT Support"),
            new Employee(root, "Jacob Smith", "Accounts Department"),
            new Employee(root, "Isabella Johnson", "Accounts Department"));
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
    	TreeViewer<de.dc.javafx.mm.control.viewer.model.Node> treeViewer = new TreeViewer<>();
    	treeViewer.setLabelProvider(new ILabelProvider<de.dc.javafx.mm.control.viewer.model.Node>() {
			
			@Override
			public String getText(de.dc.javafx.mm.control.viewer.model.Node element) {
				return element.getName();
			}
			
			@Override
			public Image getImage(de.dc.javafx.mm.control.viewer.model.Node element) {
				// TODO Auto-generated method stub
				return null;
			}
		});
    	treeViewer.setContentProvider(new IContentProvider<de.dc.javafx.mm.control.viewer.model.Node>() {
			
			@Override
			public boolean hasChildren(de.dc.javafx.mm.control.viewer.model.Node input) {
				return !input.getChildren().isEmpty();
			}
			
			@Override
			public de.dc.javafx.mm.control.viewer.model.Node getParent(de.dc.javafx.mm.control.viewer.model.Node input) {
				return input.getParent();
			}
			
			@Override
			public List<de.dc.javafx.mm.control.viewer.model.Node> getElements(de.dc.javafx.mm.control.viewer.model.Node input) {
				return new ArrayList<>();
			}
			
			@Override
			public List<de.dc.javafx.mm.control.viewer.model.Node> getChildren(de.dc.javafx.mm.control.viewer.model.Node input) {
				return input.getChildren();
			}
		});
    	treeViewer.setInput(root);
    	
        stage.setTitle("Tree View Sample");
        VBox box = new VBox();
        final Scene scene = new Scene(box, 400, 300);
        scene.setFill(Color.LIGHTGRAY);
 
        box.getChildren().add(treeViewer);
        stage.setScene(scene);
        stage.show();
    }
 
    public static class Employee extends de.dc.javafx.mm.control.viewer.model.Node{

    	private String department;
    	
		public Employee(de.dc.javafx.mm.control.viewer.model.Node parent, String name, String deparment) {
			super(parent);
			setName(name);
			setDepartment(deparment);
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
    }
}