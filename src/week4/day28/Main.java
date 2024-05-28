package week4.day28;

import week3.day19.iterator.Item;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String s = main.longestPalindrome("ccc");
        System.out.println(s);
    }

    private String longestPalindrome(String s) {

        if (s.length() <= 1) return s;

        int n = s.length();
        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < n; i++) {
            for (int j = i + maxLen; j <= n; j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
