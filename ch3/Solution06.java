package ch3;

import java.util.LinkedList;

public class Solution06 {
	class node{
		String type;
		int order;
		public void node(String type){
			this.type = type;

		}
		public void setOrder(int value){
			order = value;
			
		}
		public int getOrder(){
			return order;
		}
	}
	class Animals{
		int orderAll = 0;
		LinkedList<node> dogs = new LinkedList<node>();
		LinkedList<node> cats = new LinkedList<node>();
	
		public void enqueue(node n){
			n.setOrder(orderAll++);
			if(n.type == "dog"){
				dogs.add(n);
			}else if(n.type == "cat"){
				cats.add(n);
			}
			
	}
		public node dequeueCat(){
			return cats.poll();
		}
		public node dequeueDog(){
			return dogs.poll();
		}
		public node dequeueAny(){
			node dog = dogs.poll();
			node cat = cats.poll();
			int order1 = dog.getOrder();
			int order2 = cat.getOrder();
			if(order1 < order2){
				return dog;
			}else{
				return cat;
			}
		}
		
		
	}

}
