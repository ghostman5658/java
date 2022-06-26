
import java.util.concurrent.*;

public class ExecutorDemo {

	public static void main(String[] args) {
		// create a fixed thread pool with maximum three threads 
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		// submit runnable tasks to the executor
		executor.execute(new PrintChar('a', 100));
		executor.execute(new PrintChar('b', 100));
		executor.execute(new PrintNum(100));
		
		// shutdown the executor
		executor.shutdown();

	}

}
