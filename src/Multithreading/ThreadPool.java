
import java.util.concurrent.*;

public class ThreadPool {
	public static void main(String[] args) {
		// Create a fixed-size thread pool with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Submit 5 tasks to the pool
		for (int i = 0; i < 5; i++) {
			executor.submit(new RunnableTask(i));
		}

		// Shutdown the executor
		executor.shutdown();
	}
}

class RunnableTask implements Runnable {
	private int taskId;

	public RunnableTask(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("Task " + taskId + " is being executed by: " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000); // Simulate work
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
