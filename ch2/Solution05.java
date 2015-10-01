package ch2;
import java.util.LinkedList;

public class Solution05 {
	
	public static LinkedListNode addNumbersInReverse(LinkedListNode a, LinkedListNode b){
		LinkedListNode result = new LinkedListNode(0);
		LinkedListNode head = result;
		int flag = 0;
		
		
		while(a != null || b != null){
			int temp = 0;
			//There are three situations. 
			// When a is null. The sum should be the value of b plus flag.
			if(a == null){
				temp += (b.value + flag)%10;
				flag = (b.value + flag)/10;
			}
			// When b is null. The sum should be the value of a plus flag.
			else if (b == null){
				temp += (a.value + flag)%10;
				flag = (a.value + flag)/10;
			}
			//when a and b are both not null. The sum should be the value of a plus b plus flag.
			else {
				temp += (a.value + b.value + flag) % 10;
				flag = (a.value + b.value + flag) /10;
			}
			LinkedListNode m = new LinkedListNode(temp);
			result.next = m;
			if(a!=null&&a.next!= null)
			a = a.next;
			else a =null;
			if(b!=null&&b.next != null){
				b = b.next;
			}else b = null;
			result = result.next;
			
		
			
		}
			if(flag == 1){
				LinkedListNode m = new LinkedListNode(1);
				result.next =m;
			}
		
			return head.next;
	
	}
	
	public static LinkedListNode reverseLinkedListNode(LinkedListNode a){
		LinkedListNode reverse = null;
		LinkedListNode nextNode;
		LinkedListNode head = a;
		while(head != null){
			nextNode = head.next;
			if(reverse == null){
				reverse = head;
				reverse.next = null;
				
			}else{
				head.next = reverse;
				reverse = head;
				
			}head = nextNode;
			
			
			
		}
		return reverse;
		
		

		
	}
	
	public static LinkedListNode addNumbersInForward(LinkedListNode a, LinkedListNode b){
		
		a =  reverseLinkedListNode(a);
		b =  reverseLinkedListNode(b);
		LinkedListNode result = addNumbersInReverse(a,b);
		result = reverseLinkedListNode(result);
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedListNode a = new LinkedListNode(1);
		 LinkedListNode b = new LinkedListNode(2);
		 LinkedListNode c = new LinkedListNode(1);
		 LinkedListNode m = new LinkedListNode(9);
		 LinkedListNode d = new LinkedListNode(9);
		 LinkedListNode e = new LinkedListNode(1);
		 LinkedListNode f = new LinkedListNode(4);
		 LinkedListNode g = new LinkedListNode(1);
		 a.next = b;
		 b.next = c;
		 c.next = m;
		 d.next = e;
		 e.next = f;
		 f.next = g;
		// LinkedListNode result=addNumbersInForward(a,d);
		 LinkedListNode result=reverseLinkedListNode(d);
		 
		//LinkedListNode result = addNumbersInReverse(a,d);
		while(result != null){
			System.out.println(result.value);
			result = result.next;
		}
		
	}
}
