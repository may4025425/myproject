package com.may.sogo;

public class GoldenCustomer extends SilverCustomer {

	public GoldenCustomer(int amount) {
		super(amount);
		super.discount = 0.1f;
	}

	@Override
	public void print() {
		int total = (int) (amount * (1 - discount));
		int returnMoney = amount - total;
		System.out.println(amount + "\t" + total + "\t" + returnMoney);

	}

}
