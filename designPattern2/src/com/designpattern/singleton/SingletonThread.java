package com.designpattern.singleton;

public class SingletonThread implements Runnable{

	@Override
	public void run() {
		Singleton instance = Singleton.getInstance();
		System.out.println("Instance hashcode : "+System.identityHashCode(instance));
	}
	
}
