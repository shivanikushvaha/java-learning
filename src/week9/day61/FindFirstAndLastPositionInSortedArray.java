package week9.day61;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ints = searchRange(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        if (n < 1)
            return new int[]{-1, -1};

        int start = 0;
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                start = i;
                if (i++ < n) {
                    while (i < n && nums[i] == target) {
                        i++;
                    }
                    return new int[]{start, i - 1};
                } else
                    return new int[]{i, i};
            }
        }
        return new int[]{-1, -1};
    }
}
