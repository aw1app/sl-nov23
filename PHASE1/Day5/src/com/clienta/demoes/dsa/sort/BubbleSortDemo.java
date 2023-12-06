package com.clienta.demoes.dsa.sort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 77, 23, 21, 50, 3, 17 };

		System.out.println("Given array: " + Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr) {

		for (int i = arr.length-1; i >0 ; i--) {

			for (int j = 0; j < i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

	}

}
