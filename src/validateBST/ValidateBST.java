package validateBST;

import java.util.Stack;

public class ValidateBST {


	public static void main(String args[]) {
		
	}
	
	public static boolean validateBST(TreeNode root){
		
		if(root == null){
			return true;
		}
		Stack<Integer> stack = new Stack<Integer>();
		TreeNode temp = null;
		
		while(root != null){
			
		}
		return false;
	
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
