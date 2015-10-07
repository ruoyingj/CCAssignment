package ch5;

public class Solution07 {
	public static int pairWise(int n){
		int i = n & 0xAAAAAAAA;
		int j = n & 0x55555555;
		i = i >> 1;
		j = j << 1;
		return i | j;
	}
	public static void main(String[] args) {
		int result = pairWise(0b1101);
		System.out.println(Integer.toBinaryString(result));

	}


}
