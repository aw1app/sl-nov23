package com.clienta.demoes.dsa;

import java.util.Arrays;

public class RangeQueries {
	static int[][] sparseTable ;

	public static void main(String[] args) {
		int[] arr = {4 , 5 , 9 , 18, 10, 14, 21 , 23};
		
					
		buildSparseTable(arr);
		
//		for(int [] a: sparseTable) {
//			System.out.println(Arrays.toString(a));
//		};
		
		int i=3;
		int j=5;
		int result = rangeQuery(i, j);
		System.out.println("Sum (2,5 ) = " + result);

	}

	private static void buildSparseTable(int[] arr) {
		int rows=arr.length;
		
		int cols= (int) (Math.log(rows) / Math.log(2)) + 1;
		
		sparseTable = new int[rows][cols];
		
		// First column values
		for(int i=0;i<arr.length;i++)
			sparseTable[i][0]=arr[i];
		
		//
		for(int j=1; (1<<j) <= arr.length; j++) {
			
			for (int i=0; i + (1 << j) - 1 <arr.length;i++ )
			{
				sparseTable[i][j] = sparseTable[i][j-1] + sparseTable[i + (1 << (j - 1))][j - 1];
			}
			
		}
		
	}

	private static int rangeQuery(int L, int R) {
	
		int result = 0;
		int k = (int) (Math.log(sparseTable.length) / Math.log(2)) + 1;
		
		
		for (int j = k; j >= 0; j--) {
			
			if (L + (1 << j) - 1 <= R) {
				
				// System.out.println("rangeQuery. Now In column "+j + " and picked up " +  sparseTable[L][j]);
				
				result = result + sparseTable[L][j];
				L += 1 << j;
			}
		};
		
		
		return result;
	}

}
