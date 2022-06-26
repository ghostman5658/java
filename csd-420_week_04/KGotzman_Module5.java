/*
Kye Gotzman 4/8/2022 Module 5.2 Program
Purpose of the code is to write a test program that reads words from a text file and displays all non-duplicate words in ascending order and then in descending order.
The file is to be referenced in the program, not needing to be used as a command line reference.
The word file is to be titled collection_of_words.txt and included in your submission.
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class KGotzman_Module5 {

	public static void main(String[] args) {
		
		// create file object
		File file = new File("collection_of_words.txt");
		
		// check if file exists
		if (file.exists()) {
			// do nothing
		}
		// if file does not exist, create file and write text to it.
		else {
			try {
				file.createNewFile();
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("We the People of the United States "
						+ "in Order to form a more perfect Union establish Justice insure domestic Tranquility "
						+ "provide for the common defense promote the general Welfare "
						+ "and secure the Blessings of Liberty to ourselves and our Posterity "
						+ "do ordain and establish this Constitution for the United States of America");
				fileWriter.close();
			}
			catch (IOException e) {
				System.out.println("An error occured.");
				e.printStackTrace();		
			}
		}
		
		//create a scanner/reader object. read the file and display the original text
		try {
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println("\t\tOriginal Text");
				System.out.println(data + "\n");
			}
			myReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		} 
		
		// create tree set object
		TreeSet<String> treeSet = new TreeSet<>();

		// create scanner object and add words to an array, then add them to the tree set
		try {
			Scanner fileScanner = new Scanner(file); 
			while (fileScanner.hasNext()) {
				String[] words = fileScanner.next().split(", ");
				for(String word : words) {
					treeSet.add(word.toLowerCase());
				}
			}
			fileScanner.close();
		
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		// display the tree set in ascending order
		System.out.println("\t\tAscending Order");
		System.out.println(treeSet + "\n");
		
		// display the tree set in descending order
		System.out.println("\t\tDescending Order");
		System.out.println(treeSet.descendingSet() + "\n");

	}

}
