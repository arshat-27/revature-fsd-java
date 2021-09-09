package com.revature.app.memory;

public class StackOverflowDemo {

	public static void main(String[] args) {
		recursiveFunction();

	}
	
	public static void recursiveFunction() {
		recursiveFunction();
	}

}
