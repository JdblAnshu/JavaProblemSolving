public class InsertionSort {
	/* Function to sort array using insertion sort */
	void sort(int arr[])
	{
		for(int i = 1; i<arr.length; i++){
			int temp = arr[i];
			int j = i - 1;

			while(j>=0 && arr[j] > temp){
				arr[j+1] = arr[j];
				j = j -1;
			}
			//Place the key element in its correct position
			arr[j + 1] = temp;
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6 };

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
	}
}