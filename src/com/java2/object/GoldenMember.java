package com.java2.object;

public class GoldenMember extends GeneralMember {
	public GoldenMember(int amount) {
		super(amount);
		super.discount = 0.5f;
	}
	private int gift = 5000;
	
}
