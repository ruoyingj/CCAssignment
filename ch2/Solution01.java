package ch2;

public class Solution01 {
	public static  void removeDups(LinkedListNode  a){
		//lock a certain Node key and compare all the node with its.
		//element means the following Nodes by key
		//nextElement is the next element of element
        //
		LinkedListNode key = a;
		LinkedListNode  element= a;
		LinkedListNode nextElement = a ;
		
		while(key != null){
			element = key;
			nextElement = key. next;
			//If the nextElement equals to key. Then we should delete the next element
			//the next element of current element should be the next and next one.
			while(nextElement != null){
				if(key.value == nextElement.value){
					element.next = nextElement.next;
					nextElement = element.next;
				}else{
				//just keep the original linked order if they do not equal
					element = element.next;
					nextElement = element.next; 
				}
			}
			key = key.next;
			
			
			
			
			
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
		 removeDups(a);
		 System.out.println(a.value);
		 a=a.next;
		 System.out.println(a.value);
		 a=a.next;
		 System.out.println(a.value);
		 a=a.next;
		 System.out.println(a.value);
		 a=a.next;
		 
		 
		 
		
	}

}