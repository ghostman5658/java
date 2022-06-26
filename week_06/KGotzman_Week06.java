/*
Kye Gotzman 11/13/2021 Module 6.2
Purpose of the code is to use a nested for loop to create a number pyramid
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/


public class KGotzman_Week06 {

	public static void main(String[] args) {
		
		// initialize variables
		int new_number = 0, number_rows = 6;
		
		//create outer loop
        for (int center_number = 1; center_number <= 64; center_number += center_number) {
        	
        	// create inner loop for white space on left side
            for (int spaceL = 0; spaceL < number_rows; spaceL++) {
                System.out.print("   ");
            }
            
            // create inner loop for left side of pyramid
            for (int left_number = 1; left_number <= center_number; left_number += left_number) {
                System.out.printf("%3d", (left_number));
            }
            
            // create inner loop for right side of pyramid
            for (int right_number = new_number; right_number > 0; right_number /= 2) {
                System.out.printf("%3d", (right_number)); 
            }
            
            // create inner loop for white space on right side
            for (int spaceR = 0; spaceR < number_rows; spaceR++) {
            	System.out.print("   ");
            }
            
            // print right aligned @ symbol
            System.out.print(" @");
            
            // reassign the value of the temp_number
            new_number = center_number;
            
            // decrease row count
            --number_rows;
            
            // create new line
            System.out.println();
            System.out.println();
        }
	}
}
