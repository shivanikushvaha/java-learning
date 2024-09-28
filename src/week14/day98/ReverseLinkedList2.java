package week14.day98;

public class ReverseLinkedList2 {
    static ListNode head;

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);

        print();
        reverse();
        print();
    }

    private static void reverse() {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
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
