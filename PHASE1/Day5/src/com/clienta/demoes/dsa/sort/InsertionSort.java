package com.clienta.demoes.dsa.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 77, 23, 21, 50, 3, 17 };

		System.out.println("Given array: " + Arrays.toString(arr));

		insertionSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));


	}

	private static void insertionSort(int[] arr) {
		
		for(int i=1; i< arr.length; i++) {
			
			int temp = arr[i];
			
			int j = i-1;
			
			while( j>-1 && temp<arr[j]) {
				//swaping
				arr[j + 1] = arr[j];
				arr[j] =temp;
				
				//System.out.println("In iteration " +i+ " : Partially Sorted array: " + Arrays.toString(arr));
				
				j--;				
			}
			
			//System.out.println("");
			
		}
		
		
	}

}
