package week6.day39;

import java.util.*;

public class DifferenceOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> difference = findDifference(nums1, nums2);
        System.out.println(difference);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1)
            set1.add(i);

        for (int j : nums2)
            set2.add(j);

        for (int num : set1)
            if (!set2.contains(num))
                l1.add(num);
        list.add(l1);

        for (int num : set2)
            if (!set1.contains(num))
                l2.add(num);
        list.add(l2);

        return list;
    }
}
