
/*
Kye Gotzman 1/30/2022 Module 6.2 
Purpose of the code is to create four instances of two different classes that extend an abstract class and use its abstract method
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

public class UseDivision {

	public static void main(String[] args) {
		
		// create 2 instances of each division class
		Division usEast = new DomesticDivision("US East", 123, "North Carolina");
		Division usWest = new DomesticDivision("US West", 456, "Oregon");
		Division euDiv = new InternationalDivision("Europe Division", 789, "England", "English");
		Division apacDiv = new InternationalDivision("Asain Pacific Division", 012, "Japan", "Japanese");
		
		// use method that outprints each object
		usEast.display();
		usWest.display();
		euDiv.display();
		apacDiv.display();
	
	}

}
