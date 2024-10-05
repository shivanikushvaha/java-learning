package week14.day102;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle2 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode current = head;
        Map<ListNode, Integer> map = new HashMap<>();

        while (current != null) {
            if (map.containsKey(current))
                return current;
            map.put(current, 1);
            current = current.next;
        }

        return null;
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
