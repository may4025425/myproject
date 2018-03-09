package com.java2.object;

public class BookMember {
	private String name;
	private int balance;
	private int amount;
	private int cost;
	private String membershiptiers;
	float discount;

	public BookMember(String name, int amount,int cost,String membershiptiers,float discount) {
		this.name = name;
		
		this.amount = amount;
		this.cost = cost;
		this.membershiptiers = membershiptiers;
		this.discount = discount;
	}

	public void print(){
		float discount = 0.5f;
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: 王小明"+"（黃金會員）"+"\t"+"餘額： "+balance);
	}
	
	
}
