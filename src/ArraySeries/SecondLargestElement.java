public class SecondLargestElement {
//Done
	private static void findSecondLargestElement(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++){
			//System.out.println(arr[i]);

			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];

			}
			else if(arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}

		}
		System.out.println("Second largest element " + secondLargest);

	}

	public static void main(String[] args) {
		System.out.println("Second largest element");
		int arr[] = {1,2,3,4,5,7,6};
		findSecondLargestElement(arr);
	}


}
