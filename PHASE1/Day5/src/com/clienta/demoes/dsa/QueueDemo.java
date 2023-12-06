package com.clienta.demoes.dsa;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue myQueue1 = new MyQueue(5);

		myQueue1.enqueue(10);
		myQueue1.enqueue(20);
		myQueue1.enqueue(60);

		myQueue1.display();

		myQueue1.enqueue(45);
		myQueue1.enqueue(34);
		myQueue1.enqueue(56);

		myQueue1.display();
		
		System.out.println("Dequeded "+ myQueue1.dequeue());
		System.out.println("Dequeded "+ myQueue1.dequeue());

	}

}

class MyQueue {
	final int capacity;
	int[] items;

	int REAR = -1;
	int FRONT = -1;

	public MyQueue(int capacity) {
		this.capacity = capacity;
		this.items = new int[this.capacity];
	}

	void enqueue(int val) {

		if (isFull())
			System.out.println("Queue is full. cannot add.." + val);
		else {

			if (FRONT == -1)
				FRONT = 0;

			REAR++;

			items[REAR] = val;

		}
	}
	
	int dequeue() {
		int dequeuedVal = -1;
		
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			
			dequeuedVal = items[FRONT];
			FRONT++;
			
			//After deque of current of element check if the queue is empty 
			if(FRONT>=REAR) {
				FRONT=-1;
				REAR=-1;
			}
		}		
		
		return dequeuedVal;
	}

	void display() {

		if (REAR == -1)
			System.out.println("Queue is empty");
		else {
			System.out.println("Items -> ");
			for (int i = FRONT; i <= REAR; i++)
				System.out.println(items[i] + " ");
		}

	}

	// helper methods

	boolean isEmpty() {
		if (FRONT == -1)
			return true;
		else
			return false;
	}
	
	

	boolean isFull() {
		if (REAR - FRONT == capacity - 1) {
			return true;
		}
		return false;
	}

}
