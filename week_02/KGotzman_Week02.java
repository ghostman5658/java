

// Kye Gotzman 10/26/2021 Module 2.2
// Purpose of the code is to compute the energy required to heat water
// Liang, D. 2020. Introduction to Java 
// Programming and Data Structures Comprehensive Version. 
// Pearson Education, Inc. Hoboken, NJ.

import java.util.Scanner; // Scanner is in the java.util package

public class KGotzman_Week02 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Print welcome message
		System.out.println("Welcome to Water World Calculations");
		
		// Prompt user for water weight in kilograms
		System.out.println("Enter how many kilograms of water you want to heat: ");
		double waterMass = input.nextDouble();
		
		// Prompt user for starting water temperature
		System.out.println("Enter the starting temperature of the water you want to heat in celsius: ");
		double initialTemperature = input.nextDouble(); 
		
		// Prompt user for final water temperature 
		System.out.println("Enter the final temperature of the water you want to heat in Celsius: ");
		double finalTemperature = input.nextDouble(); 
		
		// Calculate the energy required to heat water
		double energy = waterMass * (finalTemperature - initialTemperature) * 4184;
		
		// Display the results
		System.out.println("The amount of energy needed to heat " + waterMass + " kilograms of water from " +
		initialTemperature + " degrees Celsius to " + finalTemperature + " degrees Celsius is " + energy + " joules");

	}
}
