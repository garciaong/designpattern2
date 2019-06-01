package com.designpattern.proxy;

import javax.activity.InvalidActivityException;
import javax.transaction.TransactionRolledbackException;

public interface Transaction {

	public void pin(String pin) throws InvalidActivityException;
	
	public void deposit(double amount);
	
	public void withdraw(double amount) throws TransactionRolledbackException;
	
}
