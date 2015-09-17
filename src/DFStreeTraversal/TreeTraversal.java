package DFStreeTraversal;

import java.util.ArrayDeque;
import java.util.Deque;
/*
 *     (Breadth First)          (Depth First - inorder) 
 * 	    TREE A 					   TREE B
 *
 *        the 					     the
 *       / | \				        / | \
 *   quick brown fox            quick fox lazy
 *   /     |     \              /     |     \
 * jumps  over    the         brown  jumps   dog
 *         |       \                 / \
 *        lazy      dog            over  the
 */

//Depth First Pre Order Traversal- TREE B
public class TreeTraversal {
	
	public static void main(String args[]){

		TreeNode the = new TreeNode(new TreeNode[]{}, "the");
		TreeNode over = new TreeNode(new TreeNode[]{}, "over");
		
		TreeNode brown = new TreeNode(new TreeNode[]{}, "brown");
		TreeNode jumps = new TreeNode(new TreeNode[]{over,the}, "jumps");
		TreeNode dog = new TreeNode(new TreeNode[]{}, "dog");
		
		TreeNode quick = new TreeNode(new TreeNode[]{brown}, "quick");
		TreeNode fox = new TreeNode(new TreeNode[]{jumps}, "fox");
		TreeNode lazy = new TreeNode(new TreeNode[]{dog}, "lazy");

		TreeNode theRoot = new TreeNode(new TreeNode[]{quick,fox,lazy}, "the");
		
		printPreorder(theRoot);
	}
	
	 public static void printPreorder(TreeNode root){
		 printPreOrderRec(root);

	 }

	private static void printPreOrderRec(TreeNode currRoot) {
		if(currRoot == null){
			return;
		}

		System.out.print(currRoot.getValue()+" ");
		for(int i=0;i<currRoot.getNumChildren();i++){
			printPreOrderRec(currRoot.getChild(i));
		}
	}
}

class TreeNode {
	private TreeNode[] children;
	private String value;
	 
	public TreeNode(TreeNode[] children, String value) {
		super();
		this.children = children;
		this.value = value;
	}
	public TreeNode getChild(int i) {
		return children[i];
	}
	public String getValue() {
		return value;
	}
	public int getNumChildren(){
		 return children.length;
	}
}
