
public class Solution021 {
	private static class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(-9);
		ListNode l1Cursor = l1;

		l1Cursor.next = new ListNode(-7);
		l1Cursor = l1Cursor.next;
		l1Cursor.next = new ListNode(-3);
		l1Cursor = l1Cursor.next;
		l1Cursor.next = new ListNode(-3);
		l1Cursor = l1Cursor.next;
		l1Cursor.next = new ListNode(-1);
		l1Cursor = l1Cursor.next;
		l1Cursor.next = new ListNode(2);
		l1Cursor = l1Cursor.next;
		l1Cursor.next = new ListNode(3);
		l1Cursor = l1Cursor.next;

		ListNode l2 = new ListNode(-7);
		ListNode l2Cursor = l2;

		l2Cursor.next = new ListNode(-7);
		l2Cursor = l2Cursor.next;
		l2Cursor.next = new ListNode(-6);
		l2Cursor = l2Cursor.next;
		l2Cursor.next = new ListNode(-6);
		l2Cursor = l2Cursor.next;
		l2Cursor.next = new ListNode(-5);
		l2Cursor = l2Cursor.next;
		l2Cursor.next = new ListNode(-3);
		l2Cursor = l2Cursor.next;
		l2Cursor.next = new ListNode(2);
		l2Cursor = l2Cursor.next;
		l2Cursor.next = new ListNode(4);
		l2Cursor = l2Cursor.next;

		print(l1);
		System.out.println("--3--");
		print(l2);

		ListNode merge = mergeTwoLists(l1, l2);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode newListHead = null;

		if (l1 == null && l2 == null) {
			return newListHead;
		} else if (l1 == null && l2 != null) {
			return l2;
		} else if (l1 != null && l2 == null) {
			return l1;
		} else {

			ListNode l1Cursor = l1;
			ListNode l2Cursor = l2;

			if (l1.val <= l2.val) {
				newListHead = l1;
				l1Cursor = l1.next;
			} else {
				newListHead = l2;
				l2Cursor = l2.next;
			}

			ListNode newListCursor = newListHead;

			while (l1Cursor != null && l2Cursor != null) {
				if (l1Cursor.val < l2Cursor.val) {
					newListCursor.next = l1Cursor;
					l1Cursor = l1Cursor.next;
				} else if (l1Cursor.val > l2Cursor.val) {
					newListCursor.next = l2Cursor;
					l2Cursor = l2Cursor.next;
				} else {
					newListCursor.next = l1Cursor;
					l1Cursor = l1Cursor.next;
					newListCursor = newListCursor.next;
					newListCursor.next = l2Cursor;
					l2Cursor = l2Cursor.next;
				}

				newListCursor = newListCursor.next;
			}

			if (l1Cursor == null) {
				newListCursor.next = l2Cursor;
			} else if (l2Cursor == null) {
				newListCursor.next = l1Cursor;
			}

			return newListHead;
		}
	}

	public static void print(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
