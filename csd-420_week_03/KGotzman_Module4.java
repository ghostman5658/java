/*
Kye Gotzman 4/2/2022 Module 4.2 Program
Purpose of the code is to write a test program that stores 50,000 integers in LinkedList and test the time to traverse the list using an iterator vs. using the get(index) method.
Then, test your program storing 500,000 integers.
After completing this program and having tested both values, in your comments, explain the results and discuss the time taken using both values and their difference with the get(index) approach.
Write test code that ensures the code functions correctly.
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

import java.util.*;

public class KGotzman_Module4 {

	public static void main(String[] args) {
		//create two linked lists, the first with 50k int and the second with 500k ints
		LinkedList<Integer> list50k = linkedList(50000);
		LinkedList<Integer> list500k = linkedList(500000);
		
		// get and display the time it took to iterate / loop through the first linked list using both methods
		long iteratorTime1 = timeUsingIterator(list50k);
		long getIndexTime1 = timeUsingGetIndex(list50k);
		System.out.println("To iterate/loop through 50K integers it took " + iteratorTime1 + 
				" milliseconds using the iterator method and " + getIndexTime1 + " milliseconds using the get() method");
		
		// get and dsiplay the time it took to iterate / loop through the second linked list using both methods
		long iteratorTime2 = timeUsingIterator(list500k);
		long getIndexTime2 = timeUsingGetIndex(list500k);
		System.out.println("\nTo iterate/loop through 500K integers it took " + iteratorTime2 + 
				" milliseconds using the iterator method and " + getIndexTime2 + " milliseconds using the get() method");
		
	}
	
	
	// method for creating a LinkedList with a specified length
	public static LinkedList<Integer> linkedList(int quantity) {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < quantity; i++) {
			list.add(i);
		}
		return list;
	}
	
	// method for iterating through a LinkedList and return the time it took
	public static long timeUsingIterator(LinkedList list) {
		long timerStart = System.currentTimeMillis();
		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next();
		}
		long timerEnd = System.currentTimeMillis();
		long iteratorResults = timerEnd - timerStart;
		return iteratorResults;
	}
	
	// method for looping through a LinkedList using the get() method and return the time it took
	public static long timeUsingGetIndex(LinkedList list) {
		long timerStart = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		long timerEnd = System.currentTimeMillis();
		long iteratorResults = timerEnd - timerStart;
		return iteratorResults;
	}
}
