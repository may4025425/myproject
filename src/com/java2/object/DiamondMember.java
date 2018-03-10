package com.java2.object;

public class DiamondMember extends BookMember {
	
	public DiamondMember(String name, String membershiptiers, int amount, int cost, float discount) {
		super(name, membershiptiers, amount, cost, discount);
		super.discount = 0.9f;
	}

	private int triplecoupon;
	
	@Override
	public void print1(){
		 int triplecoupon = 1000;
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: " + name+ membershiptiers + "\t" + "購物金： " + amount+"\t"+"花費： "+cost+"\t"+"餘額： "+(balance+triplecoupon));
	}
}
