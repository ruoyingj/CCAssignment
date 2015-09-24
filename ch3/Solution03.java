package ch3;

import java.util.Stack;
import java.util.Vector;

public class Solution03 {
	Vector<Stack> SetOfStacks = new Vector<Stack>();
	int capacity;

	public Solution03(int capacity) {
		this.capacity = capacity;
	}

	public Stack lastStack() {
		int size = SetOfStacks.size();

		if (size == 0) {
			return null;
		} else {
			return SetOfStacks.get(size - 1);
		}
	}

	public void push(int value){
		 Stack curStack = lastStack();
		 int size = lastStack().size();
		 if(!curStack.isEmpty()&&curStack.size() < capacity){
			 curStack.push(value);}
		 else{
			 Stack newStack = new Stack();
			 newStack.push(value);
			 SetOfStacks.add(newStack);
		 	}
		}

	public int pop() {
		Stack curStack = lastStack();
			int value =   (int) curStack.pop();
			if(curStack.size() == 0){
				SetOfStacks.remove(curStack);	
			}
			return value;
	}
	
	public boolean isEmpty(){
		Stack curStack = lastStack();
		if(curStack == null){return true;}
		else{return false;}
	}
	
	public int shift(int index, boolean m ){
		Stack stack = SetOfStacks.get(index);
		int temp;
		if(m){
			temp = (int) stack.pop();
		}else{
			temp = stack.removeBottom();
		}
		if(stack.isEmpty()){
			stack.remove(index);
		}else if(stack.size() > index + 1){
			int temp2 = shift(index + 1, false);
			stack.push(temp2);
		}
		return temp;
		
		
	}
	
	public int popAt(int index){
		return shift(index, true);
		
	}

	
	

}
