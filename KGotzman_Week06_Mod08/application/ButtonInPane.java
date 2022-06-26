package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create a scene and place a button in the scene 
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in pane"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage 
		primaryStage.show(); // display the stage
		
	}
 
}
