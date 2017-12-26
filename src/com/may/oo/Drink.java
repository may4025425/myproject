package com.may.oo;

public class Drink {
	String key;// instant varible = field(屬性)
	int price;// instant varible

	// 下面一行是建立建構子
	public Drink(String key, int price) {

		this.key = key;
		this.price = price;

	}// public Drink(String key, int price) 建構子的小括號內的東西是local varible
	 // this.key = key; 的用意是為了將local varible 存到instant varible (屬性)中
}
