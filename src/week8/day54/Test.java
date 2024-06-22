package week8.day54;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int i = minDays(bloomDay, m, k);
    }

    private static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        boolean[] bloom = new boolean[n];
        int max = Arrays.stream(bloomDay).max().getAsInt();
        if (m * k >= n)
            return -1;

        Map<Integer, Integer> map = new HashMap<>();
        int o = 0;
        for (int i : bloomDay)
            map.put(i, o++);

        System.out.println(map);

        for (int i = 1; i <= max; i++) {
            if (map.containsKey(i)) {
                bloom[map.get(i)] = true;
            }
            for (int j = 0; j < n; j++) {
                if (bloom[j]) {

                }
            }
        }
        return 0;
    }
}
