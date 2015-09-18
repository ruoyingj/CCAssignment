package ch1;



public class Solution01 {
	public static Boolean isContainUniqueC (String s){
		for(int i = 0; i < s.length(); i++){
			for (int j = i + 1; j < s.length(); j++){
				if( s.charAt(i) == s.charAt(j)){
					return false;
				}
			}
		}
		
		return true;
		
	}
	 public static void main(String[] args){
		 System.out.println(isContainUniqueC("a234ew"));
	 }
	
}
