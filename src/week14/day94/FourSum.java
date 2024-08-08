package week14.day94;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        List<List<Integer>> lists = fourSum(nums, 0);
        System.out.println(lists);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            temp.sort(null);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
