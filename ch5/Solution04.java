package ch5;

public class Solution04 {
	public static int findNextNumber(int n){
		int result;
		int value = n;
		int i = 0, j = 0;
		while(value != 0 && (value & 1) == 0){
			i ++;
			value >>= 1;
		}
		while(value != 0 && (value & 1) == 1){
			j ++;
			value >>= 1;
		}
		int p = i + j;
		if( p > 31 || p == 0)
		{
			return -1;
		}
		n = n | (1 << p);
		n = n & ~ ((1 << p) - 1);
		n = n | (1 << (i - 1) - 1);
		return  n;
	}
	public static void main(String[] args) {
		int result = findNextNumber(0b1010);
		System.out.println(result);

	}


}
