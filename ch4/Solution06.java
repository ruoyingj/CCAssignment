package ch4;

public class Solution06 {
	public TreeNode nextNode(TreeNode node){
		if(node == null){return null;}
		if(node.right == null&& node.parent != null){
			TreeNode temp = node.parent;
			while(temp.left != node && temp.left != node)
			{   node = temp; 
				temp = temp.parent;
			}
			return temp;
		}
		else{TreeNode nextNode = node.right;
		while(nextNode.left!=null){
			nextNode = nextNode.left;
		}
		return nextNode;
		}
	}
}
