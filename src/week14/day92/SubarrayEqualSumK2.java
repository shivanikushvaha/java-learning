package week14.day92;

import java.util.HashMap;
import java.util.Map;

public class SubarrayEqualSumK2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int i = subarraySum(nums, k);
        System.out.println(i);
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        int count = 0;
        map.put(0, 1);

        for (int num : nums) {
            preSum += num;

            int rem = preSum - k;

            count += map.getOrDefault(rem, 0);

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }
}
