package week6.day40;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("AAA");
        queue.offer("DDD");
        queue.add("BBB");
        queue.add("CCC");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println("=====================");

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
