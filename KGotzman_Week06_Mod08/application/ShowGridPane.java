package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ShowGridPane extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); // Insets(top, right, bottom, left)
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		// Place nodes in the pane
		pane.add(new Label("First Name:"), 0, 0); // Label("StringInput"), column#, row#)
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("MI:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		Button btAdd = new Button("Add Name");
		pane.add(btAdd, 1, 3);
		GridPane.setHalignment(btAdd, HPos.RIGHT);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane); // place the pane in the scene
		primaryStage.setTitle("ShowGridPane"); // set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // display the stage
	}
}
