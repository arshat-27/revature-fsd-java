package com.revature.app.string;

public class MutableStringDemo {

	public static void main(String[] args) {
		// String is immutable
		// StringBuffer and StringBuilder
		// StringBuffer and StringBuilder - mutable
		// StringBuffer is thread safe
		// StringBuilder is not thread safe
		String name = "John";
		//String upperCaseName = ;
		System.out.println(name.toUpperCase());
		System.out.println(name);
		//System.out.println(name == upperCaseName);
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
	}

}
