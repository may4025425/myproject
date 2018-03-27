package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		//父類別的方法子類別也能使用
		List<Integer> cards = new ArrayList<>();
		cards.add(999);
		cards.add(888);
		cards.add(700);
		cards.get(2);
		cards.set(1, 0);//(位置,新輸入的值)
		//cards.remove(1);
		System.out.println("removing number : "+cards.remove(1));
		System.out.println(cards.size());
	}

}
