//Done
class ArraySortedOrNot {

	// Function that returns true if array is
	// sorted in non-decreasing order.
	static boolean arraySortedOrNot(int arr[], int n)
	{

		// Array has one or no element
		if (n == 0 || n == 1)
			return true;

		for (int i = 1; i < n; i++)

			// Unsorted pair found
			if (arr[i - 1] > arr[i])
				return false;

		// No unsorted pair found
		return true;
	}

	// driver code
	public static void main(String[] args)
	{

		int arr[] = { 201, 23, 23, 45, 78, 88 };
		int n = arr.length;

		if (arraySortedOrNot(arr, n))
			System.out.print("Yes\n");
		else
			System.out.print("No\n");
	}
}