import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayListAfterGivenIndex {


	public static void reverseArray(ArrayList<Integer> arr, int m) {
		// Write your code here.


		int left = m + 1;
		int right = arr.size() - 1;

		while (left < right) {
			int temp = arr.get(left);
			arr.set(left, arr.get(right));
			arr.set(right, temp);
			left++;
			right--;

		}

		arr.forEach(System.out::println);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int m = 3;
		//		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));


		// Convert int[] to Integer ArrayList using streams
		ArrayList<Integer> list = Arrays.stream(arr)  // Create an IntStream from the int array
				.boxed()       // Convert the IntStream to a Stream<Integer> (autoboxing)
				.collect(Collectors.toCollection(ArrayList::new));


		reverseArray(list,m);
	}
}
