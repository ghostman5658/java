

/*
Kye Gotzman 1/22/2022 Module 4.2
Purpose of the code is to create an array list
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class KyleArrayListTest {
	
	public static Integer max (ArrayList list) {
		Integer m = 0;
		boolean empty = list.isEmpty();
		if (empty == true)
			m = 0;
		else 
			m = (Integer) Collections.max(list);
		return m;
	} 
	
	public static ArrayList userList() {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		// Create array
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Integer temp = 1;
		while (temp != 0) {
			System.out.println("Enter an integer. Enter 0 to stop");
			Integer user_input = input.nextInt();
			list.add(user_input);
			temp = user_input;
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		// Test code to check if the method receives all of the parameters and to see if the max value method works
		ArrayList l = userList();
		Integer m = max(l);
		
		System.out.print("The integers in the list are: \n");  
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("The largest integer in the array is: " + m);
		
	} 
}




