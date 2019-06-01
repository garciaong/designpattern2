package com.designpattern.iterator;

public class RunIterator {
	
	public static void main(String [] args) {
		ATM atm = new ATM();
		atm.performTransaction();
		Online online = new Online();
		online.performTransaction();
		Counter counter = new Counter();
		counter.performTransaction();
		
		ProcessTransaction processor = new ProcessTransaction();
		System.out.println("ATM Transactions...");
		processor.process(atm.generateIterator());
		System.out.println("Online Transactions...");
		processor.process(online.generateIterator());
		System.out.println("Counter Transactions...");
		processor.process(counter.generateIterator());
	}
	
}
