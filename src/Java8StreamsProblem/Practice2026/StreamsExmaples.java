package Practice2026;

import java.util.Arrays;

public class StreamsExmaples {


	public static void main(String[] args) {
		int[] arr = {1,21,3};

		Arrays.stream(arr).boxed().distinct().sorted().toList();

		int secondSmallest  = Arrays.stream(arr).sorted().skip(1).findFirst().orElse(-1);

		System.out.println(secondSmallest);


		//////Array is sorted

		for(int e = 1; e<arr.length; e++){
			if(arr[e-1] > arr[e]){
				System.out.println("not sorted ");
			}

		}
	}
}
