package ch3;

import java.util.Stack;

public class Solution05 {
	public Stack<Integer> sort_stack(Stack<Integer> oldStack){
		Stack<Integer> newStack = new Stack<Integer>();
		while(!oldStack.isEmpty()){
			int temp = oldStack.pop();
			while(!newStack.isEmpty()&&newStack.peek() < temp){
					oldStack.push(newStack.pop());
			}
			newStack.push(temp); 
		}
		return newStack;
		
	}

}
