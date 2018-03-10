package com.java2.object;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<BookMember>bm = new ArrayList<>();
		bm.add(new GeneralMember("林俊傑","（一般會員）",500,100,0.2f));
		bm.add(new GoldenMember("周渝民","（黃金會員）",1000,500,0.5f));
		bm.add(new PlatinumMember("金城武","（白金會員）",3000,2000,0.7f));
		bm.add(new DiamondMember("周杰倫","（鑽石會員）",100,150,0.9f));
		for(int i = 0; i<bm.size();i++){
			BookMember b = bm.get(i);
			b.print1();
		}
	}
	
}
