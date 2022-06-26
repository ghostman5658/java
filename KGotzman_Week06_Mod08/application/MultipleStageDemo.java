package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MultipleStageDemo extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) {
		// create a scene and place a button in the scene
		Scene scene = new Scene(new Button("OK"), 200, 250);
		primaryStage.setTitle("My JavaFX"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
		
		Stage stage = new Stage(); // create a new stage
		stage.setTitle("Second Stage"); // set the stage title
		// set a scene with a button in the stage
		stage.setScene(new Scene(new Button("NewStage"), 200, 250));
		stage.show(); // Display the stage	
	}
}
