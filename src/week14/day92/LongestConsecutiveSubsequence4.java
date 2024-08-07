package week14.day92;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence4 {

    public static int longestSuccessiveElements(int[] nums) {
        int n = nums.length;
        int maxCount = 1;

        if (n == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int x = num;
                int cnt = 1;
                while (set.contains(x)) {
                    cnt++;
                    x++;
                }
                maxCount = Math.max(maxCount, cnt);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
