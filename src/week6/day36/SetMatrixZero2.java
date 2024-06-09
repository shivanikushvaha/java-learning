package week6.day36;

import java.util.HashMap;
import java.util.Map;

public class SetMatrixZero2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 0, 1, 1}
        };
        setZeroes(matrix);
    }

    private static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    int k = 0, l = 0;
                    while (k < matrix[i].length) {
                        if (matrix[i][k] != 0)
                            matrix[i][k] = -10;
                        k++;
                    }

                    while (l < n) {
                        if (matrix[l][j] != 0)
                            matrix[l][j] = -10;
                        l++;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] == -10)
                    matrix[i][j] = 0;

        for (int[] m : matrix){
            for (int i : m)
                System.out.print(i + "\t");
            System.out.println();
        }
    }
}
