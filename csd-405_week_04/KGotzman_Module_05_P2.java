
/*
Kye Gotzman 1/26/2022 Module 5.2 Program 2
Purpose of the code is to create and write to a file then close, reopen and read the file
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class KGotzman_Module_05_P2 {

	public static void main(String[] args) {
		
		// create file called data.file if it does not exist
		try {
			File dataFile = new File("data.file");
			if (dataFile.createNewFile()) {
				System.out.println("File created: " + dataFile.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
		// write 10 random integers to the file
		try {
			PrintWriter writeToFile = new PrintWriter(new FileOutputStream("data.file", true));
			for (int i = 0; i < 10; i++) {
	            int random = (int) (1 + Math.random() * 100);
	            writeToFile.append(String.valueOf(random));
	            writeToFile.append(" "); 
			}
			writeToFile.close();
		}
		catch (IOException e) {
			System.out.print("An error occured.");
			e.printStackTrace();
		}
		
		// read the file and display it to the user
		try {
			File readFile = new File ("data.file");
			Scanner fileReader = new Scanner(readFile);
			while (fileReader.hasNextLine()) {
				String data = fileReader.nextLine();
				System.out.println(data);
			}
			fileReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}








