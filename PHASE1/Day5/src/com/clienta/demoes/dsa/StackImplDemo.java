package com.clienta.demoes.dsa;

public class StackImplDemo {

	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		
		stack.push(4);
		stack.push(8);
		
		stack.displayStack();
		
		stack.push(7);
		stack.push(28);
		stack.displayStack();
		
	}

}


class MyStack{
	final int capacity;
	int[] items;
	int TOP=-1;	
	
	public MyStack(int capacity) {
		this.capacity = capacity;
		this.items = new int[this.capacity];
	}
	
		
	void push(int val) {
		
		if (TOP==capacity-1)
			System.out.println("Stack is full. cannot add..");
		
		else {
			TOP=TOP+1;
			this.items[TOP]= val;
		}
		
	}
	
	int pop() {
		
		
		return 0;
	}
	
	void displayStack(){
		System.out.println("STACK CONTENTS");
		
		for (int i=TOP;i>=0;i--)
			System.out.println(items[i]);
	}
	
}
