package com.designpattern.singleton;

public class Singleton {

	// Makes it global
	private static Singleton instance = null;

	private Singleton() {
		// Avoid multiple invocation through instantiation
	}

	// Simulate first thread with delay
	static boolean isFirstThread = true;

	public static Singleton getInstance() {
		if (isFirstThread) {
			isFirstThread = false;
			Thread.currentThread();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Synchronized this method only until first instance created
		synchronized (Singleton.class) {
			if (instance == null) {
				instance = new Singleton();
			}
		}

		return instance;
	}

}
