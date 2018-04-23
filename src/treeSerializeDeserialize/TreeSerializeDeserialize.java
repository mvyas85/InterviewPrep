package treeSerializeDeserialize;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TreeSerializeDeserialize {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);

		n4.left = n1;
		n4.right = n2;

		root.left = n4;
		root.right = n5;

		
//		TreeNode root = new TreeNode(1);
//		TreeNode n9 = new TreeNode(9);
//		TreeNode n1 = new TreeNode(1);
//		TreeNode n0 = new TreeNode(0);
//
//		n9.right = n1;
//		root.left = n9;
//		root.right = n0;
		System.out.println(serialize(root));
		@SuppressWarnings("unused")
		TreeNode ans = deserialize(serialize(root));
		System.out.println("DD");
		// System.out.println(isSubtree(root,n44));
	}
	
    // Encodes a tree to a single string.
	  public static String serialize(TreeNode root) {
	        //Creating preorder tree
	        if(root == null){return null;}
	        Stack<TreeNode> stack = new Stack<>();
	        
	        StringBuilder sb = new StringBuilder();
	        
	        while(root!= null || !stack.empty()){
	            if(root != null){
	                sb.append(root.val).append("#");
	                stack.push(root);
	                root = root.left;
	            }else{
	                root = stack.pop();
	                root = root.right;
	            }
	        }
	        return String.valueOf(sb);
	    }

	    // Decodes your encoded data to tree.
	    public static TreeNode deserialize(String data) {
	        if(data == null){return null;}
	        
	        String[] str = data.split("#");
	        
	        Queue<Integer> queue = new LinkedList<>();
	        for(String s: str){
	            int n = Integer.parseInt(s);
	            queue.offer(n);
	        }
	        return getTreeNode(queue);
	    }
	    
	    public static TreeNode getTreeNode(Queue<Integer> queue){
	        
	        if(queue.isEmpty()){return null;}
	        
	        Queue<Integer> smallVal = new LinkedList<>();
	        TreeNode root = new TreeNode(queue.poll());
	        while(!queue.isEmpty() && queue.peek()<root.val){
	            smallVal.offer(queue.poll());
	        }
	        root.left = getTreeNode(smallVal);
	        root.right = getTreeNode(queue);
	        return root;
	    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
