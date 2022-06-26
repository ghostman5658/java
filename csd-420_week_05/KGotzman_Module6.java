/*
Kye Gotzman 4/16/2022 Module 6.2 Program
Purpose of the code is to write Write a program with the two following generic methods using a bubble sort. 
The first method sorts the elements using the Comparable interface, and the second uses the Comparator interface.

public static <E extends Comparable<E>>
 void bubbleSort(E[] list)
public static <E> void bubbleSort(E[] list,
 Comparator<? super E> comparator)
 
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

import java.util.Comparator;

public class KGotzman_Module6 {
	
	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		boolean needNextPass = true;
		
		for(int k = 1; k < list.length && needNextPass; k++) {
			//array may be sorted and next pass not needed
			needNextPass = false;
			for(int i = 0; i < list.length - k; i++) {
				if (list[i].compareTo(list[i + 1]) > 0) {
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					
					needNextPass = true; // next pass still needed
				}
			}
		}
	}
	
	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
		boolean needNextPass = true;
		
		for(int k = 1; k < list.length && needNextPass; k++) {
			//array may be sorted and next pass not needed
			needNextPass = false;
			for(int i = 0; i < list.length - k; i++) {
				if (comparator.compare(list[i], list[i + 1]) > 0) {
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					
					needNextPass = true; // next pass still needed
				}
			}
		}
	}
	
	// a test method
	public static void main(String[] args) {
		
		//create an Integer array
		Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		// sort the array
		bubbleSort(list);
		//display the array
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		
		System.out.println(); // create a line break
		
		//create a String array
		String[] list1 = {"a", "b", "c", "1", "2", "3", "one", "two", "three"};
		//sort the array
		bubbleSort(list1, (e1, e2) -> e1.compareTo(e2));
		// display the array
		for (int i = 0; i < list1.length; i++) 
			System.out.print(list1[i] + " ");
	}
}









