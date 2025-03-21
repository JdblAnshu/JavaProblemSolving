//Done
public class NumberOfIslands {

	//https://leetcode.com/problems/number-of-islands/description/

//
//	class Solution {
//		private static final int[][] DIRECTIONS = {
//				{-1, 0}, // up
//				{1, 0},  // down
//				{0, -1}, // left
//				{0, 1}   // right
//		};
//
//		public int numIslands(char[][] grid) {
//			if (grid == null || grid.length == 0) {
//				return 0;
//			}
//
//			int numIslands = 0; // Counter for the number of islands.
//			int rows = grid.length;
//			int cols = grid[0].length;
//
//			for (int i = 0; i < rows; i++) {
//				for (int j = 0; j < cols; j++) {
//					if (grid[i][j] == '1') { // Land cell found.
//						numIslands++;
//						bfs(grid, i, j); // Start BFS from this cell.
//					}
//				}
//			}
//
//			return numIslands; // Return the total count of islands.
//		}
//
//		private void bfs(char[][] grid, int row, int col) {
//			Queue<int[]> queue = new LinkedList<>();
//			queue.offer(new int[]{row, col}); // Start BFS with the initial land cell.
//			grid[row][col] = '0'; // Mark this cell as visited by turning it into water.
//
//			while (!queue.isEmpty()) {
//				int[] current = queue.poll();
//				int currRow = current[0];
//				int currCol = current[1];
//
//				for (int[] direction : DIRECTIONS) {
//					int newRow = currRow + direction[0];
//					int newCol = currCol + direction[1];
//
//					// Check if the new position is within the grid and is a land cell.
//					if (newRow >= 0 && newRow < grid.length &&
//							newCol >= 0 && newCol < grid[0].length &&
//							grid[newRow][newCol] == '1') {
//						queue.offer(new int[]{newRow, newCol}); // Add new land cell to queue.
//						grid[newRow][newCol] = '0'; // Mark as visited.
//					}
//				}
//			}
//		}
//	}
}
//grid[newRow][newCol] == '1' means not visited yet make it 0 or water 1 is land