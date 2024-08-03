package week13.day89;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> arr = List.of(10, 10);
        int i = print2largest(arr);
        System.out.println(i);
    }

    public static int print2largest(List<Integer> arr) {
        int max = arr.get(0);
        int n = arr.size();

        for(int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == max) continue;
            queue.add(max - arr.get(i));
        }
        if (queue.isEmpty()) return -1;
        return max - queue.peek() == max ? -1 : max - queue.peek();
    }
}
