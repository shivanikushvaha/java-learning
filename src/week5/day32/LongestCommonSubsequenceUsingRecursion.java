package week5.day32;

public class LongestCommonSubsequenceUsingRecursion {
    public static void main(String[] args) {
        LongestCommonSubsequenceUsingRecursion main = new LongestCommonSubsequenceUsingRecursion();
        int i = main.longestCommonSubsequence("pmjghexybyrgzczy", "hafcdqbgncrcbihkd");
        System.out.println(i);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        return lcs(text1, text2, m, n);
    }

    private int lcs(String text1, String text2, int m, int n) {
        if (n == 0 || m == 0)
            return 0;
        if (text1.charAt(m - 1) == text2.charAt(n - 1))
            return 1 + lcs(text1, text2, m - 1, n - 1);
        else
            return Math.max(lcs(text1, text2, m, n - 1),
                    lcs(text1, text2, m - 1, n));
    }
}
