package ch1;

import java.util.HashMap;

public class Solution05 {
	
	public static boolean isEdit(String str1, String str2) {
		int size_str1 = str1.length();
		int size_str2 = str2.length();
		//Count the differences between two strings.
		int distance = 0;
		/*If the size of both strings are the same, there should be two characters
		*of the same index from two strings are different
		*/
		if (size_str1 == size_str2) {

			for (int i = 0; i < size_str1; i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					distance++;
				}
			}
		}
		/*Find the first index two indexes are different.
		*Extract the i+1 to size substring from the longer string compare with 
		*the i to size substring
		*/ 
		else if (size_str1 < size_str2) {
			//Delete or insert resulted in 1 distance of size difference 
			if ((size_str2 - size_str1) == 1) {
				int i = 0;
				for(; i < size_str1; i++ ){
					if(str2.charAt(i)!=str2.charAt(i)){
						distance++;
						break;
						
					}
				}
				isEdit(str1.substring(i),str2.substring(i+1));
				
			}else{return false;}
		} 
		
		else{
			isEdit(str2, str1);
		}
		//Judge whether the difference is smaller than 1
		if (distance <= 1){
			return true;
		}else {return false;}
	}

	

	public static void main(String[] args) {
		System.out.println(isEdit("pales", "pale"));
		// TODO Auto-generated method stub

	}

}
