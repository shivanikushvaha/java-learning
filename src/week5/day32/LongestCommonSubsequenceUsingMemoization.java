package week5.day32;

import java.util.Arrays;

public class LongestCommonSubsequenceUsingMemoization {
    public static void main(String[] args) {
        String text1 = "pmjghexybyrgzczy";
        String text2 = "hafcdqbgncrcbihkd";

        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }

        int lcs = lcs(text1, text2, m, n, dp);
        System.out.println(lcs);
    }

    private static int lcs(String x, String y, int m, int n, int[][] dp) {
        if (m == 0 || n == 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return dp[m][n] = 1 + lcs(x, y, m - 1, n - 1, dp);
        }
        return dp[m][n] = Math.max(lcs(x, y, m, n - 1, dp), lcs(x, y, m - 1, n, dp));
    }
}
