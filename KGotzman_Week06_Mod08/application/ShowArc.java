package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class ShowArc extends Application {

	@Override //override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create an Arc
		Arc arc1 = new Arc(150, 100, 80, 80, 30, 35); // Arc(centerX, centerY, radiusX, radiusY, startAngle, length)
		arc1.setFill(Color.RED); // set fill color
		arc1.setType(ArcType.ROUND); // set arc type
		
		Arc arc2 = new Arc(150, 100, 80, 80, 30 + 90, 35);
		arc2.setFill(Color.WHITE);
		arc2.setType(ArcType.OPEN);
		arc2.setStroke(Color.BLACK);
		
		Arc arc3 = new Arc(150, 100, 80, 80, 30 + 180, 35);
		arc3.setFill(Color.WHITE);
		arc3.setType(ArcType.CHORD);
		arc3.setStroke(Color.BLACK);
		
		Arc arc4 = new Arc(150, 100, 80, 80, 30 + 270, 35);
		arc4.setFill(Color.GREEN);
		arc4.setType(ArcType.CHORD);
		arc4.setStroke(Color.BLACK);
		
		// create a group and add nodes to the group
		Group group = new Group();
		group.getChildren().addAll(new Text(210, 40, "arc1: round"), arc1, // Text(x, y, String)
		new Text(20, 40, "arc2: open"), arc2,
		new Text(20, 170, "arc3: chord"), arc3,
		new Text(210, 170, "arc4: chord"), arc4);
		
		// create a scene and place it in the stage
		Scene scene = new Scene(new BorderPane(group), 300, 200); // Scene(node or pane, width, height) 
		primaryStage.setTitle("ShowArc"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage 	
	}
}
