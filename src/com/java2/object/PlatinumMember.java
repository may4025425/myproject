package com.java2.object;

public class PlatinumMember extends BookMember {

	public PlatinumMember(String name, String membershiptiers, int amount, int cost, float discount,String email,String phonenumber,String address) {
		super(name, membershiptiers, amount, cost, discount,email,phonenumber,address);
		super.discount = 0.7f;
	}
	
	
	private int doublecoupon;
	
	@Override
	public void print1(){
		int doublecoupon = 600;
		if(cost >= doublecoupon) {
			cost = cost-doublecoupon;
		}else{
			cost = doublecoupon-cost;
		}
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: " + name+ membershiptiers + "\t" + "購物金： " + amount+"\t"+"花費： "+cost+"\t"+"餘額： "+balance);
	}
	@Override
	public void print2(){
		email =  "Idontknow@gmail.com";
		phonenumber = "0914619076";
		address = "台北市";
		 
	System.out.println("會員信箱: " + email+"\t"+" 手機號碼: "+phonenumber+ "\t" + "運送地址： "+address+"\n");
}

}
