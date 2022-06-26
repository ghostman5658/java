
public class TaskThreadDemo {

	public static void main(String[] args) {
		// create tasks
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print100 = new PrintNum(100);
		
		//create threads 
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		//start threads 
		thread1.start();
		thread2.start();
		thread3.start();

	}

}

//the task for printing a character a specified number of times
class PrintChar implements Runnable {
	private char charToPrint; // the character to print
	private int times; // the number of times to repeat
	
	/* construct a task with a specified character and number of 
	 * times to print
	 */
	
	public PrintChar(char c, int t) {
		charToPrint = c;
		times = t;
	}

	@Override //override the run() method to tell the system what task to perform
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(charToPrint);
		}
	}
}

// the task class for printing numbers from 1 to n for a given n
class PrintNum implements Runnable {
	private int lastNum;
	
	// construct a task for printing 1, 2, ...., n
	public PrintNum(int n) {
		lastNum = n;
	}

	@Override // tell the thread how to run
	public void run() {
		for (int i = 1; i <= lastNum; i++) {
			System.out.print(" " + i);
		}
	}
}