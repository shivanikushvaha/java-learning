package week13.day90;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        SortedSet<Integer> sortedSet = new TreeSet<>();

        for (int num : nums)
            sortedSet.add(num);

        int i = 0;
        for(int z : sortedSet) {
            nums[i++] = z;
        }

        return sortedSet.size();
    }
}
