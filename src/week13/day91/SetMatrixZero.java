package week13.day91;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    int a = 0;
                    int b = 0;
                    while (a < m) {
                        if (matrix[a][j] == 0) {
                            a++;
                            continue;
                        }
                        matrix[a++][j] = 100;
                    }
                    while (b < n) {
                        if (matrix[i][b] == 0) {
                            b++;
                            continue;
                        }
                        matrix[i][b++] = 100;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 100)
                    matrix[i][j] = 0;
            }
        }

        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}
