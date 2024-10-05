package week14.day102;

import java.util.List;

public class PalindromeLinkedList {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newHead;

        while (second != null) {
            if (first.val != second.val) {
                reverse(newHead);
                return false;
            }
        }
        reverse(newHead);
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


}
