package com.designpattern.decorator;

public class Decorator implements NasiLemak{

	protected NasiLemak nasiLemak;
	
	public Decorator(NasiLemak nasiLemak) {
		this.nasiLemak = nasiLemak;
	}
	
	@Override
	public String getDescription() {
		return nasiLemak.getDescription();
	}

	@Override
	public double getPrice() {
		return nasiLemak.getPrice();
	}

}
