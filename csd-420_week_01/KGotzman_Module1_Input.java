/*
Kye Gotzman 3/19/2022 Module 1.2 Program 1 Input
Purpose of the code is to write a program that appends an array of five integers, 
object of a current date, and an array of five random doubles
then reads the data 
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/



import java.io.*;
import java.util.*;

public class KGotzman_Module1_Input {

	public static void main(String[] args) throws ClassNotFoundException, IOException { 
		
		
		int[] randomInteger = new int[5];
		Random random = new Random();
		for (int i = 0; i < randomInteger.length; i++) {
			int ranInt = random.nextInt(100);
			randomInteger[i] = ranInt;
		}
		
		double[] randomDouble = new double[5];
		for (int i = 0; i < randomDouble.length; i++) {
			double ranDble = random.nextInt(100);
			randomDouble[i] = ranDble;
		}
		
		try ( // create an output stream for file gotzman_datafile.dat
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("gotzman_datafile.dat", true));
			) {
			// write arrays and date to the object output stream
			output.writeObject(randomInteger);
			output.writeObject(new java.util.Date()); 
			output.writeObject(randomDouble);
			
			output.close();
		}
		
		try ( // create an input stream for file gotzman_datafile.dat
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("gotzman_datafile.dat"));
			) {
			int[] newNumbers = (int[])(input.readObject());
			java.util.Date date = (java.util.Date)(input.readObject());
			double[] newDoubles = (double[])(input.readObject());
			
			// display arrays and date
			for (int i = 0; i < newNumbers.length; i++)
				System.out.print(newNumbers[i] + " ");
			System.out.println();
			 
			System.out.println(date);
			
			for (int i = 0; i < newDoubles.length; i++) 
				System.out.print(newDoubles[i] + " ");
			
			input.close();
		}
	}
}














