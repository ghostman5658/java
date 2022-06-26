
/*
Kye Gotzman 1/17/2022 Module 3.2
Purpose of the code is to test the integer class
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

import java.util.Scanner;

public class TestKyleInteger {

	public static void main(String[] args) {
		// create scanner for additional testing
		Scanner input = new Scanner(System.in);
		
		int testvalue1 = 514;
		int testvalue2 = 514;
		int testvalue3 = 3;
		
		System.out.print("Please inter an integer: ");
		int testvalue4 = input.nextInt();
		
		// create 4 objects, 2 with the same value and 1 with a different value and 1 taken from the user 
		/**(not part of the assignment just wanted to mess around with some additional practice)*/
		KyleInteger testint1 = new KyleInteger(testvalue1);
		KyleInteger testint2 = new KyleInteger(testvalue2);
		KyleInteger testint3 = new KyleInteger(testvalue3);
		KyleInteger testint4 = new KyleInteger(testvalue4);
		
		// test for int 1
		String testresult1 = "";
		
		if (testint1.isEven()) {
			testresult1 += "is Even ";
		}
		else if (testint1.isOdd()) {
			testresult1 += "is Odd ";
		}
		if (testint1.isPrime()) {
			testresult1 += " is Prime ";
		}
		if (testint1.equals(testint2)) {
			testresult1 += "and int 1 is equal to int 2";
		}
		else if (!testint1.equals(testvalue2)) {
			testresult1 += "and int 1 is not equal to int 2";
		}
		
		// test for int 2
		String testresult2 = "";
				
		if (testint2.isEven()) {
			testresult2 += "is Even ";
		}
		else if (testint2.isOdd()) {
			testresult2 += "is Odd ";
		}
		if (testint2.isPrime()) {
			testresult2 += " is Prime ";
		}
		if (testint2.equals(testint3)) {
			testresult2 += "and int 2 is equal to int 3";
		}
		else if (!testint2.equals(testvalue3)) {
			testresult2 += "and int 2 is not equal to int 3";
		}
		
		// test for int 3
		String testresult3 = "";
						
		if (testint3.isEven()) {
			testresult3 += "is Even ";
		}
		else if (testint3.isOdd()) {
			testresult3 += "is Odd ";
		}
		if (testint3.isPrime()) {
			testresult3 += " is Prime ";
		}
		if (testint3.equals(testint4)) {
			testresult3 += "and int 3 is equal to int 4";
		}
		else if (!testint3.equals(testvalue4)) {
			testresult3 += "and int 3 is not equal to int 4";
		}
		
		// test for int 4
		String testresult4 = "";
						
		if (testint4.isEven()) {
			testresult4 += "is Even ";
		}
		else if (testint4.isOdd()) {
			testresult4 += "is Odd ";
		}
		if (testint4.isPrime()) {
			testresult4 += " is Prime ";
		}
		if (testint4.equals(testint1)) {
			testresult4 += "and int 4 is equal to int 1";
		}
		else if (!testint4.equals(testvalue1)) {
			testresult4 += "and int 4 is not equal to int 1";
		}
		
		System.out.println(testresult1);
		System.out.println(testresult2);
		System.out.println(testresult3);
		System.out.println(testresult4);

	}

}


















