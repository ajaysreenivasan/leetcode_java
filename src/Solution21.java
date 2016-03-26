
public class Solution21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode newListHead;

		if (l1.val >= l2.val) {
			newListHead = l1;
		} else {
			newListHead = l2;
		}

		ListNode l1Cursor = l1;
		ListNode l2Cursor = l2;

		while (l1Cursor != null && l2Cursor != null) {

		}

		return newListHead;
	}
}
