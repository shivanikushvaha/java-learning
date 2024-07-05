package week10.day67;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland2 {
    public static void main(String[] args) {
        char[][] grid = {
                {'0', '1', '1', '1', '0', '0', '0'},
                {'0', '0', '1', '1', '0', '1', '0'}
        };
        int i = numIslands(grid);
        System.out.println(i);
    }

    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == '1' && vis[row][col] == 0) {
                    count++;
                    bfs(row, col, grid, vis);
                }
            }
        }
        return count;
    }

    private static void bfs(int ro, int co, char[][] grid, int[][] vis) {
        vis[ro][co] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro, co));
        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            int[] delrow = {-1, 0, 1, 0};
            int[] delcol = {0, 1, 0, -1};
            q.remove();

            for (int k = 0; k < 4; k++) {
                int nrow = delrow[k] + row;
                int ncol = delcol[k] + col;

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
    }

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
