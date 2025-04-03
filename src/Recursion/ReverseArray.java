public class ReverseArray {

	public static void reverseArray(int arr[], int i, int j) {
		if (i >= j)
			return;
		if (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		reverseArray(arr, ++i, --j);
	}


	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int i = 0;
		int j = arr.length - 1;
		reverseArray(arr, i, j);
		for (int e : arr) {
			System.out.println(e);
		}

	}
}
