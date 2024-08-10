package week14.day95;

public class ReversePair {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 1};
        int i = reversePairs(nums);
        System.out.println(i);
    }

    public static int reversePairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j] * 2) count++;
            }
        }
        return count;
    }
}
