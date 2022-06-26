/*
Kye Gotzman 1/15/2022 Module 2.2
Purpose of the code is to create a collection of objects
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

import java.util.*;

public class KGotzman_Week_02 {

	public static void main(String[] args) {
		// Test method used to create three objects of the class fan
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		Fan fan3 = new Fan(); //uses default variable values
		
		fan1.setSpeed(Fan.MEDIUM);
		fan1.setRadius(15);
		fan1.setColor("Blue");
		fan1.setFanOn(true);
		
		fan2.setSpeed(Fan.SLOW);
		fan2.setRadius(10);
		fan2.setColor("Red");
		fan2.setFanOn(true);
		
		//create a collection and then add the objects to the collection
		ArrayList<Fan> fans = new ArrayList<Fan>();
		
		//add fan objects to the collection
		fans.add(fan1);
		fans.add(fan2);
		fans.add(fan3);
		
		//create DisplayFans instance
		DisplayFans display1 = new DisplayFans();
		
		//call method to show entire fan collection
		display1.showFans(fans);
		
		//call method to show single fan object
		display1.showFan(fan1);

	}

}

class DisplayFans {
	
	//method for displaying entire fan collection
	public void showFans(ArrayList collection) {
		System.out.println("\nDisplaying Fan Collection: \n");
		for (int i = 0; i < collection.size(); i++) {
			System.out.println("Fan: " + i);
			System.out.println(collection.get(i));
		}
		
	}
	
	//method for displaying single fan object
	public void showFan(Object fan) {
		System.out.println("\nDisplaying single fan: ");
		System.out.println(fan);
	}
}


class Fan {
	public static final int STOPPED = 0;
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan() {
		speed = STOPPED;
		on = false;
		radius = 6;
		color = "white";
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isFanOn() {
		return on;
	}
	
	public void setFanOn(boolean on) {
		this.on = on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String description = "";
		if (on == true && speed != STOPPED) {
			description += "\n\tThe fan is on" + "\n\tIts speed is " + speed + "\n\tIts radius is " + radius + "\n\tIts color is " + color;
		}
		else {
			description += "\n\tThe fan is off " + "\n\tIts speed is " + speed + "\n\tIts radius is " + radius + "\n\tIts color is " + color;
		}
		return description;
	}
	
}


