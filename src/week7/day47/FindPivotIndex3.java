package week7.day47;

public class FindPivotIndex3 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int i = pivotIndex(nums);
        System.out.println(i);
    }

    private static int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int leftSum = 0;

        for (int i = 0; i < n; i++)
            sum += nums[i];

        for (int i = 0; i < n; i++) {
            int rightSum = sum - nums[i] - leftSum;

            if (rightSum == leftSum)
                return i;

            leftSum += nums[i];
        }
        return -1;
    }
}
