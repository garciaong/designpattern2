package com.designpattern.factory;

public class YearlyReview implements Procedure{

	@Override
	public void steps() {
		obtainReviewForm();
		submitReviewForm();
		reviewSessionWithLead();
		finalizingReview();
	}

	private void obtainReviewForm() {
		System.out.println("Obtaining review form from leader");
	}
	
	private void submitReviewForm() {
		System.out.println("Fill-up & submit review form");
	}
	
	private void reviewSessionWithLead() {
		System.out.println("Having review session with respective leader");
	}
	
	private void finalizingReview() {
		System.out.println("Leader finalizing review, submit to management for endorsement");
	}
	
}
