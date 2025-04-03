
class DeadLockExamples {

    // Resource 1
    private static final Object lock1 = new Object();

    // Resource 2
    private static final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {

        // Thread 1: Tries to lock lock1, then lock2
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock 2!");
                }
            }
        });

        // Thread 2: Tries to lock lock2, then lock1
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (lock1) {
                    System.out.println("Thread 2: Acquired lock 1!");
                }
            }
        });

        thread1.start();

        thread2.start();

		//thread1.join();


    }
}

/*

Live lock

Real-World Analogy
Picture two overly polite drivers at a four-way stop. Both wave the other to go first, then both start, stop, and wave again—neither gets through despite constant action.
What is Livelock?
Livelock is a situation in concurrent programming where two or more threads (or processes) are actively running and trying to resolve a conflict, but their attempts to avoid each other prevent any of them from making progress. Unlike a deadlock, where threads are stuck waiting passively, in a livelock, the threads are busy "dancing around" each other, constantly changing states but never moving forward.

Think of two people trying to pass each other in a narrow hallway. They keep stepping aside in the same direction, mirroring each other’s moves, and neither gets past—both are active, but neither progresses.

What Happens When It Occurs?
When livelock occurs:

Threads Stay Active: The involved threads keep executing, consuming CPU cycles, but they don’t complete their tasks.
No Progress: The system appears "alive" (threads aren’t blocked), but the intended work stalls indefinitely.
Resource Waste: CPU and memory are used without achieving results, potentially degrading performance.


How It Differs from Deadlock
Deadlock: Threads wait passively, each holding a resource the other needs (e.g., Thread 1 locks A, waits for B; Thread 2 locks B, waits for A).
Livelock: Threads actively adjust, but their adjustments cancel out progress (e.g., both keep giving up resources).
 */

