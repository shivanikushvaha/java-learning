package week13.day88;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
//        Queue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue.add(10);
        queue.add(100);
        queue.add(1);
        queue.add(5);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
