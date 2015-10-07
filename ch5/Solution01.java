package ch5;

public class Solution01 {
	static int insertMtoN(int M, int N, int j, int i){
		int temp = ~0;
		int N_change = (temp << (j + 1)) | ((1 << i) - 1);
		int m = M << i;
		int n = N_change & N;
		
		return n | m;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = insertMtoN(0b10011, 0b10000000000, 6, 2);
		System.out.println(Integer.toBinaryString(result));

	}

}
