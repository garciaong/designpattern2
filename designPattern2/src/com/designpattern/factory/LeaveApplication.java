package com.designpattern.factory;

public class LeaveApplication implements Procedure{

	@Override
	public void steps() {
		applyLeaveInSystem();
		obtainLeadApproval();
	}

	private void applyLeaveInSystem() {
		System.out.println("Apply leave through leave management system");
	}
	
	private void obtainLeadApproval() {
		System.out.println("Obtain respective leader approval through system");
	}
}
