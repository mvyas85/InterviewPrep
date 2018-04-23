package palindromLinkedList;

public class PalindromLL {

	public static void main(String args[]) {

		ListNode first = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(3);
		ListNode four = new ListNode(1);
		
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);

		first.next = second;
		second.next = third;
		third.next = four;

		System.out.println(isPalindrome(first));
	}

    public static boolean isPalindrome(ListNode head) {
        
//    	if (head == null || head.next == null) {
//            return true;
//        }
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverseList(slow);
        while(slow != null){
            if(slow.val != head.val){return false;}
            slow = slow.next;
            head = head.next;
        }
        return true;
        
    }
    
    private static ListNode reverseList(ListNode runner){
        
        ListNode newHead = null;
        while(runner != null){
            ListNode next = runner.next;
            runner.next = newHead;
            newHead = runner;
            runner = next;
        }
        return newHead;
    }
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}

	public ListNode(int x, ListNode next) {
		val = x;
		this.next = next;
	}

	@Override
	public String toString() {
		return String.valueOf(val);
	}
}