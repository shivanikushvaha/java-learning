package week7.day47;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    private static int singleNumber(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1)
                return m.getKey();
        }

        return 0;
    }
}
