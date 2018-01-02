package com.may.sogo;

public class Tester {
	public static void main(String[] args) {
		Customer c1 = new Customer(1000);
		SilverCustomer c2 = new SilverCustomer(1000);
		c1.print();
		c2.print();
	}
}