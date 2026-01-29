

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3); // Wait for 3 tasks

		Runnable worker = () -> {
			System.out.println(Thread.currentThread().getName() + " is working");
			try {
				Thread.sleep(1000); // Simulate work
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " finished");
			latch.countDown(); // Signal completion
		};

		// Start 3 worker threads
		new Thread(worker, "Worker1").start();
		new Thread(worker, "Worker2").start();
		new Thread(worker, "Worker3").start();

		System.out.println("Boss is waiting for workers...");
		latch.await(); // Boss waits until all 3 workers are done
		System.out.println("All workers done, boss proceeds!");
	}
}

/**
CountDownLatch: It is a tool that enables main threads to wait until mandatory operations are performed and completed by other threads.
In simple words, it makes sure that a thread waits until the execution in another thread completes before it starts its execution.
One cannot reuse the same CountDownLatch once the count reaches 0.
CountDownLatch
What is it?
A CountDownLatch is a one-time-use synchronization mechanism that allows one or more threads to wait until a set of operations (or events) in other threads completes.
 It’s like a gate that opens once a counter reaches zero.

How does it work?
You initialize it with a count (e.g., number of tasks or threads to wait for).
Threads call countDown() to decrement the counter when they finish their task.
Other threads call await() to wait until the counter hits zero, at which point they all proceed.

 */



