public class LargestElementArray {

	//Declare a max variable
	//Loop through the array from 0 to len - 1
	//Check if any is greater than max update max var

	// Function to find the largest element in the array
	public static int findLargestElement(int[] arr, int n) {
		int max = arr[0];  // Initialize max with the first element in the array

		// Iterate through the array to find the maximum element
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {  // If the current element is greater than max, update max
				max = arr[i];
			}
		}

		return max;  // Return the largest element found
	}

}
