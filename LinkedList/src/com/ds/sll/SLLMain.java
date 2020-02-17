package com.ds.sll;

public class SLLMain {

	public static void main(String[] args) {
		SLLNode n1 = new SLLNode(1,null);
		/*SLLNode n2 = new SLLNode(2,null);
		SLLNode n3 = new SLLNode(3,null);
		SLLNode n4 = new SLLNode(4,null);
		SLLNode n5 = new SLLNode(5,null);
		SLLNode n6 = new SLLNode(6,null);*/
		
		SingleLinkedList ll = new SingleLinkedList();
		
		ll.addLast(n1);
	/*	ll.addLast(n2);
		ll.addLast(n3);
		ll.addLast(n4);
		ll.addLast(n5);
		ll.addLast(n6);*/
		
		System.out.println(ll.size());
		
		ll.print();
		
		//ll.add(new SLLNode(10,null),7);
		
		//System.out.println();
		
		//ll.print();
		
		System.out.println("");

		ll.deleteByPosition(1);
		
		ll.print();
	}

}
