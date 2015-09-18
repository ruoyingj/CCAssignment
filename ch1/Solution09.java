package ch1;


public class Solution09 {
	
	//Define the function of isSubstring
	public static boolean isSubString(String str1, String str2){
		if(str1 == null || str2 == null){return false;}
		if(str1.contains(str2))
		return true;
		else return false;
		
	}
	//if the length of two strings is different. it can not be a rotation
	//str1+str2 contains all the possible combination of rotation.
	public static boolean isRotation(String str1, String str2){
		if(str1.length() != str2.length()){return false;}
		str1 += str1;
		 return isSubString(str1,str2);
		
		
	}
	
	
	
	public static void main(String[] args) {
		String s1 = "abcdef";
		String s2 = "defabc";
		System.out.println(isRotation(s1,s2));
		
	}
}
