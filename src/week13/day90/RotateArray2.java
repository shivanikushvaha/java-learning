package week13.day90;

import java.util.Arrays;

public class RotateArray2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 2);
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = last;
        }
        System.out.println(Arrays.toString(nums));
    }
}
