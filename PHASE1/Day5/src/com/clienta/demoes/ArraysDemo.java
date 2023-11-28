package com.clienta.demoes;

public class ArraysDemo {

	public static void main(String[] args) {
		// Single Dimensional array

		int[] ages = new int[5]; // An Array declaration of size 5.

		ages[0] = 12;
		ages[1] = 14;
		ages[2] = 22;
		ages[3] = 13;
		ages[4] = 34;

		// test the contents
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}

		// another way to print the loop
		System.out.println("Another approach to looping an array");
		for (int i : ages) {
			System.out.println(i);
		}

		// Challenge 3
		// Write a program that creates an array of 4 strings and prints them
		// SOLUTION
		System.out.println("Challenge 3 Array of Strings ");
		String str[] = new String[5];
		str[0] = "Hello";
		str[1] = "World";
		str[2] = "3";
		str[3] = "Hi";
		str[4] = "World";

		for (String i : str) {
			System.out.println(i);
		}

		System.out.println("\n\nMulti dimemnsional array of 3 x 2 size");
		String[][] names = new String[3][2];
		names[0][0] = "Asha";
		names[0][1] = "Akshay";
		names[1][0] = "Sudha";
		names[1][1] = "Palani";
		names[2][0] = "Shakel";
		names[2][1] = "Robert";

		for (int i = 0; i < names.length; i++) {

			for (int j = 0; j < names[0].length; j++) {

				System.out.println("names at i=" + i + ",j=" + j + " is " + names[i][j]);

			}

		}
	}

}
