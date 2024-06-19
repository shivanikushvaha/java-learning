package week7.day49;

public class PatchingArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 31, 33};
        int n = 2147483647;
        int i = minPatches(nums, n);
        System.out.println(i);
    }

    private static int minPatches(int[] nums, int n) {
        int len = nums.length;
        long maxReach = 0;
        int patch = 0;
        int i = 0;

        while (maxReach < n) {
            if (i < len && nums[i] <= maxReach + 1) {
                maxReach += nums[i];
                i++;
            } else {
                maxReach += (maxReach + 1);
                patch++;
            }
        }

        return patch;
    }
}
