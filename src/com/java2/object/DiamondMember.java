package com.java2.object;

public class DiamondMember extends BookMember {

	public DiamondMember(String name, String membershiptiers, int amount, int cost, float discount, String email,
			String phonenumber, String address) {
		super(name, membershiptiers, amount, cost, discount, email, phonenumber, address);
		super.discount = 0.5f;
	}

	private int triplecoupon;

	@Override
	public void print1() {
		int triplecoupon = 300;
		int balance = (int) (amount - cost * (1 - discount));
		if(balance > 0) {
		while (cost >= 150) {
			if (cost >= triplecoupon) {
				balance = balance - triplecoupon;
				break;
			} else {
				triplecoupon = triplecoupon - cost;
				break;
			}
			}
		}
		System.out.println("會員: " + name + membershiptiers + "\t" + "儲值金： " + amount + "\t" + "購物金額： " + cost + "\t"
				+ " 餘額： " + balance);
	}

	@Override
	public void print2() {
		email = "canyougiveme@gmail.com";
		phonenumber = "0924619906";
		address = "台北市";
		System.out.println("會員信箱: " + email + "\t" + " 手機號碼: " + phonenumber + "\t" + "運送地址： " + address + "\n");
	}

}
