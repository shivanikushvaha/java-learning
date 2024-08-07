package week14.day92;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinAndSecondMin {
    public static int[] print2largest(List<Integer> arr) {
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
        int secondMin = min - queue.peek() == min ? -1 : min - queue.peek();
        return new int[]{min, secondMin};
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 35, 1, 10, 34, 1);
        int[] ints = print2largest(integers);
        System.out.println(Arrays.toString(ints));
    }
}