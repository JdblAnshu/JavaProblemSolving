import java.util.*;

public class ListOfAllPairs {
}

// Java program to find all distinct pairs
// with given sum using HashMap

//https://www.geeksforgeeks.org/print-all-pairs-with-given-sum/
class GfG {
	static List<List<Integer>> distinctPairs(int[] arr, int target) {
		List<List<Integer>> res = new ArrayList<>();
		int n = arr.length;

		// frequency map to store the frequency of all elements
		Map<Integer, Integer> freq = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int complement = target - arr[i];

			// If the complement is equal to arr[i], then there should
			// be only one occurrence of complement in the hash map
			if (complement == arr[i]) {
				if (freq.getOrDefault(complement, 0) == 1)
					res.add(Arrays.asList(arr[i], arr[i]));
			}

			// if complement is not equal to arr[i], then there should
			// be at least one occurrence of complement and no occurrence
			// of current element in the hash map
			else if (freq.getOrDefault(complement, 0) > 0
					&& freq.getOrDefault(arr[i], 0) == 0) {
				int first = Math.min(arr[i], complement);
				int second = Math.max(arr[i], complement);
				res.add(Arrays.asList(first, second));
			}

			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, -1, 5};
		int target = 6;

		List<List<Integer>> res = distinctPairs(arr, target);
		for (List<Integer> pair : res) {
			System.out.println(pair.get(0) + " " + pair.get(1));
		}
	}
}
