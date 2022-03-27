package com.StringBufferandStringBuilderMethods;

public class Example7 {
	public static void main(String[] args) 
	{
		
		StringBuffer name1 = new StringBuffer("write fast, read fast");
		
		System.out.println(name1.delete(16, 36));
		
		System.out.println(name1.delete(0, 7));
		
	}

}



