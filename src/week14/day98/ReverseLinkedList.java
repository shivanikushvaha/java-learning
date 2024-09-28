package week14.day98;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    static ListNode head;

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);

        print();
        reverse();
        print();
    }

    public static void print() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void insert(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
        }
        else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

    }

    public static void reverse() {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;

        int i = 1;
        while (temp != null) {
            temp.val = list.get(list.size() - i++);
            temp = temp.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
