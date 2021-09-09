package com.revature.app.threads;

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;

public class ThreadDemo extends Thread {
	// ArrayList is not thread safe
	// Vector is thread safe
	public static List<String> threads = new ArrayList<>();
	
	public void run() {
		threads.add(getName());
		//System.out.println("Thread " + getName() + " is running...");
	}

}
