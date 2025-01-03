public class MaximumSubarraySum {

	private static void maximumSubArray(int[] arr) {

		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
			if(sum>maxSum){
				maxSum = sum;
			}
			if(sum<0)
				sum = 0;
		}

		System.out.println("Maximum subarray sum is " + maxSum);

	}


	public static void main(String[] args) {
		//int arr[] = {1,2,3,-5,6,2,1};
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		maximumSubArray(arr);
	}


}
