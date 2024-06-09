package week6.day40;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {7,2,4};
        int k = 2;
        int[] ints = maxSlidingWindow(nums, k);
        for (int i : ints)
            System.out.print(i + " ");
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1)
            return nums;

        int n = nums.length;
        int i = 0, j = 0;
        int[] arr = new int[(n - k) + 1];
        int max = Integer.MIN_VALUE;

        while (j < n) {
            if ((j - i) + 1 == k) {
                int m = i;
                while (m < k + i) {
                    max = Math.max(max, nums[m]);
                    m++;
                }
                arr[i] = max;
                max = Integer.MIN_VALUE;
                i++;
            } else {
                max = Math.max(max, nums[j]);
            }
            j++;
        }
        return arr;
    }
}
