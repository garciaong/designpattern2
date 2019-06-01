package com.designpattern.factory;

public interface Procedure {

	default void info() {
		System.out.println("This is a procedure standard guideline...");
	}
	
	public void steps();
	
}
