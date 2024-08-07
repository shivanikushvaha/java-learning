package week14.day92;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumScoreFromSubarrayMinimums {

    public static void main(String[] args) {
        List<Integer> integers = List.of(453, 342, 522, 375, 71, 71, 993);
        int i = pairWithMaxSum(integers);
        System.out.println(i);
    }

    public static int pairWithMaxSum(List<Integer> arr) {
        int n = arr.size();
        int maxSum = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = sumOfMinAndSecondMin(arr.subList(i, j + 1));
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    private static int sumOfMinAndSecondMin(List<Integer> arr) {
        int min = arr.get(0);
        int n = arr.size();

        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == min) continue;
            queue.add(min - arr.get(i));
        }

        int secondMin;
        if (queue.isEmpty()) {
            secondMin = min;
        }
        else
            secondMin = min - queue.peek() == min ? min : min - queue.peek();
        return min + secondMin;
    }
}
