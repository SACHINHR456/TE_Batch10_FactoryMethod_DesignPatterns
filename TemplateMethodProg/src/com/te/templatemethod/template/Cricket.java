package com.te.templatemethod.template;

public class Cricket  extends GameTemplate{

	@Override
	public void init() {
	System.out.println("initializing cricket");
		
	}

	@Override
	public void start() {
		System.out.println("starting cricket");		
	}

	@Override
	public void end() {
		System.out.println("closing cricket");		
	}
}
