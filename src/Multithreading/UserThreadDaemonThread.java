

/*
Thread userThread = new Thread(() -> {
    System.out.println("User thread running");
});
userThread.start();
 */


/*

Thread daemonThread = new Thread(() -> {
    while (true) {
        System.out.println("Daemon thread running");
    }
});
daemonThread.setDaemon(true); // Must be set before starting
daemonThread.start();

 */
/*
Setting Daemon Status: You must call setDaemon(true) before calling start() on a thread.
Attempting to set it after starting the thread throws an IllegalThreadStateException.
Thread t = new Thread();
t.start();
t.setDaemon(true); // This will throw an exception

 */

public class UserThreadDaemonThread {
	public static void main(String[] args) {
		Thread userThread = new Thread(() -> {
			try {
				Thread.sleep(1000);
				System.out.println("User thread finished");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread daemonThread = new Thread(() -> {
			while (true) {
				System.out.println("Daemon thread running");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		daemonThread.setDaemon(true);

		userThread.start();
		daemonThread.start();

		System.out.println("Main thread finished");
	}
}