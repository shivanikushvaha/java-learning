package week8.day56.contest;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 8, 9};
        double v = minimumAverage(nums);
        System.out.println(v);
    }

    public static double minimumAverage(int[] nums) {
        int n = nums.length;
        float[] averages = new float[n / 2];
        int mid = n / 2;

        Arrays.sort(nums);

        int i = 0;
        int j = n - 1;
        while (mid-- > 0) {
            float avg = (float) (nums[i] + nums[j--]) / 2;
            averages[i] = avg;
            i++;
        }

        float min = averages[0];

        for (int k = 0; k < averages.length; k++) {
            if (averages[k] == 0.0)
                continue;
            if (min > averages[k])
                min = averages[k];
        }
        return min;
    }
}
