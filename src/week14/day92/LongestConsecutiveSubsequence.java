package week14.day92;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        int i = longestConsecutive(nums);
        System.out.println(i);
    }

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxCount = 0;

        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] - nums[i + 1] == -1) count++;
            else count = 0;
            maxCount = Math.max(count, maxCount);
        }
        return ++maxCount;
    }
}
