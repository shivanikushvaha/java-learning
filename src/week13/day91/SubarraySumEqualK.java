package week13.day91;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int i = subarraySum(nums, k);
        System.out.println(i);
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums[0];
        int count = 0;

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        if (map.size() == 1) return map.get(n) - 1;

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int rem = k - m.getKey();
            if (map.containsKey(rem) && map.get(rem) != 0) {
                count = count + map.get(rem);
                map.put(rem, 0);
            }
        }
        return count;
    }
}
