package week15.day100;

public class ReverseLinkedListRecursive {
    static Node head;

    public static void main(String[] args) {

    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;

        Node newNode = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
