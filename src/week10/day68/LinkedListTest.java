package week10.day68;

public class LinkedListTest {
    static Node head;

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        print();
        System.out.println(search(20));
        delete(30);
        print();
    }

    private static void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) return;

        temp.next = temp.next.next;
    }

    private static void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static boolean search(int data) {
        Node temp = head;
        while (temp.next != null) {
            if (data == temp.data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
