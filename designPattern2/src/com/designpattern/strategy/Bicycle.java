package com.designpattern.strategy;

public class Bicycle extends Vehicle{

	public Bicycle() {
		setWheels(new TwoWheels());
		setEngine(new NoEngine());
	}
	
	public void about() {
		System.out.println("This is a bicycle, it has "+getWheels().numberOfWheels()
				+" wheels and "+getEngine().hasEngine());
	}
	
}
