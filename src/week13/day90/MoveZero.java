package week13.day90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        List<Integer> zeroList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (int num : nums) {
            if (num == 0) zeroList.add(num);
            else integerList.add(num);
        }

        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (!integerList.isEmpty()) {
                nums[i] = integerList.removeFirst();
            } else nums[i] = zeroList.get(k++);
        }
        System.out.println(Arrays.toString(nums));
    }
}
