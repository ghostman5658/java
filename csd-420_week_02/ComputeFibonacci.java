
import java.util.Scanner;

public class ComputeFibonacci {

	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();
		
		// find and display the Fibonacci number
		System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
	}
	
	// the method for finding the Fibonacci number
	public static long fib(long index) {
		if (index == 0) // base case
			return 0;
		else if (index == 1) // base case
			return 1;
		else // reduction and recursive calls
			return fib(index - 1) + fib(index -2);
	} 
}





 
