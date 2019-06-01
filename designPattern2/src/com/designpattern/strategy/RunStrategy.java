package com.designpattern.strategy;

public class RunStrategy {

	//To eliminate dependencies and be loosely coupled by common class behaviour
	public static void main(String [] args) {
		Vehicle bicycle = new Bicycle();
		Vehicle motorcycle = new Motorcycle();
		Vehicle car = new Car();
		bicycle.about();
		motorcycle.about();
		car.about();
		car.setEngine(new HasEngine("1.8 litter turbocharged"));
		car.about();
	}
	
}
