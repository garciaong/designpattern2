package com.designpattern.adapter;

public class RunAdapter {

	public static void main(String [] args){
		ClientApplication client = new ClientApplication();
		client.setProcessData();
		HostApplication host = new HostApplication();
		Adapter adapter = new Adapter(host);
		adapter.setProcessData();
	}
	
}
