package week7.day49.contest42;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        int[] hours = {12, 12, 30, 24, 24};
        int i = countCompleteDayPairs(hours);
        System.out.println(i);
    }

    private static int countCompleteDayPairs(int[] hours) {
        Map<Integer, Boolean> numMap = new HashMap<>();
        int n = hours.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int com = 24 - hours[i];
            if (numMap.containsKey(com))
            numMap.put(hours[i], hours[i] % 24 == 0);
        }

        return count;
    }
}
