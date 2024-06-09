package week6.day40;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumDistinctSubarrayLengthK {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        long l = maximumSubarraySum(nums, k);
        System.out.println(l);
    }

    private static long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        long sum = 0, maxSum = 0;
        int n = nums.length;

        while (j < n) {
            if (!set.contains(nums[j])) {
                set.add(nums[j]);
                sum += nums[j];
                if ((j - i) + 1 == k) {
                    maxSum = Math.max(sum, maxSum);
                    sum -= nums[j];
                    i++;
                }
            } else {
                i = j;
                sum = nums[i];
                set.clear();
                set.add(nums[j]);
            }
            j++;
        }
        return maxSum;
    }
}
