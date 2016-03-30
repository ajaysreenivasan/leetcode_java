import datastructures.ListNode;

/*
 * Given a singly linked list, group all odd nodes together followed by the even nodes. 
 * Please note here we are talking about the node number and not the value in the nodes.
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * 
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 * 
 * Note:
 * The relative order inside both the even and odd groups should remain as it was in the input. 
 * The first node is considered odd, the second node even and so on ...
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution328 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l1Cursor = l1;

		l1Cursor.next = new ListNode(2);
		l1Cursor = l1Cursor.next;
		l1Cursor.next = new ListNode(3);
		l1Cursor = l1Cursor.next;
		// l1Cursor.next = new ListNode(-3);
		// l1Cursor = l1Cursor.next;
		// l1Cursor.next = new ListNode(-1);
		// l1Cursor = l1Cursor.next;
		// l1Cursor.next = new ListNode(2);
		// l1Cursor = l1Cursor.next;
		// l1Cursor.next = new ListNode(3);
		// l1Cursor = l1Cursor.next;

		ListNode sorted = oddEvenList(l1);

		print(sorted);
	}

	public static ListNode oddEvenList(ListNode head) {
		ListNode cursor = head;

		if (head == null || head.next == null) {
			return head;
		}

		ListNode oddTail = head;
		ListNode evenHead = head.next;

		ListNode oddCursor = head;
		ListNode evenCursor = head.next;

		boolean isOddCursor = true;
		cursor = cursor.next.next;
		while (cursor != null) {
			if (isOddCursor) {
				oddCursor.next = cursor;
				oddCursor = oddCursor.next;
				oddTail = oddCursor;
			} else {
				evenCursor.next = cursor;
				evenCursor = evenCursor.next;
			}

			isOddCursor = !isOddCursor;
			cursor = cursor.next;
		}

		evenCursor.next = null;
		oddTail.next = evenHead;

		return head;
	}

	public static void print(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}