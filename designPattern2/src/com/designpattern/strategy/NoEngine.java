package com.designpattern.strategy;

public class NoEngine extends Capacity implements Engine{
	
	public NoEngine() {
		setCapacity("N/A");
	}
	
	@Override
	public String hasEngine() {
		return "has no engine";
	}

}
