package removeDuplicatesLLSorted;

import java.util.LinkedList;
public class DeleteDupsFromSortedLL {

	public static void main(String args[]){
		ListNode nod1 = new ListNode(1);
		ListNode nod11 = new ListNode(1);
		ListNode nod111 = new ListNode(1);
		ListNode nod1111 = new ListNode(1);
		ListNode nod2 = new ListNode(2);
		ListNode nod22 = new ListNode(2);
		ListNode nod222 = new ListNode(2);
		ListNode nod3 = new ListNode(3);
		ListNode nod33 = new ListNode(3);
		ListNode nod333 = new ListNode(3);
		
		nod1.next = nod11;
		nod11.next = nod111;
		nod111.next = nod1111;
		nod1111.next = nod2;
		nod2.next = nod22;
		nod22.next = nod222;
		nod222.next = nod3;
		nod3.next = nod33;	
		nod33.next = nod333;	
		
//		printLL(nod1);
		printLL(deleteDuplicates(nod1));
	}
	public static ListNode deleteDuplicates(ListNode first) {
		
		if(first == null) return first ;

		ListNode newList = first;
		while (newList.next != null ){
			if(newList.val == newList.next.val){
				newList.next= newList.next.next;
			}else{
			newList = newList.next;
}
		}
		return first;
	}
	
	public static void printLL(ListNode ll){
		while (ll != null){
			System.out.print(ll.val + "->");
			ll = ll.next;
		}
	}
	
	
//    public static ListNode deleteDuplicates(ListNode a) {
//        ListNode temp = a;
//
//    while(temp != null && temp.next != null ){
//        if(temp.val == temp.next.val){
//            temp.next = temp.next.next;
//        }
//        else{
//        temp = temp.next;
//        }
//    }
//    return a;
//}
    
    
}



//////////////////////////////////////

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
