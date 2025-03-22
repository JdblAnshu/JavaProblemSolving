package Matrix;

import java.util.Arrays;
import java.util.List;

public class RotateMatrix {
	/*
	rotate matrix:
public void rotate(int[][] matrix) {
        //Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
	 */


	public static void main(String[] args) {
		int[] arr={1,2,3,4,51,6};
		int high = arr.length - 1;
		for(int i=0;i< arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 -i];
			arr[high] = temp;
			//high--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
