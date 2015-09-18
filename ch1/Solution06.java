package ch1;

import java.util.Vector;

public class Solution06 {
	
	
	public static String stringCompression(String s){
		StringBuilder result = new StringBuilder();
		int i = 1;
		//record the first character of a string and define as the current character
		char currentCharacter = s.charAt(0);
		//result.append(s.charAt(0));
		int count = 1;
		/*If the character is the same as current character
		 * count adds by 1
		 * or there appears a new character replace the former one
		 * *
		 */
		while(i < s.length()){
			if(s.charAt(i) == currentCharacter){
				count++;
			}else{
				result.append(currentCharacter);
				result.append (count);
				currentCharacter = s.charAt(i);
				count = 1;
				
			}
			i++;
			
			
		}
		//add the last same and continuous characters.
		result.append(currentCharacter);
		result.append(count);
		if(s.length() < result.length() ){
			return s;
		}else{
		return result.toString();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringCompression("aabccb"));

	}

}
