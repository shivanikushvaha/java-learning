package week9.day62;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 10, 40};
        int target = 10;
        int i = binarySearch(nums, target);
        System.out.println(i);
    }

    public static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
