package week5.day32;

public class ShortestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abac";
        String str2 = "cab";

        int m = str1.length();
        int n = str2.length();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int[][] dp = new int[m + 1][n + 1];

        String lcs = lcs(charArray1, charArray2, m, n, dp);
        System.out.println(lcs);
    }

    private static String lcs(char[] charArray1, char[] charArray2, int m, int n, int[][] dp) {
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
            }
            else {
                if (dp[i][j - 1] > dp[i - 1][j])
                    j--;
                else
                    i--;
            }
        }
        // Append remaining characters of str1 and str2
        while(i>0){
            sb.append(charArray1[i-1]);
            i--;
        }
        while(j>0){
            sb.append(charArray2[j-1]);
            j--;
        }

        return sb.reverse().toString();
    }
}
