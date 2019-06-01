package com.designpattern.iterator;

import java.util.Iterator;

public class ProcessTransaction {

	public void process(Iterator<Transaction> iterator) {
		Transaction transaction = null;
		while(iterator.hasNext()) {
			transaction = iterator.next();
			transact(transaction);
		}
	}
	
	private void transact(Transaction transaction) {
		System.out.println("Transaction amount "+transaction.getAmount()+" processed");
	}
	
}
