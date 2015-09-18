package ch1;


public class Solution07 {
	public void rotate(int[][] matrix) {
		//Rotate the rows.
		for(int i = 0; i < matrix.length/2; i++){
			for(int j = 0; j < matrix.length; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length-i-1][j];
				matrix[matrix.length-i-1][j] = temp;
				}
			}
		//use the diagnol as the axle wire
		for (int i = 0; i < matrix.length;i++){
			for(int j = i+1; j < matrix.length;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
				
			}
		}
			
		
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
