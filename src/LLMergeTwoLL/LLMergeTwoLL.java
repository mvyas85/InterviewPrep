package LLMergeTwoLL;

public class LLMergeTwoLL {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(-9);
		ListNode l11 = new ListNode(3);
		l1.next = l11;
		
		
		ListNode l2 = new ListNode(5);
		ListNode l22 = new ListNode(7);
		l2.next = l22;
		
		mergeTwoLists(l1,l2);
		
		
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode merged = new ListNode(0);
		ListNode head = merged;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				merged.next = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				merged.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			merged = merged.next;
		}

		while (l1 != null) {
			merged.next = new ListNode(l1.val);
			merged = merged.next;
			l1 = l1.next;
		}

		while (l2 != null) {
			merged.next = new ListNode(l2.val);
			merged = merged.next;
			l2 = l2.next;
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
}
