package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution07 {
	
	String filename = "input.txt";
	void findMissingInt(){
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileReader(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long numbersets = (long)Integer.MAX_VALUE + 1;
		byte[] bf = new byte[(int) (numbersets/8)];
		while(scanner.hasNext()){
			int temp = scanner.nextInt();
			int chunkNumber = (int) (numbersets / 8);
			int bitPosition = (int) (numbersets % 8);
			bf[chunkNumber] = (byte) (bf[chunkNumber] | (1 << bitPosition));
			}
		for(int i = 0; i < bf.length; i++){
			for(int j = 0; j < 8; j++){
				int isExit = bf[i] & (1 << j);
				if(isExit == 0){
					int value = i * 8 + j;
					System.out.println(value);
				}
			}
		}
		
	}
	

}
