package com.designpattern.iterator;

import java.util.HashMap;
import java.util.Iterator;

public class Counter implements TransactionIterator{

	private HashMap<String,Transaction> transactions;
	
	public void performTransaction() {
		transactions = new HashMap<String,Transaction>();
		Transaction trans1 = new Transaction();
		trans1.setAmount(300.00);
		Transaction trans2 = new Transaction();
		trans2.setAmount(320.00);
		transactions.put("1",trans1);
		transactions.put("2",trans2);
	}
	
	public HashMap<String,Transaction> getTransactions() {
		return transactions;
	}
	
	@Override
	public Iterator<Transaction> generateIterator() {
		return transactions.values().iterator();
	}
	
}
