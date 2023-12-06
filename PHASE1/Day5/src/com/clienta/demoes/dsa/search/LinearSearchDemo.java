package com.clienta.demoes.dsa.search;

import java.util.Arrays;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int arr[] =  {10,20,30,23, 40,50, 77};
		
		int key = 100;
		
		System.out.println("Given array: "+ Arrays.toString(arr));
		
		int indexOfTheKey = linearSearch(arr, key);
		
		
		if (indexOfTheKey!=-1)
			System.out.println("Key " + key + " was found in the array at index "+ indexOfTheKey);
		else
			System.out.println("Key " + key + " was not found in the array");
		
		
		// Another search 
		key = 23;
		indexOfTheKey = linearSearch(arr, key);		
		
		if (indexOfTheKey!=-1)
			System.out.println("Key " + key + " was found in the array at index "+ indexOfTheKey);
		else
			System.out.println("Key " + key + " was not found in the array");
		

	}

	private static int linearSearch(int[] arr, int key) {
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i] == key)
				return i;
		}
		
		return -1;
	}

}
