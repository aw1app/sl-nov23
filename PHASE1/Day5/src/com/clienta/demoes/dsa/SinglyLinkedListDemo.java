package com.clienta.demoes.dsa;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {

		SinglyLinkedList sll1 = new SinglyLinkedList();
		sll1.printSLL();

		sll1.insert(4);
		sll1.printSLL();

		sll1.insert(7);
		sll1.insert(14);
		sll1.insert(40);
		sll1.printSLL();

		System.out.println("Deleting 14..");
		sll1.delete(14);
		sll1.printSLL();
	}

}

class Node {

	int data;
	Node next = null;

	public Node(int data) {
		this.data = data;
	}

}

class SinglyLinkedList {

	Node head = null;

	// Operations of a SLL

	void insert(int data) {

		Node newNode = new Node(data);

		// SLL is empty
		if (head == null) {
			head = newNode;
		}

		else // SLL is not empty
		{
			// we have to traverse till the Tail and the set the tail's next to our newNode
			Node current_Node = head;

			while (current_Node.next != null)
				current_Node = current_Node.next;

			// out of the while loop, current_Node is at the tail.
			current_Node.next = newNode;
		}

	}

	void delete(int key) {
		if (head == null)
			System.err.println("SLL is empty. So nothing to delete");

		Node current_Node = head;

		if (head.data == key) {
			head = head.next;
			System.out.println("Found the key at head and deleted ");
		}

		else {
			Node prev = null;

			while (current_Node != null && current_Node.data != key) {
				prev = current_Node;
				current_Node = current_Node.next;
			}
			;

			prev.next = current_Node.next;
			System.out.println("Found the key at non-head postion and deleted ");
		}

	}

	void printSLL() {

		Node current_node = this.head;

		while (current_node != null) {
			System.out.print(current_node.data + "->");
			current_node = current_node.next;
		}
		;
		System.out.println();
	}

}
