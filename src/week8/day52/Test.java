package week8.day52;

public class Test {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix1 = maxProfitAssignment(matrix);
        for (int[] ma : matrix1) {
            for (int m : ma)
                System.out.print(m + "\t");
            System.out.println();
        }
    }

    private static int[][] maxProfitAssignment(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = matrix[j][n - (i + 1)];
            }
        }
        return arr;
    }
}
