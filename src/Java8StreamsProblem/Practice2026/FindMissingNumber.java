package Practice2026;

public class FindMissingNumber {
	public static void main(String[] args) {

		int[] arr = {8, 2, 4, 5, 3, 7, 1,6,10};

		int xor1 = 0;
		int xor2 = 0;

		for (int e : arr) {
			xor1 ^= e;
		}

		for (int i = 1; i <=arr.length + 1; i++) {
			xor2 ^= i;
		}

		System.out.println("Xor value " + (xor2 ^ xor1));
	}
}
