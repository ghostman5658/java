package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class ShowRectangle extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create rectangles
		Rectangle r1 = new Rectangle(25, 10, 60, 30); // Rectangle(x, y, width, height) 
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.WHITE);
		Rectangle r2 = new Rectangle(25, 50, 60, 30);
		Rectangle r3 = new Rectangle(25, 90, 60, 30);
		r3.setArcWidth(15); // arcWidth is the horizontal diameter of the arcs at the corner
		r3.setArcHeight(25); // arcHeight is the vertical diameter of the arcs at the corner
		
		
		// create a group and add nodes to the group
		Group group = new Group();
		group.getChildren().addAll(new Text(10, 27, "r1"), r1, new Text(10, 67, "r2"), r2, new Text(10, 107, "r3"), r3); // Text(x, y, String)
		
		for (int i = 0; i < 4; i++) {
			Rectangle r = new Rectangle(100, 50, 100, 30);
			r.setRotate(i * 360 / 8);
			r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			r.setFill(Color.WHITE);
			group.getChildren().add(r);
		}
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(new BorderPane(group), 250, 150);
		primaryStage.setTitle("ShowRectangle"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
	}

}
