package week9.day62;

public class BinarySearchTest2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 10, 40};
        int target = 10;
        int n = nums.length;
        int i = binarySearch(nums, 0, n - 1, target);
        System.out.println(i);
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                return binarySearch(nums, left, mid - 1, target);
            else
                return binarySearch(nums, mid + 1, right, target);
        }
        return -1;
    }
}
