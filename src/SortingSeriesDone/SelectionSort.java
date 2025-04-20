


//Why is Selection Sort generally not used in practice for large datasets?
//Expected Answer: Selection Sort is not efficient for large datasets because it has a time complexity of O(n^2). Even though
//it performs fewer swaps than algorithms like Bubble Sort, it still requires a large number of comparisons. For large datasets,
//more efficient algorithms like Quick Sort or Merge Sort with time complexities of O(n log n) are preferred.


class SelectionSort {
//https://www.programiz.com/dsa/selection-sort
	static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {

			// Assume the current position holds
			// the minimum element
			int min_idx = i;

			// Iterate through the unsorted portion
			// to find the actual minimum
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {

					// Update min_idx if a smaller element
					// is found
					min_idx = j;
				}
			}

			// Move minimum element to its
			// correct position
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
	}

	static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};

		System.out.print("Original array: ");
		printArray(arr);

		selectionSort(arr);

		System.out.print("Sorted array: ");
		printArray(arr);
	}

}