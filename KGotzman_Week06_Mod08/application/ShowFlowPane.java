package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ShowFlowPane extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create a pane and set its properties
		FlowPane pane = new FlowPane(); 
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setHgap(5);
		pane.setVgap(5);
		
		// place nodes in the pane
		pane.getChildren().addAll(new Label("First Name: "), 
				new TextField(), new Label("MI: "));
		TextField tfMI = new TextField();
		tfMI.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMI, new Label("Last Name: "), new TextField());
		
		// create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 250);		
		primaryStage.setTitle("ShowFlowPane"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
	}
}
