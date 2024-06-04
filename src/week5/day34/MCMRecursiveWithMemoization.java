package week5.day34;

import java.util.Arrays;

public class MCMRecursiveWithMemoization {

    static int[][] dp = new int[100][100];

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int n = arr.length;

        for (int[] a : dp)
            Arrays.fill(a, -1);

        int i = matrixChainOrder(arr, 1, n - 1);
        System.out.println(i);
    }

    private static int matrixChainOrder(int[] arr, int i, int j) {
        if (i >= j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        dp[i][j] = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            dp[i][j] = Math.min(dp[i][j], matrixChainOrder(arr, i, k)
                    + matrixChainOrder(arr, k + 1, j)
                    + arr[i - 1] * arr[k] * arr[j]);
        }
        return dp[i][j];
    }
}
