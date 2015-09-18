package ch2;


public class Solution02 {
	public static int findnthElement(LinkedListNode a,int n){
		/* p and q are at the head of the Linkedlist
		 * Nth to last means the index is the length minus n
		 * Let p step n steps, then the rest steps equals to length minus n
		 * Let p and q move at the same time 
		 * When p reach the end, it steps to length minus n and q also step length minus n
		 * Then we can find the value
		*/
		LinkedListNode p = a;
		LinkedListNode q = a;
		for(int i =0; i < n; i++){
			p=p.next;
		}
		while(p!=null){
			p = p.next;
			q = q.next;
			
		}
		return q.value;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a = new LinkedListNode(1);
		 LinkedListNode b = new LinkedListNode(2);
		 LinkedListNode c = new LinkedListNode(1);
		 LinkedListNode d = new LinkedListNode(3);
		 LinkedListNode e = new LinkedListNode(1);
		 LinkedListNode f = new LinkedListNode(4);
		 LinkedListNode g = new LinkedListNode(1);
		 a.next = b;
		 b.next = c;
		 c.next = d;
		 d.next = e;
		 e.next = f;
		 f.next = g;
		 System.out.println(findnthElement(a,7));
		 

	}

}
