
/*
wait()
Class: wait() is a method of the Object class, meaning it's available to all objects in Java.
Purpose: It causes the current thread to wait (pause execution) until another thread invokes notify() or notifyAll() on the same object. It's typically used for inter-thread communication, often in synchronization scenarios.
Behavior:
The thread releases the lock (monitor) it holds on the object it’s waiting on, allowing other threads to access the synchronized block or method.
The thread remains in a waiting state until it’s notified or the specified timeout (if provided) expires.
 */
/*
sleep()
Class: sleep() is a static method of the Thread class.
Purpose: It pauses the execution of the current thread for a specified amount of time, allowing other threads to run. It’s commonly used to introduce delays or simulate time-consuming tasks.
Behavior:
The thread does not release any locks it holds while sleeping—it retains control of any monitors.
After the sleep duration ends, the thread moves to the "runnable" state and waits for the CPU to schedule it again.
 */


public class WaitSleepMethod {
	private static final Object lock = new Object(); // Shared lock object for wait/notify
	private static boolean condition = false;        // Condition to control waiting

	public static void main(String[] args) {
		// Thread 1: Waits for a condition
		Thread waiter = new Thread(() -> {
			synchronized (lock) {
				try {
					System.out.println("Waiter: Waiting for notification...");
					while (!condition) { // Guard against spurious wakeups
						lock.wait();     // Releases lock and waits
					}
					System.out.println("Waiter: I've been notified! Condition is true.");
				} catch (InterruptedException e) {
					System.out.println("Waiter: Interrupted while waiting.");
				}
			}
		});

		// Thread 2: Notifies the waiting thread after a delay
		Thread notifier = new Thread(() -> {
			try {
				Thread.sleep(2000); // Sleep for 2 seconds to simulate delay
				synchronized (lock) {
					System.out.println("Notifier: Changing condition and notifying...");
					condition = true;    // Change the condition
					lock.notify();       // Notify the waiting thread
				}
			} catch (InterruptedException e) {
				System.out.println("Notifier: Interrupted while sleeping.");
			}
		});

		// Thread 3: Uses sleep to print messages with delay
		Thread sleeper = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				try {
					System.out.println("Sleeper: Message " + i);
					Thread.sleep(1000); // Sleep for 1 second between messages
				} catch (InterruptedException e) {
					System.out.println("Sleeper: Interrupted while sleeping.");
				}
			}
		});

		// Start all threads
		waiter.start();
		notifier.start();
		sleeper.start();

		// Ensure main thread waits for all threads to complete
		try {
			notifier.join();
			waiter.join();

			sleeper.join();
		} catch (InterruptedException e) {
			System.out.println("Main: Interrupted while joining threads.");
		}

		System.out.println("Main: All threads have completed.");
	}
}