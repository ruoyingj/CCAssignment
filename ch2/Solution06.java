package ch2;

import java.util.Stack;

public class Solution06 {
	
	public static boolean isPalindrome(LinkedListNode a){
		LinkedListNode head = a;
		int count = 0;
		while(a != null){
			a = a.next;
			count ++;
		}
		
		int i = 1;
		Stack<Integer> halfList = new Stack<Integer>();
		while(i <= count/2){
			halfList.push(head.value);
			head = head.next;
			i++;
		}
		//even
				if ((count&1)==0){
					while(head!=null){
						if(halfList.pop()!=head.value){
							return false;
							
						}
						head = head.next;
					}
				}else{
					head = head.next;
					while(head!=null){
						if(halfList.pop()!=head.value){
							return false;
						}
						head = head.next;
					}
					
				}
			return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				 LinkedListNode a = new LinkedListNode(1);
				 LinkedListNode b = new LinkedListNode(2);
				 LinkedListNode c = new LinkedListNode(2);
				 LinkedListNode d = new LinkedListNode(1);
				 //LinkedListNode e = new LinkedListNode(1);
				 
				 a.next = b;
				 b.next = c;
				 c.next = d;
				// d.next = e;
				
				System.out.println(isPalindrome(a));

	}

}
