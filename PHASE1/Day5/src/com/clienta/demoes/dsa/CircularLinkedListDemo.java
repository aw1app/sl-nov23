package com.clienta.demoes.dsa;

public class CircularLinkedListDemo {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		
		cll.printCLL();

		cll.sortedInsert(4);
		cll.printCLL();
		
		
		cll.sortedInsert(14);
		cll.printCLL();
		
		cll.sortedInsert(7);
		cll.printCLL();
		
		cll.sortedInsert(5);
		cll.printCLL();
		
		cll.sortedInsert(9);
		cll.printCLL();

	}

}


class CircularLinkedList{

	Node head = null;
	
	void sortedInsert(int data) {
		
		Node newNode = new Node(data);

		// CLL is empty
		if (head == null) {
			head = newNode;
			newNode.next = head;
		}
		
		//	
		Node current_Node = head;
		if (newNode.data < current_Node.data) {
			
			while(current_Node.next != head)
				current_Node = current_Node.next;
			
			current_Node.next= newNode;
			newNode.next = head;
			head = newNode;			
		}
		
		else if (newNode.data >= current_Node.data) {
			
			while(current_Node.next != head && current_Node.next.data <= newNode.data)
				current_Node = current_Node.next;
			
			newNode.next = current_Node.next; 
			current_Node.next = newNode;			
		}
		
	}
	
	void printCLL() {

		Node current_node = this.head;
		
		if(current_node== null) {
			System.out.println("CLL is empty ");
			return;
		}

		do {
			System.out.print(current_node.data + "->");

			current_node = current_node.next;
		} while (current_node != this.head);

		System.out.println();
	}
	
}