package week10.day70.contest405;

public class Main3 {
    public static void main(String[] args) {
        char[][] grid = {{'.','.'},{'.','.'}};
        int i = numberOfSubmatrices(grid);
        System.out.println(i);
    }

    public static int numberOfSubmatrices(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int result = 0;

        for (int top = 0; top < rows; top++) {
            for (int left = 0; left < cols; left++) {
                for (int bottom = top; bottom < rows; bottom++) {
                    for (int right = left; right < cols; right++) {
                        if (isValidSubmatrix(grid, top, left, bottom, right)) {
                            result++;
                        }
                    }
                }
            }
        }

        return result;
    }

    private static boolean isValidSubmatrix(char[][] grid, int top, int left, int bottom, int right) {
        int xCount = 0;
        int yCount = 0;
        boolean containsGrid00 = false;

        for (int i = top; i <= bottom; i++) {
            for (int j = left; j <= right; j++) {
                if (grid[i][j] == 'X') xCount++;
                else if (grid[i][j] == 'Y') yCount++;
                if (i == 0 && j == 0) containsGrid00 = true;
            }
        }

        return containsGrid00 && xCount > 0 && xCount == yCount;
    }
}
