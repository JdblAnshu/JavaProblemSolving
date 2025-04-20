
//Is Merge sort In Place? - No, Merge sort is not an in place algorithm.we use an additional array to merge the subarrays in sorted
//Is Merge sort Stable? Yes, merge sort is stable the relational ordering of the elements with same value remains unchanged.
/*
Stability : Merge sort is a stable sorting algorithm, which means it maintains the relative order of equal elements in the input array.
Guaranteed worst-case performance: Merge sort has a worst-case time complexity of O(N logN) , which means it performs well even on large datasets.
 */
//Done
public class MergeSort {


	private static void mergeSort(int[] arr, int l, int r) {
		if(l<r){
			int m = l + (r-l)/2;
			mergeSort(arr,0,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for(int i=0; i<n1; i++){
			left[i] = arr[l + i];
		}

		for(int i=0; i<n2; i++){
			right[i] = arr[m + 1 + i];
		}

		int i=0;
		int j=0;
		int k = l;

		while(i< n1 && j<n2){
			if(left[i]>right[j]){
				arr[k] = right[j];
				j++;
			}else{
				arr[k] = left[i];
				i++;
			}
			k++;
		}

		while (i<n1){
			arr[k] = left[i];
			i++;
			k++;

		}

		while (j<n2){
			arr[k] = right[j];
			k++;
			j++;
		}
	}


	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int j : arr) System.out.print(j + " ");
		System.out.println();
	}


	public static void main(String[] args) {
		int arr[] = {1,2,3,12,45,7,321,654};
		int r = arr.length;
		mergeSort(arr,0,arr.length - 1);

		printArray(arr);
	}



}
