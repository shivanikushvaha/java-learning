package week13.day90;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = 200;
                n--;
            }
        }

        System.out.println(Arrays.toString(nums));
        return 0;
    }
}
