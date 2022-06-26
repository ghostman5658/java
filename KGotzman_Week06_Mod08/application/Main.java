
/*
Kyle Gotzman 2/12/2022 Module 8.2 
Purpose of the code is to display four randomly generated playing cards inside of a GUI
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 


public class Main extends Application {

	@Override // override the start method in the application class
	public void start(Stage primaryStage) throws Exception {
		
		// create a pane to hold the image views 
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		// get four random number using the getRandomCard method -> use the number to get the png file -> create an image, assign it to an ImageView and then assign the view to the pane
		for (int i = 0; i <= 3; i++) {
			pane.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("cards/" +
				getRandomCard() + ".png")))); 
		}	
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane, Color.LIGHTSKYBLUE);
		primaryStage.setTitle("KGotzman Module 8.2"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
		
		 
	}
	
	// method for getting a random number from 1-52
	public int getRandomCard() {
		int randomNumber = (int) (Math.random() * 52 + 1);
		return randomNumber;
	}

}
 