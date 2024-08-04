package week13.day91;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 2;
        int i = subarraySum(nums, k);
        System.out.println(i);
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {

        }
        return 0;
    }
}
