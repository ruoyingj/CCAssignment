package ch2;


public class Solution07 {
	public static LinkedListNode intersectionNode(LinkedListNode a, LinkedListNode b){
		int size_a = 0, size_b = 0;
		LinkedListNode head_a = a;
		LinkedListNode head_b = b;
		while(a!=null){
			size_a ++;
			a = a.next;
		}
		while(b!=null){
			size_b++;
			b = b.next;
		}
		a = head_a;
		b = head_b;
		int distance = Math.abs(size_a - size_b);
		if(size_a > size_b){
			int step = 0;
			while(step<distance){a = a.next;step++;}}
			else{
				int step = 0;
				while(step < distance){
					b = b.next;
					step++;
				}
			}
		while(a!=null&&b!=null&& a!=b){
			a = a.next;
			b = b.next;
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 LinkedListNode b = new LinkedListNode(2);
		 LinkedListNode c = new LinkedListNode(1);
		
		 LinkedListNode d = new LinkedListNode(9);
		 LinkedListNode e = new LinkedListNode(3);
		 LinkedListNode f = new LinkedListNode(4);
		 LinkedListNode g = new LinkedListNode(1);
		
		 b.next = e;
		 e.next = f;
		 f.next = g;
		 c.next = d;
		 d.next = e;
		 e.next = f;
		 f.next = g;
		 
		 System.out.println(intersectionNode(c,b).value);
		 
		
	}

}
