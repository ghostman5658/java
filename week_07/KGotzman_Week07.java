/*
Kye Gotzman 11/20/2021 Module 7.2
Purpose of the code is to check if a password meets the requirements
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/


import java.util.Scanner;

public class KGotzman_Week07 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// display password requirements and prompt the user
		System.out.println("Password must contain:" + 
		"\n\tAt least 8 characters" + 
		"\n\tBoth letters and digits" + 
		"\n\tAt least one uppercase character" +
		"\n\tAt least one lowercase character" + 
		"\n\nEnter your password: ");
		String password = input.next();
		
		//check if password meets requirements by calling checkPassword method
		System.out.println(checkPassword(password) ? "You password meets the requirements" : "That is an invalid password");
	}
	
	/** Method for checking password requirements */
	public static boolean checkPassword(String password) {
		if (password.length() < 8) {
			return false;
		}
		
		for (int x = 0; x < password.length(); x++) {
			char y = password.charAt(x);
			if (Character.isDigit(y) || Character.isLetter(y));
			else
				return false;
			
		}
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		
		for (int a = 0; a < password.length(); a++) {
			char b = password.charAt(a);
			if (Character.isUpperCase(b)) {
				upperCaseCount++;
			};
			if (Character.isLowerCase(b)) {
				lowerCaseCount++; 
			}
		}
		if (lowerCaseCount < 1 || upperCaseCount < 1) {
			return false;
		}
		
		return true;
	}

}
