package week10.day68;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges2 {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int minutes = orangesRotting(grid);
        System.out.println("Minutes to rot all oranges: " + minutes);
    }

    public static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int minutes = 0;

        while (!queue.isEmpty() && freshOranges > 0) {
            minutes++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int[] dir : directions) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    if (x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        queue.add(new int[]{x, y});
                        freshOranges--;
                    }
                }
            }
        }

        return freshOranges == 0 ? minutes : -1;
    }
}
