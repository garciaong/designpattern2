package com.designpattern.factory;

public class RunFactory {

	public static void main(String [] args){
		Factory factory = new Factory();
		Procedure procedure = factory.findProcedure(ProcedureEnum.EXPENSES_CLAIM);
		procedure.info();
		procedure.steps();
		System.out.println("\n");
		Procedure procedure2 = factory.findProcedure(ProcedureEnum.YEARLY_REVIEW);
		procedure2.steps();
	}
	
}
