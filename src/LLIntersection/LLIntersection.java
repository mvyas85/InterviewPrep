package LLIntersection;
/**
 * 
 * 
 
 160. Intersection of Two Linked Lists

Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 * @author vyasma1
 *
 */

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