package com.clienta.demoes.dsa.search;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 23, 30, 40, 50, 77, 79, 81, 85 };

		int key = 400;

		System.out.println("Given array: " + Arrays.toString(arr));

		int indexOfTheKey = expoentialSearch(arr, key);

		if (indexOfTheKey != -1)
			System.out.println("Key " + key + " was found in the array at index " + indexOfTheKey);
		else
			System.out.println("Key " + key + " was not found in the array");

	}

	private static int expoentialSearch(int[] arr, int key) {

		if (arr[0] == key)
			return 0;

		int i = 1;

		while (i < arr.length && arr[i] < key)
			i = i * 2;

		// If we are here then key lies in between i/2 and i
		// Now handover to the binary search algo to do the rest

		return binarySearch(arr, i / 2, Math.min(i, arr.length), key);

	}

	private static int binarySearch(int[] arr, int startIndex, int endIndex, int key) {

		int left = startIndex;
		int right = endIndex-1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (key > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return -1;
	}

}
