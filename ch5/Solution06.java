package ch5;

public class Solution06 {
	public static int conversion( int m, int n){
		int num = 0;
		for(int i = m ^ n; i != 0; i >>= 1){
			num += i&1;
		}
		return num;
	} 
	public static void main(String[] args) {
		int result = conversion(0b11101, 0b01111);
		System.out.println(result);

	}


}
