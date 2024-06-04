package week6.day36;

import java.util.Arrays;

public class EggDropingDP {
    public static void main(String[] args) {
        int i = superEggDrop(6, 10000);
        System.out.println(i);
    }

    public static int superEggDrop(int k, int n) {
        int[][] dp = new int[k + 1][n + 1];

        for (int[] d : dp)
            Arrays.fill(d, - 1);

        return find(k, n, dp);
    }

    private static int find(int k, int n, int[][] dp) {
        if (n == 0 || n == 1)
            return n;
        if (k == 1)
            return n;
        if (dp[k][n] != -1)
            return dp[k][n];

        int min = Integer.MAX_VALUE;
        int low;
        int high;
        for (int i = 1; i <= n; i++) {
            if (dp[k - 1][i - 1] != -1)
                low = dp[k - 1][i - 1];
            else {
                low = find(k - 1, i - 1, dp);
                dp[k - 1][i - 1] = low;
            }

            if (dp[k][n - i] != -1)
                high = dp[k][n - i];
            else {
                high = find(k, n - i, dp);
                dp[k][n - i] = high;
            }

            int temp = 1 + Math.max(low, high);
            min = Math.min(temp, min);
        }
        return dp[k][n] = min;
    }
}
