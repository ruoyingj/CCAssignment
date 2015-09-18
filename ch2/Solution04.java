package ch2;


public class Solution04 {
	public static LinkedListNode partitionNode(LinkedListNode a, int x){
		//p stores linkedlistnode which are less than x
		//q stores linkedlistnode which are bigger than x or equal to x
		LinkedListNode p = new LinkedListNode(0);
		LinkedListNode q = new LinkedListNode(0);
		//p strores the head of p, q stores the head of q
		LinkedListNode p1 = p, q1 = q;
		//traverse a and store the node in p or q 
		while(a!=null){
			if(a.value < x){
				p.next = a;
				a = a.next;
				p = p.next;
				p.next = null;
			}else{
				q.next = a;
				a = a.next;
				q = q.next;
				q.next = null;
				
			}
			
		}
		//connect p and q
		p.next = q1.next;
		return p1.next;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedListNode a = new LinkedListNode(1);
		 LinkedListNode b = new LinkedListNode(5);
		 LinkedListNode c = new LinkedListNode(6);
		 LinkedListNode d = new LinkedListNode(0);
		 LinkedListNode e = new LinkedListNode(3);
		 LinkedListNode f = new LinkedListNode(7);
		 LinkedListNode g = new LinkedListNode(5);
		 int x = 5;
		 a.next = b;
		 b.next = c;
		 c.next = d;
		 d.next = e;
		 e.next = f;
		 f.next = g;
		 
		 LinkedListNode result = partitionNode(a,x);
		 while(result!=null){
			 System.out.println(result.value);
			 result = result.next;
		 }
		

	}

}
