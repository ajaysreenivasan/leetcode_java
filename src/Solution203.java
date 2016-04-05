/*
 * Remove all elements from a linked list of integers that have value val.
 */
public class Solution203 {
	public ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val) {
			head = head.next;
		}

		if (head != null) {
			ListNode cursor = head.next;
			ListNode newListCursor = head;

			while (cursor != null) {
				if (cursor.val != val) {
					newListCursor.next = cursor;
					newListCursor = newListCursor.next;
				}

				cursor = cursor.next;
			}

			newListCursor.next = null;
		}

		return head;
	}
}
