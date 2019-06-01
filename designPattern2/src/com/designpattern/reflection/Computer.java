package com.designpattern.reflection;

public class Computer {

	private String name;
	
	private double price;

	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("[Computer Model : %s, Price : %.2f]",new Object[] {getName(),getPrice()});
	}
	
}
