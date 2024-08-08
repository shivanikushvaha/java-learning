package week14.day94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum2 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);

                if (st.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    set.add(temp);
                }
                st.add(nums[j]);
            }
        }

        return new ArrayList<>(set);
    }
}
