package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

	@Override //override start method in the application class
	public void start(Stage primaryStage) throws Exception {
		// create a pane to hold the circle
		Pane pane = new Pane();
		
		// create a circle and sets its properties
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2)); 
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle); // add circle to the pane
		
		// create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("ShowCircleCentered"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
		
	}

}
