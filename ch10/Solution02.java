package ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Solution02 {
	public static String transArray(String a){
		char[] stringToChar = a.toCharArray();
		Arrays.sort(stringToChar);
		return new String(stringToChar);
	}
	
	public static String[] sortAnagram(String[] a){
		HashMap<String, ArrayList<String>> hashmap = new HashMap<String, ArrayList<String>>();
		for(String array: a){
			String temp = transArray(array);
			if(hashmap.containsKey(temp) != true){
				ArrayList<String> list = new ArrayList<String>();
				list.add(array);
				hashmap.put(temp, list);
			}else{
				hashmap.get(temp).add(array);
			}
			
		}

		int i = 0;
		Iterator<Entry<String, ArrayList<String>>> iter = hashmap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, ArrayList<String>> entry  = iter.next();
			ArrayList<String> anagrams =  entry.getValue();
			for(String arr: anagrams){
				a[i] = arr;
				i++;
			}
			
			
		}
		
		return a;
		
	}
	
	public static void main(String[] args) {
	String a[] = {"aba", "vvs", "ssw","vsv", "sws"};
		String result[] = sortAnagram(a);
		for(String m: result){
			System.out.println(m);
		}
		
	
	}
}
