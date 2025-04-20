import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "apple"));

		// Element to be removed
		String elementToRemove = "apple";

		// Remove all occurrences of the element
		//list.removeAll(Collections.singleton(elementToRemove));
		list.removeIf(e -> e.equals(elementToRemove));

		// Output the modified list
		System.out.println(list);
	}
}

