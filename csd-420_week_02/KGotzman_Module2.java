/*
Kye Gotzman 3/24/2022 Module 2.2 Program
Purpose of the code is to use recursion to sum three different test cases
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/


public class KGotzman_Module2 {
	
	public static double total(double i) {
		if (i == 0) // base case
			return i / (i + 1);
		else
			return i / (i + 1) + total(i -1); // recursive call
	}

	public static void main(String[] args) {
		double test1 = total(4);
		double test2 = total(9);
		double test3 = total(14);
		
		System.out.println("The recursive total of 4/5 is " + test1);
		System.out.println("\nThe recursive total of 9/10 is " + test2);
		System.out.println("\nThe recursive total of 14/15 is " + test3); 
	}
}




