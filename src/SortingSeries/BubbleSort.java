public class BubbleSort {
	// Method to perform bubble sort
	//https://www.geeksforgeeks.org/bubble-sort-algorithm/
	public static void bubbleSort(int[] arr) {
		int n = arr.length;

		// Traverse through all array elements
		for (int i = 0; i < n - 1; i++) {
			// Last i elements are already sorted after each pass
			for (int j = 0; j < n - i - 1; j++) {
				// Swap if the element found is greater than the next element
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}



	// Method to print an array
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};

		System.out.println("Unsorted array:");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("Sorted array:");
		printArray(arr);
	}
}
