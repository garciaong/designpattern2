package com.designpattern.decorator;

public class NasiLemakBiasa implements NasiLemak{

	public NasiLemakBiasa() {
		System.out.println("Preparing nasi lemak biasa...");
	}
	
	@Override
	public String getDescription() {
		return "Nasi lemak biasa";
	}

	@Override
	public double getPrice() {
		return 2.00;
	}

}
