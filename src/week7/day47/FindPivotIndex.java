package week7.day47;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int i = pivotIndex(nums);
        System.out.println(i);
    }

    private static int pivotIndex(int[] nums) {
        int n = nums.length;
        int rightSum = 0;

        for (int i = 1; i < n; i++) {
            rightSum += nums[i];
        }
        if (rightSum == 0)
            return 0;
        rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            for (int j = i + 2; j < n; j++) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum)
                return i + 1;
            rightSum = 0;
        }

        return -1;

    }
}
