public class BinarySearch {
	public static int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				low = mid + 1;

			} else {
				high = mid -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,7};
		int target = 7;
		int result = search(arr,target);
		if (result == -1)
			System.out.println(
					"Element is not present in array");
		else
			System.out.println("Element is present at "
					+ "index " + result);
	}
}

