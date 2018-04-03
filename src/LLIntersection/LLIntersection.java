package LLIntersection;


public class LLIntersection {

	public static void main (String args[]){


		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode four = new ListNode(4);
		
		first.next = second;
		second.next = third;
		third.next = four;
		
		

		ListNode first1 = new ListNode(1);
		ListNode second1 = new ListNode(2);
		ListNode third1 = new ListNode(3);
		ListNode four1 = new ListNode(4);
		
		first1.next = second1;
		second1.next = third1;
		
		
		getIntersectionNode(first,first1);
	}
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		int lenA = getLen(headA);
		int lenB = getLen(headB);

		while (lenA > lenB) {
			headA = headA.next;
			lenA--;
		}
		while (lenB > lenA) {
			headB = headB.next;
			lenB--;
		}

		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}

	public static int getLen(ListNode headA) {
		int len = 0;
		while (headA != null) {
			len++;
			headA = headA.next;
		}
		return len;
	}
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }