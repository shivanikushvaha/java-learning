package week8.day50;

public class ArrayPairSumDivisibility {
    public static void main(String[] args) {
        int[] nums = {10, 4, 2, 2};
        int k = 6;
        boolean b = canPair(nums, k);
        System.out.println(b);
    }

    private static boolean canPair(int[] nums, int k) {
        int n = nums.length;
        boolean[] used = new boolean[n];

        if (n % 2 != 0) {
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            if (used[i]) continue;
            boolean foundPair = false;
            for (int j = i + 1; j < n; j++) {
                if (used[j]) continue;
                if ((nums[i] + nums[j]) % k == 0) {
                    used[i] = true;
                    used[j] = true;
                    foundPair = true;
                    break;
                }
            }
            if (!foundPair)
                return false;
        }
        return true;
    }
}
