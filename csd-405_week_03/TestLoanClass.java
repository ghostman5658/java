
import java.util.Scanner;

public class TestLoanClass {

	//main method
	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);
		
		// enter annual interest rate
		System.out.print("Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		// enter number of years
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		// enter loan amount
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		// create a loan object
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		
		// display loan date, monthly payment, and total payment
		System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());

	}

}
