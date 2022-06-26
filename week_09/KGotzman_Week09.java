/*
Kye Gotzman 12/4/2021 Module 10.2
Purpose of the code is use an array to process 20 integers
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

import java.util.Scanner;

public class KGotzman_Week09 {

	public static void main(String[] args) {
		// creat scanner
		Scanner input = new Scanner(System.in);
		
		//init array
		int [] integer_list = new int[20];
		
		//prompt user to enter two values and insert them into array
		System.out.print("Enter " + integer_list.length + " values: ");
		for (int i = 0; i < integer_list.length; i++)
			integer_list[i] = input.nextInt();
		
		//calculate total sum of integers from integer_list
		int total = 0;
		for (int i = 0; i < integer_list.length; i++) {
			total += integer_list[i];
		}
		
		//calculate highest value
		int h_value = integer_list[0];
		for (int i = 1; i < integer_list.length; i++) {
			if (integer_list[i] > h_value) h_value = integer_list[i];
		}
		
		//calculate lowest value
		int l_value = integer_list[0];
		for (int i = 1; i < integer_list.length; i++) {
			if (integer_list[i] < l_value) l_value = integer_list[i];
		}
		
		//calculate the average value
		int average = total / 20;
		
		//display highest value, lowest value, average, and sum
		System.out.println("\nThe highest entered value is " + h_value);
		System.out.println("The lowest entered value is " + l_value);
		System.out.println("The average of the entered values is " + average);
		System.out.println("The sum of the entered values is " + total);

	}

}
