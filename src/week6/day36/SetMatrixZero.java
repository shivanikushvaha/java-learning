package week6.day36;

import java.util.HashMap;
import java.util.Map;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        for (int[] m : matrix){
            for (int i : m)
                System.out.print(i + "\t");
            System.out.println();
        }
        System.out.println("======================");

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    map.put(i, j);
                }
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()){
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (i == 0)
                        matrix[m.getKey()][j] = 0;
                    matrix[j][m.getValue()] = 0;
                }
            }
        }

        for (int[] m : matrix){
            for (int i : m)
                System.out.print(i + "\t");
            System.out.println();
        }

    }
}
