package ch1;

public class Solution03 {
	public static String replaceEmptySpace(String s, int size){
		int num = 0;
		//Count the number of empty space in the string s  
		for(int i = 0; i < size; i++){
			if(s.charAt(i) == ' '){
				num++;
			}
		}
		//New a char array contains the final result
		char []result = new char[size + num*2];
		int j = 0;
		//replace the empty space with %20 when empty space occurs
		for(int i = 0; i < size; i++){
			if(s.charAt(i) == ' '){
				result[j] = '%';
				result[j+1] = '2';
				result[j+2] = '0';
				j += 3;
			}
			//If the character is not empty space, just add into the result array
			else{
				result[j] = s.charAt(i);
				j++;
			}
		}
		//Transform the char array to string
		String NewString = new String();
		for (int i = 0; i < (size + num*2); i ++ ){
			NewString += result[i];
			
		}
		return NewString;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceEmptySpace("I LOVE YOU   ",10));

	}
}
