package week5.day33;

public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        String s = "letsleetcode";
        String i = longestSubsequenceRepeated(s);
        System.out.println(i);
    }

    private static String longestSubsequenceRepeated(String s) {
        char[] charArray1 = s.toCharArray();
        int m = s.length();
        int[][] dp = new int[m + 1][m + 1];

        return lcs(charArray1, m, m, dp);
    }

    private static String lcs(char[] charArray, int m, int n, int[][] dp) {
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (charArray[i - 1] == charArray[j - 1] && i != j)
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        int i = m;
        int j = n;
        StringBuilder sb = new StringBuilder();

        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[j - 1][j - 1] + 1) {
                sb.append(charArray[i - 1]);
                i--;
                j--;
            } else if (dp[i][j] == dp[i - 1][j])
                i--;
            else
                j--;
        }

        return sb.reverse().toString();
    }
}
