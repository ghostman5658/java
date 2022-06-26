/*
Kye Gotzman 11/20/2021 Module 8.2
Purpose of the code is to check if a password meets the requirements
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/


import java.util.Scanner;

public class KGotzman_Week08 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		//initialize variables
		double oneP = 35.00;
		double twoP = 80.00;
		double threeP = 30.00;
		
		// display service options and prompt user to make a selection
		System.out.println("-- Welcome to Kyle's Car Service --"
				+ "\n\tOption (1): Standard Service"
				+ "\n\tOption (2): Standard Service and Oil Change"
				+ "\n\tOption (3): Standard Service, Oil Change, and Tire Rotation"
				+ "\n\tOption (4): Standard Service, Oil Change, Tire Rotation, and Coupon"
				+ "\n\nPlease choose a service package: ");
		int userSelection = input.nextInt();
		
		for (int count = 0; count < 2; count ++) {
			if (userSelection == 1)
				yearlyService();
			
			else if (userSelection == 2) {
				System.out.println("The total cost of option " + userSelection + " is $" + yearlyService(oneP));
			}
			
			else if (userSelection == 3) {
				System.out.println("The total cost of option " + userSelection + " is $" + yearlyService(oneP, twoP));
			}
			
			else if (userSelection == 4) {
				System.out.println("The total cost of option " + userSelection + " is $" + yearlyService(oneP, twoP, threeP));
			}
		}
	}
	
	
	/** create class for standard service */
	public static void yearlyService() {
		System.out.println("Your total cost is $55.00");
	}
	
	
	/** create class for standard service and oil change */
	public static double yearlyService(double oneP) {
		return 55.00 + oneP; 
	}
	
	
	/** create class for standard service, oil change, and tire rotation */
	public static double yearlyService(double oneP, double twoP) {
		return 55.00 + oneP + twoP;
	}
	
	
	/** create class for standard service, oil change, tire rotation, and coupon */
	public static double yearlyService(double oneP, double twoP, double threeP) {
		return 55.00 + oneP + twoP - threeP;
	}

}
