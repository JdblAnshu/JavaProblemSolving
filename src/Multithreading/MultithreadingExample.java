public class MultithreadingExample{

	public static void main(String[] args) {

		CustomThread t1 = new CustomThread("t1");
		CustomThread t2 = new CustomThread("t2");

		// Case 1: Using start()
		System.out.println("Using start():");
		t1.start();
		t2.start();
		System.out.println("T1 thread name " + t1.getName());
		System.out.println("T2 thread name " + t2.getName());

		CustomThread t3 = new CustomThread("t3");
		System.out.println("T3 thread name " +  t3.getName());
		t3.run();

		CustomThread t4 = new CustomThread(){

			@Override
			public void run() {
				System.out.println("hi there from thread t4 "+ Thread.currentThread().getName());

			}

		};

		t4.run();

	}
}
