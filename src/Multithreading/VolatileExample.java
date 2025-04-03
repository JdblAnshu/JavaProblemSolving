
public class VolatileExample {
	// Volatile variable to indicate server status
	private static volatile boolean isServerRunning = false;

	public static void main(String[] args) throws InterruptedException {
		// Thread to simulate a server starting up
		Thread serverThread = new Thread(() -> {
			System.out.println("Server thread: Starting server...");
			try {
				Thread.sleep(3000); // Simulate server startup time
				isServerRunning = true; // Update status
				System.out.println("Server thread: Server is now running!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		// Start the server thread
		serverThread.start();

		// Main thread monitors the server status
		System.out.println("Main thread: Checking server status...");
		while (!isServerRunning) {
			System.out.println("Main thread: Server not ready yet, waiting...");
			Thread.sleep(1000); // Check every second instead of busy-waiting
		}
		System.out.println("Main thread: Server is up and running!");
	}
}