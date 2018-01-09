package com.may.ticket;

public class Tickets {

	int amount;
	float discount = 0.15f;
	
	public Tickets(int amount){
		this.amount = amount;
	}
	
	public void print(){
		int total = (int)(amount*(1-discount));
		System.out.println("2018-01-08"+"\t"+"18:30"+"\t"+"松山"+"\t"+"人堵"+"\t"+total);
	}
	
}
