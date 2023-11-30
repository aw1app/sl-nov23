package com.clienta.demoes;

import com.clienta.*;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Employee pEmp = new PantryEmployee("Subhash");
		
		System.out.println("Base salary of pEmp = "+pEmp.baseSalary);
		
		System.out.println("Name of pEmp = "+ pEmp.getName() ) ;
		
		System.out.println("Base salary of pEmp = "+ pEmp.getSalary() ) ;

	}

}
