// Program computes loan and interest payments

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		// Create scanner input
		Scanner input = new Scanner(System.in);
		
		// Enter annual interest rate in percentage, e.g., 7.25
		System.out.println("Enter annual interest rate, e.g., 7.25: ");
		double annualInterestRate = input.nextDouble();
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Enter number of years
		System.out.print("Enter term of loan in years, e.g., 15 or 30: ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.print("Enter loan amount, e.g., 120000: ");
		double loanAmount = input.nextDouble();
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// Display results
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0); 
		
	}

}
