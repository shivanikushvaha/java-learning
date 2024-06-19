package week8.day50;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayPairSumDivisibility2 {
    public static void main(String[] args) {
        int[] nums = {6, 14, 12, 14};
        int k = 2;
        boolean b = canPair(nums, k);
        System.out.println(b);
    }

    private static boolean canPair(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        if (n % 2 != 0) {
            return false;
        }

        for (int num : nums) {
            int r1 = num % k;
            int r2 = k - r1;
            if (set.contains(r2) || ((r1 == 0) && (set.contains(0)))) {
                set.remove(r1);
                set.remove(r2);
            } else
                set.add(r1);
        }
        return set.isEmpty();
    }
}
