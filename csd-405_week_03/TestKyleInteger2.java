
/*
Kye Gotzman 1/17/2022 Module 3.2
Purpose of the code is to test the integer class
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class TestKyleInteger2 {

	public static void main(String[] args) {
		// create scanner for additional testing
		Scanner input = new Scanner(System.in);
		
		Integer testvalue1 = 514;
		Integer testvalue2 = 514;
		Integer testvalue3 = 3;
		
		System.out.print("Please inter an integer: ");
		Integer testvalue4 = input.nextInt();
		
		// create 4 objects, 2 with the same value and 1 with a different value and 1 taken from the user 
		/**(not part of the assignment just wanted to mess around with some additional practice)*/
		KyleInteger testint1 = new KyleInteger(testvalue1);
		KyleInteger testint2 = new KyleInteger(testvalue2);
		KyleInteger testint3 = new KyleInteger(testvalue3);
		KyleInteger testint4 = new KyleInteger(testvalue4);
		
		ArrayList<KyleInteger> tests = new ArrayList<KyleInteger>();
		tests.add(testint1);
		tests.add(testint2);
		tests.add(testint3);
		tests.add(testint4);
		
		for (int i = 0; i < tests.size(); i++) {
			int j = i + 1;
			String str = "";
			if (tests.get(i).isEven()) {
				str += " index " + i + " is even";
			}
			if (tests.get(i).isOdd()) {
				str += " index " + i + " is odd";
			}
			if (tests.get(i).isPrime()) {
				str += " index " + i + " is prime";
			}
			try {
				if (tests.get(i).equals(tests.get(j))) {
					str += " and index " + i + " is equal to " + j; 
				}
				else 
					str += " and index " + i + " is not equal to " + j;
			}
			catch (Exception e) {
				str += " no more test items";
			}
			
			System.out.println("Test " + j + " " + str);
		}
	}
}


















