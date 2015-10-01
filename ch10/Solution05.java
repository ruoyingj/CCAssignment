package ch10;

public class Solution05 {
	public static int findNotEmpty(String[] strs, int mid,int begin, int last){
		int left = mid - 1;
		int right = mid + 1;
		while(true){
			if(left < begin && right > last ){return -1;}
			else if(left >= 0 && !strs[left].isEmpty()){
				mid = left;
				break;
			}else if(right <= last && !strs[right].isEmpty()){
				mid = right;
				break;
			}
			left--;
			right++;
		}
		return mid;
	}
	public static int binarySearch(String[] strs, String target, int begin, int last){
		if(target == null || strs == null || target == ""){return -1;}
		int mid = (begin + last) / 2;
			if(mid == begin){
				if(strs[mid] == strs[begin]){
					return mid;
				}
				else{return -1;}
			}
			if(strs[mid] == ""){
				mid = findNotEmpty(strs, mid, begin, last);
			}
			if(strs[mid].equals(target) ){
				return mid;
			}
			else if(strs[mid].compareTo(target) < 0){
				begin = mid + 1;
				return binarySearch(strs, target, begin, last);
				
			}else {
				last = mid - 1; 
				return binarySearch(strs, target, begin, last);
			}
		
	}
	
	
	 public static void main(String[] args) {
		 String[] a = {"at", "", "", "","ball","","","car","","","dad","",""};
		 System.out.println(binarySearch(a, "ball",0,12));
	 }

}
