package week5.day32;

public class LongestCommonSubstringUsingDP {
    public static void main(String[] args) {
        String text1 = "GeeksforGeeks";
        String text2 = "GeeksQuiz";
        int m = text1.length();
        int n = text2.length();

        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();
        int[][] dp = new int[m + 1][n + 1];

        int lcs = lcs(charArray1, charArray2, m, n, dp);
        System.out.println(lcs);
    }

    private static int lcs(char[] charArray1, char[] charArray2, int m, int n, int[][] dp) {
        int count = 0;
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (charArray1[i - 1] == charArray2[j - 1]){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    count = Math.max(count, dp[i][j]);
                }
                else
                    dp[i][j] = 0;
            }
        }
        return count;
    }
}
