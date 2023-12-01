package com.clienta.demoes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.clienta.Doctor;

public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		// doSerilzation();
		doDeSerilzation();
	}
	
	
	public static void doSerilzation() throws Exception{
		Doctor d = new Doctor(1,"Shabeer", 34.5f);
		
		d.setAge(101.0f);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\Users\\home\\git\\sl-nov23\\doctor1.txt"));
		oos.writeObject(d);
		oos.close();
	}
	
	public static void doDeSerilzation() throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\Users\\home\\git\\sl-nov23\\doctor1.txt"));
		Doctor d = (Doctor) ois.readObject();

		System.out.println("Name "+d.getName() + " and  age = " + d.getAge());
		
	}

}
