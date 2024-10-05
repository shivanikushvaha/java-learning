package week14.day102;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList2 {
    public static void main(String[] args) {

    }

    public OddEvenLinkedList.ListNode oddEvenList(OddEvenLinkedList.ListNode head) {
        List<Integer> list = new ArrayList<>();
        OddEvenLinkedList.ListNode current = head;

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
        OddEvenLinkedList.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
