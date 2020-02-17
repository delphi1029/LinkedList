package com.ds.sll;

public class SingleLinkedList {
	
	private SLLNode head;
	
	private SLLNode tail;
	
	private int size;
	
	public SLLNode addFirst(SLLNode node) {
		if(head == null) {
			head = node;
			tail = node;
			size++;
			return head;
		}
		SLLNode temp = head;
		node.next = temp;
		head = node;
		size++;
		return head;
	}
	
	public SLLNode addLast(SLLNode node) {
		if(head == null) {
			head = node;
			tail = node;
			size++;
			return head;
		}
		SLLNode temp = tail;
		temp.next = node;
		tail = node;
		size++;
		return head;
	}
	
	public SLLNode add(SLLNode node, int pos) {
		if(pos <=0 || pos > size+1) {
			throw new RuntimeException("Invalid position");
		}
		
		if(pos == 1)  
			return addFirst(node);
		
		SLLNode temp = head;
		SLLNode prev = head;
		for(int i=1; i<pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		
		SLLNode next = prev.next;
		prev.next = node;
		node.next = next;
		size++;
		
		return head;
	}
	
	public int size() {
		return size;
	}
	
	public void print() {
		SLLNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
	}
	
	public SLLNode search(int value) {
		SLLNode temp = head;
		
		while(temp != null) {
			if(temp.value == value) {
				return temp;
			}
			temp = temp.next;
		}
		
		return null;
	}
	
	public SLLNode delete(int value) {
		SLLNode temp = head;
		SLLNode prev = null;
		
		while(temp != null) {
			if(temp.value == value) {
				if(prev == null) {
					head = temp.next;
					temp.next = null;
					return temp;
				} else {
					prev.next = temp.next;
					temp.next = null;
					return temp;
				}
			}
			prev = temp;
			temp = temp.next;
			
		}
		return null;
	}
	
	
	public void deleteByPosition(int pos) {
		if(pos <=0 || pos>size) {
			throw new RuntimeException("Invalid position");
		}
		
		if(pos == 1) {
			SLLNode temp = head;
			head = temp.next;
			temp.next = null;
			if(head ==null)
				tail = null;
			return;
		}  
		
		SLLNode prev = null;
		SLLNode temp = head;
		for(int i=0; i<pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		temp.next = null;
		return;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
