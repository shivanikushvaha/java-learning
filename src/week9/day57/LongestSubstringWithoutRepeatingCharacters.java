package week9.day57;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int n = s.length();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (!charSet.contains(ch)) {
                charSet.add(ch);
                maxLength = Math.max(right - left + 1, maxLength);
            } else {
                while (charSet.contains(ch)) {
                    charSet.remove(s.charAt(left++));
                }
                charSet.add(ch);
            }
        }
        return maxLength;
    }
}
