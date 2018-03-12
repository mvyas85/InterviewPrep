package LLhasLoop;

import java.util.HashSet;

/*
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

Example :

Input : 

                  ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

Return the node corresponding to node 3. 
 */
public class CyclicLinkedList {

	public static void main (String args[]){

		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		
		first.next = second;
		second.next = third;
		third.next = four;
		four.next = third;
		
		System.out.println(detectCycle1(first));
	}
	public ListNode detectCycle(ListNode A) {

	    HashSet<ListNode> hashSet = new HashSet<>();
	    
	    while (A != null) {
	        if (hashSet.contains(A)) {
	            return A;
	        } else {
	            hashSet.add(A);
	        }
	        A = A.next;
	    }
	    
	    return null;
	}
	
	public static ListNode detectCycle1(ListNode a) {
	    
	    if(a == null) return null;
	    ListNode slow, fast;
	    slow = a;
	    fast = a;
	    
	    while(slow != null && fast != null && fast.next != null){
	        slow = slow.next;
	        fast = fast.next.next;
	        
	        if(slow == fast) return slow;
	    }
	    return null;
	}
	

}

class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int x) { val = x; next = null; }
     public ListNode(int x,ListNode next) { val = x; this.next = next; }
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return String.valueOf(val);
    }
 }