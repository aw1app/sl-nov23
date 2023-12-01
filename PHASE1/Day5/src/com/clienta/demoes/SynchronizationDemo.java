package com.clienta.demoes;

import com.clienta.Person;
import com.clienta.Postman;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		Postman commonPostman = new Postman();
		
		Person p1 = new Person(commonPostman,"Hi P1" );
		Person p2 = new Person(commonPostman,"Hello P2" );
		Person p3 = new Person(commonPostman,"Bye P3" );

		p1.start();
		p2.start();
		p3.start();
		
	}

}
