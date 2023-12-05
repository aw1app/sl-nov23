package com.clienta.demoes.dsa;

import java.util.Arrays;

public class MatrixMultiplicationDemo {

	public static void main(String[] args) {

		int[][] firstMatrix = { 
				{ 3, -2, 5 },
				{ 3, 0, 4 } 
				}; // 2 * 3 matrix
		
		int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} }; // 3 * 2 matrix
		
		System.out.println("Matrix A ");
		for(int [] x: firstMatrix) {
			System.out.println(Arrays.toString(x));
		};
		
		System.out.println("\n");
		System.out.println("Matrix B ");
		for(int [] x: secondMatrix) {
			System.out.println(Arrays.toString(x));
		};
		
		
		
		int[][] resultMatrix = multiply(firstMatrix,secondMatrix);
		
		System.out.println("\n");
		System.out.println("Matrix C  = A*B is ");
		for(int [] x: resultMatrix) {
			System.out.println(Arrays.toString(x));
		};

	}
	
	//i=2 j=0 ... no of columns of b

	private static int[][] multiply(int[][] a, int[][] b) {
		int[][] resultMatrix = new int[a.length][b[0].length];
		
		for (int i=0; i<a.length; i++ ) {
			
			for (int j=0; j < b[0].length;j++ ) {
				
				for (int k =0 ; k < a[0].length ; k++)
					
					resultMatrix[i][j] = resultMatrix[i][j] + a[i][k]*b[k][j];
				
			}
			
		}			
		
		return resultMatrix;
	}

}
