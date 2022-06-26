package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowHBoxVBox extends Application {

	@Override //override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create a border pane
		BorderPane pane = new BorderPane();
		
		// place nodes in the pane
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowHBoxVBox"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
		
		
	}
	
	private HBox getHBox() {
		HBox hBox = new HBox(15); // HBox(spacing between nodes)
		hBox.setPadding(new Insets(15, 15, 15, 15)); // Insets(top, right, bottom, left)
		hBox.setStyle("-fx-background-color: gold");
		hBox.getChildren().add(new Button("Computer Science"));
		hBox.getChildren().add(new Button("Chemistry"));
		ImageView imageView = new ImageView(new Image("http://liveexample.pearsoncmg.com/book/image/us.gif"));
		hBox.getChildren().add(imageView);
		return hBox;
	}
	
	private VBox getVBox() {
		VBox vBox = new VBox(15); // VBox(spacing between nodes)
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Courses"));
		
		Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"), new Label("CSCI 3720")};
		
		for (Label course: courses) {
			VBox.setMargin(course, new Insets(0, 0, 0, 15));
			vBox.getChildren().add(course);
		}
		
		return vBox;
	}

}
