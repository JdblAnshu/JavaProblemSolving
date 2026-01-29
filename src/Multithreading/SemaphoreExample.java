import java.util.concurrent.Semaphore;

/**
 * In Java, a Semaphore is a synchronization tool from the java.util.concurrent package that controls access to a shared
 * resource by maintaining a set of permits. It is used to limit the number of threads that can access a resource
 * concurrently, making it useful for scenarios like resource pooling, thread limiting, or preventing resource exhaustion.
 *
 * Key Concepts of Semaphore
 * Permits: A semaphore maintains a count of permits. Each thread must acquire a permit to access the resource,
 * and it releases the permit when done.
 *
 * Acquire and Release:
 * acquire(): Decrements the permit count; if no permits are available, the thread blocks until one is released.
 * release(): Increments the permit count, allowing other threads to acquire a permit.
 *
 * Fairness: Semaphores can be configured to be fair (FIFO order for waiting threads) or non-fair (default, no guaranteed order).
 *
 * Use Cases:
 * Limiting concurrent access to a resource (e.g., database connections).
 * Implementing producer-consumer patterns.
 * Throttling thread execution.
 */
public class SemaphoreExample {
    // Semaphore with 2 permits
    private static final Semaphore semaphore = new Semaphore(2, true); // true for fairness

    public void accessResource(String threadName) {
        try {
            System.out.println(threadName + " is trying to acquire a permit...");
            semaphore.acquire(); // Acquire a permit
            System.out.println(threadName + " acquired a permit. Available permits: " + semaphore.availablePermits());
            // Simulate resource usage
            Thread.sleep(2000);
            System.out.println(threadName + " is releasing the permit...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the permit
        }
    }

    public static void main(String[] args) {
        SemaphoreExample example = new SemaphoreExample();

        // Create 5 threads, but only 2 can access the resource at a time
        Runnable task = () -> example.accessResource(Thread.currentThread().getName());
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        Thread t4 = new Thread(task, "Thread-4");
        Thread t5 = new Thread(task, "Thread-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}