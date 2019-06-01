package com.designpattern.factory;

public class Resignation implements Procedure{

	@Override
	public void steps() {
		
	}
	
	private void submitResignationLetter() {
		System.out.println("Submit resignation letter to respective leader");
	}
	
	private void managerEndorsement() {
		System.out.println("Waitting for management endorsement");
	}
	
	private void exitInterview() {
		System.out.println("HR conducting exit interview");
	}

}
