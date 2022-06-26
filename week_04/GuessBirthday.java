
import java.util.Scanner;

public class GuessBirthday {

	public static void main(String[] args) {
		// create string sets
		String set1 = 
				" 1 3 5 7\n" +
				" 9 11 13 15\n" +
				"17 19 21 23\n" + 
				"25 27 29 31";
		
		String set2 = 
				"2 3 6 7\n" +
				"10 11 14 15\n" + 
				"18 19 22 23\n" +
				"26 27 30 31";
		
		String set3 = 
				"4 5 6 7\n" + 
				"12 13 14 15\n" +
				"20 21 22 23\n" +
				"28 29 30 31";
		
		String set4 = 
				"8 9 10 11\n" +
				"12 13 14 15\n" + 
				"24 25 26 27\n" + 
				"28 29 30 31";
		
		String set5 =
				"16 17 18 19" +
				"20 21 22 23\n" +
				"24 25 26 27\n" + 
				"28 29 30 31";
		
		int day = 0;
		
		// create a scanner
		Scanner input = new Scanner(System.in);
		
		// prompt the user to answer questions
		System.out.print("\nIs your birthday in Set1\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		int answer1 = input.nextInt();
		
		if (answer1 == 1)
			day += 1;
		
		// prompt the user to answer questions
		System.out.print("\nIs your birthday in Set2\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		int answer2 = input.nextInt();
				
		if (answer2 == 1)
			day += 2;
		
		// prompt the user to answer questions
		System.out.print("\nIs your birthday in Set3\n");
		System.out.print(set3);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		int answer3 = input.nextInt();
						
		if (answer3 == 1)
			day += 4;
		
		// prompt the user to answer questions
		System.out.print("\nIs your birthday in Set4\n");
		System.out.print(set4);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		int answer4 = input.nextInt();
								
		if (answer4 == 1)
			day += 8;
		
		// prompt the user to answer questions
		System.out.print("\nIs your birthday in Set5\n");
		System.out.print(set5);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		int answer5 = input.nextInt();
										
		if (answer5 == 1)
			day += 16;
		
		System.out.println("\nYour birthday is " + day + "!");
	}

}
