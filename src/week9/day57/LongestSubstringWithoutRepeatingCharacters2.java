package week9.day57;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters2 {
    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLenght = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (!map.containsKey(ch)) {
                map.put(ch, right);
                maxLenght = Math.max(right - left + 1, maxLenght);
            } else {
                left = map.get(ch) + 1;
                map.put(ch, right);
            }
        }
        return maxLenght;
    }
}
