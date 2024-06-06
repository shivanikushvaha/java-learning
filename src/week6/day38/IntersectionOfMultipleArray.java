package week6.day38;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfMultipleArray {
    public static void main(String[] args) {
        int[][] nums = new int[][] {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};

        intersection(nums);
    }

    public static List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (nums[j][i] == nums[j + 1][i])
                    list.add(nums[j][i]);
            }
        }
        System.out.println(list);
        return null;
    }

}
