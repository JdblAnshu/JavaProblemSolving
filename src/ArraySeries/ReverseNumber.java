public class ReverseNumber {
	public static int reverse(int number) {
		int result = 0;
		while(number > 0) {
			int digit = number % 10;
			result = result * 10 + digit;
			number = number/10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Reverse element");
		System.out.println(reverse(12345));
	}
}
