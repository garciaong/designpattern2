package com.designpattern.decorator;

public class RunDecorator {

	public static void main(String [] args) {
		NasiLemak nasiLemak = new AyamGoreng(new TelurMata( new NasiLemakBiasa()));
		System.out.println(nasiLemak.getDescription()+" total price is "+nasiLemak.getPrice());
	}
	
}
