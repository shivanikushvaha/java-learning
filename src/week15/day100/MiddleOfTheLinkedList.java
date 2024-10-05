package week15.day100;

public class MiddleOfTheLinkedList {
    static ListNode head;

    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        insertAtEnd(50);

        print();
        middleNode();
    }

    public static void print() {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;
        }
    }

    public static void middleNode() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

    }

    static class ListNode {
        int data;
        ListNode next;
        ListNode prev;

        ListNode(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }
}
