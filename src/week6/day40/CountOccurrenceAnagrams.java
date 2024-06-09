package week6.day40;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceAnagrams {
    public static void main(String[] args) {
        String txt = "aabaabaa";
        String pat = "aaba";
        int search = search(pat, txt);
        System.out.println(search);
    }

    private static int search(String pat, String txt) {
        char[] txtArray = txt.toCharArray();
        char[] patArray = pat.toCharArray();
        int n = txt.length();
        int i = 0, j = 0;
        int k = pat.length();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> tmpMap = new HashMap<>();

        for (char c : patArray)
            map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println(map);

        while (j < n) {
            if ((j - i) + 1 == k) {
                int m = i;
                int c = 0;
                while (m < k + i) {
                    if (map.get(txtArray[m]) != null) {
                        c++;

                    }
                    m++;
                }
                if (c == k)
                    count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
