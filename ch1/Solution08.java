package ch1;


public class Solution08 {
	public static void setMatrixAsZero(int[][] matrix){
		int length = matrix.length;
		int breadth = matrix[0].length;
		int row[] = new int[length];
		int col[] = new int[breadth];
		//define two arrays to remember the column and row should be set as 0
		for(int i = 0; i < length; i++){
			for (int j = 0; j < breadth; j++){
				if(matrix[i][j] == 0){
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		//check row by row, whether this row has a signal to be 0
		for(int i = 0; i < length; i++){
			if(row[i] == 1){
				for (int j = 0; j < breadth; j++){
					matrix[i][j] = 0;
				}
			}
		}
		//check column by column, whether this column has a signal to be 0
		for(int i = 0; i < breadth; i++){
			if(col[i] == 1){
				for(int j = 0; j < length; j++){
					matrix[j][i] = 0;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][4];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 1;
		a[0][3] = 2;
		a[1][0] = 0;
		a[1][1] = 2;
		a[1][2] = 1;
		a[1][3] = 2;
		a[2][0] = 1;
		a[2][1] = 2;
		a[2][2] = 1;
		a[2][3] = 2;
		setMatrixAsZero(a);
		for(int i = 0 ; i < 3; i++){
			for(int j = 0; j < 4; j++ ){
				
				System.out.println(a[i][j]); 
				
			}
			
		}
		

	}

}