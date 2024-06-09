package week6.day40;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceAnagrams2 {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        int search = search(pat, txt);
        System.out.println(search);
    }

    private static int search(String pat, String txt) {
        char[] txtArray = txt.toCharArray();
        char[] patArray = pat.toCharArray();
        int n = txt.length();
        int i = 0, j = 0;
        int k = pat.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : patArray)
            map.put(c, map.getOrDefault(c, 0) + 1);
        int count = map.size();

        while (j < n) {
            char ch = txtArray[i];
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(txtArray[i]) == 0)
                    count--;
            }

            if ((j - i) + 1 < k) {
                j++;
            }
            else if ((j - i) + 1 == k){
                if (count == 0)
                    ans++;

                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) == 1)
                        count++;
                }
            }
            i++;
            j++;
        }
        return ans;
    }
}
