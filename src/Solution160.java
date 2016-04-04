/*
 * Write a program to find the node at which the intersection 
 * of two singly linked lists begins.
 * Notes:
 * 	If the two linked lists have no intersection at all, return null.
 * 	The linked lists must retain their original structure after the function returns.
 * 	You may assume there are no cycles anywhere in the entire linked structure.
 * 	Your code should preferably run in O(n) time and use only O(1) memory.
 */

public class Solution160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode intersectionNode = null;

		ListNode aCursor = headA;
		ListNode bCursor = headB;
		int equalizeCount = 0;

		while (aCursor != null && bCursor != null) {
			if (aCursor == bCursor) {
				intersectionNode = aCursor;
				break;
			}

			aCursor = aCursor.next;
			bCursor = bCursor.next;
		}

		if (intersectionNode == null) {
			if (aCursor == null && bCursor != null) {
				while (bCursor != null) {
					equalizeCount += 1;
					bCursor = bCursor.next;
				}

				aCursor = headA;
				bCursor = headB;
				for (int i = 0; i < equalizeCount; i++) {
					bCursor = bCursor.next;
				}
			} else if (aCursor != null && bCursor == null) {
				while (aCursor != null) {
					equalizeCount += 1;
					aCursor = aCursor.next;
				}

				aCursor = headA;
				bCursor = headB;
				for (int i = 0; i < equalizeCount; i++) {
					aCursor = aCursor.next;
				}
			}

			while (aCursor != null && bCursor != null) {
				if (aCursor == bCursor) {
					intersectionNode = aCursor;
					break;
				}

				aCursor = aCursor.next;
				bCursor = bCursor.next;
			}
		}

		return intersectionNode;
	}
}
