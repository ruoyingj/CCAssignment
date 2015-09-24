package ch3;

import javax.annotation.processing.FilerException;

public class Solution01 {
	int size_stack;
	int numbersOfStack;
	int sizes[];
	int result[];
	public void Solution(int size){
		size_stack = size;
		numbersOfStack =3;
		sizes = new int[3];
		result = new int[3*size_stack];		
	}
	
	public void push(int value, int number) throws Exception{
		if(isFull(number)){
			throw new Exception();
		}int index = top_index(number);
		result[index + 1] = value;
		sizes[number]++;
		
		
	}
	public int pop (int number) throws Exception{
		if(isEmpty(number)){
			throw new Exception();
		}int index = top_index(number);
		int value = result[index];
		sizes[number]--;
		result[index] = 0;
		return value;
		
	}
	
	public int peek (int number)throws Exception{
		if(isEmpty(number)){
			throw new Exception();
		}int index = top_index(number);
		int value = result[index];
		return value;
		
	}
	
	public boolean isEmpty (int number){
		int index = top_index(number);
		int begin = number*size_stack - 1;
		if(index == begin){return true;}
		else return false;
		
		
	}
	public boolean isFull (int number){
		int index = top_index(number);
		int begin = (number+1)*size_stack - 1;
		if(index == begin){return true;}
		else return false;
		
		
	}
	public int top_index (int number){
		int m = number * size_stack;
		int size = sizes[number];
		int index = m + size;
		return index + 1;
		
		
	}
	


}
