package com.aboutStrings;

public class StringConceptProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message = "advancement and application of information technology is ever changing";
		System.out.println(message);
		
		System.out.println(message.toUpperCase());
		System.out.println("****************************");
		 String str1= "advancement and application of information technology is ever changing";
		 String search="A";
		int count=0;
	    for (int i=0;i<str1.length();i++)
	    {
	       if(Character.isLetter(str1.charAt(i)))
	count++;
	    }
	System.out.println("the total number of words starting with a letter 'A'  in the given string is:"+count);
	  }
	
		
			
	}

