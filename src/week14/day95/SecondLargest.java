package week14.day95;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[1]);
        System.out.println(Integer.MAX_VALUE);
    }
}
