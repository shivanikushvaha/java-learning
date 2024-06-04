package week5.day33;

public class MinimumInsertionToMakePalindrome {
    public static void main(String[] args) {
        String s = "leetcode";
        int i = longestPalindromeSubseq(s);
        System.out.println(i);
    }

    private static int longestPalindromeSubseq(String s) {
        String revStr = new StringBuilder(s).reverse().toString();

        if (s.equals(revStr))
            return 0;

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = revStr.toCharArray();
        int m = s.length();
        int n = s.length();
        int[][] dp = new int[m + 1][n + 1];

        return n - lps(charArray1, charArray2, m, n, dp);
    }

    private static int lps(char[] charArray1, char[] charArray2, int m, int n, int[][] dp) {
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (charArray1[i - 1] == charArray2[j - 1])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }
}
