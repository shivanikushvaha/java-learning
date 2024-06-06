package week6.day39;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};
        int i = maxSubArray(nums);
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            int s = nums[i] + nums[i + 1];
            for (int j = i; j < n - 2; j++) {
                s = s + nums[j + 2];
            }
            if (s > sum)
                sum = sum + s;
        }
        return sum;
    }
}
