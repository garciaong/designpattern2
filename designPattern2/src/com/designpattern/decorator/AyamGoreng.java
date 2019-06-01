package com.designpattern.decorator;

public class AyamGoreng extends Decorator{

	public AyamGoreng(NasiLemak nasiLemak) {
		super(nasiLemak);
		System.out.println("Adding ayam goreng...");
	}

	@Override
	public String getDescription() {
		return nasiLemak.getDescription()+" tambah ayam goreng";
	}

	@Override
	public double getPrice() {
		return nasiLemak.getPrice()+5.00;
	}
}
