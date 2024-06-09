package week6.day39;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-4, -3, -2, -1};
        int i = maxSubArray(nums);
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length, sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }

        return max;
    }
}
