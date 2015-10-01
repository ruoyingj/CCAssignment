package ch10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution11 {
	public static void findPeakValley(int[] array){
		Arrays.sort(array);
		for(int i = 1; i < array.length; i++){
			int temp = array[i];
			array[i] = array[i-1];
			array[i-1] = temp;
		}
	}
}
