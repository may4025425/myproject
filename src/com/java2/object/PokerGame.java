package com.java2.object;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Random random = new Random();
		String flowers = "SHDC";
		int [] cards = new int[52];
		for (int i = 0;i<cards.length; i++) {
			cards[i]=i;
			System.out.println((i%13)+1+""+(flowers.charAt(i/13)));
		}
		for (int i=0;i<cards.length;i++) {
			int r = random.nextInt(52);
			//將card原來的和card亂數交換
			int temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
		//上面的交換完後，再由下面的程式列出來結果
		for (int i=0;i<cards.length;i++) {
			int c = cards[i];
			System.out.println((c%13)+1+""+(flowers.charAt(c/13)));
		}
	}

}
