
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// generate a lottery number
		int lottery = (int)(Math.random() * 100); 
		
		// prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		// get digits from lottery
		int lotteryDigi1 = lottery / 10; 
		int lotteryDigi2 = lottery % 10;
		
		// get digits from guess
		int guessDigi1 = guess / 10;
		int guessDigi2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		// check the guess
		if (guess == lottery)
			System.out.println(" Exact match: you win $10,000");
		else if (guessDigi2 == lotteryDigi1
				&& guessDigi1 == lotteryDigi2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigi1 == lotteryDigi1
				|| guessDigi1 == lotteryDigi2
				|| guessDigi2 == lotteryDigi1
				|| guessDigi2 == lotteryDigi2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match"); 

	}

}
