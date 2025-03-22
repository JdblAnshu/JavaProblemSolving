import java.util.ArrayList;
import java.util.List;
//Done
public class ReverseAndRemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1, 4, 5};

		// Step 1: Use a List to store elements and manually remove duplicates
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			if (!list.contains(num)) {
				list.add(num);
			}
		}

		// Step 2: Reverse the List manually
		List<Integer> reversedList = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}

		// Step 3: Convert List back to an array
		int[] result = new int[reversedList.size()];
		for (int i = 0; i < reversedList.size(); i++) {
			result[i] = reversedList.get(i);
		}

		// Printing the result
		System.out.println("Reversed array without duplicates:");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
