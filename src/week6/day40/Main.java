package week6.day40;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Alice");
        queue.offer("Bob");
        queue.add("Charlie");

        // Inspecting the head of the Queue
        System.out.println("Head of the queue: " + queue.peek()); // Alice

        // Removing elements from the Queue
        System.out.println("Removed: " + queue.poll()); // Alice
        System.out.println("Removed: " + queue.remove()); // Bob

        // Printing remaining elements
        System.out.println("Remaining queue: " + queue); // [Charlie]

        // Checking the head of the Queue
        System.out.println("Head of the queue: " + queue.element()); // Charlie
    }
}
