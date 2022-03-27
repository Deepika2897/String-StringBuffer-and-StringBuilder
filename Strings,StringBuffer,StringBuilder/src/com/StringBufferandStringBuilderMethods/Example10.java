package com.StringBufferandStringBuilderMethods;

public class Example10 {
	public static void main(String[] args) 
	{		
		
		StringBuffer name = new StringBuffer("DEEPI");
		
		name.append(" BIS");
		
		System.out.println(name);	
		
		System.out.println("==================");
		
		StringBuilder myName = new StringBuilder("DEEPI");
		
		myName.append(" VIJAY");
		
		System.out.println(myName);
		
	}

}
