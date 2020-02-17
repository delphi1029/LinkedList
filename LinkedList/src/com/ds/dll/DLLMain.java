package com.ds.dll;

public class DLLMain {

	public static void main(String[] args) {
		
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.add(1, 1);
		dl.add(2, 2);
		dl.add(3, 3);
		dl.add(4, 4);
		dl.add(5, 5);
		dl.add(6, 6);
		dl.add(20, 3);
		
		
		//System.out.println(dl.size());
		dl.print();

	}

}
