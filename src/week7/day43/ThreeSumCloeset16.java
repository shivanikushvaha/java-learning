package week7.day43;

import java.util.Arrays;

public class ThreeSumCloeset16 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int i = threeSumClosest(nums, target);
        System.out.println(i);
    }

    private static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];
            int close = target - sum;
        }

        return 0;
    }
}
