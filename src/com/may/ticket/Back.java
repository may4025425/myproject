package com.may.ticket;

public class Back extends Come {

	public Back(int amount) {
		super(amount);
	}

	@Override
	public void print(){
		int total = (int)(amount*(1-discount));
		System.out.println("2018-01-08"+"\t"+"18:30"+"\t"+"松山"+"\t"+"八堵"+"\t"+total);
	}
	
}
