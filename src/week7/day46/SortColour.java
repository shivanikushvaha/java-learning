package week7.day46;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortColour {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        int j = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int k = 0;
            int v = m.getValue();
            int key = m.getKey();
            while (k < v) {
                nums[j++] = key;
                k++;
            }
        }

        System.out.println(map);

        for (int i : nums)
            System.out.print(i + " ");
    }
}
