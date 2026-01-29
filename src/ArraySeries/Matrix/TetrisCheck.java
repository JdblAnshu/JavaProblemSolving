package Matrix;

/**
 * Ref: https://codesignal.com/blog/example-codesignal-questions/ Question 3
 * You are given a matrix of integers field of size height × width representing a game field, and also a matrix of integers figure of size 3 × 3 representing a figure. Both matrices contain only 0s and 1s, where 1 means that the cell is occupied, and 0 means that the cell is free.
 *
 * You choose a position at the top of the game field where you put the figure and then drop it down. The figure falls down until it either reaches the ground (bottom of the field) or lands on an occupied cell, which blocks it from falling further. After the figure has stopped falling, some of the rows in the field may become fully occupied.
 * Your task is to find the dropping position such that at least one full row is formed. As a dropping position, you should return the column index of the cell in the game field which matches the top left corner of the figure’s 3 × 3 matrix. If there are multiple dropping positions satisfying the condition, feel free to return any of them. If there are no such dropping positions, return -1.
 *
 * Note: The figure must be dropped so that its entire 3 × 3 matrix fits inside the field, even if part of the matrix is empty.
 *
 * For
 * field = [[0, 0, 0],
 *          [0, 0, 0],
 *          [0, 0, 0],
 *          [1, 0, 0],
 *          [1, 1, 0]]
 * and
 * figure = [[0, 0, 1],
 *          [0, 1, 1],
 *          [0, 0, 1]]
 *
 * the output should be solution(field, figure) = 0.
 *
 * Because the field is a 3 x 3 matrix, the figure can be dropped only from position 0. When the figure stops falling, two fully occupied rows are formed, so dropping position 0 satisfies the condition.
 *
 * For
 * field =  [[0, 0, 0, 0, 0],
 *           [0, 0, 0, 0, 0],
 *           [0, 0, 0, 0, 0],
 *           [1, 1, 0, 1, 0],
 *           [1, 0, 1, 0, 1]]
 *
 * and
 * figure = [[1, 1, 1],
 *           [1, 0, 1],
 *           [1, 0, 1]]
 *
 * the output should be solution(field, figure) = 2.
 *
 *
 * For
 * field =  [[0, 0, 0, 0],
 *           [0, 0, 0, 0],
 *           [0, 0, 0, 0],
 *           [1, 0, 0, 1],
 *           [1, 1, 0, 1]]
 *
 * and
 * figure = [[1, 1, 0],
 *           [1, 0, 0],
 *           [1, 0, 0]]
 *
 * the output should be solution(field, figure) = -1
 */

class TetrisCheck {

    public static int solution(int[][] field, int[][] figure) {
        int H = field.length;
        int W = field[0].length;

        // Try each valid column
        for (int col = 0; col <= W - 3; col++) {

            int row = 0;

            // Move down until collision or bottom
            while (canPlace(field, figure, row + 1, col)) {
                row++;
                if (row + 3 == H) break;
            }

            // Copy field and place figure
            int[][] copy = copyField(field);
            placeFigure(copy, figure, row, col);

            // Check for full row
            if (hasFullRow(copy)) {
                return col;
            }
        }

        return -1;
    }

    private static boolean canPlace(int[][] field, int[][] figure, int row, int col) {
        int H = field.length;

        if (row + 3 > H) return false;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (figure[r][c] == 1 && field[row + r][col + c] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void placeFigure(int[][] field, int[][] figure, int row, int col) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (figure[r][c] == 1) {
                    field[row + r][col + c] = 1;
                }
            }
        }
    }

    private static boolean hasFullRow(int[][] field) {
        for (int[] row : field) {
            boolean full = true;
            for (int cell : row) {
                if (cell == 0) {
                    full = false;
                    break;
                }
            }
            if (full) return true;
        }
        return false;
    }

    private static int[][] copyField(int[][] field) {
        int[][] copy = new int[field.length][field[0].length];
        for (int i = 0; i < field.length; i++) {
            //copy[i] = field[i].clone();
            System.arraycopy(field[i], 0, copy[i], 0, field[0].length);
        }
        return copy;
    }

    public static void main(String args[]) {
        int field[][] = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1}
        };
        int figure[][] = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 0, 1}
        };
        System.out.println("Tetris Check: " + solution(field, figure));

    }
}
