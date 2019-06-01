package com.designpattern.strategy;

public class Car extends Vehicle{

	public Car() {
		setWheels(new FourWheels());
		setEngine(new HasEngine("1.5 litter turbocharged"));
	}
	
	public void about() {
		System.out.println("This is a car, it has "+getWheels().numberOfWheels()
				+" wheels and "+getEngine().hasEngine()+" with capacity "+getEngine().capacity());
	}
	
}
