package week13.day90;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<Integer> priorityqueue = new PriorityQueue<>();
        priorityqueue.add(10);
        priorityqueue.add(20);
        priorityqueue.add(40);
        priorityqueue.add(100);
        priorityqueue.add(50);

        System.out.println(priorityqueue.peek());
        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue);
        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue);
        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue);
    }
}
