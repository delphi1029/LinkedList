package com.ds.csll;

public class CSLLMain {

	public static void main(String[] args) {
		CircualrSingleLinkedList l = new CircualrSingleLinkedList();
		
		l.add(1,1);
		l.add(2,2);
		l.add(3,3);
		l.add(4,4);
		l.add(5,5);
		l.add(6,6);
		l.add(7,7);
		l.add(8,8);
		l.add(9,9);
		
		
		l.print();
		System.out.println();
		l.delete(9);

		
		
		l.print();

	}

}
