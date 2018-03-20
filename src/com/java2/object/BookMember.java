package com.java2.object;

public class BookMember {
	protected String name;
	String membershiptiers;
	protected int amount;
	protected int cost;
	float discount;
	protected int balance;
	protected String email;
	protected String phonenumber;
	protected String address;

	public BookMember( String name,String membershiptiers,int amount,int cost,float discount,String email,String phonenumber,String address) {
		this.name = name;
		this.membershiptiers = membershiptiers;
		this.amount = amount;
		this.cost = cost;
		this.discount = discount;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	
	public void print1(){
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: " + name+ membershiptiers + "\t" + "儲值金： " + amount+"\t"+"購物金額： "+cost+"\t"+"餘額： "+balance);
	}
	public void print2(){
		System.out.println("會員信箱: " + email +"\t"+"手機號碼: "+phonenumber+ "\t" + "運送地址： "+address);
	}


	
}
