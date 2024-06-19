package week7.day49.contest42;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        int[] nums = {12, 12, 30, 24, 24};
        int k = 24;
        long l = countPairs(nums, k);
        System.out.println(l);
    }

    private static long countPairs(int[] nums, int k) {
        Map<Long, Long> cnt = new HashMap<>();
        long res = 0L;
        for (int x : nums) {
            cnt.merge(BigInteger.valueOf(x).gcd(BigInteger.valueOf(k)).longValue(), 1L, Long::sum);
        }
        for (long x : cnt.keySet()) {
            for (long y : cnt.keySet()) {
                if (x <= y && x + y % k == 0L) {
                    res += x < y ? cnt.get(x) * cnt.get(y) : cnt.get(x) * (cnt.get(x) - 1L) / 2L;
                }
            }
        }
        return res;
    }
}
