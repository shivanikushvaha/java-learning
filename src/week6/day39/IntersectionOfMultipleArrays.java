package week6.day39;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        List<Integer> intersection = intersection(nums);
        System.out.println(intersection);
    }

    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int[] num : nums){
            for (int i : num) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                if (map.get(i) == nums.length) list.add(i);
            }
        }

        list.sort(Comparator.naturalOrder());
        return list;
    }
}
