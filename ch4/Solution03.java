package ch4;

import java.util.ArrayList;
import java.util.LinkedList;


public class Solution03 {
	public ArrayList<LinkedList<TreeNode>> creatLinkedNode(TreeNode node){
	ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
	LinkedList<TreeNode> currentLevel = new LinkedList<TreeNode>();
	currentLevel.add(node);
	while(node!=null){
		result.add(currentLevel);
		LinkedList<TreeNode> highLevel = currentLevel;
		currentLevel = new LinkedList<TreeNode>();
		for(TreeNode p : highLevel){
			if(p.left != null){
				currentLevel.add( p.left);
			}
			if(p.right != null){
				currentLevel.add (p.right);
			}
		}
		
		
	}
	return result;
	
	}

}
