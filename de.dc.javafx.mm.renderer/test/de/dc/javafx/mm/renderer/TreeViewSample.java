package de.dc.javafx.mm.renderer;
import java.util.Arrays;
import java.util.List;

import de.dc.javafx.mm.control.viewer.TreeViewer;
import de.dc.javafx.mm.control.viewer.model.Node;
import de.dc.javafx.mm.control.viewer.provider.NodeContentProvider;
import de.dc.javafx.mm.control.viewer.provider.NodeLabelProvider;
import javafx.application.Application;
import javafx.scene.Scene;
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
    	TreeViewer<Node> treeViewer = new TreeViewer<>();
    	treeViewer.setLabelProvider(new NodeLabelProvider());
    	treeViewer.setContentProvider(new NodeContentProvider());
    	treeViewer.setInput(root);
    	
        stage.setTitle("Tree View Sample");
        VBox box = new VBox();
        final Scene scene = new Scene(box, 400, 300);
        scene.setFill(Color.LIGHTGRAY);
 
        box.getChildren().add(treeViewer);
        stage.setScene(scene);
        stage.show();
    }
 
    public static class Employee extends Node{

    	private String department;
    	
		public Employee(Node parent, String name, String deparment) {
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