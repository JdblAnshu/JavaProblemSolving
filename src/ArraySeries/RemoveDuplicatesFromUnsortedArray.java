import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
//Done
public class RemoveDuplicatesFromUnsortedArray {


	private static void removeDuplicates(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int i = 0; i<arr.length; i++){
			set.add(arr[i]);
		}

		int[] array = set.stream().mapToInt(Integer::intValue).toArray();

		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {

		removeDuplicates(new int[]{1,2,3,4,4,4,3,2,1,66,77,66});

	}

}
