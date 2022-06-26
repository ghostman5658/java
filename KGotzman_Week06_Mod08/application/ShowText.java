package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class ShowText extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// Create a pane to hold the texts
		Pane pane = new Pane();
		pane.setPadding(new Insets(5, 5, 5, 5)); // Insets(top, right, bottom, left)
		Text text1 = new Text(20, 20, "Programming is fun"); // Text(x, y, text string)
		text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
		pane.getChildren().add(text1);
		
		Text text2 = new Text(60, 60, "Programming is fun\nDisplay text");
		pane.getChildren().add(text2);
		
		Text text3 = new Text(10, 100, "Programming is fun\nDisplay text");
		text3.setFill(Color.RED);
		text3.setUnderline(true);
		text3.setStrikethrough(true);
		pane.getChildren().add(text3);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowText"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
	}
}
