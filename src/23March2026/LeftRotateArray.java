import java.util.Arrays;

public class LeftRotateArray {


	public static void reverse(int arr[], int start, int end){

		while (start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}

	}

	public static void rotateArray(int [] arr, int k){

		//For left rotate
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length-1);


		//For right rotate
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length - 1);

	}
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6};
		int k = 2;
		rotateArray(arr, k);

		System.out.println(Arrays.toString(arr));
		//3,4,5,6,1,2





	}
}
