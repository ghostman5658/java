
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// create scanner input
		Scanner input = new Scanner(System.in);
		
		// create random number between 0 and 100
		int number = (int)(Math.random() * 101);
		
		int guess = -1;
		while (guess != number) {
			//prompt the user to guess a number between 1 and 100
			System.out.println("Enter a number between 1 and 100: ");
			guess = input.nextInt();
			
			if (guess == number) 
				System.out.print("Yes, the number is " + number);
			else if (guess < number)
				System.out.print("Your guess is too low, try again! ");
			else
				System.out.print("Your guess is too high, try again! ");
		}

	}

}
