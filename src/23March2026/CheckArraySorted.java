
public class CheckArraySorted {
	// Function to check if the array is sorted
	public boolean isSorted(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[i - 1])  // If any element is smaller than the previous one, return false
				return false;
		}
		return true;  // Return true if the array is sorted
	}
}

 class Main {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		CheckArraySorted obj = new CheckArraySorted();

		// Output result
		System.out.println(obj.isSorted(arr, n) ? "True" : "False");
	}
}
