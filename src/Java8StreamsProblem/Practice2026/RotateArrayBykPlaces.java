package Practice2026;

import java.util.Arrays;

public class RotateArrayBykPlaces {

	public static void reverse(int arr[], int start, int end){
		while (start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[] = {11,2,33,4,54,6,7};
		int k = 2;
		int n = arr.length;

		reverse(arr,0, k-1);
		reverse(arr,k, n - 1);
		reverse(arr,0,n-1);

		System.out.println(Arrays.toString(arr));

		//Left : reverse A → reverse B → reverse all
		//Right: reverse all → reverse B → reverse A
	}
}
