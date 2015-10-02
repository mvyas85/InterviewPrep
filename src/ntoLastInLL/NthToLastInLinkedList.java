package ntoLastInLL;
/*
 * Implement an algorithm to find the nth to last element of a singly linked list
 */;

public class NthToLastInLinkedList {

	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		//find 3rd from end
		ll.add(new Node(1));
		ll.add(new Node(2));
		ll.add(new Node(3));
		ll.add(new Node(4));
		ll.add(new Node(5));
		ll.add(new Node(6));
		System.out.println(nthElement(ll, 2));
		
	}
	

	public static int nthElement(LinkedList ll, int n){
		
		if(ll.head==null||n<1){
			return 0; // element not found less than 1
		}
		Node p1 = ll.head;
		Node p2 = ll.head;
		
		for(int i=0;i<n-1;i++){
			if(p2 == null){
				return 0; // element not found 
			}
			p2 = p2.next;
		}
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1.data;
		
	}
}

class LinkedList{
	public Node head;
	LinkedList(){head = null;}
	
	public void add(Node n){
		if(head == null){
			head = n;
			return;
		}
		Node runner = head;
		while(runner.next != null){
			runner = runner.next;
		}
		runner.next = n;
	}
}
class Node{
	public int data;
	public Node next;
	public Node(int data){this.data = data;
	this.next = null;}
}
