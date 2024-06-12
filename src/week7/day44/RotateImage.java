package week7.day44;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int[] a : matrix) {
            for (int i : a)
                System.out.print(i + "\t");
            System.out.println();
        }
        System.out.println("=======================");
        rotate(matrix);
    }

    private static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        for (int[] a : matrix) {
            for (int i : a)
                System.out.print(i + "\t");
            System.out.println();
        }
    }
}
