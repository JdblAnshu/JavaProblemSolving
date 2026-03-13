package Practice2026;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {

		int[] arr = {1,1,2,3,4,4,5,6,7,8};
		int j = 0;
		for(int i=0; i<arr.length; i++){
		if(arr[j]!=arr[i]){
			j++;
			arr[j] = arr[i];
		}

		}

		for(int i=0;i<arr.length;i++){
			System.out.println("val" + " " + arr[i]);
		}

	}
}
