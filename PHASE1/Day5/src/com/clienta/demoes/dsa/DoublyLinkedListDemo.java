package com.clienta.demoes.dsa;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList dll =  new DoublyLinkedList();
		
		dll.insertFirst(10);
		dll.insertFirst(17);
		dll.printDLL();
		
		dll.insertFirst(1);
		dll.insertFirst(77);
		dll.printDLL();		
	}

}



class DoublyLinkedList{
	Node head=null;
	
	
	class Node{
		
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	void insertFirst(int val){
		
		Node newNode = new Node(val);

		// DLL is empty
		if (head == null) {
			head = newNode;
		}
		
		// DLL is not empty
		else {
		newNode.next = head;
		head.prev =  newNode;
		head = newNode;	
		};
	}
	
	
	void insertLast(int val){
		
	}
	
	
	public void printDLL() {
		Node current_node = this.head;

		while (current_node != null) {
			System.out.print(current_node.data + "->");
			current_node = current_node.next;
		}
		System.out.println();

	}
	
	
	
}
