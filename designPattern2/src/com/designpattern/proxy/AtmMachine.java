package com.designpattern.proxy;

import javax.activity.InvalidActivityException;
import javax.transaction.TransactionRolledbackException;

public class AtmMachine implements Transaction{

	private Account account;
	
	public AtmMachine() {
		Account account = new Account();
		account.setPin("123");
		account.setAmount(100);
		this.account = account;
	}
	
	public double balance() {
		return account.getAmount();
	}

	@Override
	public void pin(String pin) throws InvalidActivityException {
		if(!account.getPin().equals(pin)) {
			throw new InvalidActivityException("Invalid PIN entered!");
		}
	}

	@Override
	public void deposit(double amount) {
		account.setAmount(account.getAmount()+amount);
	}

	@Override
	public void withdraw(double amount) throws TransactionRolledbackException {
		if(account.getAmount()<amount) {
			throw new TransactionRolledbackException("Insufficient fund");
		}
		account.setAmount(account.getAmount()-amount);
	}
	
}
