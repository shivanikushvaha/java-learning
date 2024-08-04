package week13.day90;

import java.util.Arrays;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i+=2) {
            if (nums[i] != nums[i + 1])
                return nums[i];
        }

        return nums[n - 1];
    }
}
