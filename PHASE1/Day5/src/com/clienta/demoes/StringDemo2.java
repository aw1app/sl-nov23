package com.clienta.demoes;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1="NOAH";
		
		StringBuffer sbr = new StringBuffer(s1);
		sbr.reverse();
		
		System.out.println(sbr);
		
		
		System.out.println("\n\nString Builder Demo");
		
		StringBuilder sbuilder = new StringBuilder(s1);
		
		sbuilder.reverse();
		System.out.println(sbuilder);
		
		sbuilder.reverse();
		System.out.println(sbuilder);
		sbuilder.append(" ABC").append(" XYZ")
		System.out.println(sbuilder);
		
		// Conversion from a StringBuilder to String
		String s = sbuilder.toString();
		char[] myChars = s.toCharArray();		
		
	}

}
