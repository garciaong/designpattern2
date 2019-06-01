package com.designpattern.decorator;

public class TelurMata extends Decorator{

	public TelurMata(NasiLemak nasiLemak) {
		super(nasiLemak);
		System.out.println("Adding telur mata...");
	}

	@Override
	public String getDescription() {
		return nasiLemak.getDescription()+" tambah telur mata";
	}

	@Override
	public double getPrice() {
		return nasiLemak.getPrice()+1.00;
	}
}
