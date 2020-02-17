package com.ds.csll;

public class CircualrSingleLinkedList {
	
	private CSLLNode head;
	
	private CSLLNode tail;
	
	private int size;

	public CSLLNode add(int value) {
		return addLast(value);
	}
	public CSLLNode add(int value, int pos) {
		
		if(pos <=0 || pos>size+1) {
			throw new RuntimeException("Invalid Position");
		}
		
		if(pos == 1) {
			return addFirst(value);
		}
		
		if(pos == size+1) { //insert node in the end
			return addLast(value);
		}
		
		CSLLNode temp = head;
		CSLLNode prev = null;
		CSLLNode newNode = new CSLLNode(value);
		
		for(int i=1; i<pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		
		newNode.next = prev.next;
		prev.next = newNode;
		size++;
		
		return head;
	}


	private CSLLNode addLast(int value) {
		CSLLNode newNode = new CSLLNode(value);
		
		CSLLNode temp = tail;
		
		tail = newNode;
		temp.next = newNode;
		newNode.next = head;
		size++;
		return head;
	}
	
	private CSLLNode addFirst(int value) {
		CSLLNode newNode = new CSLLNode(value);
		CSLLNode temp = head;
		
		if(temp == null) { //first eelement to be inserted in the list
			head = newNode;
			newNode.next = newNode;
			tail = newNode;
			size++;
			return head;
		} else {
			head = newNode;
			head.next = temp;
			tail.next = newNode;
			size++;
			return head;
		}
		
	}
	
	public CSLLNode delete(int pos) {
		
		if(pos <=0 || pos>size+1) {
			throw new RuntimeException("Invalid Position");
		}
		
		if(pos == 1) {
			return deleteFirst();
		}
		
		CSLLNode temp = head;
		CSLLNode prev = null;
		
		for(int i=1; i<pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		
		tail = prev;
		prev.next = temp.next;
		temp.next = null;
		size--;
		
		return temp;
	}



	private CSLLNode deleteFirst() {
		CSLLNode temp = head;
		
		if(temp.next == null) {
			head = null;
			tail = null;
			size--;
			return temp;
		} else {
			head = temp.next;
			tail.next = temp.next;
			temp.next = null;
			size--;
		}
		
		return temp;
	}


	public CSLLNode search(int value) {
		CSLLNode temp = head;
		
		for(int i=1; i<=size; i++) {
			if(temp.value == value) 
				return temp;
			temp = temp.next;
		}
		return null;
	}
	
	public void print() {
		CSLLNode temp = head;
	
		for(int i=1; i<=size; i++) {
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
	}

}
