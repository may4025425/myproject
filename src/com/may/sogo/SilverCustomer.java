package com.may.sogo;

public class SilverCustomer extends Customer{
		public SilverCustomer (int amount){
		super(amount);
		super.discount = 0.1f;
	}
		@Override
		public void print(){
			int total = (int)(amount*(1-discount));
			System.out.println(amount+"\t"+total);
		}
		
	
		
}

/*
 第二種寫法:
	public SilverCustomer (int amount){
	float discount = 0.1f;
	super(amount);
}
	@Override
	public void print(){
		int total = (int)(amount*(1-discount));
		System.out.println(amount+"\t"+total);
	}
*/