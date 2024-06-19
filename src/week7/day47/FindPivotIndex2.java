package week7.day47;

public class FindPivotIndex2 {
    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
        int i = pivotIndex(nums);
        System.out.println(i);
    }

    private static int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] arr = new int[n];
        int leftSum = 0;

        for (int i = 0; i < n; i++)
            arr[i] = sum += nums[i];

        for (int i = 0; i < n; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (rightSum == leftSum)
                return i;
            leftSum = arr[i];
        }

        return -1;
    }
}
