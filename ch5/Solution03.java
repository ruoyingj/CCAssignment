package ch5;

import java.util.ArrayList;

public class Solution03 {
	public static int flipBitToWin(int value){
		String value_binary= Integer.toBinaryString(value);
		ArrayList<ArrayList<Integer>> sequence = new ArrayList<ArrayList<Integer>>();
		value_binary = " " + value_binary; 
		int i = 1;
		while(i < value_binary.length()){
			int current = value_binary.charAt(i);
			int pre = value_binary.charAt(i-1);
			if(current != pre){
				ArrayList<Integer> item = new ArrayList<Integer>();
				item.add(current);
				item.add(1);
				sequence.add(item);
			}else{
				int num = sequence.get(sequence.size()-1).get(1);
				sequence.get(sequence.size() - 1).set(1, num + 1);
			}
			i++;
		}
		int maxLength = Integer.MIN_VALUE;
		for(int j = 0; j < sequence.size(); j ++){
			ArrayList item = sequence.get(j);
			int key = (int) item.get(0) - '0';
			if(key == 0){
				int val = (int) item.get(1);
				if(val == 1){
					int length = sequence.get(j - 1).get(1) + sequence.get(j + 1).get(1) + 1;
					if(length > maxLength){
						maxLength = length;
					}
				}else{
					int length = Math.max((sequence.get(j - 1).get(1) + 1), (sequence.get(j + 1).get(1) + 1));
					if(length > maxLength){
						maxLength = length;
					}
				}
				
				
			}
			
		}
		return maxLength;
		
	}
	
	
	public static void main(String[] args) {
		int result = flipBitToWin(0b11011101111);
		System.out.println(result);

	}
}
