package week12.day84;

import java.util.HashMap;
import java.util.Map;

public class MininumCostToConvertString {
    public static void main(String[] args) {
        String source = "abcd";
        String target = "acbe";
        char[] original = {'a', 'b', 'c', 'c', 'e', 'd'};
        char[] changed = {'b', 'c', 'b', 'e', 'b', 'e'};
        int[] cost = {2, 5, 5, 1, 2, 20};
    }

    public long minimumCost(String source, String target, char[] original,
                            char[] changed, int[] cost) {
        int n = source.length();
        int len = original.length;

        long totalCost = 0;
        for (int i = 0; i < n; i++) {
            char ch1 = source.charAt(i);
            char ch2 = target.charAt(i);
            if (ch1 != ch2) {
                for (int j = 0; j < len; j++) {
                    if (original[j] == ch1) {
                        
                    }
                }
            }
        }
        return totalCost;
    }
}
