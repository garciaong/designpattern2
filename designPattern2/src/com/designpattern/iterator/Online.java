package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Online implements TransactionIterator{

	private ArrayList<Transaction> transactions;
	
	public void performTransaction() {
		transactions = new ArrayList<Transaction>();
		Transaction trans1 = new Transaction();
		trans1.setAmount(200.00);
		Transaction trans2 = new Transaction();
		trans2.setAmount(220.00);
		transactions.add(trans1);
		transactions.add(trans2);
	}
	
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	@Override
	public Iterator<Transaction> generateIterator() {
		return transactions.iterator();
	}
	
}
