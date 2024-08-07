package week14.day93;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement3 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        List<Integer> integers = majorityElement(nums);
        System.out.println(integers);
    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int len = nums.length / 3 + 1;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) == len)
                list.add(num);
        }
        return list;
    }
}
