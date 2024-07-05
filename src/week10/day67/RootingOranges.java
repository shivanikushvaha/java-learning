package week10.day67;

import java.util.Arrays;

public class RootingOranges {
    static int min = 0;

    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] i = orangesRotting(grid);
        for (int[] o : i)
            System.out.println(Arrays.toString(o));
    }

    public static int[][] orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    dfs(i, j, grid);
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }

        System.out.println(min - 2);
        return grid;
    }

    private static void dfs(int i, int j, int[][] grid) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && (grid[i][j] == 2 || grid[i][j] == 1)) {
            min++;
            grid[i][j] = 2;
            dfs(i, j + 1, grid);
            dfs(i, j - 1, grid);
            dfs(i + 1, j, grid);
            dfs(i - 1, j, grid);
        }
    }
}
