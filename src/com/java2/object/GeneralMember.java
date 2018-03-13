package com.java2.object;

public class GeneralMember extends BookMember {

	public GeneralMember(String name, String membershiptiers, int amount, int cost, float discount,String email,String phonenumber,String address,String productname) {
		super(name, membershiptiers, amount, cost, discount,email,phonenumber,address,productname);
		super.discount = 0.2f;
	}
	
	@Override
	public void print1(){
		int balance = (int)(amount-cost*(1-discount));
		System.out.println("會員: " + name+ membershiptiers + "\t" + "購物金： " + amount+"\t"+"購物金額： "+cost+"\t"+" 餘額： "+balance);
	}
	@Override
	public void print2(){
		email = "JJLin@gmail.com";
		phonenumber = "0934619876";
		address = "台北市";
	System.out.println("會員信箱: " + email +"\t"+" 手機號碼: "+phonenumber+ "\t" + "運送地址： "+address+"\n");
}
	@Override
	public void print3(){
		System.out.println("購買商品: "+ productname);
	}

	
}
