package week14.day92;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElementBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] ints = rearrangeArray(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> positivList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) positivList.add(num);
            else negativeList.add(num);
        }

        int[] temp = new int[n];
        for (int i = 0; i < n / 2; i++) {
            temp[2 * i] = positivList.get(i);
            temp[2 * i + 1] = negativeList.get(i);
        }
        return temp;
    }
}
