
// Java Program to check for triplet sum using Sorting
// and Two Pointer Technique

//Done
import java.util.Arrays;

/*
Why n - 2?
When you are looking for a triplet (three numbers), the first element in the triplet must be arr[i], and you need at least two more numbers to complete the triplet.

If the loop goes up to n - 1, you will be at the last element of the array.
But for a valid triplet, there must be at least two more numbers (after arr[i]), so you stop the loop at n - 2 to ensure that there are still two remaining elements to form a triplet.
 */
class ThreeSum {
	static boolean hasTripletSum(int[] arr, int target) {
		int n = arr.length;
		Arrays.sort(arr);

		// Fix the first element as arr[i]
		for (int i = 0; i < n - 2; i++) {

			// Initialize left and right pointers with
			// start and end of remaining subarray
			int l = i + 1, r = n - 1;

			int requiredSum = target - arr[i];
			while (l < r) {
				if (arr[l] + arr[r] == requiredSum)
					return true;
				if (arr[l] + arr[r] < requiredSum)
					l++;
				else if (arr[l] + arr[r] > requiredSum)
					r--;
			}
		}

		// If we reach here, then no triplet was found
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, 8 };
		int target = 13;
		if (hasTripletSum(arr, target))
			System.out.println("true");
		else
			System.out.println("false");
	}
}

