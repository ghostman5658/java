import java.util.Random;

/*
Kye Gotzman 4/16/2022 Module 6.2 Program
Purpose of the code is to Create a class titled <your first name here> ThreeThreads.
In this class, you are to use three threads to output three types of characters to a text area for display.
In the first thread, you are to output random letter characters such as a, b, c, d …
In the second thread, you are to output random number digits such as 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
In the third thread, you are to output random characters such as !, @, #, $, %, &, *
Display a minimum of 10,000 of each of the three sets.
 
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.

N/A. 2022. random number generator for special characters[duplicate]. StackOverflow. 
Retrieved from: https://stackoverflow.com/questions/16934465/random-number-generator-for-special-characters
*/

public class KyleThreeThreads {

	public static void main(String[] args) {
		// determine testQuantity
		int testQuantity = 10000;
		
		// create tasks
		Runnable printNum = new PrintNumber(testQuantity);
		Runnable printLett = new PrintLetter(testQuantity);
		Runnable printChar = new PrintCharacter(testQuantity);
		
		// create threads
		Thread thread1 = new Thread(printNum);
		Thread thread2 = new Thread(printLett);
		Thread thread3 = new Thread(printChar);
		
		// start threads
		thread1.start();
		thread2.start();
		thread3.start();

	}

}

class PrintNumber implements Runnable { 
	private int testQuantity;
	
	// construct a task that specifies how many test cases will be ran
	public PrintNumber(int n) {
		testQuantity = n;
	}
	
	// method for getting random number
	public int randomNumber() {
		int number = (int) (Math.random() * 100);
		return number;
	}

	@Override
	public void run() {
		for(int i = 0; i < testQuantity; i++) {
			int rNumber = randomNumber();
			System.out.print(rNumber + " ");
		}
	}
}

class PrintLetter implements Runnable {
	private int testQuantity;
	
	// construct a task that specifies how many test cases will be ran
	public PrintLetter(int n) {
		testQuantity = n;
	}
	
	// method for getting random letter
	public int randomLetter() {
		Random random = new Random();
		char randomizedLetter = (char) (random.nextInt(26) + 'a'); 
		return randomizedLetter;
	}

	@Override
	public void run() {
		for(int i = 0; i < testQuantity; i++) {
			int rLetter = randomLetter();
			System.out.print(rLetter + " ");
		}
	}
}

class PrintCharacter implements Runnable {
	private int testQuantity;
	
	// construct a task that specifies how many test cases will be ran
	public PrintCharacter(int n) {
		testQuantity = n;
	}
	
	// method for getting random letter
	public String randomCharacter() {
		String[] specialCharacters = {"!", "@", "#", "$", "%", "^", "&", "*", "?", "+"};
		int randomNum = (int) (Math.random() * 10);
		String randomizedCharacter = specialCharacters[randomNum];
		return randomizedCharacter; 
	}

	@Override
	public void run() {
		for(int i = 0; i < testQuantity; i++) {
			String rCharacter = randomCharacter();
			System.out.print(rCharacter + " ");
		} 
	}
}
