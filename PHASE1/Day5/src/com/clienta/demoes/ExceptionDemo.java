package com.clienta.demoes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Enter the plot size  ");
//		int x=sc.nextInt();
//		System.out.println(" In to how pieces you want divide this plot  ");
//		int b=sc.nextInt();
//		
//				
//		System.out.println(" So here size of each plot after division "+ x/b);
//		
//		System.out.println(" Thank you  ");

//		int[] arr = { 10, 20, 60 };
//
//		System.out.println(arr[4]);
//
//		System.out.println(" Thank you  ");

		//
		String readmeFilePath = "F:\\Users\\home\\git\\sl-nov23\\README.mdgrgrrtr";
		FileReader fr = null;

		try {
			 fr = new FileReader(readmeFilePath);
			fr.read();
			System.out.println("All good. Hi");
		} catch (FileNotFoundException e) {
			System.out.println(" something went wrong ");
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// clean up here
			System.out.println("Finally here");
			try {
				fr.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		

		System.out.println(" Thank you  ");
	}

}
