import java.util.concurrent.CyclicBarrier;

/**

 CyclicBarrier
 What is it?
 A CyclicBarrier is a reusable synchronization point where a fixed number of threads must wait for each other to arrive before proceeding together. It’s like a meeting point—everyone gathers, and once all are present, they move forward as a group.

 How does it work?
 You initialize it with a party size (number of threads) and optionally a "barrier action" (a task to run when all threads arrive).
 Each thread calls await() when it reaches the barrier.
 Once all threads reach the barrier, the barrier "trips," executes the optional action (if any), and releases all waiting threads to continue.
 It resets automatically, ready for reuse.
 Key Characteristics
 Reusable: Unlike CountDownLatch, it can be used repeatedly (cyclic).
 Symmetric: All threads both wait and contribute to triggering the barrier.
 import java.util.concurrent.CyclicBarrier;
 **/

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("All friends arrived, race starts!");
        });

        Runnable friend = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is heading to the start");
                Thread.sleep((long) (Math.random() * 2000)); // Random travel time
                System.out.println(Thread.currentThread().getName() + " reached the start");
                barrier.await(); // Wait for all friends
                System.out.println(Thread.currentThread().getName() + " is racing!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        // Start 3 friend threads
        new Thread(friend, "Friend1").start();
        new Thread(friend, "Friend2").start();
        new Thread(friend, "Friend3").start();
    }
}
