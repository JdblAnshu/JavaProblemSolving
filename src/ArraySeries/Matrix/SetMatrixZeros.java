package Matrix;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

	public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        int n = matrix[0].length, m = matrix.length;
        //Set row and col matrix
        for(int i = 0;i<m; i++) {
            for(int j =0;j<n;j++) {
                if(matrix[i][j]==0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        //Set values to 0 if present in row/col
        for(int i=0;i<m;i++) {
            for(int j =0;j<n;j++) {
                if(row.contains(i))
                {
                    matrix[i][j] = 0;
                } else if(col.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
}

	public static void main(String[] args) {
		int[][] mat = { { 0, 1, 2, 0 },
						{ 3, 4, 0, 2 },
						{ 1, 3, 1, 5 } };


		setZeroes(mat);

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
