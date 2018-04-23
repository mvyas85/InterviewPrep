package llMergeKLinkedList;
/**
 * 
 * 
 * 23. Merge k Sorted Lists

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * @author vyasma1
 *
 */
public class LLMergeKLinkedList {

	public static void main(String args[]) {
		ListNode[] lists = { new ListNode(1), new ListNode(0) };
		printLL(mergeKLists(lists));

	}

	public static void printLL(ListNode ll) {

		while (ll != null) {
			System.out.print(ll.val + "-->");
			ll = ll.next;
		}

		System.out.print("null");

	}
	public static ListNode mergeKLists(ListNode[] lists) {

		if (lists.length == 0) {
			return null;
		}
		if (lists.length == 1) {
			return lists[0];
		}
		
		return partition(lists,0,lists.length-1);
	}
	
	public static ListNode partition(ListNode[] lists, int l,int r){
		if(l == r){return lists[l];} 
			
		while(l<r){
			int m = l+(r-l)/2;
			
			ListNode n1 = partition(lists,l,m);
			ListNode n2 = partition(lists,m+1,r);
			return mergeTwoLL(n1,n2);
			
			
		}
		
		return null;
	}
	
	
	
	
	
	
	//This is right approach but dosent work as it -
	//Timeout use it so that divide and conquer 
	public static ListNode mergeKLists1(ListNode[] lists) {

		if (lists.length == 0) {
			return null;
		}
		if (lists.length == 1) {
			return lists[0];
		}

		ListNode node1 = lists[0];
		for (int i = 1; i < lists.length; i++) {
			node1 = mergeTwoLL(node1, lists[i]);
		}

		return node1;
	}

	public static ListNode mergeTwoLL(ListNode n1, ListNode n2) {
		if (n1 == null) {
			return n2;
		}
		if (n2 == null) {
			return n1;
		}
		
		ListNode merged = new ListNode(0);
		ListNode head = merged;
		while (n1 != null && n2 != null) {
			if (n1.val < n2.val) {
				merged.next = new ListNode(n1.val);
				n1 = n1.next;
			} else {
				merged.next = new ListNode(n2.val);
				n2 = n2.next;
			}
			merged = merged.next;

		}

		while (n1 != null) {
			merged.next = new ListNode(n1.val);
			n1 = n1.next;
			merged = merged.next;
		}

		while (n2 != null) {
			merged.next = new ListNode(n2.val);
			n2 = n2.next;
			merged = merged.next;
		}
		return head.next;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public String toString() {
		return String.valueOf(val);
	}
}
