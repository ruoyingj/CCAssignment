package ch5;

import java.util.ArrayList;

public class Solution02 {
	public static String binaryToString(double value){
		if(value >= 1 || value <= 0){
			return "ERROR";
		}
		ArrayList<String> result = new ArrayList<String> ();
		result.add("0");
		result.add(".");
		while(value > 0){
			if(result.size() >= 32){
				return "ERROR1";
			}
			double temp = value * 2;
			if(temp < 1){
				result.add("0");
				value = temp;
			}else{
				result.add("1");
				value = temp -1;
			}
		}
		String s = "";
		for(String m : result){
			s += m;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = binaryToString(0.625);
		System.out.println(result);

	}

}
