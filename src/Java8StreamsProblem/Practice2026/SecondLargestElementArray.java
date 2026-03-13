package Practice2026;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		int[] arr = {12,31,41,23,45,56,67,798};

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i=0; i<arr.length;i++){
			if(arr[i] > firstLargest){
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(arr[i] > secondLargest && arr[i]<firstLargest){
				secondLargest = arr[i];
			}


		}

		System.out.println("Value of the second largest element" + " " + secondLargest + "  " + firstLargest);


	}
}
