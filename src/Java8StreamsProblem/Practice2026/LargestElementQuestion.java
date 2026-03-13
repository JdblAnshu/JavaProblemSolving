package Practice2026;

import java.util.Arrays;

public class LargestElementQuestion {
	public static void main(String[] args) {

		int[] arr = {21,31,51,71,65};
		int maxVal = Integer.MIN_VALUE;

		for (int j : arr) {
			if (j > maxVal) {
				maxVal = j;
			}
		}

		System.out.println(Arrays.stream(arr).max().getAsInt());
		System.out.println("MaxVal" + " " +  maxVal);
	}
}
