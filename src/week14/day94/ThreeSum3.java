package week14.day94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum3 {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> triplet(int n, int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) j++;
                else if (sum > 0) k--;
                else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }

            }

        }

        return ans;
    }

}


