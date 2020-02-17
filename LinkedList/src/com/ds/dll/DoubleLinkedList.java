package com.ds.dll;

public class DoubleLinkedList {

	private DLLNode head;
	private DLLNode tail;
	private int size;
	

	public DLLNode add(int value,int pos) {
		
		if(pos<=0 || pos > size+1) {
			throw new RuntimeException("Invalid position");
		}

		if(pos == 1) {
			return addFirst(value);
		}
		
		if(pos == size+1) {
			return addLast(value);
		}
		
		DLLNode temp = head;
		DLLNode prev = null;
		DLLNode newNode = new DLLNode(value);
		
		for(int i=1; i<pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		
		newNode.prev = prev;
		newNode.next = prev.next;
		prev.next = newNode;
		size++;
		return head;
	}


	private DLLNode addLast(int value) {
		DLLNode newNode = new DLLNode(value);
		
		newNode.prev = tail;
		newNode.next = null;
		tail.next = newNode;
		tail = newNode;
		size++;
		
		return head;
	}


	private DLLNode addFirst(int value) {
		DLLNode newNode = new DLLNode(value);
		
		DLLNode temp = head;
		
		if(temp == null) {
			head = newNode;
			tail = newNode;
			newNode.next = null;
			newNode.prev = null;
			size++;
		} else {
			head = newNode;
			newNode.prev = null;
			newNode.next = temp;
			temp.prev = newNode;
			size++;
		}
		
		return head;
	}
	
	public void print() {
		DLLNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
	}
	
	public int size() {
		return size;
	}
}






