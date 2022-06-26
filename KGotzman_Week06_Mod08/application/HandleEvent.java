package application;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.*;
import javafx.event.*;

public class HandleEvent extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create a pane and set its properties
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
		OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction(handler1);
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		pane.getChildren().addAll(btOK, btCancel);
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Handle Event"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
	}
}

class OKHandlerClass implements EventHandler<ActionEvent> {
	@Override
	public void handle (ActionEvent e) {
		System.out.println("OK button clicked");
	}
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Cancel button clicked");
	}
}