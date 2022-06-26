
/*
Kye Gotzman 11/5/2021 Module 3.2
Purpose of the code is to play rock/paper/scissor against the computer
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

import java.util.Scanner;

public class KGotzman_Week03 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// get players choice
		System.out.print("Choose 1 for Rock, 2 for Paper, or 3 for Scissors: ");
		int playerPick = input.nextInt();
		
		// dsiplay players choice
		if (playerPick == 1)
			System.out.println("You chose Rock...");
		else if (playerPick == 2)
			System.out.println("You chose Paper...");
		else if (playerPick == 3)
			System.out.println("You chose Scissors...");

		// generate random number between 1 and 3
		int computerPick = (int)(Math.random() * 3) + 1;
		
		// display computers move
		if (computerPick == 1)
			System.out.println("Computer chose Rock...");
		else if (computerPick == 2)
			System.out.println("Computer chose Paper...");
		else if (computerPick == 3)
			System.out.println("Computer chose Scissors...");
		
		//display results
		if (playerPick == computerPick)
			System.out.println("It is a tie!");
		else if (playerPick == 1 && computerPick == 3)
			System.out.println("Rock beats Scissors: You Win!");
		else if (playerPick == 2 && computerPick == 1)
			System.out.println("Paper beats Rock: You Win!");
		else if (playerPick == 3 && computerPick == 2)
			System.out.println("Scissors beats Paper: You Win!");
		else if (playerPick == 1 && computerPick == 2)
			System.out.println("Paper beats Rock: You Lose!");
		else if (playerPick == 2 && computerPick == 3)
			System.out.println("Scissors beats Paper: You Lose!");
		else if (playerPick == 3 && computerPick == 1)
			System.out.println("Rock beats Scissors: You Lose!");

	}

}
