/*
Kye Gotzman 12/9/2021 Module 10.2
Purpose of the code is to use an overloaded method to test different arrays
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

import java.util.Scanner;

public class KGotzman_Week10 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		
		// prompt user to input short elements then call overloaded method (short array)
		short[] shortValues = new short[5];
        System.out.println("Please enter 5 short values: ");

        for (int i = 0; i < 5; i++) {
            shortValues[i] = input.nextShort();
        }
        short shortPrint = average(shortValues);
        System.out.println("The short values you entered were: ");
        for (int i = 0; i < shortValues.length; i++) {
        	System.out.print(shortValues[i] + " ");
        }
        System.out.println("\nThe average of the short values you entered is: " + shortPrint);
        
        
        // prompt user to input int elements then call overloaded method (int array)
     	int[] intValues = new int[6];
        System.out.println("Please enter 6 int values: ");

        for (int i = 0; i < 6; i++) {
        intValues[i] = input.nextInt();
        }
        int intPrint = average(intValues);
        System.out.println("The int values you entered were: ");
        for (int i = 0; i < intValues.length; i++) {
        	System.out.print(intValues[i] + " ");
        }
        System.out.println("\nThe average of the int values you entered is: " + intPrint);
        
        
     // prompt user to input long elements then call overloaded method (long array)
     	long[] longValues = new long[7];
        System.out.println("Please enter 7 long values: ");

        for (int i = 0; i < 7; i++) {
        longValues[i] = input.nextLong();
        }
        long longPrint = average(longValues);
        System.out.println("The long values you entered were: ");
        for (int i = 0; i < longValues.length; i++) {
        	System.out.print(longValues[i] + " ");
        }
        System.out.println("\nThe average of the long values you entered is: " + longPrint);
        
        
		//prompt user to input double elements then call overloaded method (double array)
		double[] doubleValues = new double[8];
        System.out.println("Please enter 8 double values: ");

        for (int i = 0; i < 8; i++) {
            doubleValues[i] = input.nextDouble();
        }
        double doublePrint = average(doubleValues);
        System.out.println("The double values you entered were: ");
        for (int i = 0; i < doubleValues.length; i++) {
        	System.out.print(doubleValues[i] + " ");
        }
        System.out.println("\nThe average of the double values you entered is: " + doublePrint);
        
        
	}
	
	public static short average(short[] array) {
		int arrayInputs = array.length;
		short arrayTotal = 0;
		
		for (int i = 0; i < arrayInputs; i++) {
			arrayTotal += array[i];
		}
		
		short average = (short) (arrayTotal / arrayInputs);
		return average;
	}
	
	public static int average(int[] array) {
		int arrayInputs = array.length;
		int arrayTotal = 0;
		
		for (int i = 0; i < arrayInputs; i++) {
			arrayTotal += array[i];
		}
		
		int average = arrayTotal / arrayInputs;
		return average;
	}
	
	public static long average(long[] array) {
		int arrayInputs = array.length;
		long arrayTotal = 0;
		
		for (int i = 0; i < arrayInputs; i++) {
			arrayTotal += array[i];
		}
		
		long average = (long) (arrayTotal / arrayInputs);
		return average;
	}
	
	public static double average(double[] array) {
		int arrayInputs = array.length;
		double arrayTotal = 0;
		
		for (int i = 0; i < arrayInputs; i++) {
			arrayTotal += array[i];
		}
		
		double average = (double) (arrayTotal / arrayInputs);
		return average;
	}

}
