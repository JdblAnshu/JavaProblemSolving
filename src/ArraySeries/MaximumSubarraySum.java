import java.util.ArrayList;
import java.util.List;

public class MaximumSubarraySum {
//Done
	/*

	Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.
	Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
	Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
	Output: 11


	Input: arr[] = {-2, -4}
	Output: –2
	Explanation: The subarray {-2} has the largest sum -2.


	Input: arr[] = {5, 4, 1, 7, 8}
	Output: 25
	Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
	 */
	private static void maximumSubArray(int[] arr) {

		int maxSum = Integer.MIN_VALUE;
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
			list.add(arr[i]);
			if(sum>maxSum){
				maxSum = sum;
				
			}
			if(sum<0)
				sum = 0;
			//list = null;
		}

		System.out.println("Maximum subarray sum is " + maxSum);

	}


	public static void main(String[] args) {
		//int arr[] = {1,2,3,-5,6,2,1};
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		maximumSubArray(arr);
	}


}
