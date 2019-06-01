package com.designpattern.strategy;

public class Motorcycle extends Vehicle{

	public Motorcycle() {
		setWheels(new TwoWheels());
		setEngine(new HasEngine("250cc"));
	}
	
	public void about() {
		System.out.println("This is a motorcycle, it has "+getWheels().numberOfWheels()
				+" wheels and "+getEngine().hasEngine()+" with capacity "+getEngine().capacity());
	}
	
}
