package com.te.factorymethod;

public abstract class Plan {
	double rate;

	public abstract void setRate();

	public void generateBill(float units) {

		System.out.println((float) (units * rate));

	}

}
