package week13.day90;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int i = majorityElement(nums);
        System.out.println(i);
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int k;
        if (n % 2 == 0) k = n / 2;
        else k = (n / 2) + 1;

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() >= k)
                return m.getKey();
        }
        return 0;
    }
}
