package week13.day89;

import java.util.Arrays;

public class MinimumSwapToGroupAll1Together {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1};
        int i = minSwaps(nums);
        System.out.println(i);
    }

    public static int minSwaps(int[] nums) {
        int n = nums.length;

        int[] temp = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            temp[i] = nums[i % n];
        }

        int countOnes = Arrays.stream(nums).sum();

        int i = 0;
        int j = 0;
        int currCount = 0;
        int maxCount = 0;

        while (j < 2 * n) {
            if (nums[j % n] == 1) currCount++;

            if (j - i + 1 > countOnes) {
                currCount -= temp[i % n];
                i++;
            }

            maxCount = Math.max(currCount, maxCount);
            j++;
        }
        return countOnes - maxCount;
    }
}
