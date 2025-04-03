public class Print1tonUsingRecursion {


	public static void print1ton(int i, int n) {

		if (i > n)
			return;

		System.out.println(i);
		print1ton(i + 1, n);

	}

	public static void main(String[] args) {
		print1ton(1, 50);
	}
}
