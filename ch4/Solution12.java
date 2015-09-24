package ch4;

public class Solution12 {
	
	public int countPath(int target, TreeNode node){
		if(node == null){return 0;}
		int result = 0;
		int a = countPathFromNode(target,node, 0);
		int b = countPath(target, node.left);
		int c = countPath(target, node.right);
		return a+b+c;
		
	}
	
	public int countPathFromNode(int target, TreeNode begin, int CurrentSum){
		if(begin == null){return 0;}
		int totalPath = 0;
		CurrentSum += begin.value;
		if(CurrentSum == target){
			totalPath++;
		}
			
		countPathFromNode(target, begin.left, CurrentSum);
		countPathFromNode(target, begin.right, CurrentSum);
		return totalPath;
	}

}
