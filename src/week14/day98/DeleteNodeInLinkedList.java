package week14.day98;

public class DeleteNodeInLinkedList {
    public static void main(String[] args) {

    }

    public static void deleteNode(ListNode node) {
        ListNode next = node.next;
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
