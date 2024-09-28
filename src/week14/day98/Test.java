package week14.day98;

public class Test {

    static Node head;

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static int count() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static boolean search(int target) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == target)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node temp = head;
        Node prevNode = null;

        for (int i = 0; i < position - 1; i++) {
            prevNode = temp;
            temp = temp.next;
        }

        prevNode.next = newNode;
        newNode.next = temp;
    }

    public static void deleteFirstNode() {
        if (head == null)
            System.out.println("List is empty");
        head = head.next;
    }

    public static void deleteLastNode() {
        Node temp = head;
        Node prevNode = null;

        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
    }

    public static void deleteAtPosition(int position) {
        Node prevNode = null;
        Node temp = head;

        if (position == 1) {
            head = head.next;
            temp = null;
            return;
        }

        for (int i = 0; i < position - 1; i++) {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = temp.next;
    }

    public static void main(String[] args) {
        Test.insertAtBegin(10);
        Test.insertAtBegin(20);
        Test.insertAtBegin(30);
        printLinkedList();
        System.out.println("No of elements: " + count());

        System.out.println("===============================");

        Test.insertAtEnd(100);
        Test.insertAtEnd(200);
        Test.insertAtEnd(300);
        printLinkedList();

        System.out.println("===================================");

        System.out.println("No of elements: " + count());

        System.out.println("====================================");

        insertAtPosition(3000, 3);
        printLinkedList();

        deleteFirstNode();
        deleteFirstNode();
        deleteFirstNode();
        printLinkedList();

        System.out.println("==========================");
        deleteAtPosition(1);
        printLinkedList();
    }

    private static void printLinkedList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node() {

        }
    }
}
