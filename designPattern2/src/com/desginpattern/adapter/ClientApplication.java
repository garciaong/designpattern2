package com.desginpattern.adapter;

public class ClientApplication implements Processing{
	
	@Override
	public void setProcessData() {
		System.out.println("Store data in client database");
	}
	
}
