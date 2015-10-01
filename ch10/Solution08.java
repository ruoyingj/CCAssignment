package ch10;

public class Solution08 {
	void findDuplicates(int[] arr){
		BitVec bv = new BitVec(32000);
		for(int i = 0; i < arr.length; i++){
			int temp = arr[i] - 1;
			if(bv.getValue(temp)){
				System.out.println(arr[i]);
			}else{
				bv.setValue(temp);
			}
			
		}
		
	}
	class 	BitVec{
		int[] bitvec;
		public BitVec(int value){
			int i = value >> 5 + 1;
			bitvec = new int[i];
		}
		void setValue(int value){
			int chunkNumber = value >> 5;
			int bitPostion = value & 0x1F;
			bitvec[chunkNumber] = bitvec[chunkNumber] | 1 << bitPostion ;}
				
		boolean getValue(int value){
			int chunkNumber = value >> 5;
			int bitPostion = value & 0x1F;
			boolean isExit = (bitvec[chunkNumber] & 1 << bitPostion) == 1;
			return isExit;
		}
		
		}
	}


