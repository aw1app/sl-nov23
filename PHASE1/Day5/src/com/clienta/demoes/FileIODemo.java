package com.clienta.demoes;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileIODemo {

	public static void main(String[] args) {

		// fileInfoDemo(); // read 1 byte at a atime
		// fileReadDemo(); // read 1 char at a atime

		//fileReadDemo3();// read all content
		
		// fileWriteDemo1();
		fileWriteAppendModeDemo2();

	}
	
	public static void fileWriteAppendModeDemo2() {
		String testFilePath = "F:\\Users\\home\\git\\sl-nov23\\TestOut.txt";

		FileWriter writer = null;
		try {
			writer = new FileWriter(testFilePath,true); // true is for append mode

			writer.write("\nblah blah");
			
			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void fileWriteDemo1() {
		String testFilePath = "F:\\Users\\home\\git\\sl-nov23\\TestOut.txt";

		FileWriter writer = null;
		try {
			writer = new FileWriter(testFilePath, false);// false is for overwrite mode

			writer.write("Hello ddffdfdf World");
			
			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void fileReadDemo3() {
		String testFilePath = "F:\\Users\\home\\git\\sl-nov23\\Test.txt";

		try {
			List<String> lines = Files.readAllLines(Paths.get(testFilePath));

			// Print only those lines that has Saturday in it
			for (String line : lines) {
				if (line.contains("Saturday"))
					System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void fileReadDemo2() {
		String testFilePath = "F:\\Users\\home\\git\\sl-nov23\\Test.txt";

		FileReader in = null;
		try {
			in = new FileReader(testFilePath);

			int b = in.read(); // 1 char at a time
			System.out.println(b);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void fileReadDemo1() {
		String testFilePath = "F:\\Users\\home\\git\\sl-nov23\\Test.txt";

		FileInputStream in = null;
		try {
			in = new FileInputStream(testFilePath);

			int b = in.read(); // // 1 byte at a time
			System.out.println(b);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void fileInfoDemo() {

		String readmeFilePath = "F:\\Users\\home\\git\\sl-nov23\\README.md";

		File f = new File(readmeFilePath);

		boolean b = f.exists();

		System.out.printf("File %s exists : %s \n", f.getName(), b);

		// Folder info
		System.out.println("\n\n Folder info demo");
		String readmeFilePFolder = "F:\\Users\\home\\git\\sl-nov23\\PHASE1\\Day5";
		File folder1 = new File(readmeFilePFolder);

		String[] folderContentsList = folder1.list();

		for (String s : folderContentsList)
			System.out.println(s);

	}

}
