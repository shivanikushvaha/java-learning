package week14.day92;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                idx = i - 1;
                break;
            }
        }

        if (idx != -1) {
            int swapIdx = idx;

            for (int i = n - 1; i >= idx + 1 ; i--) {
                if (nums[i] > nums[swapIdx]) {
                    swapIdx = i;
                    break;
                }
            }
            swap(idx, swapIdx, nums);
        }

        /*int end = n - 1;
        if (idx == -1) idx = 0;
        for (int i = idx + 1; i < n / 2; i++) {
            swap(i, end--, nums);
        }*/

        nums = reverse(nums, idx + 1, n);
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int start, int end, int[] nums) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    private static int[] reverse(int[] arr, int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(arr[i]);
        }
        Collections.reverse(list);

        int k = 0;
        for (int i = start; i < end; i++) {
            arr[i] = list.get(k++);
        }
        return arr;
    }
}
