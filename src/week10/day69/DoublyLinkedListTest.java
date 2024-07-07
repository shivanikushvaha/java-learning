package week10.day69;

public class DoublyLinkedListTest {
    static Node head;
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        print();
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    static class Node {
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
        }
    }
}
