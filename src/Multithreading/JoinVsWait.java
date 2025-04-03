public class JoinVsWait {
}
/*

thread.join();      // Waits indefinitely until the thread finishes
thread.join(long millis);    // Waits for the specified time or until the thread finishes
thread.join(long millis, int nanos); // Waits for the specified time or until the thread finishes (with finer granularity)

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is working.");
            try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is working.");
        });

        thread1.start();
        thread2.start();

        // Main thread waits for thread1 to finish
        thread1.join();

        System.out.println("Thread 1 has finished, now the main thread will continue.");
    }
}

 */

/*
synchronized (obj) {
    obj.wait();                // Waits until notified
    obj.wait(long millis);      // Waits for a specified time or until notified
    obj.wait(long millis, int nanos); // Waits for a specified time or until notified (with finer granularity)
}

class WaitNotifyExample {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Producer is producing...");
                try {
                    Thread.sleep(2000); // Simulate work
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                lock.notify();  // Notify the consumer thread to proceed
            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Consumer is waiting...");
                    lock.wait();  // Wait until notified
                    System.out.println("Consumer is now consuming.");
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        });

        consumer.start();
        producer.start();
    }
}

 */