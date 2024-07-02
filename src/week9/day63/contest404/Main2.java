package week9.day63.contest404;

public class Main2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int i = maximumLength(nums);
        System.out.println(i);
    }

    public static int maximumLength(int[] nums) {
        int n = nums.length;
        int max = 1;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            if ((nums[i] + nums[i + 1]) % 2 == (nums[j] + nums[j + 1]) % 2) {
                max++;
            }
        }
        return ++max;
    }
}
