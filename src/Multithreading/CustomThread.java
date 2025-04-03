public class CustomThread extends Thread{
	private String name;

	public CustomThread(String name) {
		this.name = name;
	}

	public CustomThread(){

	}
	@Override
	public void run() {
		System.out.println("Thread " + name + " running on: " +
				Thread.currentThread().getName());
		for (int i = 0; i < 2; i++) {
			System.out.println(name + ": " + i);
		}
	}
}
