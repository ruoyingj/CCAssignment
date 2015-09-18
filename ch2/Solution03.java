package ch2;


public class Solution03 {
	public static void deleteNode(LinkedListNode head, int n){
		//if the linkedlist is null. it does not exit.. 
		if(head == null){System.out.println("This head does not exit.");
		}
		//if the head.next is null. it is the last node
		else if(head.next == null){
			System.out.println("This is the last node");
		}else{
			/*copy the next node's value to the current one and let current.next equals
			*to the next and next value.
			*/
			LinkedListNode nextNode = head.next;
			head.value = nextNode.value;
			head.next = nextNode.next;
			
		}
		
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
		 deleteNode(b,2);
		 System.out.println(a.value);
		 a=a.next;
		 System.out.println(a.value);
		 a=a.next;
		 System.out.println(a.value);
		 a=a.next;
		 System.out.println(a.value);
		 a=a.next;
		 System.out.println(a.value);
		 a=a.next;
		 System.out.println(a.value);
		
		 
		 
		

	}

}