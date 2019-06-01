package com.designpattern.strategy;

public class Vehicle {

	private Wheels wheels;
	private Engine engine;
	
	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}
	
	public Wheels getWheels() {
		return this.wheels;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return this.engine;
	}
	
	public void about() {
		System.out.println("This is a vehicle");
	}
}
