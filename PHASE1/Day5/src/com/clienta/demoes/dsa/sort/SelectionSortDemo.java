package com.clienta.demoes.dsa.sort;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 77, 23, 21, 50, 3, 17 };

		System.out.println("Given array: " + Arrays.toString(arr));

		selectionSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {
		
		for(int i=0; i< arr.length;i++) {
			
			int minIndex=i;
			int minIndexVal=arr[i];
			
			for(int j=i+1; j <arr.length; j++) {
				if(arr[j] < minIndexVal) {
					minIndex=j;
					minIndexVal=arr[j];
				}
			};
			
			// swap the i index val with the minIndex val
			swap(arr,i,minIndex);			
		}
		
	}

	private static void swap(int[] arr, int p, int q) {
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;		
	}

}
