package ch4;



public class Solution02 {
	public TreeNode getMinimalTree(int array[]){
		int length = array.length - 1;
		return minimalTree(array, 0 , length);
	}
	
	public TreeNode minimalTree(int array[], int begin, int end){
		int mid = ( begin + end ) / 2;
		TreeNode midNode = new TreeNode(mid);
		midNode.left = minimalTree(array, begin, mid - 1 );
		midNode.right = minimalTree(array, mid + 1, end);
		
		
		return midNode;
		
	}

}
