package week14.day100;

import java.util.ArrayList;
import java.util.List;

public class ReverseDoublyLinkedList {
    static DLLNode head;

    public static void main(String[] args) {
        insertAtEnd(2);
        insertAtEnd(4);
        insertAtEnd(5);
        insertAtEnd(6);

        print();
        reverse();
        print();
    }

    public static void print() {
        DLLNode curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void insertAtEnd(int data) {
        DLLNode newNode = new DLLNode(data);

        if (head == null) {
            head = newNode;
        } else {
            DLLNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;
        }
    }

    public static void reverseDLL() {
        DLLNode current = head;

        while (current.next != null) {
            current = current.next;
        }
        head = current;
    }

    public static void reverse() {
        DLLNode current = head;
        List<Integer> list = new ArrayList<>();

        while (current != null) {
            list.add(current.data);
            current = current.next;
        }

        current = head;
        int size = list.size();

        for (int i = 0; i < size; i++) {
            current.data = list.get(size - i - 1);
            current = current.next;
        }
    }

    static class DLLNode {
        int data;
        DLLNode next;
        DLLNode prev;

        DLLNode(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

}
