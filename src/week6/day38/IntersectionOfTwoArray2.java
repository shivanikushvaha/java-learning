package week6.day38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArray2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersect = intersect(nums1, nums2);

        for(int i : intersect)
            System.out.println(i + " ");
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums1){
            int feq = map.getOrDefault(i, 0);
            map.put(i, feq + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2)
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }


        int[] arr = new int[list.size()];
        int n = arr.length;
        for (int i = 0; i < n; i++)
            arr[i] = list.get(i);

        return arr;
    }
}
