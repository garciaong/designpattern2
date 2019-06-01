package com.designpattern.proxy;

import javax.activity.InvalidActivityException;
import javax.transaction.TransactionRolledbackException;

public class AtmProxy implements Transaction{

	private AtmMachine atm;
	
	public AtmProxy() {
		this.atm = new AtmMachine();
	}
	
	@Override
	public void pin(String pin) throws InvalidActivityException {
		atm.pin(pin);
	}

	@Override
	public void deposit(double amount) {
		atm.deposit(amount);
		System.out.println("Deposit Amount : "+amount+", New Balance : "+atm.balance());
	}

	@Override
	public void withdraw(double amount) throws TransactionRolledbackException {
		atm.withdraw(amount);
		System.out.println("Withdrwal Amount : "+amount+", New Balance : "+atm.balance());
	}

}
