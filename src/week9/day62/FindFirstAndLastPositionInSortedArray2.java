package week9.day62;

import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ints = searchRange(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int leftMost = findLeftMost(nums, target, left, right);
        int rightMost = findRightMost(nums, target, left, right);

        return new int[] {leftMost, rightMost};
    }

    private static int findLeftMost(int[] nums, int target, int left, int right) {
        int leftMost = -1;

        while (right >= left) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                leftMost = mid;
                right = mid - 1;
            }
        }
        return leftMost;
    }

    private static int findRightMost(int[] nums, int target, int left, int right) {
        int rightMost = -1;

        while (right >= left) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                rightMost = mid;
                left = mid + 1;
            }
        }
        return rightMost;
    }
}
