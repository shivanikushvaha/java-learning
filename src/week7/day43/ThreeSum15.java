package week7.day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        int target = Integer.MAX_VALUE;

        if (n < 3)
            return list;

        Arrays.sort(nums);

        for (int x = 0; x < n; x++) {
            if (target == -(nums[x]))
                continue;
            target = -(nums[x]);
            int i = x + 1;
            int j = n - 1;
            while (i < j) {
                List<Integer> l = new ArrayList<>();
                int sum = nums[i] + nums[j];

                if (sum > target)
                    j--;
                else if (sum < target) {
                    i++;
                } else {
                    while (i < j && nums[i] == nums[i + 1])
                        i++;
                    while (i < j && nums[j] == nums[j - 1])
                        j--;
                    list.add(Arrays.asList(nums[x], nums[i], nums[j]));
                    i++;
                    j--;
                }
            }
        }
        return list;
    }
}
