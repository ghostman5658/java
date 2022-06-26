

/*
Kye Gotzman 1/17/2022 Module 3.2
Purpose of the code is to create a class called 'fistname'Integer with several methods
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
N/A. 2021. Finding minimum and maximum in Java 2D array. Stackoverflow. Retrieved from: https://stackoverflow.com/questions/38286212/finding-minimum-and-maximum-in-java-2d-array
*/

public class KyleInteger {
	
	// declare an int variable with my first name
	private int kyle;
	
	// constructor that takes and sets the initial value
	public KyleInteger(int newKyle) {
		this.kyle = newKyle;
	}
	
	// set new integer value 
	public void setKyle() {
		this.kyle = kyle;
	}
	
	// get integer value
	public int getKyle() {
		return kyle;
	}
	
	// non static method - check if parameter is even
	public boolean isEven() {
		if (kyle % 2 == 0)
			return true;
		else
			return false;
	}
	
	// non static method - check if parameter is odd
	public boolean isOdd() {
		if (kyle % 2 != 0) 
			return true;
		else 
			return false;
	}
	
	// non static method - check if parameter is prime number
	public boolean isPrime() {
		for (int i = 2; i <= kyle / 2; i++) {
			if (kyle % i == 0) { //if true, number is not prime
				return false;
			}
		}
		return true;
	}
	
	// static method - check if parameter is even
	public static boolean isEven(int k) {
		if (k % 2 == 0)
			return true;
		else
			return false;
	}
	
	// static method - check if parameter is odd
	public static boolean isOdd(int k) {
		if (k % 2 != 0)
			return true;
		else 
			return false;
	}
	
	// static method - check if parameter is prime
	public static boolean isPrime(int k) {
		for (int i = 2; i <= k / 2; i++) {
			if (k % i == 0) { //if true, number is not prime
				return false;
			}
		}
		return true;
	}
	
	// static method w/ signature - check if even
	public static boolean isEven(KyleInteger k) {
		return k.isEven();
	} 
	
	// static method w/ signature - check if odd
	public static boolean isOdd(KyleInteger k) {
		return k.isOdd();
	}
	
	// static method w/ signature - check if prime
	public static boolean isPrime(KyleInteger k) { 
		return k.isPrime();
	}
	
	// method equals(int) which returns true if int values are equal and false if they are not
	public boolean equals(int k) {
		if (this.kyle == k) {
			return true;
		}
		else
			return false;
	}
	
	// method equals(Integer) which returns true if in values are equal and false if they are not
	public boolean equals(Integer k) {  
		if (this.kyle == k) {
			return true;
		}
		else
			return false;
	} 
	// method equals(KyleInteger) which returns true if in values are equal and false if they are not
	public boolean equals(KyleInteger k) {
		if (k.equals(kyle)) {
			return true;
		}
		else 
			return false;
	}

}










