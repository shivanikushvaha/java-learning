package week6.day38;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersect = intersect(nums1, nums2);
        for (int i : intersect)
            System.out.println(i);
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            int feq = map.getOrDefault(i, 0);
            map.put(i, feq + 1);
        }
        Set<Integer> set = new HashSet<>();

        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                set.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] arr = new int[set.size()];

        int k = 0;
        for (int i : set) {
            arr[k++] = i;
        }

        return arr;
    }
}
