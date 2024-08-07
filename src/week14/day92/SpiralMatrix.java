package week14.day92;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> integers = spiralOrder(matrix);
        System.out.println(integers);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        if (m == 0) return list;

        int top = 0;
        int down = m - 1;
        int left = 0;
        int right = n - 1;
        int dir = 0;

        while (top <= down && left <= right) {
            // left to right
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
            }

            // top to bottom
            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
            }

            // right to left
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[down][i]);
                }
                down--;
            }

            // bottom to top
            if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

            dir++;
            if (dir == 4)
                dir = 0;
        }

        return list;
    }
}
