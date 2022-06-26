/*
Kye Gotzman 4/2/2022 Module 3.2 Program
Purpose of the code is to write a test program that contains a static method that returns a new ArrayList.
The new ArrayList returned will contain all original values with no duplicates from the original ArrayList.
Fill the Original ArrrayList with 50 random values from 1 to 20.
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.

*/

import java.util.ArrayList;

public class KGotzman_Module3 {

	public static void main(String[] args) {
		//create an empty array object
		ArrayList<Integer> originalList = new ArrayList<Integer>(); 
		//add random numbers to the array
		for (int i = 0; i < 50; i++) {
			int j = 1 + (int)(Math.random() * ((20 - 1) + 1));
			originalList.add(j); 
		}
		
		// display original ArrayList for comparison
		System.out.print("Your original random integer list was: ");
		for(int i = 0; i < originalList.size(); i++) {
			System.out.print(originalList.get(i) + ", ");
		}
		
		//instantiate new ArrayList object and call the remove duplicates method with the originalList argument
		ArrayList<Integer> list1 = removeDuplicates1(originalList);

		// display the new ArrayList for comparison against the old
		System.out.println();
		System.out.print("Your new random integer list using method one is: ");
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + ", ");
		}
		
	}
	
	// method for removing duplicates by creating a new ArrayList and only adding elements if they are not in the new ArrayList
	public static <E> ArrayList<E> removeDuplicates1(ArrayList<E> list) {
		ArrayList<E> newList = new ArrayList<E>();
		for (E element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
	}
}
