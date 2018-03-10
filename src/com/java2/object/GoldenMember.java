package com.java2.object;

public class GoldenMember extends BookMember {

	public GoldenMember(String name, String membershiptiers, int amount, int cost, float discount) {
		super(name, membershiptiers, amount, cost, discount);
		super.discount = 0.5f;

	}
	
	public GoldenMember(String email,String phonenumber,String address) {
		super(email, phonenumber, address);
		super.email = "maybeyouknow@gmail.com";
		super.phonenumber = "0924609806";
		super.address = "台北市";
		
	}
	
	private int coupon;
	
	@Override
	public void print1(){
		int coupon = 100;
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: " + name+ membershiptiers + "\t" + "購物金： " + amount+"\t"+"花費： "+cost+"\t"+"餘額： "+(balance+coupon));
	}
	@Override
	public void print2(){
		email = "maybeyouknow@gmail.com";
		phonenumber = "0924609806";
		address = "台北市";
	System.out.println("會員信箱: " + email +"\t"+" 手機號碼: "+phonenumber+ "\t" + "運送地址： "+address+"\n");
}
}
