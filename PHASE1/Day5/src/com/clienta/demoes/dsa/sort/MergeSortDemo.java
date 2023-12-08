package com.clienta.demoes.dsa.sort;

import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 77, 23, 21, 50, 3, 17 };

		System.out.println("Given array: " + Arrays.toString(arr));

		int[] sortedArray = mergeSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(sortedArray));

	}

	private static int[] mergeSort(int[] arr) {

		// base case
		if (arr.length == 1)
			return arr;

		// else divide / continue dividing

		int midIndex = arr.length / 2;

		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
		int[] right = mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));

		return merge(left, right);

	}

	private static int[] merge(int[] left, int[] right) {
		int[] combined = new int[left.length + right.length];

		int i = 0, j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {

			if (left[i] < right[j])
				combined[k++] = left[i++];
			else
				combined[k++] = right[j++];
		}
		
		// take the remaining left elements of left and right array
		while(i<left.length)
			combined[k++]=left[i++];
		
		while(j<right.length)
			combined[k++]=right[j++];

		return combined;
	}

}
