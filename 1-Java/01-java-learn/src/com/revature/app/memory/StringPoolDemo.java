package com.revature.app.memory;

public class StringPoolDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		//String str4 = new String("Hello");
		String str4 = str3;
		
		System.out.println("str1 == str2 - " + (str1 == str2));
		System.out.println("str1 == str3 - " + (str1 == str3));
		System.out.println("str2 == str3 - " + (str2 == str3));

	}

}
