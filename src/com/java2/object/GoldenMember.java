package com.java2.object;

public class GoldenMember extends BookMember {

	public GoldenMember(String name, String membershiptiers, int amount, int cost, float discount, String email,
			String phonenumber, String address) {
		super(name, membershiptiers, amount, cost, discount, email, phonenumber, address);
		super.discount = 0.3f;
	}

	private int coupon;

	@Override
	public void print1() {
		int coupon = 100;
		int balance = (int) (amount - cost * (1 - discount));
		while(cost >=150) {
		if (cost >= coupon) {
			balance = balance - coupon;
			break;
		} else {
			coupon = coupon - cost;
			break;
		}
		}
		System.out.println("會員: " + name + membershiptiers + "\t" + "儲值金： " + amount + "\t" + "購物金額： " + cost + "\t"+ " 餘額： " + balance);
	}

	@Override
	public void print2() {
		email = "maybeyouknow@gmail.com";
		phonenumber = "0924609806";
		address = "台北市";
		System.out.println("會員信箱: " + email + "\t" + " 手機號碼: " + phonenumber + "\t" + "運送地址： " + address + "\n");
	}
}
