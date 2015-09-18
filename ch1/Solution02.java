package ch1;

import java.util.HashMap;

public class Solution02 {
	public static boolean isPermutation(String str1, String str2){
		//Judge whether the size of two strings is equal.
		if(str1.length() != str2.length()){
			return false;
		}
		/* Store the first string in hashmap.
		 * Key is the character which has shown in the string(No repeat).
		 * Value is the times key appears.
		 */
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for(int i = 0; i < str1.length(); i++){
			//System.out.println("step1");
			if(hashmap.containsKey(str1.charAt(i))){
				hashmap.put(str1.charAt(i), hashmap.get(str1.charAt(i))+1);
			}else{
				hashmap.put(str1.charAt(i),1);
			}
		}
		/*#hashmap iterator
		  Iterator it = hashmap.keySet().iterator();
		while(it.hasNext()){
			char key = (char) it.next();
			System.out.println("key:" + key);
			System.out.println("value:"+ hashmap.get(key));
		}
		*/
		/*Compare the second string with hashmap.
		 * Whether the character is in hashmap
		 * Wheter the times of character appears equal.
		 */
		for(int j = 0; j < str2.length(); j++ ){
			//System.out.println("step2");
			if(hashmap.containsKey(str2.charAt(j))){
				//Find a same character, minus the value by 1.
				hashmap.put(str2.charAt(j), hashmap.get(str2.charAt(j))-1);
				/*if the value of a ceratin key of hashmap is 0, it means  
				 * two strings have the same number of such key.
				 */
				if(hashmap.get(str2.charAt(j)) == 0){
					hashmap.remove(str2.charAt(j));
				}
			}
			
		}
		
		/*  Iterator it = hashmap.keySet().iterator();
		while(it.hasNext()){
			char key = (char) it.next();
			System.out.println("key:" + key);
			System.out.println("value:"+ hashmap.get(key));
		}
		*/
		
		//if the hashmap is empty, which means two strings are exactly the same.
		if(hashmap.isEmpty()){
			return true;
		}else {return false;}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermutation("113544445","142345441"));

	}

}
