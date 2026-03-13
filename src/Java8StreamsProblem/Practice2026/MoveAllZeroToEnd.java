package Practice2026;

import java.util.Arrays;

public class MoveAllZeroToEnd {
	public static void main(String[] args) {

		/*
		Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
		Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

		 */
		int arr[] = {1,2,3,0,4,5,6,7,0};
		//loop
		// 0 to n
		int j=0;
		for(int i=0;i< arr.length;i++){
		if(arr[i]!=0){
			arr[j] = arr[i];
			j++;
		}
		}

		for (int i = j; i< arr.length; i++){
			arr[i] = 0;
		}

		System.out.println(Arrays.toString(arr));

	}
}
