package ch1;

import java.util.HashMap;
import java.util.Iterator;

public class Solution04 {
	public static boolean isPermuationOfPalidrome(String s){
		//Store the chat of string in a hashmap
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (int i = 0;  i< s.length(); i++){
			//Filter empty spaces.
			if(s.charAt(i) == ' '){continue;}
			//When a character appears double times, the value is 0
			//When a character appears single times, the value is 1
			if(hashmap.containsKey(s.charAt(i))){
				if(hashmap.get(s.charAt(i)) == 0){
			hashmap.put(s.charAt(i), 1);}
			else if(hashmap.get(s.charAt(i)) == 1){
				hashmap.put(s.charAt(i), 0);
			}}else{
				hashmap.put(s.charAt(i), 1);
			}
		}
		/*Permutaiton of a certain palindrome is that all characters except casual one
		 * will appear even times and the causal one will appear either even or odd times.
		 */
		 
		//Remove all the characters which appear even times
		Iterator it = hashmap.keySet().iterator();
			while(it.hasNext()){
				char key = (char) it.next();
				if(hashmap.get(key) == 0){
					it.remove();
				}
			}
			
		//This situation means each character appears even times.
		if(hashmap.isEmpty()){return true;}
		//This situation means one causal character appears odd times
		//So the value should be 1
		if(hashmap.size() == 1){
			
			if(hashmap.containsValue(1)){
				return true;
			}
		}
		return false;
		
		
		
		
	} 
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermuationOfPalidrome("abs b a"));

	}

}