package week6.day40;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class SlidingWindowMaximum2 {
    public static void main(String[] args) {
        int[] nums = {7, 2, 4};
        int k = 2;
        int[] ints = maxSlidingWindow(nums, k);
        for (int i : ints)
            System.out.print(i + " ");
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1)
            return nums;

        int n = nums.length;
        int i = 0, j = 0;
        int[] arr = new int[(n - k) + 1];
        int max;
        Deque<Integer> deque = new LinkedList<>();

        while (j < n) {
            if ((j - i) + 1 == k) {
                if (i != 0)
                    deque.removeFirst();
                deque.add(nums[j]);
                max = findMaxInDeque(deque);
                arr[i] = max;
                i++;
            } else {
                deque.add(nums[j]);
            }
            j++;
        }
        return arr;
    }

    public static int findMaxInDeque(Deque<Integer> deque) {
        int max = deque.getFirst();
        for (int i : deque) {
            max = Math.max(i, max);
        }
        return max;
    }
}
