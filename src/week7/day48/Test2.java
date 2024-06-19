package week7.day48;

import java.util.LinkedList;
import java.util.Queue;

public class Test2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(1);
        queue.add(100);
        queue.add(12);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
