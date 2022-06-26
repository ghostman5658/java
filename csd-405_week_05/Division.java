
/*
Kye Gotzman 1/30/2022 Module 6.2 
Purpose of the code is to create an abstract class with an abstract method and a constructor
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

public abstract class Division {
	// declare required variables
	String name;
	int accountNumber;
	
	// constructor that requires the division name and account number
	Division(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	// declare an abstract method that will be implemented in the subclasses
	abstract void display();

}


