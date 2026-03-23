public class SecondLargestElem {



	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 7, 7, 5};

		Integer firstLargest = Integer.MIN_VALUE;
		Integer secondLargest = Integer.MIN_VALUE;

		for(int i = 0; i< arr.length; i++){

			if(arr[i] > firstLargest){
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if(arr[i] < firstLargest && arr[i] > secondLargest){
				secondLargest = arr[i];
			}

		}

		System.out.println("firstLargest " + firstLargest + " " + "secondLargest " + secondLargest);


	}
}
