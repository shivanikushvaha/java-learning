package week15.day101;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        current = head;

        int n = list.size();
        int j = 1;
        int divide = n % 2 == 0 ? n / 2 : (n / 2) + 1;
        for (int i = 0; i < n; i++) {
            if (i < divide)
                current.val = list.get(i + i);
            else {
                current.val = list.get(j);
                j+=2;
            }
            current = current.next;
        }

        return head;
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
