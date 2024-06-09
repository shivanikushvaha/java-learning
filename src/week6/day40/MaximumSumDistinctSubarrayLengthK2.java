package week6.day40;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumDistinctSubarrayLengthK2 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        long l = maximumSubarraySum(nums, k);
        System.out.println(l);
    }

    private static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        long sum = 0, maxSum = 0;
        int n = nums.length;

        while (j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            sum += nums[j];
            if ((j - i) + 1 == k) {
                if (map.size() == k)
                    maxSum = Math.max(sum, maxSum);
                sum-=nums[i];
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0)
                    map.remove(nums[i]);
                i++;
            }
            j++;
        }
        return maxSum;
    }
}
