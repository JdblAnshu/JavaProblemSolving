package Matrix;

import java.util.Arrays;
import java.util.List;

	public	class RotateMatrix {
		static void rotate(int[][] matrix) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = i; j < matrix[0].length; j++) {
					//int temp;
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length / 2; j++) {
					//int temp;
					int temp = matrix[i][j];
					matrix[i][j] = matrix[i][matrix.length - 1 - j];
					matrix[i][matrix.length - 1 - j] = temp;
				}
			}
		}

		public static void rotateMatrix(int[][] arr){
			for(int i=0;i< arr.length;i++){
				for(int j=i;j<arr[0].length;j++){
					int temp = arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i] = temp;
				}
			}


			for(int i=0;i<arr.length;i++){
				//for (int j=0;j< arr.length;j++){
					int low = 0;
					int high = arr.length-1;
					while (low<high){
						int temp = arr[i][low];
						arr[i][low] = arr[i][high];
						arr[i][high] = temp;
						low++;
						high--;
					}
				}
			//}
		}






		public static void main(String args[]) {
			int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
			//rotate(arr);
			rotateMatrix(arr);
			System.out.println("Rotated Image");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

		}
	}


