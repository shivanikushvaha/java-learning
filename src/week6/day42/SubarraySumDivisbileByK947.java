package week6.day42;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumDivisbileByK947 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int i = subarraysDivByK(nums, k);
        System.out.println(i);
    }

    private static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < n; i++) {
            sum+=nums[i];
            int rem = sum % k;
            if (rem < 0)
                rem+=k;
            if (map.containsKey(rem))
                count+=map.get(rem);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}
