package com.clienta.demoes;

public class ArraysDemo {

	public static void main(String[] args) {
		// Single Dimensional array
		
		int[] ages = new int[5]; // An Array declaration of size 5.
		
		ages[0]=12;
		ages[1]=14;
		ages[2]=22;
		ages[3]=13;
		ages[4]=34;
		
		// test the contents
		for(int i=0; i< ages.length ; i++) {
			System.out.println(ages[i]);
		}
		
		// another way to print the loop
		System.out.println("Another approach to looping an array");
		for(int i : ages) {
			System.out.println(i);
		}

	}

}
