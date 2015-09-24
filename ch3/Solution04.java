package ch3;

import java.util.Stack;

public class Solution04<T> {
	Stack< T > stack1;
	Stack< T > stack2;
	
	
	//constructor
	public Solution04(){
		stack1 = new Stack <T>();
		stack2 = new Stack <T>();
	}
	// add the element in stack1.
	public void add(T element){
		stack1.push(element);
		
	}
	/*first pop each element 
	* push the element in stack2
	* then the stack 2 contains the oldest element
	*/
	public T peek(){
		if(stack2.isEmpty()){
			while(stack1.size()!=0){
				T value = stack1.pop();
				stack2.push(value);
			}
		}
		//not remove the element
		return stack2.peek();
	}
	public T pop(){
		if(stack2.isEmpty()){
			while(stack1.size() != 0){
				T value = stack1.pop();
				stack2.push(value);
			}
		}
		//remove the element
		return stack2.pop();
		
	}
	
	

	

}
