package ch4;

public class Solution04 {
	public int getTreeHeight(TreeNode root){
		int leftHeight = getTreeHeight(root.left);
		int rightHeight = getTreeHeight(root.right);
		if(leftHeight > rightHeight){
			return leftHeight+1;
		}else{
			return rightHeight+1;
		}
		
	}
	
	public boolean isBalance(TreeNode root){
		int left = getTreeHeight(root.left);
		int right = getTreeHeight(root.right);
		int distance = Math.abs(left - right);
		if(distance > 1){
			return false;
		}else{
			boolean a = isBalance(root.right);
			boolean b = isBalance(root.left);
			return a&&b;
		}
	}
}
