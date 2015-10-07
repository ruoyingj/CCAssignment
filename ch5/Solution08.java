package ch5;

public class Solution08 {
	

	public static void drawLine (byte[] screen, int width, int x1, int x2, int y){
		int num_byte = width / 8;
		int start_x1 = x1 % 8;
		int start_x2 = x2 % 8;
		int byte_x1 = x1 / 8;
		int byte_x2 = x2 / 8;
		int b = byte_x1 ++;
		while(b <= byte_x2--){
			screen[num_byte * y + b] = (byte)0xFF;
			b++;
		}
		byte start = (byte) (0xff >> start_x1);
		byte end = (byte) ~(0xff >> start_x1 + 1);
		
		if(byte_x1 == byte_x2){
			screen[ num_byte * y + start_x1] |= start & end;
		}else{
			if(start_x1 != 0){
				screen[num_byte * y + byte_x1 - 1] |= start; 
			}
			if(start_x2 != 0){
				screen[num_byte * y + byte_x2 - 1] |= end; 
			}
			
		}
		
	}
	public static void main(String[] args) {
		int width = 80;
		byte[] screen = new byte[width];
		drawLine(screen, width, 1, 10, 3);
	}
}
