
import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);
		
		// prompt the user to enter a decimal integer
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		
		// convert decimal to hex
		String hex = "";
		
		while (decimal != 0) {
			int hexValue = decimal % 16;
			
			// convert a decimal value to a hex digit
			char hexDigit = (0 <= hexValue && hexValue <= 9)?
					(char)(hexValue + '0'): (char)(hexValue  - 10 + 'A');
			
			hex = hexDigit + hex;
			decimal = decimal / 16;
		}
		
		System.out.println("The hex number is " + hex);

	}

}
