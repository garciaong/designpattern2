package com.desginpattern.adapter;

public class Adapter implements Processing{

	private HostApplication host;
	
	public Adapter(HostApplication host) {
		this.host = host;
	}
	
	@Override
	public void setProcessData() {
		System.out.println("Process data from client in host : "+host.process());
	}

}
