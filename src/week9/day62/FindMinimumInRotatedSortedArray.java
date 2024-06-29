package week9.day62;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {11, 13, 15, 17};
        int min = findMin(nums);
        System.out.println(min);
    }

    public static int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
