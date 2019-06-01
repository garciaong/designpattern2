package com.designpattern.proxy;

import javax.activity.InvalidActivityException;
import javax.transaction.TransactionRolledbackException;

public class RunProxy {

	public static void main(String[] args) throws InvalidActivityException, TransactionRolledbackException {
		Transaction atm = new AtmProxy();
		atm.pin("123");
		atm.deposit(50);
		atm.withdraw(100);
	}
}
