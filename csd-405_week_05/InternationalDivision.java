
/*
Kye Gotzman 1/30/2022 Module 6.2 
Purpose of the code is to create a class that inherits from an abstract class, assigns additional fields as part of its constructor and uses the abstract method
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

public class InternationalDivision extends Division{
	
	// declare country and language variables
	String country;
	String language;
	
	// constructor that requires both the superclass arguments and its own additional arguments
	InternationalDivision(String name, int accountNumber, String country, String language) {
		super(name, accountNumber);
		this.country = country;
		this.language = language;
	}
	
	// subclass implementation of the abstract method
	@Override
	void display() {
		System.out.println("This is an International Division" + "\nName: " + name + "\nAccount Number: " + accountNumber + 
				"\nCountry: " + country + "\nLanguage: " + language + "\n");
		
	}

}
