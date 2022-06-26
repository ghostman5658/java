
/*
Kye Gotzman 1/25/2022 Module 5.2 Program 1
Purpose of the code is to create an array list and then use an exception
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

import java.util.ArrayList;
import java.util.Scanner;

public class KGotzman_Module_05_P1 {
	
	// Main methed
	public static void main(String[] args) {
		
		ArrayList<String> movies = new ArrayList<String>();
		
		movies.add("1. Saving Private Ryan");
		movies.add("2. Bravehear");
		movies.add("3. Gladiator");
		movies.add("4. We Were Soldies");
		movies.add("5. Troy");
		movies.add("6. Inception");
		movies.add("7. Interstellar");
		movies.add("8. Christmas Vacation");
		movies.add("9. The Lord of The Rings");
		movies.add("10. Harry Potter");
				
				
		// prompt the user to select from a list of movies.
		System.out.println("Enter the coresponding number for the movie you would like to watch?\n" + 
		"For example you can enter '1' to watch Saving Private Ryan\n");
			
		// Use a for each loop to print the array list
		for(String i : movies) {
			System.out.println(i);
		}
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		int selection = -1;
		boolean done = true;
		
		while (done) {
			try {
				selection = input.nextInt();
				selection--;
				done = false;
			}
			catch (Exception e) {
				System.out.println("Invalid Entry, please try again");
				input.next();
			}
			
		}
		
		try {
			System.out.println("The movie you selected is " + movies.get(selection));
		}
		catch (Exception e) {
			System.out.println("Out of Bounds");
		}
	}
}











