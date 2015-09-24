package ch4;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Solution09 {
		public Vector<LinkedList<Integer>> findSubtree (TreeNode  root){
			Vector<LinkedList<Integer>> result = new Vector<LinkedList<Integer>>();
			if(root == null){
				return null;
			}else{
				LinkedList<Integer> res = new LinkedList<Integer>();
				res.add(root.value);
				Vector<LinkedList<Integer>> vec1 = findSubtree(root.left);
				Vector<LinkedList<Integer>> vec2 = findSubtree(root.right);
				
				
				for(LinkedList<Integer> v1: vec1){
					for(LinkedList<Integer> v2: vec2){
						Vector<LinkedList<Integer>> vec = new Vector<LinkedList<Integer>>();
						vec = combineTrees(v1,v2,res);
						result.addAll(vec);
					}
				}
				return result;
				
				
				
				
			}
		
	}
		public Vector<LinkedList<Integer>> combineTrees(LinkedList<Integer> vec1, LinkedList<Integer> vec2, LinkedList<Integer> parent){
			Vector<LinkedList<Integer>> result = new Vector<LinkedList<Integer>>();
			if(vec1.size() == 0&&vec1.size() != 0){
				LinkedList<Integer> temp = new LinkedList<Integer>();
				temp = (LinkedList<Integer>) parent.clone(); 
				temp.addAll(vec2);
				result.add(temp);
			}
			int head1 = parent.removeFirst();
			parent.addLast(head1);
			combineTrees(vec1, vec2, parent);
			parent.removeLast();
			vec1.addFirst(head1);
			
			int head2 = parent.removeFirst();
			parent.addLast(head2);
			combineTrees(vec1, vec2, parent);
			parent.removeLast();
			vec2.addFirst(head2);
			return result;
			
		}
	
}
	



