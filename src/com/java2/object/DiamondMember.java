package com.java2.object;

public class DiamondMember extends BookMember {
	
	public DiamondMember(String name, String membershiptiers, int amount, int cost, float discount,String email,String phonenumber,String address) {
		super(name, membershiptiers, amount, cost, discount,email,phonenumber,address);
		super.discount = 0.9f;
	}

	
	private int triplecoupon;
	
	@Override
	public void print1(){
		 int triplecoupon = 1000;
		 if(cost >= triplecoupon) {
				cost = cost-triplecoupon;
			}else{
				cost = triplecoupon-cost;
			}
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: " + name+ membershiptiers + "\t" + "購物金： " + amount+"\t"+"花費： "+cost+"\t"+"餘額： "+balance);
	}
	@Override
	public void print2(){
		email = "canyougiveme@gmail.com";
		phonenumber = "0924619906";
		address = "台北市";
	System.out.println("會員信箱: " + email +"\t"+" 手機號碼: "+phonenumber+ "\t" + "運送地址： "+address+"\n");
}

}
