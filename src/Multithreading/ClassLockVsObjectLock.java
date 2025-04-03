

/*
Class Lock
Key Behavior: Only one thread can hold the class lock at a time.
If a thread holds the class lock, no other thread can execute any static synchronized method or block synchronized on MyClass.class.

 */
public class ClassLockVsObjectLock {

	private static int count = 0;

	// Static synchronized method (implicit class lock)
	public static synchronized void increment() {
		count++;
	}

	// Explicit class lock using synchronized block
	public void incrementWithBlock() {
		synchronized (ClassLockVsObjectLock.class) {
			count++;
		}
	}
}

/*
Key Behavior: Each object has its own lock.
Multiple threads can execute synchronized instance methods on different objects simultaneously,
but only one thread can hold the lock for a specific object.
 */

class MyClass {
	private int instanceCount = 0;

	// Instance synchronized method (implicit object lock)
	public synchronized void increment() {
		instanceCount++;
	}

	// Explicit object lock using synchronized block
	public void incrementWithBlock() {
		synchronized (this) {
			instanceCount++;
		}
	}
}

