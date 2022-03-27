package com.StringBufferandStringBuilderMethods;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer name1 = new StringBuffer("Reading helps to improve our knowledge");//16 capacity
		
		StringBuffer name2 = new StringBuffer();
		
		System.out.println(name1.length());//16
		System.out.println(name1.capacity());
		
		System.out.println("===================");
		
		System.out.println(name2.length());
		System.out.println(name2.capacity());

	}


	}

