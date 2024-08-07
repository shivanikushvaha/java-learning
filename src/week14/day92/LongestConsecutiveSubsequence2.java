package week14.day92;

public class LongestConsecutiveSubsequence2 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int i = longestConsecutive(nums);
        System.out.println(i);
    }

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxCount = 0;

        if (n == 0) return 0;

        for (int i = 0; i < n; i++) {
            int s = nums[i];
            s++;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (s == nums[k]) {
                        count++;
                        s++;
                    }
                }
            }
            maxCount = Math.max(count, maxCount);
            count = 0;
        }
        return ++maxCount;
    }
}
