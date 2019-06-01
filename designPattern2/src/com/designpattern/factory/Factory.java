package com.designpattern.factory;

public class Factory {

	public Procedure findProcedure(ProcedureEnum procedureEnum) {
		Procedure procedure = null;
		switch(procedureEnum) {
			case LEAVE_APPLICATION:
				procedure = new LeaveApplication();
				break;
			case EXPENSES_CLAIM:
				procedure = new ExpensesClaim();
				break;
			case YEARLY_REVIEW:
				procedure = new YearlyReview();
				break;
			case RESIGNATION:
				procedure = new Resignation();
				break;
			default :
				procedure = null;
				break;
		}
		return procedure;
	}
	
}
