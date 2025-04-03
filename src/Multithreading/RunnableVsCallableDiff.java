import java.util.concurrent.*;

public class RunnableVsCallableDiff {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Callable<String> task = () -> {
			System.out.println("Callable Task: Running in thread " + Thread.currentThread().getName());
			Thread.sleep(1000); // Simulate work
			return "Task Result";
		};

		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<String> future = executor.submit(task);

		// Get the result (blocks until task completes)
		System.out.println("Result: " + future.get());

		executor.shutdown();
	}
}

/*

Callable Interface
Package: java.util.concurrent
Purpose: Introduced in Java 5 as part of the java.util.concurrent package. It defines a task that returns a result and can throw exceptions.
Method:
public V call() throws Exception
It returns a value of type V (generic) and can throw checked exceptions.
Exception Handling: Allows throwing exceptions, making it more flexible for error handling.
Use Case: Ideal for tasks where you need to compute and return a result or handle exceptions explicitly.

 */




/*


Runnable Interface
Package: java.lang
Purpose: Defines a task that can be executed concurrently by a thread. It’s been part of Java since version 1.0.
Method:
public void run()
It takes no arguments and returns no value (void).
Exception Handling: Cannot throw checked exceptions directly (you must handle them within the run() method).
Use Case: Suitable for simple tasks where you don’t need a result or exception propagation.



public class RunnableExample {
	public static void main(String[] args) {
		Runnable task = () -> {
			System.out.println("Runnable Task: Running in thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000); // Simulate work
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Runnable Task: Completed");
		};

		Thread thread = new Thread(task);
		thread.start();
	}
}

 */