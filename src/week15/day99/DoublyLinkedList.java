package week15.day99;

public class DoublyLinkedList {
    static Node head;

    public static void main(String[] args) {
        insertAtEnd(2);
        insertAtEnd(4);
        insertAtEnd(5);
        insertAtEnd(6);
        insertAtPosition(60, 1);
        deleteAtEnd();
        print();
        deleteAtEnd();
    }

    public static void deleteAtBegin() {
        Node current = head;

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public static void deleteAtEnd() {
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        if (current.prev != null) {
            current.prev.next = null;
        }
    }

    public static void deleteAtPosition(int p) {

        Node current = head;

        for (int i = 0; i < p - 1 && current != null; i++) {
            current = current.next;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (head == current)
            head = current.next;

    }

    public static void insertAtPosition(int x, int p) {
        Node curr = head;
        Node newNode = new Node(x);

        for (int i = 0; i < p && curr != null; i++) {
            curr = curr.next;
        }
        newNode.prev = curr;
        newNode.next = curr.next;
        curr.next = newNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
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
