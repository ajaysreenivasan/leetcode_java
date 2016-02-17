/*
 * Reverse a singly linked list.
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = null;
        ListNode tail = head;

        while (tail != null) {
            ListNode temp = tail;
            tail = tail.next;
            temp.next = first;
            first = temp;
        }

        return first;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}