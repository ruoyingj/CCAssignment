package ch3;

import java.util.Stack;

public class Solution02 extends Stack<Integer>{
	//Use a stack to store the minimum value of each step.
	Stack<Integer> minValue = new Stack<Integer>();
	// compare the current value with the minimum value
	//if current value is smaller than the minimum value, add the current value to the stack
	public void push(int value){
		super.push(value);
		if(min() > value){
			minValue.push(value);
		}
	}
	
	public Integer pop(){
		int value = super.pop();
		//if the minValue is removed than update the stack
		if(super.pop() == min()){
			minValue.pop();
		}
		return super.pop();
	}
	public int min(){
		//when minValue is empty
		if(minValue.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return minValue.peek();
		}
		
	}

}
