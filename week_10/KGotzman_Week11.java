/*
Kye Gotzman 12/16/2021 Module 11.2
Purpose of the code is to use a multidimensional array
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

import java.util.*;

public class KGotzman_Week11 {

	public static void main(String[] args) {
	//create scanner
	Scanner input = new Scanner(System.in);
	
	//declare a two dimensional array and then prompt the user to fill in the elements
	int[][] twoDimArray = new int[2][5];
	System.out.println("Please enter the first set of 5 numbers for the two dimensional array: ");
	
	for (int i = 0; i < 5; i++) {
		twoDimArray[0][i] = input.nextInt();
	}
	
	System.out.println("Please enter the second set of 5 numbers for the two dimensional array: ");
	
	for (int i = 0; i < 5; i++) {
		twoDimArray[1][i] = input.nextInt();
	}
	
	// copy the values of the (int) two dimensional array into a (double) two dimensional array
	double[][] dbleTwoDimArray = new double [2][5];
	dbleTwoDimArray[0][0] = twoDimArray[0][0];
	dbleTwoDimArray[0][1] = twoDimArray[0][1];
	dbleTwoDimArray[0][2] = twoDimArray[0][2];
	dbleTwoDimArray[0][3] = twoDimArray[0][3];
	dbleTwoDimArray[0][4] = twoDimArray[0][4];
	
	dbleTwoDimArray[1][0] = twoDimArray[1][0];
	dbleTwoDimArray[1][1] = twoDimArray[1][1];
	dbleTwoDimArray[1][2] = twoDimArray[1][2];
	dbleTwoDimArray[1][3] = twoDimArray[1][3];
	dbleTwoDimArray[1][4] = twoDimArray[1][4];
	
	// display the results
	System.out.println("The largest double is located at " + Arrays.toString(locateLargest(dbleTwoDimArray)));
	System.out.println("The largest integer is located at " + Arrays.toString(locateLargest(twoDimArray)));
	System.out.println("The smallest double is located at " + Arrays.toString(locateSmallest(dbleTwoDimArray)));
	System.out.println("The smallest integer is located at " + Arrays.toString(locateSmallest(twoDimArray)));
	
	}
	
	// method that returns the position of the largest double value
	public static int[] locateLargest(double[][] arrayParam) {
		int[] lrgDblInx = new int[2];
		double largest = Double.MIN_VALUE;
		
		for (int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] > largest) {
					largest = arrayParam[i][j];
					lrgDblInx[0] = i;
					lrgDblInx[1] = j;
				}
			}
		}
		return lrgDblInx;
	}

	// method that returns the position of the largest integer value
	public static int[] locateLargest(int[][] arrayParam) {
		int[] lrgIntInx = new int[2];
		int largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] > largest) {
					largest = arrayParam[i][j];
					lrgIntInx[0] = i;
					lrgIntInx[1] = j;
				}
			}
		}	
		return lrgIntInx;
	}
	// method that returns the position of the smallest double value
	public static int[] locateSmallest(double[][] arrayParam) {
		int[] smllDblInx = new int[2];
		double largest = Double.MAX_VALUE;
		
		for (int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] < largest) {
					largest = arrayParam[i][j];
					smllDblInx[0] = i;
					smllDblInx[1] = j;
				}
			}
		}
		return smllDblInx;
	}
	// method that returns the position of the smallest integer value
	public static int[] locateSmallest(int[][] arrayParam) {
		int[] smllIntInx = new int[2];
		int largest = Integer.MAX_VALUE;
		
		for (int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] < largest) {
					largest = arrayParam[i][j];
					smllIntInx[0] = i;
					smllIntInx[1] = j;
				}
			}
		}	
		return smllIntInx;
	}
}
