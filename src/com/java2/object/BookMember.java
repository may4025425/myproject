package com.java2.object;

public class BookMember {
	protected String name;
	String membershiptiers;
	protected int amount;
	protected int cost;
	float discount;
	protected int balance;
	protected String email;
	protected int phonenumber;
	protected String address;

	public BookMember( String name,String membershiptiers,int amount,int cost,float discount) {
		this.name = name;
		this.membershiptiers = membershiptiers;
		this.amount = amount;
		this.cost = cost;
		this.discount = discount;
	}
	
	public void print1(){
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: " + name+ membershiptiers + "\t" + "購物金： " + amount+"\t"+"花費： "+cost+"\t"+"餘額： "+balance);
	}


	
}