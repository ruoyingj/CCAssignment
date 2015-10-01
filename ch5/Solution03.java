package ch5;

public class Solution03 {
	 public static int search(int[] nums, int target) {
		 int size = nums.length;
		 int left = 0;
		 int right = size - 1;
		 
		 if(left == right){
			 if (nums[left] == target){
				 return left;
			 }else{
				 return -1;
			 }
		 }
		 while(left <= right){
			 int mid  = (left + right)/2;
			 if(nums[mid] == target){
				 return mid;
			 }else if (nums[mid] >= nums[left]){
				 if(nums[left] <= target && target < nums[mid]){
					 right = mid;
				 }else {
					 left = mid + 1;
				 }
			 }else{
				 if(target > nums[mid]&&target <= nums[right]){
					 left = mid + 1;
				 }else{
					 right = mid;
				 }
			 }
		 }
		 return -1;
				 	        
	    }
	 
	 public static void main(String[] args) {
		 int a[] = {5,6,7,8,1,3,4};
		 System.out.println(search(a,8));
	 }

}
