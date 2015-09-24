package ch4;

public class Solution08 {
	public TreeNode commonAncestor(TreeNode node1, TreeNode node2){
		if(node1 != node2){
			TreeNode parent = node1;
			while(parent != null){
				if (isLinkedNodes(parent, node2)){
					return parent;
					
				}
				else parent = parent.parent;
			}
			return null;
			
		}else{return null;}
	}
	public boolean isLinkedNodes(TreeNode a, TreeNode b){
		while(a != null){
			if(a == b){
				return true;
			}else{
			b = b.parent;
			}
		}
		return false;
		
	}

}
