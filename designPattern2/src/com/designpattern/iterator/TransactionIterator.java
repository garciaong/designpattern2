package com.designpattern.iterator;

import java.util.Iterator;

public interface TransactionIterator {

	public Iterator<Transaction> generateIterator();
	
}
