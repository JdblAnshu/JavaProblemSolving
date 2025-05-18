package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

public static List<Integer> spiralOrder(int[][] mat) {
        // Define ans list to store the result.
        List<Integer> ans = new ArrayList<>();

        int r = mat.length; // no. of rows
        int c = mat[0].length; // no. of columns

        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = r - 1, right = c - 1;

        // Loop until all elements are not traversed.
        while (top <= bottom && left <= right) {

            // For moving left to right
            for (int i = left; i <= right; i++)
                ans.add(mat[top][i]);

            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                ans.add(mat[i][right]);

            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);

                left++;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };

		List<Integer> res = spiralOrder(mat);

		for (int num : res) {
			System.out.print(num + " ");
		}
	}



}
