public class LinearSearch {

	// Function to perform linear search
	public static int linearSearch(int[] arr, int target) {
		// Iterate through the array
		for (int i = 0; i < arr.length; i++) {

			// If target is found, return the index
			if (arr[i] == target) {
				return i;
			}
		}
		// If target is not found, return -1
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50}; // Example array
		int target = 30; // Example target

		// Perform the search
		int result = linearSearch(arr, target);

		// Output the result
		if (result != -1) {
			System.out.println("Element found at index " + result);
		} else {
			System.out.println("Element not found");
		}
	}
}