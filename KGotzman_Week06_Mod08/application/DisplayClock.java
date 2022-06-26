package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class DisplayClock extends Application {

	@Override // override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// create a clock and a label
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);
		
		// place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		
		// create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250); // put the pane in the scene
		primaryStage.setTitle("DisplayClock"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		primaryStage.show(); // display the stage
	}
}

class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;
	
	// construct a default clock with the current time
	public ClockPane() {
		setCurrentTime();
	}
	
	// construct a clock with specified hour, minute, and second
	public ClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// return hour
	public int getHour() {
		return hour;
	}
	
	// set a new hour
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}
	
	//return minute
	public int getMinute() {
		return minute;
	}
	
	// set a new minute
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}
	
	// return second
	public int getSecond() {
		return second;
	}
	
	// set a new second
	public void setSecond() {
		this.second = second;
		paintClock();
	}
	
	// set the current time for the clock
	public void setCurrentTime() {
		// construct a calendar for the current date and time
		Calendar calendar = new GregorianCalendar();
		
		// set current hour, minute and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		
		paintClock(); // repaint the clock
	}
	
	//paint the clock
	private void paintClock() {
		// initialize clock parameters
		double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
		double centerX = getWidth() / 2;
		double centerY = getHeight() / 2;
		
		// draw circle
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
		
		// draw second hand
		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);
		
		// draw minute hand
		double mLength = clockRadius * 0.65;
		double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);
		
		// draw hour hand
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);
		
		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
	}
	
	@Override 
	public void setWidth(double width) {
		super.setWidth(width);
		paintClock();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paintClock();
	}
}












































