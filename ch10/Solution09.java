package ch10;

public class Solution09 {
	 public static boolean searchInMatrix(int[][] matrix, int target){
		 int columSize = matrix[0].length;
		 int rowSize = matrix.length;
		 int i = columSize - 1;
		 int j = 0;
		 while(j < rowSize && i >=0 ){
			 if(target < matrix[i][j]){
				 i--;
			 }else if(target > matrix[i][j]){
				 j++;
			 }else if(target == matrix[i][j]){
				 return true;
				 
			 }
		 }
		 return false;
	 }

	 public static void main(String[] args) {
		 int matrix[][]={{15,20,30,40},{20,35,55,80},{30,55,95,105},{40,80,100,120}};
		 System.out.println(searchInMatrix(matrix,111));
		 
	 }
}
