package week8.day56.contest;

public class Main2 {
    public static void main(String[] args) {
        int[][] grid = {{0}, {1}};
        int i = minimumArea(grid);
        System.out.println(i);
    }

    public static int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (m == 1) {
            for (int i = 0; i < n; i++) {
                if (grid[0][i] == 1)
                    return m;
            }
        }

        int l = 0;
        int b = 0;
        int lCount;
        int bCount;

        for (int i = 0; i < m; i++) {
            lCount = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    lCount++;
            }
            if (lCount != n)
                l++;
        }

        for (int i = 0; i < n; i++) {
            bCount = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 0)
                    bCount++;
            }
            if (bCount != n)
                b++;
        }

        if (l == 0)
            l = 1;
        if (b == 0)
            b = 1;
        return l * b;
    }
}
