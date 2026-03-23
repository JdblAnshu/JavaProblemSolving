public class SecondSmallestElem {
	public static void main(String[] args) {
		int arr[] = {10, 21, 4, 71, 7, 5};

		Integer secondSmallest = Integer.MAX_VALUE;
		Integer firstSmallest = Integer.MAX_VALUE;

		for(int i = 0; i< arr.length; i++){

			if(arr[i] < firstSmallest){
				secondSmallest = firstSmallest;
				firstSmallest = arr[i];
			} else if(arr[i] > firstSmallest && arr[i] < secondSmallest){
				secondSmallest = arr[i];
			}

		}

		System.out.println("firstSmallest " + firstSmallest + " " + "secondSmallest " + secondSmallest);

	}
}
