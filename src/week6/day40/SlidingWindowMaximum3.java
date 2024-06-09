package week6.day40;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class SlidingWindowMaximum3 {
    public static void main(String[] args) {
        int[] nums = {7, 2, 4};
        int k = 2;
        int[] ints = maxSlidingWindow(nums, k);
        for (int i : ints)
            System.out.print(i + " ");
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            throw new IllegalArgumentException("Input is invalid");
        }
        int n = nums.length;
        if (n == 0 || k == 1) {
            return Arrays.copyOf(nums, n);
        }
        if (n <= k) {
            return new int[] { getMaxVal(nums) };
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    private static int getMaxVal(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            max = Math.max(max, n);
        }
        return max;
    }
}