package com.designpattern.strategy;

public class HasEngine extends Capacity implements Engine{

	public HasEngine(String capacity) {
		setCapacity(capacity);
	}
	
	@Override
	public String hasEngine() {
		return "has an engine";
	}
	
}
