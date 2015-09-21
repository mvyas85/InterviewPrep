package removeDuplicatesLL;

import java.util.Hashtable;

 /* Write code to remove duplicates from an unsorted linked list FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 *
 */
public class removeDupLinkedList {


	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		//find 3rd from end
		
		Node nn = new Node(2);
		ll.add(new Node(1));
		ll.add(new Node(1));
		ll.add(new Node(1));
		ll.add(new Node(1));
		ll.add(new Node(1));
		ll.add(nn);
		ll.add(new Node(3));
		ll.add(new Node(3));
		ll.add(new Node(2));
		ll.add(new Node(6));
		ll.add(new Node(6));
		ll.add(new Node(6));
		ll.add(new Node(6));
		ll.add(new Node(6));
		ll.add(new Node(1));
		ll.add(new Node(1));
		ll.add(new Node(1));
		ll.add(new Node(6));
		
//		ll.remove(nn);
		
//		ll.printLL();
//		deleteDups(ll.head);
//		System.out.println();
//		ll.printLL();
		

		
		System.out.println("Without Buffer");
		ll.printLL();
		deleteDupsWithoutBuffer(ll,ll.head);
		System.out.println();
		ll.printLL();
	}
	

	public static void deleteDups (Node n){
		 Hashtable table = new Hashtable();
		 Node previous = null;
		  while(n!=null){
		      if(table.containsKey(n.data)){
		          previous.next = n.next;
		      } else {
		          table.put(n.data, true);
		          previous = n;
		      }
		      n = n.next;
		  }
		}
	
	public static void deleteDupsWithoutBuffer (LinkedList ll , Node head){
		Node p1 = head;
		Node p2= head;
		while(p1.next != null){
			p2 = p1;
			while(p2.next != null){
				p2 = p2.next;
				if(p1.data == p2.data){
					ll.remove(p2);
					if(p2.next == null){
						break;
					}
				}
			}

			if(p1.next == null){
				break;
			}
			p1 = p1.next;
			
		}
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
	public void remove(Node n){
		if(head == null){
			return;
		}
		
		Node runner = head;
		while(runner.next != null){
			if(runner.next == n){
				runner.next = runner.next.next;
			}else{
				runner = runner.next;
			}
			
		}

	}
	
	public void printLL() {
		Node runner = head;
		while(runner != null){
			System.out.print(runner.data+" ");
			runner = runner.next;
		}
		
	}

}
class Node{
	public int data;
	public Node next;
	public Node(int data){this.data = data;
	this.next = null;}
}
