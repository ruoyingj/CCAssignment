package ch4;

import java.util.Stack;

public class Solution05 {
	public int maxSearch(TreeNode root){
		int max = Integer.MIN_VALUE;
		Stack<TreeNode> p = new Stack<TreeNode>();
		p.push(root);
		while(!p.isEmpty()){
			root = p.pop();
			int value = root.value;
			if(value > max){max = value;}
			if(root.left != null){
				p.push(root.left);
			}
			if(root.right != null){
				p.push(root.right);
			}
		}
		return max;
		
	}
	public int minSearch(TreeNode root){
		int min = Integer.MAX_VALUE;
		Stack<TreeNode> p = new Stack<TreeNode>();
		p.push(root);
		while(!p.isEmpty()){
			root = p.pop();
			int value = root.value;
			if(value < min){min = value;}
			if(root.left != null){
				p.push(root.left);
			}
			if(root.right != null){
				p.push(root.right);
			}
		}
		return min;
	}
		
		public boolean isBinaryTree(TreeNode root){
			Stack<TreeNode> p = new Stack<TreeNode>();
			p.push(root);
			while(!p.isEmpty()){
				root = p.pop();
				int mid = root.value;
				int max = maxSearch(root.left);
				int min = minSearch(root.right);
				if(mid >= max && mid <= min){
					if(root.left!=null){
						p.push(root.left);
					}
					if(root.right!=null){
						p.push(root.right);
					}
				}else{
					return false;
				}
			}
			return true;
		}
		
		
}
