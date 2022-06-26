
/*
Kye Gotzman 1/8/2022 Module 1.2
Purpose of the code is to create a class called Fan and then test it by creating two objects
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

public class KGotzman_Week_01 {

	public static void main(String[] args) {
		// Test method used to create two objects of the class fan
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(Fan.MEDIUM);
		fan1.setRadius(15);
		fan1.setColor("Blue");
		fan1.setFanOn(true);
		
		fan2.getSpeed();
		fan2.getRadius();
		fan2.getColor();
		fan2.isFanOn();
		
		System.out.println("Fan 1 description: " + fan1.toString());
		System.out.println("Fan 2 description: " + fan2.toString());
		
		System.out.println("Fan 2 " + fan2.getSpeed() + "\nFan 1 " + fan1.getSpeed());

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














