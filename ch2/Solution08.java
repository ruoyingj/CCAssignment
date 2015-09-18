package ch2;

public class Solution08 {
	public static LinkedListNode findTheBeginNode(LinkedListNode a){
		LinkedListNode p = a;
		LinkedListNode q = a;
		while(true){
			p = p.next;
			q = q.next.next;
			if(p == q){
				break;
			}
		}
		p = a;
		while(p!=q){
			p = p.next;
			q = q.next;
		}
		return q;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedListNode b = new LinkedListNode(2);
		 LinkedListNode c = new LinkedListNode(1);
		 LinkedListNode d = new LinkedListNode(9);
		 LinkedListNode e = new LinkedListNode(3);
		 LinkedListNode f = new LinkedListNode(4);
		 LinkedListNode g = new LinkedListNode(1);
		 b.next = c;
		 c.next = d;
		 d.next = e;
		 e.next = f;
		 f.next = g;
		 g.next = d;
		 
		 System.out.println(findTheBeginNode(b).value);

	}

}
