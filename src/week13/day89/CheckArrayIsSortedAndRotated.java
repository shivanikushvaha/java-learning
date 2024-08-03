package week13.day89;

public class CheckArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {6, 10, 6};
        boolean check = check(nums);
        System.out.println(check);
    }

    public static boolean check(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= min) {
                min = nums[i];
                idx = i;
            }
        }

        while (idx-- > 0) {
            int first = nums[0];
            for (int i = 0; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[n - 1] = first;
        }

        for (int i = 0; i < n - 1; i++) {
            if (!(nums[i] <= nums[i + 1])) return false;
        }

        return true;
    }
}
