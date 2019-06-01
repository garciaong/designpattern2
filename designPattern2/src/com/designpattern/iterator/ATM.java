package com.designpattern.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class ATM implements TransactionIterator{

	private Transaction [] transactions;
	
	public void performTransaction() {
		transactions = new Transaction[2];
		Transaction trans1 = new Transaction();
		trans1.setAmount(100.00);
		Transaction trans2 = new Transaction();
		trans2.setAmount(120.00);
		transactions[0] = trans1;
		transactions[1] = trans2;
	}
	
	public Transaction[] getTransactions() {
		return transactions;
	}

	@Override
	public Iterator<Transaction> generateIterator() {
		return Arrays.asList(transactions).iterator();
	}
	
}
