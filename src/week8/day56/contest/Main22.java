package week8.day56.contest;

public class Main22 {
    public static void main(String[] args) {
        int[][] grid = {{0, 1}};
        int i = minimumArea(grid);
        System.out.println(i);
    }

    public static int minimumArea(int[][] grid) {
        int minRow = grid.length, maxRow = -1;
        int minCol = grid[0].length, maxCol = -1;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    minRow = Math.min(minRow, r);
                    maxRow = Math.max(maxRow, r);
                    minCol = Math.min(minCol, c);
                    maxCol = Math.max(maxCol, c);
                }
            }
        }

        // If there are no 1's in the grid, the area would be 0
        if (minRow == grid.length || maxRow == -1 || minCol == grid[0].length || maxCol == -1) {
            return 0;
        }

        // Calculate the width and height of the rectangle
        int width = maxCol - minCol + 1;
        int height = maxRow - minRow + 1;

        // Return the area of the rectangle
        return width * height;
    }
}
