package com.java2.object;

public class PokerTester {

	public static void main(String[] args) {
		String flowers = "SHDC";//是一個物件(生出一個物件來幫你設計類別)
		Poker poker = new Poker();//先建一個撲克牌的新類別;先跳回呼叫他的地方
		Poker2 poker2 =new Poker2();
		poker.shuffle();//洗牌
		poker.show();//印出你洗完的結果
		poker2.shuffle();
		poker2.show();
	}

}
