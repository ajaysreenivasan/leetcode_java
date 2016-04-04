
public class Solution024 {
	public static ListNode swapPairs(ListNode head){
		ListNode newListHead = head;
		ListNode cursor = head;
		
		if(!(head == null || head.next == null)){
			newListHead = head.next;
			
			while(cursor != null){
				ListNode temp = cursor.next;
				
				cursor.next = temp.next;
				temp.next = cursor;
				
			}
			
		}
			
		return newListHead;
	}
}
