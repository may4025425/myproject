package com.java2.object;

public class GoldenMember extends BookMember {

	public GoldenMember(String name, String membershiptiers, int amount, int cost, float discount) {
		super(name, membershiptiers, amount, cost, discount);
		super.discount = 0.5f;

	}

	private int coupon;
	
	@Override
	public void print1(){
		int coupon = 100;
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: " + name+ membershiptiers + "\t" + "購物金： " + amount+"\t"+"花費： "+cost+"\t"+"餘額： "+(balance+coupon));
	}
}
