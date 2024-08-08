package week14.day94;

import java.util.*;

public class FourSum2 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2};
        List<List<Integer>> lists = fourSum(nums, 8);
        System.out.println(lists);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) left++;
                    else if (sum > target) right--;
                    else {
                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
