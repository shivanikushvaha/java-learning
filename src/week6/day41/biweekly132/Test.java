package week6.day41.biweekly132;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] sum = sum(nums, target);
        for (int i : sum)
            System.out.print(i + " ");
    }

    private static int[] sum(int[] number ,int target) {
        int i = 0;
        int j = number.length - 1;

        while (i < j) {
            int sum = number[i] + number[j];
            if (sum > target)
                j--;
            else if (sum < target)
                i++;
            else
                return new int[]{i + 1, j + 1};
        }
        return new int[]{};
    }
}
