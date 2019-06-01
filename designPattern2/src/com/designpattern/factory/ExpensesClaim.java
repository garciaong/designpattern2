package com.designpattern.factory;

public class ExpensesClaim implements Procedure{

	@Override
	public void steps() {
		submitClaim();
		obtainLeadApproval();
		monthEndChannelIn();
	}

	private void submitClaim() {
		System.out.println("Submitting claim through system");
	}
	
	private void obtainLeadApproval() {
		System.out.println("Obtaining approval from respective leader");
	}
	
	private void monthEndChannelIn() {
		System.out.println("Wait until month end when HR channel in claimed amount together with salary");
	}
}
