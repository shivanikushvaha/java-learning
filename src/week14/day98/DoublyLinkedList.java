package week14.day98;

public class DoublyLinkedList {
    static Node head;

    public static void main(String[] args) {
        insertAtEnd(2);
        insertAtEnd(4);
        insertAtEnd(5);
        insertAtEnd(6);
        insertAtPosition(60, 1);

        print();
    }

    public static void insertAtPosition(int x, int p) {
        Node curr = head;
        Node newNode = new Node(x);
        Node prevNode = null;

        for (int i = 0; i < p; i++) {
            prevNode = curr;
            curr = curr.next;
        }
        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = curr.prev;
        curr.prev = newNode;
    }

    public static void print() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void insertAtBegin(int data) {
        Node newNode = new Node(data);
        Node curr = head;

        head = newNode;
        newNode.next = curr;
        curr.prev = newNode;
    }

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;
        }
    }

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
