package com.java2.object;

public class BookStore {
	int amount;
	int name;
	float discount = 0.08f;

	public BookStore (int amount){
		this.amount = amount;
	}
	public void print(){
		int total = (int)(amount*(1-discount));
		System.out.println(amount+"\t"+total);
	}
	

}
