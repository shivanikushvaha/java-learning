package week5.day32;

public class PrintLongestSubsequenceUsingDP {
    public static void main(String[] args) {
        String text1 = "abac";
        String text2 = "cab";

        int m = text1.length();
        int n = text2.length();
        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();
        int[][] dp = new int[m + 1][n + 1];

        int lcs = lcs(charArray1, charArray2, m, n, dp);
        System.out.println(lcs);
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

        int i = m;
        int j = n;
        StringBuilder sb = new StringBuilder();

        while (i > 0 && j > 0) {
            if (charArray1[i - 1] == charArray2[j - 1]) {
                sb.append(charArray1[i - 1]);
                i--;
                j--;
            } else {
                if (dp[i][j - 1] > dp[i - 1][j])
                    j--;
                else
                    i--;
            }
        }
        System.out.println(sb.reverse());
        return dp[m][n];
    }
}
