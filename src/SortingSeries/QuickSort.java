public class QuickSort {
//Best Case: (Ω(n log n)), Occurs when the pivot element divides the array into two equal halves.
//Average Case (θ(n log n)), On average, the pivot divides the array into two parts, but not necessarily equal.
//Worst Case: (O(n²)), Occurs when the smallest or largest element is always chosen as the pivot (e.g., sorted arrays).
//Done
	private static void quickSort(int[] arr, int low, int high) {

		if(low < high){
			// pi is the partition return index of pivot
			int pivot = partition(arr,low,high);
			quickSort(arr,low,pivot - 1);
			quickSort(arr,pivot + 1, high);
		}
	}
	// Partition function
	private static int partition(int[] arr, int low, int high) {
		// Choose the pivot
		int pivot = arr[high];

		int i = low - 1;
		// Traverse arr[low..high] and move all smaller
		// elements to the left side. Elements from low to
		// i are smaller after every iteration
		for(int j = low; j<=high - 1; j++){
			if(arr[j] < pivot ) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr,i+1,high);
		return i+1;
	}


	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}


	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int j : arr) System.out.print(j + " ");
		System.out.println();
	}


	public static void main(String[] args) {
		int[] arr = {1,2,3,12,45,7,321,654};
		int r = arr.length;
		quickSort(arr,0,r - 1);

		printArray(arr);
	}




}
