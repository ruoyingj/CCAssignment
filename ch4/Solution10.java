package ch4;

import java.util.Stack;

public class Solution10 {
	public boolean isSubtree(TreeNode node1, TreeNode node2){
		if(transform(node1).contains(transform(node2))){
			return true;
		}else{
			return false;
		}
	}
	public String transform(TreeNode root){
		String result = "";
		Stack<TreeNode> p = new Stack<TreeNode>();
		p.push(root);
		while(!p.isEmpty()){
			root = p.pop();
			result += String.valueOf(root.value);
			int value = root.value;
			
			if(root.left != null){
				p.push(root.left);
			}
			if(root.right != null){
				p.push(root.right);
			}
		}
		return result;
	}
}
