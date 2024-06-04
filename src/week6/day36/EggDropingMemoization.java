package week6.day36;

import java.util.Arrays;

public class EggDropingMemoization {

    public static void main(String[] args) {
        int i = superEggDrop(6, 10000   );
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

        for (int i = 1; i <= n; i++) {
            int temp = 1 + Math.max(find(k - 1, i - 1, dp), find(k, n - i, dp));
            min = Math.min(temp, min);
        }
        return dp[k][n] = min;
    }
}
