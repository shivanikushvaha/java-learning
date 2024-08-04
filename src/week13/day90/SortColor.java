package week13.day90;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for (int num : nums) {
            if (num == 0) zeroCount++;
            else if (num == 1) oneCount++;
            else twoCount++;
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount-- > 0) nums[i] = 0;
            else if (oneCount-- > 0) nums[i] = 1;
            else if (twoCount-- > 0) nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
