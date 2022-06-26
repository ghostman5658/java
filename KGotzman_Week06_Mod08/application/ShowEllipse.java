package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

public class ShowEllipse extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create a scene and place it in the stage
		Scene scene = new Scene(new MyEllipse(), 300, 200);
		primaryStage.setTitle("ShowEllipse"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
	}
}

class MyEllipse extends Pane {
	private void paint() {
		getChildren().clear();
		for (int i = 0; i < 16; i++) {
			// create an ellipse and add it to pane
			Ellipse e1 = new Ellipse(getWidth() / 2, getHeight() / 2, getWidth() / 2 - 50, getHeight() / 2 - 50); // Ellipse(centerX, centerY, radiusX, radiusY)
			e1.setStroke(Color.color(Math.random(), Math.random(), Math.random())); 
			e1.setFill(Color.WHITE);
			e1.setRotate(i * 180 / 16);
			getChildren().add(e1);
		}
	}
	
	@Override
	public void setWidth(double widdth) {
		super.setWidth(widdth);
		paint();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}
