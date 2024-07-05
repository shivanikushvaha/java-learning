package week10.day67;

public class NumberOfIsland {
    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int i = numIslands(grid);
        System.out.println(i);
    }

    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int i, int j, char[][] grid) {
        if (i >= 0 && j>= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = '0';
            dfs(i, j + 1, grid);
            dfs(i, j - 1, grid);
            dfs(i + 1, j, grid);
            dfs(i - 1, j, grid);
        }
    }

}
