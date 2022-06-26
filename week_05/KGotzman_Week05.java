
/*
Kye Gotzman 11/11/2021 Module 5.2
Purpose of the code is to use a while loop to add 2 to a denominator through each pass
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

public class KGotzman_Week05 {

	public static void main(String[] args) {
		
		// define first denominator
		int denominator1 = 3;
		
		// iterate a loop until denominator reaches 99
		while (denominator1 < 100) {
			String display1 = ("1/" + denominator1);
			System.out.print(display1 + " + ");
			denominator1++;
			denominator1++;
			
		}
		
		// move to the next line
		String next = "\n";
		System.out.print(next);
		
		// define second denominator
		int denominator2 = 99;
		
		// iterate a loop until the denominator reaches 3
		while (denominator2 > 2) {
			String display2 = ("1/" + denominator2);
			System.out.print(display2 + " + ");
			denominator2--;
			denominator2--;
		}

	}

}
