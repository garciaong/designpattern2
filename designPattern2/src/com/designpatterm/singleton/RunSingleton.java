package com.designpatterm.singleton;

public class RunSingleton {

	public static void main(String [] args) {
		Runnable singleton1 = new SingletonThread();
		Runnable singleton2 = new SingletonThread();
		Runnable singleton3 = new SingletonThread();
		Runnable singleton4 = new SingletonThread();
		
		new Thread(singleton1).start();
		new Thread(singleton2).start();
		new Thread(singleton3).start();
		new Thread(singleton4).start();
	}
	
}
