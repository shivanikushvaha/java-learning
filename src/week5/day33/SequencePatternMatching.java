package week5.day33;

public class SequencePatternMatching {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        int i = isSubsequence(s, t);
        System.out.println(i);
    }

    private static int isSubsequence(String s, String t) {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        int m = s.length();
        int n = s.length();
        int[][] dp = new int[m + 1][n + 1];

        return lcs(charArray1, charArray2, m, n, dp);
    }

    private static int lcs(char[] charArray1, char[] charArray2, int m, int n, int[][] dp) {
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
