package week13.day90;

import java.util.Arrays;

public class SortColor2 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n - 1;

        while (j <= k) {
            if (nums[j] == 1) {
                j++;
            } else if (nums[j] == 2) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            } else {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}
