public class AThreadRunnableExample implements  Runnable{

	@Override
	public void run() {
		System.out.println("Runnable example " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		AThreadRunnableExample obj = new AThreadRunnableExample();
		Thread t1 = new Thread(obj);
		//t1.start();
		t1.run();
	}
}
