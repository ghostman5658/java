/*
Kye Gotzman 11/6/2021 Module 4.2
Purpose of the code is to evaluate if string 1 is a substring of string 2 and vice versa
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

import java.util.Scanner;

public class KGotzman_Week04 {

	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for first string
		System.out.println("Enter a sentence and press enter: ");
		String str1 = input.nextLine();
		
		// prompt user for second string
		System.out.println("Enter another sentence and press enter: ");
		String str2 = input.nextLine();
		
		// check if string 1 is a substring of string 2 and vice versa, then display results
		if (str1.equals(str2))
			System.out.println("The two sentences are identical");
		
		else if (str1.contains(str2))
			System.out.println("Your second string is a substring of your first");
		
		else if (str2.contains(str1))
			System.out.println("Your first sentence is a substring of your second.");
		
		else
			System.out.println("Neither sentence is a substring of the other.");

	}

}
