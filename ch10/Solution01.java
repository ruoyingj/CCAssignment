package ch10;

public class Solution01 {
	public static int[] mergeTwoSortedArrays(int a[], int b[], int endIndexA, int endIndexB){
		int p = endIndexA - 1;
		int q = endIndexB - 1;
		int endIndex = endIndexA + endIndexB -1;
		while(q >= 0){
			if(p >= 0 && a[p] > b[q]){
				a[endIndex] = a[p];
				p--;
			}else{
				a[endIndex] = b[q];
				q--;
			}
				
			endIndex--;
			
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,5,6,7,8,0,0,0,0,0};
		int b[] = {2,3,5,6,8};
		int endIndexA = 6;
		int endIndexB = 5;
		int m = endIndexA + endIndexB -1;
		int[] result = mergeTwoSortedArrays(a,b, endIndexA, endIndexB);
		for(int i = 0; i < m; i++){
			System.out.println(result[i]);
		}
	}


}
