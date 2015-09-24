package ch4;

import java.util.Random;

public class Solution11 {
	 public class tree{
		 treeNode root;
		 
		 public treeNode getRandomNode(treeNode root){
			 Random random = new Random();
			 int i = random.nextInt(root.getSize());
			 return root.getNode(i);
		 }
	 }
	
	public class treeNode{
		int value;
		int index = 0;
		treeNode left;
		treeNode right;
		int size;
		 
		 public void setSize(int size){
			this.size = size;
		 }
		 public int getSize(){
			 return size;
		 }
		public treeNode(int value){
			this.value = value;
		}
		
		public treeNode getNode(int i){
			int size_left;
			if(left == null){
				size_left = 0;
			}else{
				size_left = left.getSize();
			}
			if(size_left == i){
				return this;
			}else if(size_left > i){
				return left.getNode(i);
			}else{
				return right.getNode(i - size_left - 1);
			}
		}

		
		
	
	
	
	}
	
	
	
	
	
}
       