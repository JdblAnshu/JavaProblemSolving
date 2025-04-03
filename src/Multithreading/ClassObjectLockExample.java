
class Counter {
	private static int totalCount = 0; // Shared across all instances
	private int instanceCount = 0;     // Unique to each instance

	// Class lock: Protects static variable
	public static synchronized void incrementTotal(){
		//System.out.println("Current thread incrementTotal "+ Thread.currentThread().getName());
		totalCount++;
		System.out.println("Current totalCount "+ totalCount);
		try {
			Thread.sleep(700);
		}catch (InterruptedException e){
	e.printStackTrace();
		}

	}

	// Object lock: Protects instance variable
	public synchronized void incrementInstance(){
		//System.out.println("Current thread incrementInstance "+ Thread.currentThread().getName());
		instanceCount++;
		System.out.println("Current instanceCount"+ instanceCount);

		try {
			Thread.sleep(700);
		}catch (InterruptedException e){
	e.printStackTrace();
		}
	}
}

public class ClassObjectLockExample {
	public static void main(String[] args) {


		Counter c1 = new Counter();
		Counter c2 = new Counter();

			// Two threads can call incrementInstance() on c1 and c2 simultaneously
			// because they use separate object locks.
			new Thread(c1::incrementInstance).start();
			new Thread(c2::incrementInstance).start();

			// Only one thread can call incrementTotal() at a time
			// because it uses a class lock.
			new Thread(Counter::incrementTotal).start();
			new Thread(Counter::incrementTotal).start();

	}
}